import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_TestCases extends TestBase {

    @Test
    public void LoginWithValidCredentiaols() {
        loginPage
                .setUserName("standard_user")
                .setPassword("secret_sauce")
                .CLickonlogin();
        Assert.assertTrue(loginPage.checkSuccessfullyLogin());

    }

    @Test
    public void LoginWithInvalidCredentiaols() {
        loginPage
                .setUserName("standard_user")
                .setPassword("secret")
                .CLickonlogin();
        Assert.assertTrue(loginPage.checkErrorMessage());
    }

}
