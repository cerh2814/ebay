package pages;

import common.BasePage;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.apache.commons.io.FileUtils.waitFor;

public class SearchPage extends BasePage {
    private static HomePage homePage;

    @When("deplazar hasta la seccion marca")
    public void desplazarHastaLaSeccionMarca() {
        WebElement marcaSection = driver.findElement(By.xpath("//h2[text()='Marca']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", marcaSection);


    }
}
