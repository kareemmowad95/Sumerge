package Pages;

import Elements.LoginElements;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Step;

public class LoginPage extends LoginElements {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Set User Name")
    public LoginPage setUserName(String userName) {
        driver.findElement(userNameInput).sendKeys(userName);
        return this;
    }
    public LoginPage setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
        return this;
    }
    public boolean CLickonlogin() {
        driver.findElement(loginBtn).click();
        return true;

    }

    public boolean checkErrorMessage() {
        return driver.findElement(loginErrorMSG).isDisplayed();
    }

    public boolean checkSuccessfullyLogin() {
        return driver.findElement(successfullyLogin).isDisplayed();
    }
}
