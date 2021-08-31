package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class DealsPageElements {

    //deals title
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Deals' AND visible == 1")
    @AndroidFindBy(accessibility = "Promo Code Deals")
    public MobileElement dealPageTitle;

    //top promo code deals with picture
    @AndroidFindBy(accessibility = "PROMO CODE DEAL")
    @iOSXCUITFindBy(id = "dealer_container")
    public MobileElement topDealItem;

    //promo code deals
    @AndroidFindBy(id = "promo_code_deals_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Promo Code Deals'")
    public MobileElement promoCodeDeal;

    //club card specials
    @AndroidFindBy(id = "club_card_specials_tv")
    @iOSXCUITFindBy(accessibility = "Club Card Specials")
    public MobileElement clubCardSpecials;

    //buy one get one free
    @AndroidFindBy(id = "bogo_tv")
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Buy One Get One Free'")
    public MobileElement buyOneGetOneFree;

    //back button
    @AndroidFindBy(accessibility = "Navigate up")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Deals\"])[1]")
    public MobileElement backButton;

    //promo code deal title
    @AndroidFindBy(id = "tvTitle") //text = "Promo Code Deals"
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Promo Code Deals' AND visible == 1")
    public MobileElement promoCodeTitle;

    //club card specials title
    @AndroidFindBy(id = "tvTitle") //text = "Club Card Specials"
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Club Card Specials' AND visible == 1")
    public MobileElement clubCardSpecialsTitle;

    //buy one get one free title
    @AndroidFindBy(id = "tvTitle")  //text = "Buy One, Get One Free"
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Buy One, Get One Free' AND visible == 1")
    public MobileElement buyOneGetOneTitle;

    //search icon on the top right corner
    @AndroidFindBy(id = "menu_search")
    @iOSXCUITFindBy(accessibility = "Search")
    public WebElement searchIcon;
}
