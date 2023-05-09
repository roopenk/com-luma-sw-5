package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GearPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement overnightDuffle;

    // Declaring Methods
    public void clickOnOvernightDuffle() {
        Reporter.log("Clicking On Overnight Duffle " + overnightDuffle.toString());
        CustomListeners.test.log(Status.PASS, "Getting Books Text " + overnightDuffle);
        clickOnElement(overnightDuffle);
    }
}


