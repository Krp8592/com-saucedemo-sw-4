package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By actualText = By.xpath("//span[@class='title']");


    //Send text to username field
    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    //Send text to password field
    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    //Click on login button
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    //Get text from the element
    public String getActualText() {
        return getTextFromElement(actualText);
    }
}
