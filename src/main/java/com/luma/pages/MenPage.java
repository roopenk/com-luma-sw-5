package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement size;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement color;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addToCartText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;

    // Defining Methods
    public void mouseHoverOnCronusYogaPant() {
        Reporter.log("Mouse Hovering On Cronus Yoga Pant " + cronusYogaPant.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hovering On Cronus Yoga Pant " + cronusYogaPant);
        mouseHoverToElement(cronusYogaPant);
    }

    public void clickOnSize() {
        Reporter.log("Clicking On Size " + size.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Size " + size);
        clickOnElement(size);
    }

    public void clickOnColor() {
        Reporter.log("Clicking On Colour " + color.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Colour " + color);
        clickOnElement(color);
    }

    public void clickOnAddToCart() {
        Reporter.log("Clicking On Add To Cart " + addToCart.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Add To Cart " + addToCart);
        clickOnElement(addToCart);
    }

    public String getTextAfterAddToCart() {
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
