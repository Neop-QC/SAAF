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
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
    }

}
