package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.After;
import pages.HomePage;

import static org.junit.Assert.assertEquals;

public class EbaySteps {
    private HomePage homePage; //se declara variable de tipo HomePage

    public EbaySteps() {
        this.homePage = new HomePage(); //se instancia la variable
    }

    @Given("que abro el navegador e ingreso a la URL de eBay")
    public void openAndNavigateToEbay() {

         homePage.openBrowserAndNavigate("https://www.ebay.com", "chrome");
       // homePage.openBrowserAndNavigate("https://www.ebay.com", "firefox");
       // homePage.openBrowserAndNavigate("https://www.ebay.com", "edge");

    }

    @Then("valido que la URL es correcta")
    public void validateUrl() throws InterruptedException {
        String expectedUrl = "https://www.ebay.com/";
        String actualUrl = homePage.getCurrentUrl();
        assertEquals("La URL no es la esperada", expectedUrl, actualUrl);
        Thread.sleep(5000);

    }
    @After // <-- Se ejecuta después de cada escenario
    public void tearDown() {
        if (homePage != null) {
            homePage.closeBrowser();
        }

}
}
