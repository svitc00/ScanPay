package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

import java.lang.management.MonitorInfo;
import java.util.List;

public class HomePageElements {

    //notification

    //app send notification permission text
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value == '“Delivery & Pick Up” Would Like to Send You Notifications' AND visible == 1")
    public MobileElement notificationText;

    //do not allow notification button
    @iOSXCUITFindBy(accessibility = "Don’t Allow")
    public MobileElement doNotAllowNotificationButton;

    //allow notification button
    @iOSXCUITFindBy(accessibility = "Allow")
    public MobileElement allowNotificationButton;

    //More on ios, menu button on android
    @iOSXCUITFindBy(accessibility = "More")
    @AndroidFindBy(accessibility = "Open navigation drawer")
    public MobileElement menuButton;

    //home tab
    @iOSXCUITFindBy(accessibility = "Home")
    @AndroidFindBy(id = "bb_menu_home")
    public MobileElement homeTab;

    //my purchase tab
    @iOSXCUITFindBy(accessibility = "My Purchases")
    @AndroidFindBy(id = "bb_menu_scan")
    public MobileElement myPurchaseTab;

    //aisle tab
    @iOSXCUITFindBy(accessibility = "Aisles")
    @AndroidFindBy(id = "bb_menu_savings")
    public MobileElement aisleTab;

    //deals tab
    @iOSXCUITFindBy(accessibility = "Deals")
    @AndroidFindBy(id = "bb_menu_delivery")
    public MobileElement dealsTab;

    //search edit text
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeSearchField' AND name == 'Search for Products' AND visible == 1")
    @AndroidFindBy(id = "editSearch")
    public MobileElement searchEditText;

    //current trending on search page
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value == 'Currently Trending'")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Currently Trending\")")
    public MobileElement currentTrendingText;

    //Recently searched on search page
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value == 'Recently Searched'")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Recently Searched\")")
    @CacheLookup
    public MobileElement recentlySearchedText;

    //search result list
    //@iOSXCUITFindBy(className = "XCUIElementTypeImage")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS '$' ")
    @AndroidFindBy(id = "ivProduct")
    public List<MobileElement> searchResultProductList;

    //search auto suggest list
    @iOSXCUITFindBy(className = "XCUIElementTypeButton")
    @AndroidFindBy(id = "txt")
    public List<MobileElement> autoSuggestSearchList;

    //no result text in search
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] '0 Results' AND visible == 1")
    @AndroidFindBy(id = "noResultTitle")
    public MobileElement noSearchResult;

    //quantity button
    //@iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Quantity' ")
    @iOSXCUITFindBy(accessibility = "Quantity")
    @AndroidFindBy(id = "tvQuantity")
    public MobileElement quantityButton;

    //quantity text edit field
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Quantity' ")
    @AndroidFindBy(id = "etQuantityNotEditable")
    public MobileElement quantityTextEdit;

    //deals toggle switch
    //@iOSXCUITFindBy(accessibility = "Deals")
    @iOSXCUITFindBy(iOSNsPredicate = "type=='XCUIElementTypeButton' AND name=='Deals' AND value CONTAINS 'o'")
    @AndroidFindBy(id = "dealsToggle")
    public MobileElement dealsToggleSwitch;

    //cart icon
    @iOSXCUITFindBy(accessibility = "Cart")
    @AndroidFindBy(accessibility = "Shopping Cart Button")
    @CacheLookup
    public MobileElement cartButton;

    //delivery zipcode
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND value BEGINSWITH[c] 'Delivery' AND visible == 1")
    @AndroidFindBy(id = "preferenceText")
    @CacheLookup
    public MobileElement deliveryAddressText;

    //edit delivery button
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name ENDSWITH 'Edit' AND visible == 1")
    @AndroidFindBy(id = "preferenceText")
    @CacheLookup
    public MobileElement editDeliveryButton;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[8]")
    @AndroidFindBy(id = "editSlotText")
    @CacheLookup
    public MobileElement editReserveTimeButton;

    //popular items text
    @iOSXCUITFindBy(accessibility = "Popular Items")
    @AndroidFindBy(id = "carousel_title")
    public MobileElement popularItemText;

    //most viewed text
    @iOSXCUITFindBy(accessibility = "Most Viewed")
    @AndroidFindBy(id = "carousel_title")
    public MobileElement mostViewedText;

    //popular items view all
    @iOSXCUITFindBy(accessibility = "View All")
    @AndroidFindBy(accessibility = "View All Popular Items")
    public MobileElement popularViewAllButton;

    @AndroidFindBy(id = "btnPlus")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Add' AND visible == 1")
    public List<MobileElement> addItemButtons;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Shopping Cart Button\"]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Cart' ")
    public MobileElement shoppingCartButton;

    //Deals view all button
    @AndroidFindBy(id = "view_more")
    @iOSXCUITFindBy(accessibility = "View all Deals")
    public MobileElement viewAllDealButton;

    //aisles title
    @AndroidFindBy(id = "recycler_view")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Aisles' AND visible == 1")
    public MobileElement aisleTitle;

    //aisles category list- level 1
    @AndroidFindBy(id = "deptName")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeCell' AND name BEGINSWITH 'Baby' AND visible == 1")
    public List<MobileElement> departmentListElements;

    //aisles category list - level 2
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeCell' AND name ENDSWITH 'Collapsed.' AND visible == 1")
    @AndroidFindBy(id = "row")
    public List<MobileElement> subListElements;

    //aisles category list - level 3
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeCell' AND name BEGINSWITH 'Bottles' AND visible == 1")
    @AndroidFindBy(id = "childDeptName")
    public List<MobileElement> categoryListElements;

    //item found from aisle
    @AndroidFindBy(id = "tvResults")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name ENDSWITH 'Found' AND visible == 1")
    public MobileElement aisleResultText;

    //item found from search
    @AndroidFindBy(id = "tvResults")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name CONTAINS 'results' AND visible == 1")
    public MobileElement searchResultText;

    //add button from product list
    @AndroidFindBy(id = "add_button_layout")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name CONTAINS 'Add' AND visible == 1")
    public List<MobileElement> addButtonList;

    @iOSXCUITFindBy(accessibility = "Toggle it. Toggle it real good.")
    public MobileElement iosTogglePopUp;

    @iOSXCUITFindBy(accessibility = "close")
    public MobileElement iosCloseToggle;

    //back /cancel button from search screen
    @AndroidFindBy(id = "imageBack")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Cancel' AND visible == 1")
    public MobileElement cancelButton;

    // plus button list
    //@AndroidFindBy(id = "btnPlus")
    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Increase Quantity\"]")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Increment quantity' AND visible == 1")
    public List<MobileElement> plusButtonList;

    //ios
    //ios :do you love online shopping popup
    @AndroidFindBy(id = "yes")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Do you love Vons Online Shopping?\"]")
    public MobileElement loveShoppingPopUpText;

    @AndroidFindBy(id = "yes")
    @iOSXCUITFindBy(accessibility = "Yes")
    public MobileElement loveShoppingYesButton;

    @AndroidFindBy(id = "no")
    @iOSXCUITFindBy(accessibility = "No")
    public MobileElement loveShoppingNoButton;

    //ios rating shop pop up
    @AndroidFindBy(id = "body")
    @iOSXCUITFindBy(accessibility = "Enjoying Delivery & Pick Up?")
    public MobileElement ratingShopWindowText;

    @AndroidFindBy(id = "decline")
    @iOSXCUITFindBy(accessibility = "Not Now")
    public MobileElement ratingShopNotNowButton;

    @iOSXCUITFindBy(accessibility = "bread")
    public WebElement autoSuggestBread;


    //window title
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement windowTitle;

    //option window title
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[1]")
    @AndroidFindBy(id = "app_bar_title")
    public MobileElement optionWindowTitle;

    //sort and filter icon
    @iOSXCUITFindBy(accessibility = "Sort & Filter Options")
    @AndroidFindBy(id = "img_filterSort")
    public MobileElement sortAndFilterButton;

    //product detail page
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND value CONTAINS '$'")
    @AndroidFindBy(id = "imageProduct")
    public MobileElement productImage;

    //related products text
    @iOSXCUITFindBy(accessibility = "Related Products")
    @AndroidFindBy(id = "carousel_title") //text: "Related Products"
    public MobileElement relatedProductText;

    //product detail page add button
    @iOSXCUITFindBy(accessibility = "Add to Cart")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"1\")")
    public MobileElement addProductButton;

    //android back arrow
    @AndroidFindBy(id = "btnBack")
    public MobileElement androidBackArrow;

}
