package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OverNightDuffle extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement overNightDuffleText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    // Defining Methods
    public String getOverNightDuffelText() {
        Reporter.log("Getting Over Night Duffle Text " + overNightDuffleText.toString());
        CustomListeners.test.log(Status.PASS, "Getting Over Night Duffle Text " + overNightDuffleText);
        return getTextFromElement(overNightDuffleText);
    }

    public void changeQuantityTo3(String newQty) {
        Reporter.log("Clearing Quantity " + newQty + " From Quantity Field " + qty.toString());
        CustomListeners.test.log(Status.PASS, "Clearing Quantity " + qty);
        driver.findElement((By) qty).clear();
        Reporter.log("Sending Quantity " + newQty + " To Quantity Field " + qty.toString());
        CustomListeners.test.log(Status.PASS, "Sending New Quantity " + qty);
        sendTextToElement(qty, newQty);
    }

    public void clickOnAddToCart() {
        Reporter.log("Clicking On Add To Cart " + addToCart.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Add To Cart " + addToCart);
        clickOnElement(addToCart);
    }

    public String getAddToCartText() {
        Reporter.log("Getting Add To Cart Text " + addToCartText.toString());
        CustomListeners.test.log(Status.PASS, "Getting Add To Cart Text " + addToCartText);
        return getTextFromElement(addToCartText);
    }

    public void clickOnShoppingCart() {
        Reporter.log("Clicking On Shopping Cart " + shoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Shopping Cart " + shoppingCart);
        clickOnElement(shoppingCart);
    }

}
