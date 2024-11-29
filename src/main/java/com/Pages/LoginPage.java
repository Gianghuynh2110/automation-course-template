package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
   
public LoginPage(WebDriver givenDriver) {
   super(givenDriver);

    }
By byEmail = By.xpath("//input[@id='username']");

By byPassWord = By.xpath("//input[@id='password']");

By byLoginButton = By.xpath("//button [@name='login']");

public void inputEmail(String username){

    wait.until(ExpectedConditions.visibilityOfElementLocated(byEmail)).sendKeys(username);
    }
    
    public void inputPassWord(String pass) {
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(byPassWord)).sendKeys(pass);
    }
    
    public void clickLogin() {
    wait.until(ExpectedConditions.visibilityOfElementLocated(byLoginButton)).click();
    
    }

//Page Factory
@FindBy (xpath = "//input[@id='username']")
public WebElement email;

@FindBy(xpath = "//input[@id='password']")
public WebElement password;

@FindBy(xpath = "//button [@name='login']")
public WebElement LoginButton;


// Medthod for Page Factory
public LoginPage enterEmail(String username){
email.sendKeys(username);
return this;
}

public LoginPage enterpass(String pass){
password.sendKeys(pass);
return this;
}

public LoginPage clickLoginButton(){
LoginButton.click();
return this;
}


}
