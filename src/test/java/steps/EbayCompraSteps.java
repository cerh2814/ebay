package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import pages.HomePage;

import static org.junit.Assert.assertEquals;

public class EbayCompraSteps {

    private static HomePage homePage;

    @Given("que ingreso a la URL de eBay")
    public void navigateToEbay() {

        homePage = new HomePage();
        homePage.openBrowserAndNavigate("https://www.ebay.com", "chrome");
    }

    @When("busco la gorra")
    public void searchForCap() {
        homePage.enterSearchText("gorra");
        homePage.clickSearchButton();
    }

    @Then("debería ver los resultados de la búsqueda")
    public void shouldSeeSearchResults() {
        homePage.closeBrowser();
    }

}