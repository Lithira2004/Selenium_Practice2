package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CasePage {
    WebDriver driver;

    @FindBy(xpath = "//span[text() = 'Crave Dual Guard for Google Pixel 6 Pro, Shockproof Protection Dual Layer Case for Google Pixel 6 Pro - Shaded Spruce'][1]")
    WebElement productTwo;

    @FindBy(xpath = "//*[@id='sw-gtc']/span/a")
    WebElement goToCartButton;

    public CasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void verifyProduct() {
        String name = "Crave Dual Guard for Google Pixel 6 Pro, Shockproof Protection Dual Layer Case for Google Pixel 6 Pro - Shaded Spruce";
        String actualName = productTwo.getText();
        Assert.assertEquals(name, actualName);
        productTwo.click();
    }

    public void goToCart() {
        goToCartButton.click();
    }
}
