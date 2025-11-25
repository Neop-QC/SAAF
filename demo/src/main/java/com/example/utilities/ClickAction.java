package com.example.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClickAction {
    

    WebDriver driver;

    public ClickAction(WebDriver driver) {
        // Constructor implementation
        this.driver = driver;
    }


    // Add click action methods here
    public void click(By locator) {
        try{
            driver.findElement(locator).click();
        }catch(Exception e){
            throw new RuntimeException("Element is not clickable: " +locator + " : " +e.getMessage());
        }
    }
}


