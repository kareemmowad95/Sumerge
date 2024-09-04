package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements extends PageBase {

    public LoginElements(WebDriver driver) {
        super(driver);
    }

    public By userNameInput = By.xpath("//input[@id='user-name']");
    public By passwordInput = By.xpath("//input[@id='password']");
    public By loginBtn = By.xpath("//input[@id='login-button']");
    public By loginErrorMSG = By.xpath("//h3[@data-test='error']");
    public By successfullyLogin = By.xpath("//span[@data-test='title']");



}
