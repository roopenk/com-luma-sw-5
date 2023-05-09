package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customlistners.CustomListeners;
import com.luma.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomensJacketsPage extends Utility {

    // Declaring locators
    @CacheLookup
    @FindBy(xpath = "//div[2]//div[3]//select[1]")
    WebElement productFilter;
    @CacheLookup
    @FindBy(xpath = "//strong[@class = 'product name product-item-name']")
    WebElement nameList1;
    @CacheLookup
    @FindBy(xpath = "//strong[@class = 'product name product-item-name']")
    WebElement nameList2;
    @CacheLookup
    @FindBy(xpath = "//span[@class='price-container price-final_price tax weee']")
    WebElement priceList1;
    @CacheLookup
    @FindBy(xpath = "//span[@class='price-container price-final_price tax weee']")
    WebElement priceList2;

    // Defining Methods

    public ArrayList<String> getProductList1() {
        Reporter.log("Storing And Sorting Products " + nameList1.toString());
        CustomListeners.test.log(Status.PASS, "Storing And Sorting Products " + nameList1);
        List<WebElement> beforeFilterProductList = driver.findElements((By) nameList1);
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public void selectProductNameFilter(String filterName) {
        Reporter.log("Selecting Products' Name " + filterName + " From Drop Down " + nameList1.toString());
        CustomListeners.test.log(Status.PASS, "Storing And Sorting Products " + nameList1);
        selectByVisibleTextFromDropDown(productFilter, filterName);
    }

    public ArrayList<String> getProductList2() {
        Reporter.log("Storing And Sorting Products " + nameList2.toString());
        CustomListeners.test.log(Status.PASS, "Storing And Sorting Products " + nameList2);
        List<WebElement> afterFilterProductList = driver.findElements((By) nameList2);
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }

        return afterFilterProductList1;
    }


    public ArrayList<String> getPriceList1() {
        Reporter.log("Storing And Sorting Products' Prices " + priceList1.toString());
        CustomListeners.test.log(Status.PASS, "Storing And Sorting Products' Prices " + priceList1);
        List<WebElement> beforeFilterProductList = driver.findElements((By) priceList1);
        ArrayList<String> beforeFilterProductList1 = new ArrayList<>();
        for (WebElement list : beforeFilterProductList) {
            beforeFilterProductList1.add(String.valueOf(list.getText()));
        }
        Collections.sort(beforeFilterProductList1);
        return beforeFilterProductList1;
    }

    public ArrayList<String> getPriceList2() {
        Reporter.log("Storing And Sorting Products' Prices " + priceList2.toString());
        CustomListeners.test.log(Status.PASS, "Storing And Sorting Products' Prices " + priceList2);
        List<WebElement> afterFilterProductList = driver.findElements((By) priceList2);
        ArrayList<String> afterFilterProductList1 = new ArrayList<>();
        for (WebElement list1 : afterFilterProductList) {
            afterFilterProductList1.add(String.valueOf(list1.getText()));
        }
        return afterFilterProductList1;
    }

}
