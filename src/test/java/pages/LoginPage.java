package pages;

import common.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    private final By usernameInput = By.id("userid");
    private final By passwordInput = By.id("pass");
    private final By Sign = By.partialLinkText("Inicia sesión");
    private final By email = By.id("userid");
    private final By continuar = By.id("signin-continue-btn");



    public LoginPage() {
        super();
    }
    public void iniciarsession(){
        WebElement iniciar= driver.findElement(Sign);
        iniciar.click();
    }

    public void login(String user) {
        WebElement usernameField = driver.findElement(usernameInput);
        usernameField.sendKeys(user);

    }

    public void validarUsuario() {
        if (driver.getTitle().contains("La información no coincide.")) {
            throw new IllegalStateException("Error de inicio de sesión: Título de la página indica fallo.");
        }
        WebElement btn= driver.findElement(continuar);
        btn.sendKeys(Keys.ENTER);

        System.out.println("Usuario validado correctamente.");
    }
    public void password(String pass) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput));
        passwordField.sendKeys(pass, Keys.ENTER);

    }
    public void validarpassword() {
        if (driver.getTitle().contains("La información no coincide.")) {
            throw new IllegalStateException("Error de inicio de sesión: Título de la página indica fallo.");
        }
        System.out.println("Contraseña validada correctamente.");
    }

    public void loginexitoso() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.titleContains("Ingresa la dirección de correo electrónico o el nombre de usuario asociado con tu cuenta."));
            System.out.println("Ingresa la dirección de correo electrónico o el nombre de usuario asociado con tu cuenta.");
        } catch (TimeoutException e) {
            throw new IllegalStateException("No se encontró el título esperado para login no exitoso.");
        }
    }

    public void loginnoexitoso() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            wait.until(ExpectedConditions.titleContains("Ingresa la dirección de correo electrónico o el nombre de usuario asociado con tu cuenta."));
            System.out.println("Ingresa la dirección de correo electrónico o el nombre de usuario asociado con tu cuenta.");
        } catch (TimeoutException e) {
            throw new IllegalStateException("No se encontró el título esperado para login no exitoso.");
        }
    }

}
