package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.FindPage;

public class EbayFindStep {

    private static FindPage findPage;


    @Then("buscar el producto {string}")
    public void buscar_el_producto(String producto) {
        findPage = new FindPage();
        findPage.buscarProducto(producto);

    }

}
