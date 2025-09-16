package pages;

import common.BasePage;

import static java.sql.DriverManager.getDriver;

public class FindPage extends BasePage {
    private static HomePage homePage;
    private static FindPage findPage;


    public FindPage() {
        super();
    }

    public void buscarProducto(String producto) {
        homePage = new HomePage();
        homePage.enterSearchText(producto);
        homePage.clickSearchButton();
    }

    public void validarBusqueda(String producto) {
        String tituloPagina = driver.getTitle();
        if (tituloPagina.contains(producto)) {
            System.out.println("La búsqueda fue exitosa. El título de la página contiene el producto: " + producto);
        } else {
            System.out.println("La búsqueda no fue exitosa. El título de la página no contiene el producto: " + producto);
        }
    }



}
