package com.example.Pages.CreateNewFund;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.example.base.basePage;
import com.example.utilities.ClickAction;
import com.example.utilities.Waits;

public class _2InvestmentPolicy extends basePage{

    private final By DividedPolicy = By.xpath("//input[@placeholder='Select dividend policy']");
    private final By Riskclassification = By.xpath("//input[@placeholder='Select risk classification']");
    private final By MinimumSubscriptionCapital = By.xpath("//input[@placeholder='Enter minimum Subscription Capital']");
    private final By Minimumadditionalsubscriptionamount = By.xpath("//input[@placeholder='Enter minimum additional subscription amount']");
    private final By MinimumRedemptionAmount = By.xpath("//input[@placeholder='Enter minimum Redemption Amount']");
    private final By SubscriptionAllocationDays = By.xpath("//h6[normalize-space()='Subscription Allocation']/following-sibling::div[1]//button");
    private final By RedemptionAllocationDays = By.xpath("//h6[normalize-space()='Redemption Allocation']/following-sibling::div[1]//button");
    private final By PartialValue = By.xpath("//div[@class='values']//div/input[@value=0]");
    private final By FullyValue = By.xpath("//div[@class='values']//div/input[@value=1]");
    private final By BothValue = By.xpath("//div[@class='values']//div/input[@value=2]");


    public _2InvestmentPolicy(WebDriver driver) {
        super(driver);
    }


    public void SelectDividedPolicy(String policy) {
        new Waits(driver, 10).waitForVisibility(DividedPolicy);
        new Select(driver.findElement(DividedPolicy)).selectByVisibleText(policy);
    }

    public void SelectRiskClassification(String risk) {
        new Waits(driver, 10).waitForVisibility(Riskclassification);
        new Select(driver.findElement(Riskclassification)).selectByVisibleText(risk);
    }





    public void EnterMinimumSubscriptionCapital(String amount) {
        new Waits(driver, 10).waitForVisibility(MinimumSubscriptionCapital);
        driver.findElement(MinimumSubscriptionCapital).sendKeys(amount);
    }

    public void EnterMinimumAdditionalSubscriptionAmount(String amount) {
        new Waits(driver, 10).waitForVisibility(Minimumadditionalsubscriptionamount);
        driver.findElement(Minimumadditionalsubscriptionamount).sendKeys(amount);
    }


    public void EnterMinimumRedemptionAmount(String amount) {
        new Waits(driver, 10).waitForVisibility(MinimumRedemptionAmount);
        driver.findElement(MinimumRedemptionAmount).sendKeys(amount);
    }


    
    public void selectAllocationDays(List <String> days) throws InterruptedException{

        List<WebElement> allDays = driver.findElements(SubscriptionAllocationDays);
        System.out.println(allDays.size());//print size of list//output 7
        for(WebElement day : allDays){
            String dayText = day.getText();
            if(days.contains(dayText)){
                    new Waits(driver, 10).waitForClickable(SubscriptionAllocationDays);
                    new ClickAction(driver).click(SubscriptionAllocationDays);
                }
                Thread.sleep(500);
            }
        }
        
    

    public void selectRedemptionDays(List <String> days) throws InterruptedException{

        List<WebElement> allDays = driver.findElements(RedemptionAllocationDays);
        System.out.println(allDays.size());//print size of list//output 7
        for(WebElement day : allDays){
            String dayText = day.getText();
            if(days.contains(dayText)){
                    new Waits(driver, 10).waitForClickable(RedemptionAllocationDays);
                    new ClickAction(driver).click(RedemptionAllocationDays);
                }
                Thread.sleep(500);
            }
        }   


    public void selectValues(String value) {
        switch (value) {
            case "Partial":
                new Waits(driver, 10).waitForClickable(PartialValue);
                new ClickAction(driver).click(PartialValue);
                break;
            case "Fully":
                new Waits(driver, 10).waitForClickable(FullyValue);
                new ClickAction(driver).click(FullyValue);
                break;
            case "Both":
                new Waits(driver, 10).waitForClickable(BothValue);
                new ClickAction(driver).click(BothValue);
                break;
        }
    }
}
