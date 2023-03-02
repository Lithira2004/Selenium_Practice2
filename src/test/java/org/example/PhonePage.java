package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PhonePage {

    WebDriver driver;

    @FindBy(xpath = "//span[text() = 'Google']")
    WebElement brandBox;

    @FindBy(id = "low-price")
    WebElement minPrice;

    @FindBy(id = "high-price")
    WebElement maxPrice;

    @FindBy(xpath = "//*[@id='p_n_feature_two_browse-bin/17352537011']/span/a/span/div")
    WebElement colorBox;

    @FindBy (xpath = "//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div[2]/div[2]/h2/a/span")
    WebElement product;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='attach-close_sideSheet-link']")
    WebElement close;

    public PhonePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void brand() {
        brandBox.click();
    }

    public void priceRange(String min_price, String max_price) {
        minPrice.sendKeys(min_price);
        maxPrice.sendKeys(max_price);
    }

    public void color() {
        colorBox.click();
    }

    public void verifyElement() {
        String productName = "Google Pixel 6 Pro - 5G 6.71\" AMOLED - Unlocked Smartphone with Advanced Pixel Camera and Telephoto Lens - 128GB - Cloudy White (Renewed)";
        String actualName = product.getText();
        Assert.assertEquals(productName, actualName);
        product.click();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void close() {
        close.click();
    }
}
