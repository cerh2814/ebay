package pages;

import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage extends BasePage {

    private final By searchInput = By.id("gh-ac");
    private final By searchButton = By.id("gh-search-btn");
    private final By categorySection = By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[3]/div[1]");
    private final By screen = By.id("s0-1-0-53-1-2-5-15-0[2]-10-@match-media-0-@ebay-carousel-list");
    private final By talla = By.id("x-refine__group_1__2");
    private final By marca = By.xpath("/html/body/div[5]/div[3]/ul/li[1]/ul/li[2]/ul/li[3]/h3/div");
    private final By add = By.xpath("//*[@id=\"x-refine__group_1__2\"]/ul/li[1]/div/a/div");



    public HomePage() {
        super();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void enterSearchText(String text) {
        WebElement searchField = driver.findElement(searchInput);
        searchField.sendKeys(text);
    }

    public void clickSearchButton() {
        WebElement searchBtn = driver.findElement(searchButton);
        searchBtn.click();
    }

    public void scrollToCategorySection() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(categorySection));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void MostrarPantalla(){
        WebElement pantalla= driver.findElement(screen);
        pantalla.isDisplayed();
    }
    public void seleccionarTamano(String talla){
        WebElement tall = driver.findElement(this.talla);
        tall.click();
    }
    public void selecciona_size(){
        WebElement ok = driver.findElement(By.xpath("//*[@id=\"x-refine__group_1__2\"]/ul/li[1]/div/a/div/span"));
        ok.click();
    }
    public void selecctmarca(){
        WebElement seccmarca = driver.findElement(marca);
        seccmarca.click();

    }

}



