package stepdefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class EbayLoginSteps {

    private static LoginPage loginPage;

    @Then("ingreso el usuario {string}")
    public void login(String user) {
       loginPage = new LoginPage();
       loginPage.iniciarsession();
       loginPage.login(user);
    }
    @Then("valido usuario")
    public void valido_usuario() {
        loginPage = new LoginPage();
        loginPage.validarUsuario();
    }
    @Then("ingreso la contrasena {string}")
    public void ingreso_la_contrasena(String pass) {
        loginPage = new LoginPage();
        loginPage.password(pass);

    }
    @Then("valido contraseña")
    public void valido_contraseña() {
        loginPage = new LoginPage();
        loginPage.validarpassword();

    }

    @Then("valido que el login fue exitoso")
    public void valido_que_el_login_fue_exitoso() {
        loginPage = new LoginPage();
        loginPage.loginexitoso();

    }







}
