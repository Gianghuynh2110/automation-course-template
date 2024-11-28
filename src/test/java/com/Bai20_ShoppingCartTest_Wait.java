package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BasicTest;

public class Bai20_ShoppingCartTest_Wait extends BasicTest {

  
    @Test()
    public void shoppingCartTestsuccess() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']"))).sendKeys("kimgiang2110@gmail.com");

        // WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
        // email.sendKeys("kimgiang2110@gmail.com");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']"))).sendKeys("Giang@123");

        // WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        // password.sendKeys("Giang@123");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button [@name='login']"))).click();

        // WebElement loginButton = driver.findElement(By.xpath("//button [@name='login']"));
        // loginButton.click();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@class,'logout')]"))).isDisplayed());

        // WebElement exitButton = driver.findElement(By.xpath("//li[contains(@class,'logout')]"));
        // Assert.assertTrue(exitButton.isDisplayed());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='s'])[1]"))).sendKeys("merc");

        // WebElement searchField = driver.findElement(By.xpath("(//input[@id='s'])[1]"));
        // searchField.sendKeys("merc");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Bơm nước xe')]"))).click();

        // WebElement searchResult = driver.findElement(By.xpath("//a[contains(text(),'Bơm nước xe')]"));
        // searchResult.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='pa_xuat-xu']"))).click();

        // WebElement origindropdown = driver.findElement(By.xpath("//select[@id='pa_xuat-xu']"));
        // origindropdown.click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//option[contains(text(), 'England')]"))).click();

        // WebElement originvalue = driver.findElement(By.xpath("//option[contains(text(), 'England')]"));
        // originvalue.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Thêm vào giỏ hàng')]"))).click();
    
        // WebElement addButton = driver.findElement(By.xpath("//button[contains(text(),'Thêm vào giỏ hàng')]"));
        // addButton.click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button wc-forward']"))).isDisplayed());

        // WebElement successmessage = driver.findElement(By.xpath("//a[@class='button wc-forward']"));
        // Assert.assertTrue(successmessage.isDisplayed());


    }

}