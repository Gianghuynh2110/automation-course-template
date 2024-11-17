package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.utils.BasicTest;
import com.utils.Utils;

public class Bai18_ICEHRM_LoginTest extends BasicTest {


    @Test(dataProvider = "loginTestData")
    public void loginTestSuccess(String username, String pass, boolean expectedErrorMessage) throws Exception {
        // Launch website
        String url = "https://icehrm-open.gamonoid.com/login.php";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        Utils.hardWait(1000);

        WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
        email.sendKeys(username);
        Utils.hardWait(1000);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(pass);
        Utils.hardWait(1000);

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();
        Utils.hardWait(1000);
       
        //boolean errorMessDisplayed = isErrorMessdisplayed();
        Assert.assertEquals(isErrorMessdisplayed(), expectedErrorMessage);


    }

    @DataProvider(name="loginTestData")
    public Object[][] testDataFeed() {
        Object[][] data = new Object[2][3];
        data[0][0] = "admin";
        data[0][1] = "admin";
        data[0][2] = false;

        data[1][0] = "admin";
        data[1][1] = "admin000";
        data[1][2] = true;
        
        return data;

    }
    public boolean isErrorMessdisplayed() {
        try {
            WebElement message = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}