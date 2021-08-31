package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.CacheLookup;

import java.util.List;

public class MyAccountPageElements {

    //public WebElement myAccountPageTitle;
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Account' AND visible == 1")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement myAccountPageTitle;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH[c] 'Hi' AND visible == 1")
    @AndroidFindBy(id = "account_firstname")
    @CacheLookup
    public MobileElement firstNameText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Savings Summary' AND visible == 1")
    @AndroidFindBy(id = "savings_summary")
    @CacheLookup
    public MobileElement savingSummary;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH[c] '2' AND visible == 1")
    @AndroidFindBy(id = "current_year")
    @CacheLookup
    public MobileElement currentYearText;

    @iOSXCUITFindBy(accessibility = "Lifetime")
    @AndroidFindBy(id = "lifetime")
    @CacheLookup
    public MobileElement lifetimeText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH[c] '$' AND visible == 1")
    @AndroidFindBy(id = "current_year_amt")
    public MobileElement currentYearSaving;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH[c] '$' AND visible == 1")
    @AndroidFindBy(id = "lifetime_amt")
    public MobileElement lifetimeSaving;

    @iOSXCUITFindBy(accessibility = "Address")
    @AndroidFindBy(id = "delivery_address_head")
    @CacheLookup
    public MobileElement userAddressHead;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[10]")
    @AndroidFindBy(id = "delivery_address_content")
    //@CacheLookup
    public MobileElement userAddressText;

    @iOSXCUITFindBy(accessibility = "Drive Up & Go Store Address")
    @AndroidFindBy(id = "dug_address_head")
    @CacheLookup
    public MobileElement dugAddressHead;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[14]")
    @AndroidFindBy(id = "dug_address_content")
    //@CacheLookup
    public MobileElement storeAddressText;

    @iOSXCUITFindBy(accessibility = "Contact Phone Number")
    @AndroidFindBy(id = "delivery_contact_head")
    @CacheLookup
    public MobileElement phoneNumberHead;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[18]")
    @AndroidFindBy(id = "delivery_contact_content")
    //@CacheLookup
    public MobileElement contactPhoneNumberText;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[22]")
    @AndroidFindBy(id = "store_phone_content")
    //@CacheLookup
    public MobileElement phoneNumberUsedInStore;

    @iOSXCUITFindBy(accessibility = "Email Address")
    @AndroidFindBy(id = "email_head")
    @CacheLookup
    public MobileElement emailAddressHead;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name ENDSWITH '@example.com' AND visible == 1")
    @AndroidFindBy(id = "email_content")
    @CacheLookup
    public MobileElement userEmail;

    @iOSXCUITFindBy(accessibility = "Communication Preferences")
    @AndroidFindBy(id = "comm_pref_rl")
    public MobileElement communicationPreference;

    @iOSXCUITFindBy(accessibility = "Update Password / Security")
    @AndroidFindBy(id = "update_password_rl")
    public MobileElement passwordSecurity;


    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'More' AND visible == 1")
    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement navigateBackButton;

    @iOSXCUITFindBy(accessibility = "Cancel")
    @AndroidFindBy(accessibility = "Navigate up")
    public MobileElement navigateBackToAccountPageButton;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeButton' AND name == 'Save' AND visible == 1")
    @AndroidFindBy(id= "btn_save")
    @CacheLookup
    public MobileElement saveButton;

    //address window elements
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeNavigationBar' AND name == 'Address' AND visible == 1")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement addressWindowTitle;

    @iOSXCUITFindBy(accessibility = "Enter Zipcode Text Field")
    @AndroidFindBy(id = "edit_text")
    public MobileElement zipcodeEditText;

    @iOSXCUITFindBy(accessibility = "Enter Address Line One")
    @AndroidFindBy(id = "edit_text")
    @CacheLookup
    public MobileElement addressLine1EditText;

    @AndroidFindBy(id = "edit_text")
    public List<MobileElement> androidAddressEditList;

    //user phone number window
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Contact Phone Number' AND visible == 1")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement phoneNumberWindowTitle;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Phone Number' AND visible == 1")
    @AndroidFindBy(id = "edit_text")
    public MobileElement phoneNumberEditText;

    //password window
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeNavigationBar' AND name == 'Update Password / Security' AND visible == 1")
    @AndroidFindBy(id = "tvTitle")
    public MobileElement passwordWindowTitle;

    @iOSXCUITFindBy(className = "XCUIElementTypeSecureTextField")
    @AndroidFindBy(id = "edit_text")
    public List<MobileElement> passwordEditFieldList;

    @iOSXCUITFindBy(accessibility = "Password")
    @AndroidFindBy(id = "edit_text")
    public MobileElement currentPasswordEditText;

    @iOSXCUITFindBy(accessibility = "New Password Field")
    @AndroidFindBy(id = "edit_text")
    public MobileElement newPasswordEditText;

    @iOSXCUITFindBy(accessibility = "Confirm New Password Field")
    @AndroidFindBy(id = "edit_text")
    public MobileElement confirmPasswordEditText;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Password must be 8-40 characters long.' AND visible == 1")
    @AndroidFindBy(accessibility = "Please create a password with 8-40 characters.")
    public MobileElement passwordAlertMessage;

    //phone number used in store window
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name == 'Phone Number Used in Store' AND visible == 1")
    @AndroidFindBy(id = "label_text")
    public MobileElement phoneNumberEditTitle;

    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Phone Number' AND visible == 1")
    @AndroidFindBy(id = "edit_text")
    public List<MobileElement> phoneEditTextList;

    //popup window
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeStaticText' AND name BEGINSWITH 'Would you like to save' AND visible == 1")
    @AndroidFindBy(id = "alertTitle")
    public MobileElement popupMessage;

    @iOSXCUITFindBy(accessibility = "No")
    @AndroidFindBy(id = "android:id/button2")
    public MobileElement selectNoButtonToSave;

    @iOSXCUITFindBy(accessibility = "Yes")
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement selectYesButtonToSave;

    //************************************ Email Address window *************************************//
    @iOSXCUITFindBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND name == 'Email' AND visible == 1")
    @AndroidFindBy(id = "edit_text")
    public List<MobileElement> emailEditTextList;

    //************************************ Communnication window *************************************//

}
