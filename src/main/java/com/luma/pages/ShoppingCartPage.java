package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement size;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement color;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement overNightDuffleText;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qtyText;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    WebElement productPrice;
    @CacheLookup
    @FindBy(xpath = "(//input[@class='input-text qty'])[1]")
    WebElement qty;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedProductPrice;

    // Defining Methods
    public String getShoppingCart() {
        Reporter.log("Getting Shopping Cart Text " + shoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Getting Shopping Cart Text " + shoppingCart);
        return getTextFromElement(shoppingCart);
    }

    public String getCronusYogaPantText() {
        Reporter.log("Getting Cronus Yoga Pant Text " + cronusYogaPant.toString());
        CustomListeners.test.log(Status.PASS, "Getting Cronus Yoga Pant Text " + cronusYogaPant);
        return getTextFromElement(cronusYogaPant);
    }

    public String getSizeText() {
        Reporter.log("Getting Size Text " + size.toString());
        CustomListeners.test.log(Status.PASS, "Getting Size Text " + size);
        return getTextFromElement(size);
    }

    public String getColorText() {
        Reporter.log("Getting Colour Text " + color.toString());
        CustomListeners.test.log(Status.PASS, "Getting Colour Text " + color);
        return getTextFromElement(color);
    }

    public String getOverNightDuffleText() {
        Reporter.log("Getting Over Night Duffle Text " + overNightDuffleText.toString());
        CustomListeners.test.log(Status.PASS, "Getting Over Night Duffle Text " + overNightDuffleText);
        return getTextFromElement(overNightDuffleText);
    }

    public String getQty() {
        Reporter.log("Getting Quantity Text " + qtyText.toString());
        CustomListeners.test.log(Status.PASS, "Getting Quantity Text " + qtyText);
        String qty = driver.findElement((By) qtyText).getAttribute("value");
        return qty;
    }

    public String getProductPrice() {
        Reporter.log("Getting Product Price Text " + productPrice.toString());
        CustomListeners.test.log(Status.PASS, "Getting Product Price Text " + productPrice);
        return getTextFromElement(productPrice);
    }

    public void changeQtyOfOverNightDuffle(String newQty) {
        Reporter.log("Clearing Quantity " + newQty + " From Quantity Field " + qty.toString());
        CustomListeners.test.log(Status.PASS, "Clearing Quantity " + qty);
        driver.findElement((By) qty).clear();
        Reporter.log("Sending Quantity " + newQty + " To Quantity Field " + qty.toString());
        CustomListeners.test.log(Status.PASS, "Sending New Quantity " + qty);
        sendTextToElement(qty, newQty);
    }

    public void clickOnUpdateShoppingCart() {
        Reporter.log("Clicking On Update Shopping Cart " + updateShoppingCart.toString());
        CustomListeners.test.log(Status.PASS, "Clicking on Update Shopping Cart " + updateShoppingCart);
        clickOnElement(updateShoppingCart);
    }

    public String getUpdatedProductPrice() {
        Reporter.log("Getting Updated Product Price Text " + updatedProductPrice.toString());
        CustomListeners.test.log(Status.PASS, "Getting Updated Product Price Text " + updatedProductPrice);
        return getTextFromElement(updatedProductPrice);
    }

}
