package com.automation.pages;

import com.automation.pageElements.PaymentPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage {
    public PaymentPageElements pageElements = new PaymentPageElements();
    public PaymentPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageElements);
    }

    public void waitForCvvWindowDisplayed() {
        waitForDisplayed(pageElements.cvvWindowTitle);
    }

    public void enterCvvInfo(String arg0) {
        enterKey(pageElements.cvvEditText, arg0);
        clickElement(pageElements.creditCvvNextButton);
    }

    public void enterNameOnCreditCard(String name) {
        enterKey(pageElements.nameOnCard,name);
    }

    public void enterCardNumber(String cardNumber) {
        enterKey(pageElements.cardNumber, cardNumber);
    }

    public void enterExpirationMonthYear(String monthYear) {
        enterKey(pageElements.expirationMonthYear, monthYear);
    }

    public void enterBillingZipCode(String zipcode) {
        if (driver.getPlatformName().equalsIgnoreCase("ios")){
            enterKey(pageElements.billingZip, zipcode);
        } else {
            enterFromKeyboard(pageElements.billingZip, zipcode);
        }
    }
}
