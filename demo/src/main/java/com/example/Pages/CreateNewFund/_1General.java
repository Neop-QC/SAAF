package com.example.Pages.CreateNewFund;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.example.base.basePage;
import com.example.utilities.SelectDDL;
import com.example.utilities.Waits;

public class _1General extends basePage {

    private static final By FUND_CODE_INPUT = By.cssSelector("input[placeholder='Enter fund code']");
    private static final By FUND_NAME_EN_INPUT = By.cssSelector("input[placeholder='Enter fund Name (EN)']");
    private static final By FUND_NAME_AR_INPUT = By.cssSelector("input[placeholder='Enter fund Name (AR)']");
    private static final By INITIAL_CAPITAL_INPUT = By.cssSelector("input[placeholder='Enter Initial Capital']");
    private static final By AGGREGATE_CAPITAL_INPUT = By.cssSelector("input[placeholder='Enter aggregate capital']");
    private static final By NAV_PER_UNIT_INPUT = By.cssSelector("input[placeholder='Enter Unite Price']");
    private static final By NUMBER_OF_UNITS_INPUT = By.cssSelector("input[placeholder='Enter Number of Units']");
    private static final By NEXT_BUTTON = By.cssSelector("button.submit-btn");
    private static final By SUCCESS_MESSAGE = By.cssSelector(
            ".Vue-Toastification__toast--success, .alert-success, .toast-success, [data-testid='success-message']");
    private static final String FUND_TYPE_LABEL = "Fund Type";
    private static final String FUND_STRUCTURE_LABEL = "Fund Structure";
    private static final String FUND_CURRENCY_LABEL = "Fund currency";
    private static final String FUND_CATEGORY_LABEL = "Fund category";
    private static final String FUND_MANAGER_LABEL = "Fund manager";
    private static final String FUND_BROKER_LABEL = "Fund broker";
    private static final String CUSTODIAN_LABEL = "Custodian";
    private static final String FINANCIAL_AUDITOR_LABEL = "Financial Auditor";
    private static final String INCEPTION_DATE_LABEL = "Inception Date";
    private static final String END_DATE_LABEL = "End Date";



    public _1General(WebDriver driver) {
        super(driver);
    }
    


 
    private By getDropdownByLabel(String label) {
        return By.xpath("//div[@class='form-floating']/p[text()='" + label + "']");
    }





    /* Private Functions */
    private void EnterFundCode(String fundCode) {
        new Waits(driver, 20).waitForVisibility(FUND_CODE_INPUT);
        driver.findElement(FUND_CODE_INPUT).sendKeys(fundCode);
    }

    private void EnterFundNameEN(String fundNameEN) {
        driver.findElement(FUND_NAME_EN_INPUT).sendKeys(fundNameEN);
    }

    private void EnterFundNameAR(String fundNameAR) {
        driver.findElement(FUND_NAME_AR_INPUT).sendKeys(fundNameAR);
    }

    private void EnterInitialCapital(String initialCapital) {
        driver.findElement(INITIAL_CAPITAL_INPUT).sendKeys(initialCapital);
    }

    private void EnterAggregateCapital(String aggregateCapital) {
        driver.findElement(AGGREGATE_CAPITAL_INPUT).sendKeys(aggregateCapital);
    }

    private void EnterNavPerUnit(String navPerUnit) {
        driver.findElement(NAV_PER_UNIT_INPUT).sendKeys(navPerUnit);
    }


    private void EnterNumberOfUnits(String numberOfUnits) {
        driver.findElement(NUMBER_OF_UNITS_INPUT).sendKeys(numberOfUnits);
    }

    private void SelectFundType(String fundType, String type) {
        driver.findElement(getDropdownByLabel(FUND_TYPE_LABEL)).click();
        By option = By.xpath("//div[contains(@class,'dropdown-menu')]//a[text()='" + fundType + "']");
        driver.findElement(option).click();
    }

    private void FundStructure(String fundStructure) {
       new SelectDDL(driver).selectByVisibleText(getDropdownByLabel(FUND_STRUCTURE_LABEL), fundStructure);
    }

    private void SelectFundCurrency(String fundCurrency) {
        new SelectDDL(driver).selectByVisibleText(getDropdownByLabel(FUND_CURRENCY_LABEL), fundCurrency);
    }

    private void SelectFundCategory(String fundCategory) {
        new SelectDDL(driver).selectByVisibleText(getDropdownByLabel(FUND_CATEGORY_LABEL), fundCategory);
    }

    private void SelectFundManager(String fundManager) {
        new SelectDDL(driver).selectByVisibleText(getDropdownByLabel(FUND_MANAGER_LABEL), fundManager);
    }

    private void SelectFundBroker(String fundBroker) {
        new SelectDDL(driver).selectByVisibleText(getDropdownByLabel(FUND_BROKER_LABEL), fundBroker);
    }

    private void SelectCustodian(String custodian) {
        new SelectDDL(driver).selectByVisibleText(getDropdownByLabel(CUSTODIAN_LABEL), custodian);
    }

    private void SelectFinancialAuditor(String financialAuditor) {
        new SelectDDL(driver).selectByVisibleText(getDropdownByLabel(FINANCIAL_AUDITOR_LABEL), financialAuditor);
    }

    private void SelectInceptionDate(String inceptionDate) {
        new SelectDDL(driver).selectByVisibleText(getDropdownByLabel(INCEPTION_DATE_LABEL), inceptionDate);
    }

    private void SelectEndDate(String endDate) {
        new SelectDDL(driver).selectByVisibleText(getDropdownByLabel(END_DATE_LABEL), endDate);
    }





    /* Public Functions */


    public void fillGeneralInformation(String fundCode, String fundNameEN, String fundNameAR,
            String initialCapital, String aggregateCapital, String navPerUnit, String numberOfUnits,
            String fundType, String fundStructure, String fundCurrency, String fundCategory,
            String fundManager, String fundBroker, String custodian, String financialAuditor,
            String inceptionDate, String endDate) {
        EnterFundCode(fundCode);
        EnterFundNameEN(fundNameEN);
        EnterFundNameAR(fundNameAR);
        EnterInitialCapital(initialCapital);
        EnterAggregateCapital(aggregateCapital);
        EnterNavPerUnit(navPerUnit);
        EnterNumberOfUnits(numberOfUnits);
        SelectFundType(fundType, "type");
        FundStructure(fundStructure);
        SelectFundCurrency(fundCurrency);
        SelectFundCategory(fundCategory);
        SelectFundManager(fundManager);
        SelectFundBroker(fundBroker);
        SelectCustodian(custodian);
        SelectFinancialAuditor(financialAuditor);
        SelectInceptionDate(inceptionDate);
        SelectEndDate(endDate);
    }




    
}
