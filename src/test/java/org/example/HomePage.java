package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchTextBox;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    public  HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void getHomePage() {
        driver.get("https://www.amazon.com");
    }

    public void search(String keyword) {
        searchTextBox.sendKeys(keyword);
        searchButton.click();
    }

    public void searchClear() {
        searchTextBox.clear();
    }
}
