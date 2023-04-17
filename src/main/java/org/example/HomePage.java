package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    private final WebDriver driver;

    @FindBy(id = "welcome-message")
    private WebElement welcomeMessage;

    @FindBy(css = "a[href='/logout']")
    private WebElement logoutLink;

    @FindBy(css = "a[href='/dashboard']")
    private WebElement dashboardLink;

    @FindBy(css = "a[href='/profile']")
    private WebElement profileLink;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    public void clickLogoutLink() {
        logoutLink.click();
    }

    public LoginPage logout() {
        clickLogoutLink();
        return new LoginPage(driver);

    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public DashboardPage goToDashboard() {
        clickDashboardLink();
        return new DashboardPage(driver);
    }

    public void clickProfileLink() {
        profileLink.click();
    }

    public ProfilePage goToProfile() {
        clickProfileLink();
        return new ProfilePage(driver);
    }


}
