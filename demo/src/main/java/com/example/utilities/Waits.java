package com.example.utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {


    WebDriverWait wait;
    WebDriver driver;


    public Waits(WebDriver driver, int seconds) {
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(seconds));
        this.driver = driver;
    }

    public void waitForVisibility(By locator) {
        // Implementation for waiting until the element located by 'locator' is visible
        wait.until(driver -> driver.findElement(locator).isDisplayed());
    }


    public void waitForClickable(By locator) {
        // Implementation for waiting until the element located by 'locator' is clickable
        wait.until(driver -> {
            var element = driver.findElement(locator);
            return element.isDisplayed() && element.isEnabled();
        });
    }


   

    

}
    
