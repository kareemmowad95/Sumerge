package Elements;

import Pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageElements extends PageBase {

    public ProductPageElements(WebDriver driver) {
        super(driver);
    }
    public By productItems = By.xpath("//div[@class='inventory_item']");
    public By ProductImage = By.xpath("//img[@alt='Sauce Labs Backpack']");
    public By ProductName = By.xpath("//div[@class='inventory_details_name large_size']");
    public By ProductPrice = By.xpath("//div[@class='inventory_details_price']");
    public By ProductDescription = By.xpath("//div[@class='inventory_details_desc large_size']");
    public By AddToCartBtn = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']");
    public By ShoppingCartBTN = By.xpath("//a[@class='shopping_cart_link']");
    public By ProductSortBN = By.xpath("//select[@class='product_sort_container']");
    public By ProductSortHighttolow= By.xpath("//option[@value='hilo']");
    public By FirstProductPrice = By.xpath("(//div[@class='inventory_item_price'])[1]");
    public By SecondProductPrice = By.xpath("(//div[@class='inventory_item_price'])[2]");
    public By ThirdProductPrice = By.xpath("(//div[@class='inventory_item_price'])[3]");
    public By FourthProductPrice = By.xpath("(//div[@class='inventory_item_price'])[4]");
    public By FifthProductPrice = By.xpath("(//div[@class='inventory_item_price'])[5]");
    public By SixthProductPrice = By.xpath("(//div[@class='inventory_item_price'])[6]");


}
