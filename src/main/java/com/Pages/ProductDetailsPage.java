package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductDetailsPage extends BasePage {
   
    public ProductDetailsPage(WebDriver givenDriver) {
        super(givenDriver);

    }


    By byOrigin = By.xpath("//select[@id='pa_xuat-xu']");

    By byOriginValue = By.xpath("//option[contains(text(), 'England')]");

    By byAddButton = By.xpath("//button[contains(text(),'Thêm vào giỏ hàng')]");

    By bySucessMessage = By.xpath("//a[@class='button wc-forward']");

    public void clickOrigin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(byOrigin)).click();

    }

    public void selectkOrigin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(byOriginValue)).click();
        
    }

    public void clickAddButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(byAddButton)).click();
        
    }

    public boolean isSuccessMess(){
        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(bySucessMessage)).isDisplayed();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    // Page Factory
    @FindBy(xpath = "//select[@id='pa_xuat-xu']")
    public WebElement origin;

    @FindBy(xpath = "//option[contains(text(), 'England')]")
    public WebElement originValue;

    @FindBy(xpath = "//button[contains(text(),'Thêm vào giỏ hàng')]")
    public WebElement addButton;

    public ProductDetailsPage click_Origin(){
        origin.click();
        return this;
    }

    public ProductDetailsPage select_Origin(){
        originValue.click();
        return this;
    }

    public ProductDetailsPage click_AddButton(){
        addButton.click();
        return this;
    }
}
