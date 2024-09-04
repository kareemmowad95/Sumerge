package Pages;

import Elements.LogoutElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage extends LogoutElement {
    WebDriverWait wait;

    public LogoutPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    public LogoutPage ClickonMenu() {
        driver.findElement(Logoutap).click();
        return this;
    }
    public LogoutPage ClickonLogout() {
        wait.until(ExpectedConditions.elementToBeClickable(logout));
        driver.findElement(logout).click();
        return this;
    }
    public boolean CheckLogout() {
        return driver.findElement(LogoutConfirmation).isDisplayed();
    }

}
