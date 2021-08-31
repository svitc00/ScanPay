package com.automation.pages;

import com.automation.pageElements.ZipCodePageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZipCodePage extends BasePage{
    public ZipCodePageElements zipCodePageElements = new ZipCodePageElements();
    public ZipCodePage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), zipCodePageElements);
    }

    public void waitForZipCodePageDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.elementToBeClickable(zipCodePageElements.zipCodeEditText));
    }

    public void clickSignInButton(){
        zipCodePageElements.signInHereButton.click();
    }

    public void enterZipCode(String zipCode){
        zipCodePageElements.zipCodeEditText.clear();
        if(driver.getPlatformName().equalsIgnoreCase("android"))
            enterFromKeyboard(zipCodePageElements.zipCodeEditText, zipCode);
        else if(driver.getPlatformName().equalsIgnoreCase("ios"))
            enterKey(zipCodePageElements.zipCodeEditText, zipCode);
    }

    public void clickNextButton(){
        zipCodePageElements.enterButton.click();
    }

    public void clickUseMyLocation() {
        clickElement(zipCodePageElements.useMyLocationButton);
        hideKeyBoard();
    }

    public void waitForNonServiceZipCodePageDisplayed() {
        waitForDisplayed(zipCodePageElements.notAreaTitle);
    }

    public void enterEmail(String email) {
        enterKey(zipCodePageElements.invalidZipEmailTextEdit, email);
    }

    public void emailTextNextButton() {
        clickElement(zipCodePageElements.invalidZipNextButton);
    }

    public void waitForNonServiceConfirmationPage() {
        waitForDisplayed(zipCodePageElements.thankYouText);
    }

    public void clickNextAfterRegistration() {
        clickElement(zipCodePageElements.registerZipCodeNext);
    }
}
