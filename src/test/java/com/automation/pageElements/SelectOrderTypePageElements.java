package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

public class SelectOrderTypePageElements {
    @iOSXCUITFindBy(accessibility = "Pick Up")
    @AndroidFindBy(id = "how_do_want_text")
    public MobileElement title;

    @iOSXCUITFindBy(accessibility = "Pick Up")
    @AndroidFindBy(id = "tvSelectYourDeliveryType")
    public MobileElement title2;


    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'Fulfilled' AND visible == 1")
    @AndroidFindBy(id = "llHomeDelivery")
    public MobileElement deliveryOptionButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'Delivery' AND visible == 1")
    @AndroidFindBy(id = "delivery_zipcode")
    public MobileElement deliverToZipButton;

    @iOSXCUITFindBy(accessibility = "Pick Up")
    @AndroidFindBy(id = "pickup_title")
    @CacheLookup
    public MobileElement pickUpButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Open Shopping App' AND visible == 1")
    @AndroidFindBy(id = "bodytext")
    @CacheLookup
    public MobileElement downLoadDifferentAppTitle;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start Shopping\"]")
    @AndroidFindBy(id = "start_shopping")
    public MobileElement startShoppingButton;

    @AndroidFindBy(id = "selectbtn")
    public MobileElement startShoppingButton2;

    @iOSXCUITFindBy(accessibility = "Notifications may include alerts, sounds, and icon badges. These can be configured in Settings.")
    public MobileElement notificationText;

    @iOSXCUITFindBy(accessibility = "Don’t Allow")
    public MobileElement dontAllowNotificationButton;

    @iOSXCUITFindBy(accessibility = "Allow")
    public MobileElement allowNotificationButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Fulfilled' AND visible == 1")
    @AndroidFindBy(id = "fulfilled_banner")
    public MobileElement differentBannerDeliveryText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Zip Code' AND visible == 1")
    @AndroidFindBy(id = "edit_text")
    @CacheLookup
    public MobileElement pickUpZipodeEditText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Search For Dug Store' AND visible == 1")
    @AndroidFindBy(id = "btn_next")
    @CacheLookup
    public MobileElement searchZipCodeButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name ENDSWITH 'mi.' AND visible == 1")
    @AndroidFindBy(id = "dug_address_container")
    @CacheLookup
    public MobileElement dugStoreText;
}
