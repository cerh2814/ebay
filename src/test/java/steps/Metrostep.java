package steps;

import io.cucumber.java.en.*;
import pages.HomePage;

public class Metrostep {
    private static HomePage homePage;
    @Given("el usuario está en la página web ebay")
    public void el_usuario_está_en_la_página_web_ebay() {
        homePage = new HomePage();
        String url ="https://www.ebay.com/";
        homePage.openBrowserAndNavigate(url);
    }
    @When("el usuario se desplaza hacia el elemento miles de juguetes")
    public void el_usuario_se_desplaza_hacia_el_elemento_miles_de_juguetes() {
        homePage.scrollToCategorySection();

    }
    @Then("el elemento juguetes es visible en la pantalla")
    public void el_elemento_juguetes_es_visible_en_la_pantalla() {
        homePage.MostrarPantalla();

    }
    @Given("que el usuario está en la página de resultados de búsqueda de gorras en eBay")
    public void que_el_usuario_está_en_la_página_de_resultados_de_búsqueda_de_gorras_en_e_bay() {
        homePage = new HomePage();
        String url ="https://www.ebay.com/";
        homePage.openBrowserAndNavigate(url);
        homePage.enterSearchText("gorras");
        homePage.clickSearchButton();
    }
    @When("el usuario selecciona la talla {string}")
    public void el_usuario_selecciona_la_talla(String talla) {
        homePage.seleccionarTamano(talla);


    }
    @When("selecciona size")
    public void selecciona_size() {
        homePage.selecciona_size();
    }
    @Then("selecciona la marca {string}")
    public void selecciona_la_marca() {
       homePage.selecctmarca();
     //  homePage.adidas();
    }


}
