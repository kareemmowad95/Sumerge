import Elements.ProductPageElements;
import Pages.LoginPage;
import Pages.LogoutPage;
import Pages.ProductPage;
import Pages.ShoppingCardPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static Pages.PageBase.driver;

public class TestBase {
    protected LoginPage loginPage;
    protected ProductPage productPage;
    protected ShoppingCardPage shoppingCardPage;
    protected LogoutPage logoutPage;

    @BeforeClass
    public void setUp()  {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        shoppingCardPage = new ShoppingCardPage(driver);
        logoutPage = new LogoutPage(driver);
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }



}
