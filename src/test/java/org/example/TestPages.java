package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestPages extends BaseTest {

    @Test
    public void productTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.getHomePage();
        homePage.search("Pixel 6 pro");
        PhonePage phonePage = new PhonePage(driver);
        phonePage.brand();
        phonePage.priceRange("20", "600");
        phonePage.color();
        phonePage.verifyElement();
        phonePage.addToCart();
        phonePage.close();
        Thread.sleep(3000);
        homePage.searchClear();
        homePage.search("Pixel 6 pro case");
        CasePage casePage = new CasePage(driver);
        casePage.verifyProduct();
        phonePage.addToCart();

    }
}
