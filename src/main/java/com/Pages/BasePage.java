package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver givenDriver) {
    this.driver = givenDriver;
    this.wait = new WebDriverWait(givenDriver, 20);
    PageFactory.initElements(this.driver, this);
    }
}
