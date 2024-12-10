package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage {
   
    public RegisterPage(WebDriver givenDriver) {
        super(givenDriver);
    }

    By byEmail = By.xpath("//input[@autocomplete='email']");

    By byPassWord = By.xpath("//input[@autocomplete='new-password']");

    By byRegisterButton = By.xpath("//button[@name='register']");

    By byErrorMessage = By.xpath("//label[@for='reg_password']");

    public void inputEmail(String username){

        wait.until(ExpectedConditions.visibilityOfElementLocated(byEmail)).sendKeys(username);
    }

    public void inputPassWord(String pass) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(byPassWord)).sendKeys(pass);
    }

    public void clickRegister() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(byRegisterButton)).click();

    }
    public boolean isErrorMessage(){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(byErrorMessage)).isDisplayed();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    
    }
}