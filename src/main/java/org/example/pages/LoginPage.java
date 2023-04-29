package org.example.pages;

import org.example.constants.locators.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class LoginPage {

    private final WebDriver driver;


    private By username = By.id(Locators.LOGIN_USERNAME);
    private By password = By.id(Locators.LOGIN_PASSWORD);
    private By wrongCredentialsErrorMessage = By.id(Locators.WRONG_CREDENTIALS_ERROR_MESSAGE_ID);
    private By signInWithGoogleButton = By.id(Locators.SIGN_IN_WITH_GOOGLE_BUTTON_ID);
    private By signInWithFacebookButton = By.id(Locators.SIGN_IN_WITH_FB_BUTTON_ID);
    private By signInWithLinkedInButton = By.id(Locators.SIGN_IN_WITH_LINKEDIN_BUTTON_ID);
    private By signInWithGithubButton = By.id(Locators.SIGN_IN_WITH_GITHUB_BUTTON_ID);
    private By loginButton = By.id(Locators.LOGIN_BUTTON);


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsernameField(String email) {
        driver.findElement(username).sendKeys(email);
    }

    public void setPasswordField(String password) {
        driver.findElement(this.password).sendKeys(password);
    }

    public HomePage clickSignInButton() {
        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.elementToBeClickable(loginButton));
        button.click();
        return new HomePage(driver);
    }

    public String wrongCredentialsDisplayStatus() {
        setUsernameField("wrong_username");
        setPasswordField("wrong_password");
        clickSignInButton();
        return driver.findElement(wrongCredentialsErrorMessage).getCssValue("display");
    }

    public GooglePage signInWithGoogle() {
        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(signInWithGoogleButton));
        return new GooglePage(driver);
    }

    public FacebookPage signInWithFB() {
        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.elementToBeClickable(signInWithFacebookButton));
        return new FacebookPage(driver);
    }

    public LinkedInPage signInWithLinkedIn() {
        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.elementToBeClickable(signInWithLinkedInButton));
        return new LinkedInPage(driver);
    }

    public GithubPage signInWithGithub() {
        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(100))
                .until(ExpectedConditions.elementToBeClickable(signInWithGithubButton));
        return new GithubPage(driver);
    }


}
