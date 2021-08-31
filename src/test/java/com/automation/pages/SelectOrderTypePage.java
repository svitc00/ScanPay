package com.automation.pages;


import com.automation.pageElements.SelectOrderTypePageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectOrderTypePage extends BasePage{
    private SelectOrderTypePageElements selectOrderTypePageElements = new SelectOrderTypePageElements();
    public SelectOrderTypePage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), selectOrderTypePageElements);
    }

    public void waitForSelectOrderTypePageDisplayed(){
        try {
            waitVar.until(ExpectedConditions.visibilityOf(selectOrderTypePageElements.title));
        }catch (Exception e){
            waitVar.until(ExpectedConditions.visibilityOf(selectOrderTypePageElements.title2));

        }

    }

    public void clickDelivery(){
                selectOrderTypePageElements.deliverToZipButton.click();
    }

    public void clickStartShoppingButton(){
            waitForClickableAndClick(selectOrderTypePageElements.startShoppingButton);
    }

    public void waitForDownloadDifferentBannerDisplayed() {
        waitForDisplayed(selectOrderTypePageElements.downLoadDifferentAppTitle);
    }

    public void waitForNotification() {
        waitForDisplayed(selectOrderTypePageElements.notificationText);
    }

    public void clickNotAllowNotification() {
        clickElement(selectOrderTypePageElements.dontAllowNotificationButton);
    }

    public void clickPickUp() {
        clickElement(selectOrderTypePageElements.pickUpButton);
    }

    public void enterZipCode(String zipcode) {
        enterKey(selectOrderTypePageElements.pickUpZipodeEditText, zipcode);
    }

    public void clickSearchButton() {
        clickElement(selectOrderTypePageElements.searchZipCodeButton);
    }

    public void waitForDUGListDisplayed() {
        waitForDisplayed(selectOrderTypePageElements.dugStoreText);
    }

    public void selectAnyStore() {
        clickElement(selectOrderTypePageElements.dugStoreText);
    }

    public void waitForZipcodeFieldDisplayed() {
        waitForDisplayed(selectOrderTypePageElements.pickUpZipodeEditText);
    }
}
