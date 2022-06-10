package com.accesshq.models;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Predicate;

public class MenuPage {
    WebDriver driver;

    public MenuPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getTab(String tabName){
        for(WebElement tab: new Toolbar(driver).getMenuTabs()){
           if(tab.findElement(By.tagName("i")).getText().equalsIgnoreCase(tabName)){
               return tab;
           }
        }
        throw new NotFoundException("Tab not found");
    }

    public ArrayList<MenuCard> getAllMenuCard(){
        ArrayList<MenuCard> result = new ArrayList<>();
        for(WebElement drink : driver.findElements(By.className("menuItem.drink"))){
            result.add(new MenuCard(drink));
        }
        return result;
    }

//    public MenuCard getMenuCard(Predicate logic){
//        for(MenuCard card : getAllMenuCard()){
//            if(logic.test(card)){
//                return card;
//            }
//        }
//    }

    //Todo: Finished off until get a card
}
