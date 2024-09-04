package Pages;

import Elements.ShoppingCardEelements;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCardPage extends ShoppingCardEelements {
    WebDriverWait wait;
    public ShoppingCardPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }

    public boolean checkProductItemName() {
        try {
            return driver.findElement(ProudctItemName).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public ShoppingCardPage clickOnRemoveBTN() {
        driver.findElement(RemoveBTN).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(ProudctItemName));
        return this;
    }
    public int getCartBadgeCount() {
        try {
            String badgeCountText = driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText();
            return Integer.parseInt(badgeCountText);
        } catch (NoSuchElementException e) {
            return 0;
        }
    }









    }

