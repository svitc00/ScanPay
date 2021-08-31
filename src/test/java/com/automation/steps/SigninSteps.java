package com.automation.steps;

import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.pages.SigninPage;
import com.automation.pages.WalletPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class SigninSteps {

    AppiumDriver driver = AppiumDriverManager.getDriver();
    public SigninPage signinPage = new SigninPage(driver);


    @When("^Validate just for U logo$")
    public void validate_just_for_you_logo() {
        signinPage.waitForLoadingComplete();
        signinPage.justForYouLogIsDisplayed();
    }



}
