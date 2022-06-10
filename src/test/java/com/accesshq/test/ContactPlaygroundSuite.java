package com.accesshq.test;

import com.accesshq.models.ContactPage;
import com.accesshq.models.ErrMessage;
import com.accesshq.models.Toolbar;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactPlaygroundSuite {
    WebDriver driver;

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d3eczsrdruv8hn.cloudfront.net/");
    }

    @Test
    public void errDisplayTest(){
        // Arrange
        new Toolbar(driver).goToContact();
        // Act
        new ContactPage(driver).clickSubmitButton();

        // Assert
        Assertions.assertEquals("Forename is required", new ErrMessage(driver).errForename().getText());
        Assertions.assertEquals("Email is required", new ErrMessage(driver).errEmail().getText());
        Assertions.assertEquals("Message is required", new ErrMessage(driver).errMsg().getText());
    }

    @Test
    public void populateFormTest(){
        // Arrange
        new Toolbar(driver).goToContact();
        new ContactPage(driver).clickSubmitButton();
        new ContactPage(driver).getInput("forename");

        // Act
        new ContactPage(driver).getInput("forename").sendKeys("Dan");
        new ContactPage(driver).getInput("email").sendKeys("dan@abc.com");
        new ContactPage(driver).getInput("message").sendKeys("Nice pizza");

        // Assert
        Assertions.assertFalse(driver.findElements(By.id("forename-err")).size() > 1);
        Assertions.assertFalse(driver.findElements(By.id("email-err")).size() > 1);
        Assertions.assertFalse(driver.findElements(By.id("message-err")).size() > 1);
    }


    @AfterEach
    public void tearDown(){
        driver.quit();
    }

}
