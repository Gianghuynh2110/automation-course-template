package com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Pages.LoginPage;
import com.utils.BasicTest;

public class Bai22_LoginTest extends BasicTest {


    @Test
    public void loginTestSuccess() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        LoginPage loginPage = new LoginPage(driver);
       
        
        String username = "kimgiang2110@gmail.com";
        String password = "Giang@123";

        loginPage.inputEmail(username);
        loginPage.inputPassWord(password);
        loginPage.clickLogin();
        WebElement exitButton = driver.findElement(By.xpath("//li[contains(@class,'logout')]"));
        Assert.assertTrue(exitButton.isDisplayed());


    }
   
}
