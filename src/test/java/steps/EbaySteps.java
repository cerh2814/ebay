package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import static org.junit.Assert.assertEquals;

public class EbaySteps {
    private static HomePage homePage;

    @Given("que abro el navegador e ingreso a la URL de eBay")
    public void openAndNavigateToEbay() {
        homePage = new HomePage();
        homePage.openBrowserAndNavigate("https://www.ebay.com");
    }

    @Then("valido que la URL es correcta")
    public void validateUrl() throws InterruptedException {
        String expectedUrl = "https://www.ebay.com/";
        String actualUrl = homePage.getCurrentUrl();
        assertEquals("La URL no es la esperada", expectedUrl, actualUrl);
        Thread.sleep(5000);

        homePage.closeBrowser();
    }
    @When("desplazarme hacia la seccion Compra por categorías")
    public void desplazarme_hacia_la_seccion_compra_por_categoria() {
        HomePage homePage = new HomePage();

    }
}
