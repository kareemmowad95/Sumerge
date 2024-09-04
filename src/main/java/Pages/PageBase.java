package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageBase {
    public static WebDriver driver;

    public PageBase(WebDriver driver) {
        PageBase.driver = driver;
    }
   //Empty
}