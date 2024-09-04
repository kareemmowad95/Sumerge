import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class ShoppingCard_TestCases extends TestBase{


    @Test
    public void AddToProductCardAndVerfiytheCartUpadted() {
        loginPage
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .CLickonlogin();
        productPage
                .ClickOnAddToCartBtn()
                .ClickOnShoppingCartBTN();
        Assert.assertTrue(shoppingCardPage.checkProductItemName());
    }

    @Test
    public void RemoveProductFromCard() {
        loginPage
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .CLickonlogin();
        productPage
               .ClickOnAddToCartBtn()
                .ClickOnShoppingCartBTN();

        shoppingCardPage
                .clickOnRemoveBTN();
          Assert.assertFalse(shoppingCardPage.checkProductItemName());
    }
    @Test
    public void VerifyCartBadgeCountUpdatesCorrectly() throws InterruptedException {
        loginPage
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .CLickonlogin();
        sleep(2000);

        int initialBadgeCount = shoppingCardPage.getCartBadgeCount();


        productPage
                .ClickOnAddToCartBtn()
                .ClickOnShoppingCartBTN();

        int badgeCountAfterAdding = shoppingCardPage.getCartBadgeCount();
        Assert.assertEquals(badgeCountAfterAdding, initialBadgeCount + 1);
        sleep(2000);

        shoppingCardPage
                .clickOnRemoveBTN();

        int badgeCountAfterRemoving = shoppingCardPage.getCartBadgeCount();
        Assert.assertEquals(badgeCountAfterRemoving, badgeCountAfterAdding - 1);
    }















}
