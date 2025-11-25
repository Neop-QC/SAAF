package com.example.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDDL {
    
    WebDriver driver;


    public SelectDDL(WebDriver driver) {
        this.driver = driver;
    }
    


    public void selectByVisibleText(By locator, String text) {
        try{ 
            Select select = new Select(driver.findElement(locator));
            select.selectByVisibleText(text);
            System.out.println("Element is selected : " +locator + " : " +text);
        }catch(Exception e){
            throw new RuntimeException("Element is not visible  or not selected : " +locator + " : " +e.getMessage());
        }
    }
    
    public void selectByValue(By locator, String value) {
        try{    
            Select select = new Select(driver.findElement(locator));
            select.selectByValue(value);
        }catch(Exception e){
            throw new RuntimeException("Element is not visible  or not selected : " +locator + " : " +e.getMessage());
        }
    }

    public void selectByIndex(By locator, int index) {
        try{    
            Select select = new Select(driver.findElement(locator));
            select.selectByIndex(index);
        }catch(Exception e){
            throw new RuntimeException("Element is not visible  or not selected : " +locator + " : " +e.getMessage());
        }
    }

    
}
