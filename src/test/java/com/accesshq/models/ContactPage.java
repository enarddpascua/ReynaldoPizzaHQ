package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
    WebDriver driver;

    public ContactPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSubmitButton(){
        driver.findElement(By.cssSelector("[aria-label=submit]")).click();
    }

    public WebElement getInput(String inputName){
        return driver.findElement(By.id(inputName));
    }


}
