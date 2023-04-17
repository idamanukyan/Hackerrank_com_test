package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.login("username", "password");
        String welcomeMessage = homePage.getWelcomeMessage();
        Assert.assertEquals(welcomeMessage, "Welcome back!");
    }

    @Test
    public void testLogout() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.logout();
        String pageTitle = loginPage.getTitle();
        Assert.assertEquals(pageTitle, "Login Page");
    }

    @Test
    public void testDashboardNavigation() {
        HomePage homePage = new HomePage(driver);
        DashboardPage dashboardPage = homePage.goToDashboard();
        String pageTitle = dashboardPage.getTitle();
        Assert.assertEquals(pageTitle, "Dashboard");
    }

    @Test
    public void testProfileNavigation() {
        HomePage homePage = new HomePage(driver);
        ProfilePage profilePage = homePage.goToProfile();
        String pageTitle = profilePage.getTitle();
        Assert.assertEquals(pageTitle, "Profile");
    }

    @Test
    public void testInteractionBetweenPages() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.login("username", "password");
        DashboardPage dashboardPage = homePage.goToDashboard();
        String pageTitle = dashboardPage.getTitle();
        Assert.assertEquals(pageTitle, "Dashboard");
        ProfilePage profilePage = dashboardPage.goToProfile();
        pageTitle = profilePage.getTitle();
        Assert.assertEquals(pageTitle, "Profile");
    }

}
