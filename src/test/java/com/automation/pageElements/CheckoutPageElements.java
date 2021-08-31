package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

public class CheckoutPageElements {
    //******************************************* checkout page *******************************************
    //checkoutTitle
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Checkout' AND visible == 1")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement checkoutTitle;

    //order confirmation window - done button
    @iOSXCUITFindBy(accessibility = "Done")
    @AndroidFindBy(accessibility = "Close")
    @CacheLookup
    public MobileElement doneOrderConfirmationButton;

    //contact
    @iOSXCUITFindBy(accessibility = "Contact")
    @AndroidFindBy(id = "contact_title")
    @CacheLookup
    public MobileElement contactInfo;

    @iOSXCUITFindBy(accessibility = "Phone Number textfield, field is required.")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public MobileElement phoneNumberEditText;

    //order info
    @iOSXCUITFindBy(accessibility = "Order Info")
    @AndroidFindBy(id = "orderInfo_txt")
    public MobileElement orderInfoText;

    //payment
    @iOSXCUITFindBy(accessibility = "Payment")
    @AndroidFindBy(id = "payment_title")
    @CacheLookup
    public MobileElement paymentText;

    //promo code
    @iOSXCUITFindBy(accessibility = "Promo Code(s)")
    @AndroidFindBy(id = "promo_code_title")
    @CacheLookup
    public MobileElement promoCodeText;

    //cart
    @iOSXCUITFindBy(accessibility = "Cart")
    @AndroidFindBy(id = "cart_title")
    @CacheLookup
    public MobileElement cartText;

    //Estimate subtotal
    @iOSXCUITFindBy(accessibility = "Estimated Subtotal")
    @AndroidFindBy(id = "nameTv")
    @CacheLookup
    public MobileElement estimateSubtotalText;

    //service fee
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Service' AND visible == 1")
    @AndroidFindBy(id = "nameTv")
    @CacheLookup
    public MobileElement serviceFeeText;

    //Estimate total
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Estimated Total' AND visible == 1")
    @AndroidFindBy(accessibility = "Estimated Total [Info button], swipe up and right to open details link.")
    @CacheLookup
    public MobileElement estimateTotalText;

    //place order button
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Place Order' AND visible == 1")
    @AndroidFindBy(id = "btn_save")
    @CacheLookup
    public MobileElement placeOrderButton;

    @iOSXCUITFindBy(accessibility = "Checkout")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    @CacheLookup
    public MobileElement promoCodeBackButtonToCheckout;

    //order confirmation window
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Order Confirmation' AND visible == 1")
    @AndroidFindBy(id = "thank_you_txt")
    public MobileElement orderConfirmationTitle;

    //******************************************* promo code page *******************************************
    //promo code delete icon
    @iOSXCUITFindBy(accessibility = "Remove")
    @AndroidFindBy(id = "delete_promo")
    public MobileElement deletePromoCode;

    //promo code title
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Promo Code(s)\"]")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement promoCodeTitle;

    //promo code text field
    @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    @AndroidFindBy(id = "edit_text")
    @CacheLookup
    public MobileElement promoCodeTextField;

    //promo code enter button
    @iOSXCUITFindBy(accessibility = "Apply Promo Code")
    @AndroidFindBy(id = "btn_next")
    @CacheLookup
    public MobileElement promoCodeEnterButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND name CONTAINS 'Applied' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Applied\")")
    @CacheLookup
    public MobileElement promoCodeAppliedText;

    //******************************************* Edit Delivery Address page *******************************************
    //zip code
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Zipcode' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public MobileElement zipcodeTextField;

    //address line 1
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Address' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public MobileElement addressLine1TextField;

    //apt number
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Apartment' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public MobileElement aptTextField;

    //enter comments
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name CONTAINS 'Comments' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Comments\")")
    public MobileElement deliveryInstructionTextField;
}
