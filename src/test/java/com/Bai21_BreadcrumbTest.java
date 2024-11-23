package com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import com.utils.BasicTest;
import com.utils.Utils;

public class Bai21_BreadcrumbTest extends BasicTest {

  
    @Test()
    public void breadcrumbTest() throws Exception {
        // Launch website
        String url = "https://bantheme.xyz/hathanhauto/tai-khoan/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        actions.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='menu-item-347']")))).perform();

        actions.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='menu-item-465']")))).perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='menu-item-468']"))).click();
        
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//nav[@class='woocommerce-breadcrumb']"))).isDisplayed());

    }
}
