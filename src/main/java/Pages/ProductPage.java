package Pages;

import Elements.ProductPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ProductPage extends ProductPageElements {
     WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));

    }

    public List<WebElement> CHeckProductVisabilty() {
        return driver.findElements(productItems);
    }

    public ProductPage ClickOnProductImage() {
        wait.until(ExpectedConditions.elementToBeClickable(ProductImage));
         driver.findElement(ProductImage).click();
            return this;
    }

    public boolean CheckProductName() {
            return driver.findElement(ProductName).isDisplayed();
        }

        public boolean CheckProductPrice() {
        return driver.findElement(ProductPrice).isDisplayed();
        }


        public boolean CheckProductDescription() {
        return driver.findElement(ProductDescription).isDisplayed();
        }

        public ProductPage ClickOnSortDropDown() {
        driver.findElement(ProductSortBN).click();
        return this;
        }

        public ProductPage ClickOnSortHightToLow() {
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        driver.findElement(ProductSortHighttolow).click();
        return this;
        }


    public List<String> getProductPrices() {
        List<WebElement> priceElements = driver.findElements(ProductPrice);
        List<String> prices = new ArrayList<>();
        for (WebElement priceElement : priceElements) {
            prices.add(priceElement.getText().replace("$", ""));
        }
        return prices;
    }

    public ProductPage ClickOnAddToCartBtn() {
        driver.findElement(AddToCartBtn).click();
        return this;
    }
    public ProductPage ClickOnShoppingCartBTN() {
        driver.findElement(ShoppingCartBTN).click();
        return this;
    }

    public  List<String> ProductPrices() {
        List<String> prices = new ArrayList<>();
        prices.add(driver.findElement(FirstProductPrice).getText());
        prices.add(driver.findElement(SecondProductPrice).getText());
        prices.add(driver.findElement(ThirdProductPrice).getText());
        prices.add(driver.findElement(FourthProductPrice).getText());
        prices.add(driver.findElement(FifthProductPrice).getText());
        prices.add(driver.findElement(SixthProductPrice).getText());
        return prices;
    }







    //public ProductPage getProductPrice() {
        //driver.findElement(FirstProductPrice).equals("49.99$");

       // driver.findElement(SecondProductPrice).equals("29.99$");
       // driver.findElement(ThirdProductPrice).equals("15.99$");
       // driver.findElement(FourthProductPrice).equals("15.99$");
       // driver.findElement(FifthProductPrice).equals("9.99$");
       // driver.findElement(SixthProductPrice).equals("7.99$");
       // return this;

    }





