package com.example.base;
import org.openqa.selenium.WebDriver;



public abstract class basePage {
    protected final WebDriver driver;
    
    
    protected basePage(WebDriver driver) {
        this.driver = driver;
    }


}