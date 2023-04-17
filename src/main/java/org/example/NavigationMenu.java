package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationMenu {

    private WebDriver driver;

    @FindBy(css = "a[href='/dashboard']")
    private WebElement dashboardLink;

    @FindBy(css = "a[href='/profile']")
    private WebElement profileLink;

    public NavigationMenu(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickDashboardLink() {
        dashboardLink.click();
    }

    public void clickProfileLink() {
        profileLink.click();
    }

    public void clickMenuItem(String itemName) {
        WebElement itemLink = driver.findElement(By.linkText(itemName));
        itemLink.click();
    }
}
