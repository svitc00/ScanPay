package com.automation.pageElements;

import cucumber.api.java.cs.A;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SortFilterPageElements {
    //Sort & Filter title
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Sort & Filter'")
    @AndroidFindBy(accessibility = "Cancel Sort or Filter page.")
    public MobileElement sortFilterTitle;

    //Done or close button
    @iOSXCUITFindBy(accessibility = "Done")
    @AndroidFindBy(id = "btnSave")
    public MobileElement saveSortFilterPage;

    //Sort By text
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[3]")
    @AndroidFindBy(id = "selectedSortText")
    public MobileElement selectSortText;

    //Sort & Filter By window title
    @iOSXCUITFindBy(className = "XCUIElementTypeNavigationBar")
    @AndroidFindBy(id = "app_bar_title")
    public MobileElement sortByWindowTitle;

    //Best Match
    @iOSXCUITFindBy(accessibility = "Best Match")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Best Match\")")
    public MobileElement selectBestMatch;

    //Club Card Special
    @iOSXCUITFindBy(accessibility = "Club Card Specials")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Club Card Specials\")")
    public MobileElement selectClubCardSpecial;

    //Most popular
    @iOSXCUITFindBy(accessibility = "Most Popular")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Most Popular\")")
    public MobileElement selectMostPopular;

    //Price Low to High
    @iOSXCUITFindBy(accessibility = "Price Low to High")
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Price: Low to High\")")
    public MobileElement selectPriceLowToHigh;


}
