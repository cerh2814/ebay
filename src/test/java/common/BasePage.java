package common;

<<<<<<< HEAD
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
=======
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
>>>>>>> b7fa546dd24cd8abe90393ceec8cfb87e8ca8f4d

import java.time.Duration;

public class BasePage {
    protected static WebDriver driver;

<<<<<<< HEAD
    public void openBrowserAndNavigate(String url, String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Navegador no soportado: " + browser);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        driver.navigate().refresh();

    }

    public void closeBrowser() {
        try {
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            System.err.println("Error al cerrar el navegador: " + e.getMessage());
=======
    public void openBrowserAndNavigate(String url) {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
>>>>>>> b7fa546dd24cd8abe90393ceec8cfb87e8ca8f4d
        }
    }


}
