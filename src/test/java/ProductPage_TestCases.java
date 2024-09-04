import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;


public class ProductPage_TestCases extends  TestBase {

    @Test
    public void verifyProductAreDisplayed() {
        loginPage
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .CLickonlogin();
        productPage
                .CHeckProductVisabilty();

        Assert.assertEquals(productPage.CHeckProductVisabilty().size(), 6);

    }

    @Test
    public void verifyProductNameisDisplayed() {
        loginPage
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .CLickonlogin();
        productPage
                .ClickOnProductImage()
                .CheckProductName();
    }

    @Test
    public void verifyProductPriceisDisplayed() {
        loginPage
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .CLickonlogin();
        productPage
                .ClickOnProductImage()
                .CheckProductPrice();
    }

    @Test
    public void verifyProductDescriptionisDisplayed() {
        loginPage
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .CLickonlogin();
        productPage.ClickOnProductImage()
                .CheckProductDescription();
    }


    @Test
    public void verifyProductSortingByPriceFromHightolow() {
        // Navigate to the product page
        loginPage
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .CLickonlogin();
        productPage.ClickOnSortDropDown()
                .ClickOnSortHightToLow();

        List<String> actualPrices = productPage.ProductPrices();
        List<String> expectedPrices = Arrays.asList("$49.99", "$29.99", "$15.99", "$15.99", "$9.99", "$7.99");
        for (String expectedPrice : expectedPrices) {
            Assert.assertTrue(actualPrices.contains(expectedPrice));
        }
    }








}

