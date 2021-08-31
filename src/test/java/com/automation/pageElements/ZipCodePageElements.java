package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

public class ZipCodePageElements {

    //zipcode title
    //android text : "ZIP Code"
    @iOSXCUITFindBy(accessibility = "ZIP Code")
    @AndroidFindBy(id = "title")
    public MobileElement zipCodeTitle;

    //zipcode input
    @iOSXCUITFindBy(accessibility = "Zip Code")
    @AndroidFindBy(id = "edit_text")
    //@CacheLookup
    public MobileElement zipCodeEditText;

    //next button
    @iOSXCUITFindBy(accessibility = "Tap to Confirm zipcode")
    @AndroidFindBy(id = "btn_next")
    @CacheLookup
    public MobileElement enterButton;

    //use my location
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name ENDSWITH 'location'")
    @AndroidFindBy(id = "btn_use_loc")
    @CacheLookup
    public MobileElement useMyLocationButton;

    //sign in here
    @iOSXCUITFindBy(accessibility = "Sign In Here")
    @AndroidFindBy(id = "link_text_signin")
    @CacheLookup
    public MobileElement signInHereButton;

    //second zip code page when enter invalid zipcode
    //we are not in your area yet
    //android text : "We're not in your area yet."
    @iOSXCUITFindBy(accessibility = "We’re not in your area yet.")
    @AndroidFindBy(id = "textView")
    @CacheLookup
    public MobileElement notAreaTitle;

    //update info to email address text file
    @iOSXCUITFindBy(accessibility = "Email")
    @AndroidFindBy(id = "edit_text_email")
    @CacheLookup
    public MobileElement invalidZipEmailTextEdit;

    //next button
    @iOSXCUITFindBy(accessibility = "Confirm email")
    @AndroidFindBy(id = "btnNotifyMe")
    @CacheLookup
    public MobileElement invalidZipNextButton;

    //enter another zip code
    @iOSXCUITFindBy(accessibility = "Enter Another ZIP Code")
    @AndroidFindBy(id = "try_another_zip")
    @CacheLookup
    public MobileElement enterAnotherZipCodeLink;

    //thank you text in confirm zip code email
    @iOSXCUITFindBy(accessibility = "Thank You!")
    @AndroidFindBy(id = "thankyou") //need to be changed after issue fixed
    @CacheLookup
    public MobileElement thankYouText;

    //after create account zip code page
    @iOSXCUITFindBy(accessibility = "whiteRightArrow")
    @AndroidFindBy(id = "btn_next")
    public MobileElement registerZipCodeNext;

}
