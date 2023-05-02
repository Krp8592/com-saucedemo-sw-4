package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.MainPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Jay Vaghani
 */
public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {

        //Expected text to verify after successful login
        String expectedText = "Products";

        //Enter userName
        loginPage.enterUserName("standard_user");

        //Enter Password
        loginPage.enterPassword("secret_sauce");

        //CLick on login button
        loginPage.clickOnLoginButton();

        //Actual text to be verified
        String actualText = loginPage.getActualText();

        //Verify the text is displayed or not
        Assert.assertEquals(expectedText, actualText, "Expected text is not displayed");

    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        //Enter userName
        loginPage.enterUserName("standard_user");

        //Enter Password
        loginPage.enterPassword("secret_sauce");

        //CLick on login button
        loginPage.clickOnLoginButton();

        //Expected number of displayed items to verify
        int expectedNumberOfProducts = 6;

        //Actual number of displayed products
        int actualNumberOfProducts = mainPage.numberOfProductsDisplayed();


        //Verify expected Number of products displayed.
        Assert.assertEquals(expectedNumberOfProducts, actualNumberOfProducts, "Expected number of products are not displayed");

    }

}
