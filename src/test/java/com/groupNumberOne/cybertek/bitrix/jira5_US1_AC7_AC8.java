package com.groupNumberOne.cybertek.bitrix;

import com.groupNumberOne.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class jira5_US1_AC7_AC8 {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");

        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk23@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();

    }
    @Test
    public void topicBar() throws InterruptedException {
        WebElement messageClick = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']"));
        messageClick.click();
        Thread.sleep(3000);
        WebElement topicClick = driver.findElement(By.id("lhe_button_title_blogPostForm"));
        topicClick.click();
        Thread.sleep(3000);
        WebElement topicBard = driver.findElement(By.id("POST_TITLE"));
        Assert.assertTrue(topicBard.isDisplayed(),"topic bar is not displayed, TEST FAIL!!");
    }

    @Test
    public void visualEditor(){

        WebElement message = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-message']"));
        message.click();

        WebElement visualEditorIcon= driver.findElement(By.xpath("//span[@id='lhe_button_editor_blogPostForm']"));
        visualEditorIcon.click();

        WebElement visualBar  = driver.findElement(By.xpath("//div[@id='bx-html-editor-tlbr-idPostFormLHE_blogPostForm']"));

        Assert.assertTrue(visualBar.isDisplayed(),"Visual bar is not dispalyed, verification failed");

    }

}
