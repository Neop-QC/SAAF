package com.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.example.base.basePage;
import com.example.utilities.Waits;
import io.qameta.allure.Step;

public class SidePar extends basePage {
   
    private static final By FUND_MANAGEMENT_SECTION = By.xpath("//button[@data-bs-toggle='collapse' and @href='#funds']");
    private static final By FUNDS_LIST_LINK = By.cssSelector("a.nav-link[href*='/dashboard/funds']");



     protected SidePar(WebDriver driver) {
        super(driver);
    }



    /*Private Functions */
    private void ClickFundsList() {
        //logger.info("Clicking on Funds List link in sidebar");
        new Waits(driver, 10).waitForClickable(FUNDS_LIST_LINK);
        driver.findElement(FUNDS_LIST_LINK).click();
    }

    private void ClickFundManagementSection() {
        //logger.info("Clicking on Fund Management section in sidebar");
        new Waits(driver, 10).waitForClickable(FUND_MANAGEMENT_SECTION);
        driver.findElement(FUND_MANAGEMENT_SECTION).click();
    }




    /* Public Functions */

    @Step("Navigating to Fund Management section from sidebar")
    public void openFundManagement() {
       ClickFundManagementSection();
       ClickFundsList();
    }
}

