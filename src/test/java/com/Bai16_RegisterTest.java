package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.BasicTest;

public class Bai16_RegisterTest extends BasicTest {

    
    @Test(priority = 1)
    public void registerTestFail() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        WebElement emailRegister = driver.findElement(By.xpath("//input[@autocomplete='email']"));
        emailRegister.sendKeys("kimgiang2110gmail.com1");
        WebElement passwordRegister = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
        passwordRegister.sendKeys("Giang@123");
        WebElement registerButton = driver.findElement(By.xpath("//button[@name='register']"));
        registerButton.click();
        WebElement errorMessage = driver.findElement(By.xpath("//label[@for='reg_password']"));
        Assert.assertTrue(errorMessage.isDisplayed());


    }

}