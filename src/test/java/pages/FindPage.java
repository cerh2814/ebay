package pages;

import common.BasePage;

public class FindPage extends BasePage {
    private static HomePage homePage;
   // private static FindPage findPage;


    public FindPage() {
        super();
    }

    public void buscarProducto(String producto) {
        homePage = new HomePage();
        homePage.enterSearchText(producto);
        homePage.clickSearchButton();
    }



}
