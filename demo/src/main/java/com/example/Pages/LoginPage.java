package com.example.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.example.base.basePage;
import com.example.utilities.SendKeys;
import com.example.utilities.Waits;



public class LoginPage extends basePage {

    private static final By EMAIL_INPUT = By.id("email");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By LOGIN_BUTTON = By.cssSelector("button.main__btn[type='submit']");

    



    public LoginPage(WebDriver driver) {
        super(driver);
    }



   /* Private Functions */
    private void EnterEmail(String email) {
        //logger.info("Entering email: {}", email);
        new Waits(driver, 10).waitForVisibility(EMAIL_INPUT);
        new SendKeys(driver).sendKeys(EMAIL_INPUT, email);
    }

    private void EnterPassword(String password) {
        //logger.info("Entering password");
        new SendKeys(driver).sendKeys(PASSWORD_INPUT, password);
    }

    private void ClickLoginButton() {
        //logger.info("Clicking on Login button");
        new Waits(driver, 10).waitForClickable(LOGIN_BUTTON);
        driver.findElement(LOGIN_BUTTON).click();
    }




    /* Public Functions */

    @Step("Logging in Email And Password")
    public void login(String username, String password) {
        EnterEmail(username);
        EnterPassword(password);
        ClickLoginButton();
    }
}

