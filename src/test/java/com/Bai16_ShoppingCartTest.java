package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BasicTest;

public class Bai16_ShoppingCartTest extends BasicTest {

  
    @Test()
    public void shoppingCartTestsuccess() throws Exception {
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

        WebElement searchField = driver.findElement(By.xpath("(//input[@id='s'])[1]"));
        searchField.sendKeys("merc");

        WebElement searchResult = driver.findElement(By.xpath("//a[contains(text(),'Bơm nước xe')]"));
        searchResult.click();

        WebElement origindropdown = driver.findElement(By.xpath("//select[@id='pa_xuat-xu']"));
        origindropdown.click();

        WebElement originvalue = driver.findElement(By.xpath("//option[contains(text(), 'England')]"));
        originvalue.click();
    
        WebElement addButton = driver.findElement(By.xpath("//button[contains(text(),'Thêm vào giỏ hàng')]"));
        addButton.click();

        WebElement successmessage = driver.findElement(By.xpath("//a[@class='button wc-forward']"));
        Assert.assertTrue(successmessage.isDisplayed());


    }

}