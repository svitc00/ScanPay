package com.automation.pages;

import com.automation.pageElements.MenuPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuPage extends BasePage{
    private MenuPageElements menuPageElements = new MenuPageElements();
    public MenuPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), menuPageElements);
    }


    public void waitForMenuPageDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(menuPageElements.titleMore));
    }

    public void clickSignOutButton(){
        menuPageElements.signOutButton.click();
    }

    public void waitForConfirmSignOutDisplayed(){
        waitVar.until(ExpectedConditions.visibilityOf(menuPageElements.confirmSignOutMessage));
    }

    public void clickSignOutConfirmButton(){
        menuPageElements.confirmSignOutButton.click();
    }


    public void clickAccount() {
        clickElement(menuPageElements.accountButton);
    }

    public void clickFeedback() {
        clickElement(menuPageElements.feedbackButton);
    }

    public void clickOrder() {
        clickElement(menuPageElements.ordersButton);
    }

    public void navigateFromSubLevel() {
            clickElement(menuPageElements.topLeftArrowBack);
    }

    public void clickHelpFAQ() {
        clickElement(menuPageElements.helpFAQbutton);
    }

    public void waitForHelpFAQDisplayed() {
        waitForDisplayed(menuPageElements.helpWindowTitle);
    }

    public void clickContactUs() {
        clickElement(menuPageElements.contactUsButton);
    }

    public void clickChat() {
        clickElement(menuPageElements.chatButton);
    }

    public void clickDeliveryPickUp() {
        clickElement(menuPageElements.deliveryPickupQuestion);
    }

    public void clickTermsPolicy() {
        clickElement(menuPageElements.termsPoliciesButton);
    }

    public void clickNeedHelpChatbot() {
        scrollDownForElement(menuPageElements.needHelpInMenu);
        clickElement(menuPageElements.needHelpInMenu);
    }

    public void verifyVersionDisplayed() {
        waitForDisplayed(menuPageElements.versionText);
    }
}

