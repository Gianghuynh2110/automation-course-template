package com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BasicTest;

public class Bai16_LoginTest extends BasicTest {


    @Test(priority = 1)
    public void loginTestSuccess() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
        email.sendKeys("kimgiang2110@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Giang@123");
        WebElement loginButton = driver.findElement(By.xpath("//button [@name='login']"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement exitButton = driver.findElement(By.xpath("//li[contains(@class,'logout')]"));
        Assert.assertTrue(exitButton.isDisplayed());


    }
    @Test(priority = 2)
    public void loginTestFail() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
        email.sendKeys("kimgiang2110@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("");
        WebElement loginButton = driver.findElement(By.xpath("//button [@name='login']"));
        loginButton.click();
        WebElement errorMessage = driver.findElement(By.xpath("//ul [@class ='woocommerce-error']"));
        Assert.assertTrue(errorMessage.isDisplayed());
        

    }
}
