package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
   
public HomePage(WebDriver givenDriver) {
   super(givenDriver);

    }

By bySearchField = By.xpath("(//input[@id='s'])[1]");

By bySearchResult = By.xpath("//a[contains(text(),'Bơm nước xe')]");


public void inputSearchKey(String searchKey) {
wait.until(ExpectedConditions.visibilityOfElementLocated(bySearchField)).sendKeys(searchKey);
}

public void selectSearchResult() {
wait.until(ExpectedConditions.visibilityOfElementLocated(bySearchResult)).click();

}

// Page Factory
@FindBy(xpath = "(//input[@id='s'])[1]")
public WebElement Searchfield;

@FindBy(xpath = "//a[contains(text(),'Bơm nước xe')]")
public WebElement Searchvalue;

public HomePage input_searchKey(String searchKey) {
    Searchfield.sendKeys(searchKey);
    return this;
}


public HomePage select_searchResult() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(bySearchResult)).click();
    return this;
}

}




