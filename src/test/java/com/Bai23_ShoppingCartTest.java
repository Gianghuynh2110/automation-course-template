package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.ProductDetailsPage;
import com.utils.BasicTest;

public class Bai23_ShoppingCartTest extends BasicTest {

  
    @Test()
    public void shoppingCartTestsuccess() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);

        

        // WebElement email = driver.findElement(By.xpath("//input[@id='username']"));
        // email.sendKeys("kimgiang2110@gmail.com");
        // WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        // password.sendKeys("Giang@123");
        // WebElement loginButton = driver.findElement(By.xpath("//button [@name='login']"));
        // loginButton.click();
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // WebElement exitButton = driver.findElement(By.xpath("//li[contains(@class,'logout')]"));
        // Assert.assertTrue(exitButton.isDisplayed());

        // WebElement searchField = driver.findElement(By.xpath("(//input[@id='s'])[1]"));
        // searchField.sendKeys("merc");

        // WebElement searchResult = driver.findElement(By.xpath("//a[contains(text(),'Bơm nước xe')]"));
        // searchResult.click();

        // WebElement origindropdown = driver.findElement(By.xpath("//select[@id='pa_xuat-xu']"));
        // origindropdown.click();

        // WebElement originvalue = driver.findElement(By.xpath("//option[contains(text(), 'England')]"));
        // originvalue.click();
    
        // WebElement addButton = driver.findElement(By.xpath("//button[contains(text(),'Thêm vào giỏ hàng')]"));
        // addButton.click();

        String username = "kimgiang2110@gmail.com";
        String pass = "Giang@123"; 
        String searchKey = "merc";
        // Login 
        loginPage.enterEmail(username)
                .enterpass(pass)
                .clickLoginButton();
       

        //HomePage - Search
        homePage.input_searchKey(searchKey)
                .select_searchResult();

        // Product Details Page

        productDetailsPage.click_Origin()
                        .select_Origin()
                        .click_AddButton();

        // Cart Page - verify add to cart successfully

        WebElement successmessage = driver.findElement(By.xpath("//a[@class='button wc-forward']"));
        Assert.assertTrue(successmessage.isDisplayed());

    }

}