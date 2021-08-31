package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EditDeliveryAddressPageElements {
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

    //back button: android arrow, ios arrow
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[6]")
    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement topLeftArrowBack;
}
