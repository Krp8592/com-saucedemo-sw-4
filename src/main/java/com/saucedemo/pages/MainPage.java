package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends Utility {

    By listOfProducts = By.xpath("//div[@class='inventory_item']");

    //List of displayed web elements
    public int numberOfProductsDisplayed() {
        List<WebElement> numberofProducts = driver.findElements(listOfProducts);
        return numberofProducts.size();
    }
}
