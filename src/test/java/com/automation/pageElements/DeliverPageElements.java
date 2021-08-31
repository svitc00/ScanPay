package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.util.List;

public class DeliverPageElements {

    //title
    @iOSXCUITFindBy(accessibility = "Select your delivery window")
    @AndroidFindBy(id = "deliveryWindowTv")
    public MobileElement orderDeliveryWindowTitle;

   //unattend
    @iOSXCUITFindBy(accessibility = "Leave bags at my doorstep")
    @AndroidFindBy(id = "deliveryTypeUnattendedBtn")
    public MobileElement unattendedButton;

   //attend
   @iOSXCUITFindBy(accessibility = "I'll be there to receive my order")
   @AndroidFindBy(id = "deliveryTypeAttendedBtn")
   public MobileElement attendedButton;

   //1-hour window
   @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH '1‑' AND visible == 1")
   @AndroidFindBy(id = "deliveryWindowOneBtn")
   public MobileElement oneHourDeliveryButton;

   //2-hour window
   @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH '2‑' AND visible == 1")
   @AndroidFindBy(id = "deliveryWindowTwoBtn")
   public MobileElement twoHourDeliveryButton;

    //4-hour window
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH '4‑' AND visible == 1")
    @AndroidFindBy(id = "deliveryWindowFourBtn")
    public MobileElement fourHourDeliveryButton;

    //date picker
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypePickerWheel[1]")
    @AndroidFindBy(id = "datePicker")
    public MobileElement datePicker;

    //time picker
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypePickerWheel[2]")
    @AndroidFindBy(id = "timePicker")
    public MobileElement timePicker;

   //save button
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Save'")
    @AndroidFindBy(id = "btn_save")
    public MobileElement saveButton;
}
