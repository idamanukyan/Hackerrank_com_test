package org.example.pages;

import org.example.constants.messages.AssertionMessages;
import org.example.constants.url.Links;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests extends BaseTest {

    @Test
    public void testWrongCredentials() {
        String errorMessageDisplayStatus = loginPage.wrongCredentialsDisplayStatus();
        Assert.assertEquals(errorMessageDisplayStatus, AssertionMessages.LOGIN_FAILED);
    }

    @Test
    public void testGoogleButton() {
        loginPage.signInWithGoogle();
        Assert.assertEquals(driver.getCurrentUrl(), Links.GOOGLE_URL);
    }

    @Test
    public void testFacebookButton() {
        loginPage.signInWithFB();
        Assert.assertEquals(driver.getCurrentUrl(), Links.FB_URL);
    }

    @Test
    public void testLinkedInButton() {
        loginPage.signInWithLinkedIn();
        Assert.assertEquals(driver.getCurrentUrl(), Links.LINKEDIN_URL);
    }

    @Test
    public void testGithubButton() {
        loginPage.signInWithGithub();
        Assert.assertEquals(driver.getCurrentUrl(), Links.GITHUB_URL);
    }

}
