package org.example.pages;

import org.example.constants.url.Links;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        String hubUrl = "http://localhost:4444/grid/";
        Capabilities capabilities = getCapabilities();
        driver = new RemoteWebDriver(new URL(hubUrl), capabilities);
        loginPage = new LoginPage(driver);
        moveToSignInPage();
    }

    private Capabilities getCapabilities() {
        ChromeOptions options = new ChromeOptions();
        options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
        return options;
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
