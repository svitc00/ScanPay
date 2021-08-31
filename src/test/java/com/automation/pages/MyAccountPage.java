package com.automation.pages;

import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.mobile.entities.BannerConfType;
import com.automation.mobile.manager.ConfigFileManager;
import com.automation.pageElements.MyAccountPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class MyAccountPage extends BasePage {
    private MyAccountPageElements myAccountPageElements = new MyAccountPageElements();
    public MyAccountPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), myAccountPageElements);
    }

    public void waitForAccountPageDisplayed() {
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf( myAccountPageElements.myAccountPageTitle));
        Assert.assertEquals(myAccountPageElements.myAccountPageTitle.getText(), "Account");
    }

    public void verifyPhoneNumberUsedInStoreDisplayed() {
        scrollDownForElement(myAccountPageElements.phoneNumberUsedInStore);
        Assert.assertTrue(myAccountPageElements.phoneNumberUsedInStore.isDisplayed());
    }

    public void clickEditPhoneNumber() {
        clickElement(myAccountPageElements.phoneNumberUsedInStore);
    }

    public void verifySavingsSummeryDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(myAccountPageElements.savingSummary));
    }

    public void verifyAddressWindowDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(myAccountPageElements.userAddressText));
    }

    public void verifyStoreInfoDisplayed() {
        scrollDownForElement(myAccountPageElements.storeAddressText);
    }

    public void verifyEmailAddressDisplayed() {
        scrollDownForElement(myAccountPageElements.userEmail);
    }

    public void verifyCommunicationPreferenceDisplayed() {
        scrollDownForElement(myAccountPageElements.communicationPreference);
    }

    public void verifyPasswordSecurityDisplayed() {
        scrollDownForElement(myAccountPageElements.passwordSecurity);
    }

    public void clickBackButton() {
        clickElement(myAccountPageElements.navigateBackButton);
    }

    public void verifyPhoneNumberEditWindowDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(myAccountPageElements.phoneNumberEditTitle));
    }

    public void createNewPhoneNumber() {
            String areaCode = (int)(Math.random() * 7 + 2) +
                    new SimpleDateFormat("dd").format(new Date());
            String phoneCode = (int)(Math.random() * 7 + 2) +
                    new SimpleDateFormat("HHmmss").format(new Date());

        enterPhoneNumberOnPhoneNumberEditWindow(areaCode + phoneCode);

    }

    private  void enterPhoneNumberOnPhoneNumberEditWindow(String number){
        for(MobileElement element: myAccountPageElements.phoneEditTextList){
            element.clear();
            enterKey(element, number);
        }
    }
    public void clickSaveButton() {
        clickElement(myAccountPageElements.saveButton);
    }

    public void verifyOriginalPhoneNumberDisplayed() throws IOException {

        AppiumDevice device = AppiumDeviceManager.getDevice();
        String lastFourDigits = device.getConfigureData(BannerConfType.BANNER_CONTACT_NUMBER)
                .substring(6, 9);
        Assert.assertTrue(containTextDisplayed(lastFourDigits));
    }
    public void verifyNewPhoneNumberDisplayed() throws IOException {

        AppiumDevice device = AppiumDeviceManager.getDevice();
        String lastFourDigits = device.getConfigureData(BannerConfType.BANNER_CONTACT_NUMBER)
                .substring(6, 9);
        Assert.assertFalse(myAccountPageElements.phoneNumberUsedInStore.getText().contains(lastFourDigits));
    }

    public void updateSavedPhoneNumber() throws IOException {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String number = device.getConfigureData(BannerConfType.BANNER_PHONE_NUMBER);
        enterPhoneNumberOnPhoneNumberEditWindow(number);
    }

    public void verifyCurrentPhoneNumberDisplayed() throws IOException {
        String banner = getCurrentBanner();
        String env = getCurrentEnv();
        Map<String, String> bannerProperty = ConfigFileManager.getBannerPropertyMap(banner, env);
        Assert.assertEquals(myAccountPageElements.phoneNumberUsedInStore.getText(),bannerProperty.get("PHONENUMBER") );
    }

    public void clickBackButtonToAccountPage() throws InterruptedException {
        Thread.sleep(1000);
        clickElement(myAccountPageElements.navigateBackToAccountPageButton);
    }

    public void PopupSaveConfirmMessage() {
            waitForDisplayed(myAccountPageElements.popupMessage);
    }

    public void PopupSaveButtonClick(String button) {
            if(button.equalsIgnoreCase("no")){clickElement(myAccountPageElements.selectNoButtonToSave);}
            else if(button.equalsIgnoreCase("yes")){clickElement(myAccountPageElements.selectYesButtonToSave);}
    }

    public void verifyContactPhoneNumberDisplayed() {
        scrollDownForElement(myAccountPageElements.phoneNumberHead);
        Assert.assertTrue(myAccountPageElements.phoneNumberHead.isDisplayed());
    }

    public void clickEditContactPhoneNumber() {
        clickElement(myAccountPageElements.phoneNumberHead);
    }

    public void waitForContactphoneEditWindowDisplayed() {
        waitForDisplayed(myAccountPageElements.phoneNumberWindowTitle);
    }

    public void createNewContactNumber() {
        String areaCode = (int)(Math.random() * 7 + 2) +
                new SimpleDateFormat("dd").format(new Date());
        String phoneCode = (int)(Math.random() * 7 + 2) +
                new SimpleDateFormat("HHmmss").format(new Date());
        enterContactNumberOnContactPhoneEditWindow(areaCode + phoneCode);
    }
    private void enterContactNumberOnContactPhoneEditWindow(String number){
        myAccountPageElements.phoneNumberEditText.clear();
        enterKey(myAccountPageElements.phoneNumberEditText, number);
    }

    public void newContactNumberWindowDisplayed() {
        waitForDisplayed(myAccountPageElements.phoneNumberWindowTitle);
    }

    public void updateSavedContactNumber() throws IOException {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String number = device.getConfigureData(BannerConfType.BANNER_CONTACT_NUMBER);
        enterContactNumberOnContactPhoneEditWindow(number);
    }

    public void verifyOriginalContactPhoneNumberDisplayed() throws IOException, InterruptedException {
       AppiumDevice device = AppiumDeviceManager.getDevice();
        String lastFourDigits = device.getConfigureData(BannerConfType.BANNER_CONTACT_NUMBER)
                .substring(6, 9);
        Thread.sleep(3000);
        Assert.assertTrue(myAccountPageElements.contactPhoneNumberText.getText().contains(lastFourDigits));
    }

    public void clickEditAddress() {
        clickElement(myAccountPageElements.userAddressHead);
    }

    public void verifyAddressEditWindowDisplayed() {
        waitForDisplayed(myAccountPageElements.addressWindowTitle);
    }

    public void editNewAddress() throws IOException {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String address = device.getConfigureData(BannerConfType.BANNER_ADDRESS_LINE1_FORSR);
        enterAddressEditWindow(address);
    }

    private void enterAddressEditWindow(String address) {
        if(driver.getPlatformName().equalsIgnoreCase("ios")){
            deleteCurrentTextInEditText(myAccountPageElements.addressLine1EditText);
            enterKey(myAccountPageElements.addressLine1EditText, address);
        }else {
            deleteCurrentTextInEditText(myAccountPageElements.androidAddressEditList.get(1));
            enterKey(myAccountPageElements.androidAddressEditList.get(1), address);
        }
    }

    public void verifyOriginalAddressDisplayed() throws IOException {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String address = device.getConfigureData(BannerConfType.BANNER_ADDRESS_LINE1);
        Assert.assertTrue(myAccountPageElements.userAddressText.getText().contains(address));
    }

    public void verifyNewAddressDisplayed() throws IOException {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String address = device.getConfigureData(BannerConfType.BANNER_ADDRESS_LINE1_FORSR);
        Assert.assertTrue(myAccountPageElements.userAddressText.getText().contains(address));
    }

    public void clickEditPassword() {
        clickElement(myAccountPageElements.passwordSecurity);
    }

    public void passwordWindowDisplayed() {
        waitForDisplayed(myAccountPageElements.passwordWindowTitle);
    }

    public void changePassword(String newPass, String oldPass) {
        int i = 0;
        for(MobileElement element: myAccountPageElements.passwordEditFieldList){
            element.clear();
           if(i == 0){
               enterKey(element, oldPass);
           }
           else{enterKey(element, newPass);}
           i++;
        }
    }

    public void editOriginalAddress() throws IOException {
        String banner = getCurrentBanner();
        String env = getCurrentEnv();
        Map<String, String> bannerProperty = ConfigFileManager.getBannerPropertyMap(banner, env);
        String address = bannerProperty.get("ADDRESSLINE1");
        enterAddressEditWindow(address);
    }

    public void verifyNewPhoneContactNumberDisplayed() throws InterruptedException {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String lastFourDigits = device.getConfigureData(BannerConfType.BANNER_CONTACT_NUMBER)
                .substring(6, 9);
        Thread.sleep(3000);
        Assert.assertFalse(myAccountPageElements.contactPhoneNumberText.getText().contains(lastFourDigits));
    }

    public void verifyOriginalEmailDisplayed() {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String email = device.getConfigureData(BannerConfType.BANNER_USERNAME);
        Assert.assertTrue(myAccountPageElements.userEmail.getText().contains(email));
    }

    public void verifyNewEmailDisplayed() {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String email = device.getConfigureData(BannerConfType.BANNER_USERNAME);
        Assert.assertFalse(myAccountPageElements.userEmail.getText().contains(email));
    }

    private  void enterEmailOnEmailEditWindow(String number){
        for(MobileElement element: myAccountPageElements.emailEditTextList){
            deleteCurrentTextInEditText(element);
            enterKey(element, number);
        }
    }

    public void updateSavedEmail() throws IOException {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String email = device.getConfigureData(BannerConfType.BANNER_USERNAME);
        enterEmailOnEmailEditWindow(email);
    }

    public void updateNewEmail() {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String currentDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String email = device.getBanner() + "_" + device.getEnv() + "_" + currentDate + "@example.com";
        enterEmailOnEmailEditWindow(email);
    }

    public void passwordErrorDisplayed() {
        waitForDisplayed(myAccountPageElements.passwordAlertMessage);
    }

    public void verifyToggleSwitchDisplayed(String text) {
        String locator;
        MobileElement element;
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            locator =  "type == 'XCUIElementTypeSwitch' AND name CONTAINS '" + text + "'";
            element = (MobileElement) driver.findElement(MobileBy.iOSNsPredicateString(locator));
        } else {
            locator = "new UiSelector().textContains(\"" + text+ "\")";
            element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(locator));
        }
        Assert.assertTrue(element.isDisplayed());
    }
}
