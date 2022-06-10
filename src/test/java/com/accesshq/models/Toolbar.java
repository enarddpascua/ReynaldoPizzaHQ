package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Toolbar {
    WebDriver driver;

    public Toolbar(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getContact(){
        return driver.findElement(By.cssSelector("[aria-label=contact]"));
    }

    public WebElement getMenu(){
        return driver.findElement(By.cssSelector("[aria-label=menu]"));
    }

    public void goToContact(){
        getContact().click();
    }

    public void goToMenu() {
        getMenu().click();
    }

    public List<WebElement> getMenuTabs(){
        return driver.findElements(By.className("v-tab"));
    }
}
