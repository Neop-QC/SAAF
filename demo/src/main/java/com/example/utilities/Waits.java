package com.example.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {


    WebDriverWait wait;
    WebDriver driver;


    public Waits(WebDriver driver, int seconds) {
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(seconds));
        this.driver = driver;
    }

    public void waitForVisibility(By locator) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
             throw new RuntimeException("Element is not visible: " +locator + " : " +e.getMessage());
        }
    }


    public void waitForClickable(By locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
             throw new RuntimeException("Element is not clickable: " +locator + " : " +e.getMessage());
        }
    }


   

    

}
    
