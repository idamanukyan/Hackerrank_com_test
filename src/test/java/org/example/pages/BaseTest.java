package org.example.pages;

import org.example.constants.url.Links;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/java/org/example/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        moveToSignInPage();

    }

    @BeforeMethod
    public void moveToSignInPage() {
        driver.get(Links.SIGN_IN_URL);
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
