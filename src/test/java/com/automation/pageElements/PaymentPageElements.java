package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;

public class PaymentPageElements {
    //back button
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Checkout' AND visible == 1")
    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement backToCheckoutPageButton;

    //cvv window title
    @iOSXCUITFindBy(accessibility = "Current Payment Method")
    @AndroidFindBy(id = "confirm_cvv_et")
    public MobileElement cvvWindowTitle;

    //cvv
    @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    @AndroidFindBy(id = "edit_text")
    public MobileElement cvvEditText;

    //enter cvv
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Confirm CVV' AND visible == 1")
    @AndroidFindBy(id = "btn_next")
    public MobileElement creditCvvNextButton;

    //name on card
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Full Name' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public MobileElement nameOnCard;

    //card number
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Credit Card Number' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public MobileElement cardNumber;

    //Expiration Month year
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Expiration Date' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(5)")
    public MobileElement expirationMonthYear;

    //Billing zip
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payment V2\"]/XCUIElementTypeTextField")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(6)")
    public MobileElement billingZip;

}
