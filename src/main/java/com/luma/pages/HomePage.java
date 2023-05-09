package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']")
    WebElement jackets;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottomMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;

    // Defining Methods
    public void mouseHoverOnWomenMenu() {
        Reporter.log("Mouse Hovering On Womens Menu " + womenMenu.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hovering On Womens Menu " + womenMenu);
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        Reporter.log("Mouse Hovering On Tops Menu " + tops.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hovering On Tops Menu " + tops);
        mouseHoverToElement(tops);
    }

    public void clickOnJackets() {
        Reporter.log("Clicking On Jackets " + jackets.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Jackets " + jackets);
        clickOnElement(jackets);
    }

    public void mouseHoverOnMenMenu() {
        Reporter.log("Mouse Hovering On Men Menu " + menMenu.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hovering On Men Menu " + menMenu);
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottom() {
        Reporter.log("Mouse Hovering On Bottoms Menu " + bottomMenu.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hovering On Bottoms Menu " + bottomMenu);
        mouseHoverToElement(bottomMenu);
    }

    public void clickOnPant() {
        Reporter.log("Clicking On Pants " + pants.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Pants " + pants);
        clickOnElement(pants);
    }

    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(gearMenu);
        Reporter.log("Mouse Hovering On Gear Menu " + gearMenu.toString());
        CustomListeners.test.log(Status.PASS, "Mouse Hovering On Gear Menu " + gearMenu);
    }

    public void clickOnBags() {
        Reporter.log("Clicking On Bags " + bags.toString());
        CustomListeners.test.log(Status.PASS, "Clicking On Bags " + bags);
        clickOnElement(bags);
    }

}
