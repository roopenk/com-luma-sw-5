package com.luma.testsuite;

import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.pages.OverNightDuffle;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    HomePage homePage;
    GearPage gearPage;
    OverNightDuffle overNightDuffle;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        gearPage = new GearPage();
        overNightDuffle = new OverNightDuffle();
        shoppingCartPage = new ShoppingCartPage();
    }

    @Test(groups = {"Sanity", "Regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        homePage.mouseHoverOnGearMenu();
        homePage.clickOnBags();
        gearPage.clickOnOvernightDuffle();
        Assert.assertEquals(overNightDuffle.getOverNightDuffelText(), "Overnight Duffle");
        overNightDuffle.changeQuantityTo3("3");
        overNightDuffle.clickOnAddToCart();
        Assert.assertEquals(overNightDuffle.getAddToCartText(), "You added Overnight Duffle to your shopping cart.");
        overNightDuffle.clickOnShoppingCart();
        Assert.assertEquals(shoppingCartPage.getOverNightDuffleText(), "Overnight Duffle");
        Assert.assertEquals(shoppingCartPage.getQty(), "3");
        Assert.assertEquals(shoppingCartPage.getProductPrice(), "$135.00");
        shoppingCartPage.changeQtyOfOverNightDuffle("5");
        shoppingCartPage.clickOnUpdateShoppingCart();
        Assert.assertEquals(shoppingCartPage.getUpdatedProductPrice(), "$225.00");
    }
}
