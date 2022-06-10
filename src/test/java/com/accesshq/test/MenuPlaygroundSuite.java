package com.accesshq.test;

import com.accesshq.models.MenuPage;
import com.accesshq.models.Toolbar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MenuPlaygroundSuite {
    WebDriver driver;

    @BeforeEach
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d3eczsrdruv8hn.cloudfront.net/");
    }

    @Test
    public void zeroRatingTest(){
        // Arrange
        new Toolbar(driver).goToMenu();
        new MenuPage(driver).getTab("local_drink").click();

        // Act


        // Assert
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }
}
