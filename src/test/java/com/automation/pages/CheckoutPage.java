package com.automation.pages;

import com.automation.pageElements.CheckoutPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage{
    public CheckoutPageElements pageElements = new CheckoutPageElements();
    public CheckoutPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageElements);
    }

    public void waitForCheckoutPageDisplayed() {
        waitForDisplayed(pageElements.orderInfoText);
    }

    public void clickOrderInfo() {
        clickElement(pageElements.orderInfoText);
    }

    public void clickPayment() {
        waitForDisplayed(pageElements.paymentText);
        clickElement(pageElements.paymentText);
    }

    public void waitForPlaceOrderButtonEnabled() {
        waitForClickableAndClick(pageElements.placeOrderButton);
    }

    public void clickDoneConfirmationButton() {
        clickElement(pageElements.doneOrderConfirmationButton);
    }

    public void waitForConfirmationPageDisplayed() {
        waitForDisplayed(pageElements.orderConfirmationTitle);
    }

    public void clickPromoCode() {
        clickElement(pageElements.promoCodeText);
    }

    public void waitForPromoCodeWindow(){
        waitForDisplayed(pageElements.promoCodeTitle);
    }

    public void enterPromoCode(String promoCode){
        enterKey(pageElements.promoCodeTextField, promoCode);
        clickElement(pageElements.promoCodeEnterButton);
    }

    public void waitForPromoCodeApplied(){
        waitForDisplayed(pageElements.promoCodeAppliedText);
    }

    public void clickBackButtonFromPromoCode(){
        clickElement(pageElements.promoCodeBackButtonToCheckout);
    }

    public void enterPhoneNumber(String phoneNumber) {
        pageElements.phoneNumberEditText.clear();
        enterKey(pageElements.phoneNumberEditText, phoneNumber);
    }

    public void clearPromoCode() {
        try {
            //wait for Enter Promo Code element
            containTextDisplayed("Enter Promo Code");
            return;

        } catch (Exception e) {
            clickPromoCode();
            waitForPromoCodeWindow();
            clickElement(pageElements.deletePromoCode);
            waitForPromoCodeWindow();
            clickBackButtonFromPromoCode();
            return;
        }
    }

    public void scrollDownToTotalSummary() {
        scrollDownForElement(pageElements.estimateTotalText);
    }
}
