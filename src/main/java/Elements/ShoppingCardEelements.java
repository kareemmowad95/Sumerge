package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCardEelements extends PageBase {

    public ShoppingCardEelements(WebDriver driver) {
        super(driver);
    }

    public static By ProudctItemName = By.xpath("//div[@class='inventory_item_name']");
    public By RemoveBTN = By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]");
    public By CartBadge = By.xpath("//span[@class='shopping_cart_badge']");


}
