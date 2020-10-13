package com.groupNumberOne.cybertek.bitrix;

import com.groupNumberOne.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Jira5_US2_AC9 {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login2.nextbasecrm.com/");
    }
    @Test
    public void addingEvent() throws InterruptedException {
        driver.findElement(By.name("USER_LOGIN")).sendKeys("helpdesk23@cybertekschool.com");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        Thread.sleep(3000);
        WebElement taskButton = driver.findElement(By.xpath("//span[@id='feed-add-post-form-tab-tasks']"));
        taskButton.click();
        WebElement datePick=driver.findElement(By.xpath("(//input[@data-bx-id=\"datepicker-display\"])[1]"));
        datePick.click();
        WebElement chooseDay = driver.findElement(By.linkText("10"));
        chooseDay.click();
        WebElement timeButton = driver.findElement(By.xpath("(//input[@class=\"bx-calendar-form-input\"])[1]"));
        timeButton.click();
        timeButton.sendKeys(Keys.BACK_SPACE);
        timeButton.sendKeys(Keys.BACK_SPACE);
        timeButton.sendKeys("10");
        WebElement chooseminutes = driver.findElement(By.xpath("(//input[@class=\"bx-calendar-form-input\"])[2]"));
        chooseminutes.click();
        chooseminutes.sendKeys(Keys.BACK_SPACE);
        chooseminutes.sendKeys(Keys.BACK_SPACE);
        chooseminutes.sendKeys("20");
        WebElement selectButton=driver.findElement(By.xpath("(//span[@class='bx-calendar-button-text'])[1]"));
        selectButton.click();
        
        //pull practice

    }
}
