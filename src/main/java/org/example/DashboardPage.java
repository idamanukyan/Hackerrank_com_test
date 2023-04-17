package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public ProfilePage goToProfile() {
        WebElement profileLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/profile']")));
        profileLink.click();
        return new ProfilePage(driver);
    }
}
