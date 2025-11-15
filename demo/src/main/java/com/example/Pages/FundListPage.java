package com.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.example.base.basePage;
import com.example.utilities.Waits;

import io.qameta.allure.Step;

public class FundListPage extends basePage {

    private static final By CREATE_FUND_BUTTON = By.cssSelector("a.main__btn[href*='new-fund']");


    public FundListPage(WebDriver driver) {
        super(driver);
    }


    @Step("Clicking on Create Fund Button")
    public void startFundCreation() {
        new Waits(driver, 10).waitForClickable(CREATE_FUND_BUTTON);
        driver.findElement(CREATE_FUND_BUTTON).click();
    }
}

    
    

