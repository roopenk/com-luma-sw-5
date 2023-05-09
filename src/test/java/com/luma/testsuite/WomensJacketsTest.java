package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.WomensJacketsPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomensJacketsTest extends BaseTest {
    HomePage homepage;
    WomensJacketsPage womenPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homepage = new HomePage();
        womenPage = new WomensJacketsPage();
    }


    @Test(groups = {"Sanity", "Regression"})
    public void verifyTheSortByProductNameFilter() {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenPage.selectProductNameFilter("Product Name");
        Assert.assertEquals(womenPage.getProductList1(), womenPage.getProductList2());
    }

    @Test(groups = {"Smoke", "Regression"})
    public void verifyTheSortByPriceFilter() {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenPage.selectProductNameFilter("Price");
        Assert.assertEquals(womenPage.getPriceList1(), womenPage.getPriceList2());
    }
}
