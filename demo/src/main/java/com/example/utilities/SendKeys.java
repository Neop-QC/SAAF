package com.example.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendKeys {

    WebDriver driver;

    public SendKeys(WebDriver driver) {
        this.driver = driver;
    }

    // Add send keys methods here
    public void sendKeys(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }
    
}
