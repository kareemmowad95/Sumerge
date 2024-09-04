import Pages.LogoutPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Logout_TestCases extends TestBase {



    @Test
    public void VerifyThattheUserCanLogoutandbacktoLoginPage() {
        loginPage
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .CLickonlogin();
        productPage
                .ClickOnAddToCartBtn()
                .ClickOnShoppingCartBTN();
        shoppingCardPage
                .clickOnRemoveBTN();
        logoutPage
                .ClickonMenu()
                .ClickonLogout();
        Assert.assertTrue(logoutPage.CheckLogout());


    }
}
