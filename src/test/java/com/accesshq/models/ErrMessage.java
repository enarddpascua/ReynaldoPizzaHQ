package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ErrMessage {
    WebDriver driver;

    public ErrMessage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement errForename(){
        return driver.findElement(By.id("forename-err"));
    }

    public WebElement errEmail(){
        return driver.findElement(By.id("email-err"));
    }

    public WebElement errMsg(){
        return driver.findElement(By.id("message-err"));
    }
}
