package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.util.List;

public class OrderPageElements {

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Orders' AND visible == 1")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement orderTitle;

    //reserve time window title
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement reserveATimeTitle;

    //back button/arrow
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'More' AND visible == 1")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    @CacheLookup
    public MobileElement backButtonToMenu;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Cancel Order\"]")
    @AndroidFindBy(id = "cancel_order")
    @CacheLookup
    public MobileElement cancelOrderButton;

    //order list
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Order Number' AND visible == 1")
    @AndroidFindBy(id = "order_number")
    public List<MobileElement> orderNumberList;

    //cancel order title
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Cancel Order' AND visible == 1")
    @AndroidFindBy(id = "alertTitle")
    @CacheLookup
    public MobileElement cancelOrderAlertWindow;

    //cancel order button from alert window
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Cancel Order' AND visible == 1")
    @AndroidFindBy(id = "android:id/button1")
    @CacheLookup
    public MobileElement cancelOrderConfirmButton;

    @iOSXCUITFindBy(accessibility = "Past Orders")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Past Orders\")")
    public MobileElement pastOrder;
}
