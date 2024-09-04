package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutElement extends PageBase {
    public LogoutElement(WebDriver driver) {
        super(driver);
    }

    public By Logoutap = By.xpath("//button[@id='react-burger-menu-btn']");
    public By logout = By.xpath("//a[@id='logout_sidebar_link']");
    public By LogoutConfirmation = By.xpath("//h4[text()='Accepted usernames are:']");


}
