package com.automation.pageElements;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import java.util.List;

public class CartPageElements {

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND name BEGINSWITH 'Items'")
    @AndroidFindBy(id = "tvTotal")
    public MobileElement totalNumber;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'My Cart' AND visible == 1")
    @AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"My Cart\")")
    public MobileElement myCartTitle;

    //note to personal shopper text edit field
    @iOSXCUITFindBy(className = "XCUIElementTypeTextField")
    @AndroidFindBy(id = "etNote")
    public MobileElement noteForShopperEditText;

    @iOSXCUITFindBy(className = "XCUIElementTypeImage")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Product Image\"]")
    public List<MobileElement> cartItemsImageList;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Increment quantity '")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"+\").instance(3)")
    public MobileElement plusButton;

    //increase quantity:
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Increment'")
    @AndroidFindBy(id = "btnPlus")
    public List<MobileElement> plusButtonList;

    //decrease quantity
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Decrement'")
    @AndroidFindBy(id = "btnMinus")
    public List<MobileElement> minusButtonList;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Remove' AND visible == 1")
    @AndroidFindBy(id = "tvRemove")
    public MobileElement removeIcon;

    @iOSXCUITFindBy(accessibility = "Full carts & happy hearts")
    @AndroidFindBy(id = "empty_cart_img")
    public MobileElement emptyCartImage;

    @iOSXCUITFindBy(accessibility = "Done")
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    @CacheLookup
    public MobileElement closeButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Checkout' AND visible == 1")
    @AndroidFindBy(id = "btn_checkout")
    public MobileElement checkoutButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeOther' AND name BEGINSWITH 'Items' AND visible == 1")
    @AndroidFindBy(id = "txt_total_amount")
    @CacheLookup
    public MobileElement totalAmount;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name BEGINSWITH 'Estimated Total' AND visible == 1")
    @AndroidFindBy(id = "estimatedTotalmoreInfo")
    public MobileElement EstimatedTotalInfoIcon;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Savings'")
    @AndroidFindBy(id = "moreInfo")
    public MobileElement EstimatedSavingsInfoIcon;

    @iOSXCUITFindBy(accessibility = "Quantity")
    @AndroidFindBy(id = "tvQuantity")
    public List<MobileElement> quantityFieldList;

    @iOSXCUITFindBy(accessibility = "Remove")
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Product Image\"]")
    public MobileElement swipeRemoveButton;

    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"No substitution on all unavailable items\"])[1]")
    @AndroidFindBy(id = "substitution_checkbox")
    public WebElement globalSubstitutionCheckbox;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'No substitution if unavailable'")
    @AndroidFindBy(id = "no_substitution_checkbox")
    public List<MobileElement> itemSubstitutionCheckboxList;

    @iOSXCUITFindBy(accessibility = "Cart Summary")
    @AndroidFindBy(uiAutomator = "ew UiSelector().text(\"Cart Summary\")")
    public MobileElement cartSummary;
}
