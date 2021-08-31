package com.automation.pages;


import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.pageElements.HomePageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventFlag;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomePage extends BasePage {
    public HomePageElements homePageElements = new HomePageElements();
    public HomePage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), homePageElements);
    }

    public void waitForHomePageDisplayed(){
        waitForLoadingComplete();
       waitVar.until(ExpectedConditions.visibilityOf(homePageElements.menuButton));
       Assert.assertTrue(homePageElements.menuButton.isDisplayed());
    }

    public void clickMenuIcon(){
        homePageElements.menuButton.click();
    }

    public void clickAddButton(){
        homePageElements.addItemButtons.get(0).click();
    }

    public void clickShoppingCartButton() throws InterruptedException {
        Thread.sleep(1000);
        waitForClickableAndClick(homePageElements.shoppingCartButton);
    }

    public void clickAislesTab() throws InterruptedException {
        homePageElements.aisleTab.click();
        Thread.sleep(1000);
        waitForLoadingComplete();
    }

    public void waitForSubListDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.subListElements.get(0)));
    }

    public void clickSubListItem(String arg0) {
        homePageElements.subListElements.get(Integer.parseInt(arg0) - 1).click();
    }

    public void waitForCategoryListDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf( homePageElements.categoryListElements.get(0)));
    }

    public void waitForDepartmentListDisplayed() {
        waitForDisplayed(homePageElements.aisleTitle);
    }

    public void clickCategoryListItem(String arg0) {
        if(driver.getPlatformName().equalsIgnoreCase("ios"))
            homePageElements.categoryListElements.get(Integer.parseInt(arg0) - 2).click();
        else
            homePageElements.categoryListElements.get(Integer.parseInt(arg0) - 1).click();
    }

    public void clickDepartmentListItem(String arg0) {
        homePageElements.departmentListElements.get(Integer.parseInt(arg0) - 1).click();
    }

    public void waitForItemFoundFromAisle() {
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.aisleResultText));
    }

    public void clickAddItem(String arg0) throws InterruptedException {
        if(driver.getPlatformName().equalsIgnoreCase("ios")){
            try {
                if(homePageElements.iosTogglePopUp.isDisplayed())
                    homePageElements.iosCloseToggle.click();
            }catch(Exception e){}
        }
            Thread.sleep(1000);
            waitForLoadingComplete();
            MobileElement element = homePageElements.addButtonList.get(Integer.parseInt(arg0) - 1);
            element.click();

    }

    public void clickMyPurchaseTab() {
        homePageElements.myPurchaseTab.click();
        waitForLoadingComplete();
    }

    public void clickSearchBar() {
        homePageElements.searchEditText.click();
        driver.hideKeyboard();
    }

    public void waitForSearchWindowDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.currentTrendingText));
    }

    public void clickElementsByIndex(int arg0) {
        List<MobileElement> elements = homePageElements.autoSuggestSearchList;
        clickElement(elements.get(arg0));
    }

    public void enterSearchItem(String arg0) {

        if (driver.getPlatformName().equalsIgnoreCase("android")){

            if (AppiumDeviceManager.getDevice().getDeviceType().equalsIgnoreCase("cloud")) {
                homePageElements.searchEditText.click();
                homePageElements.searchEditText.sendKeys(arg0);
                tapSearchAndroidKeyboard();
                driver.hideKeyboard();
            } else {
                enterKey(homePageElements.searchEditText, arg0);
                androidKeyboardClickDone();
            }
        } else {
            enterKey(homePageElements.searchEditText, arg0 + Keys.RETURN.toString());
        }
    }

    public void clickDealTab() {
        clickElement(homePageElements.dealsTab);
        waitForLoadingComplete();
    }

    public void verifyPopularItemsDisplayed() {
        waitForDisplayed(homePageElements.popularItemText);
    }

    public void verifyMostViewedDisplayed() {
        scrollDownForElement(homePageElements.mostViewedText);
    }

    public void waitForResultFoundDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(homePageElements.searchResultText));
        Assert.assertTrue(homePageElements.searchResultText.isDisplayed());

    }

    public void clickCancelButton() {
        waitForLoadingComplete();
        clickElement(homePageElements.cancelButton);
    }

    public void waitForNotificationAlert() {
        waitForDisplayed(homePageElements.notificationText);
    }

    public void clickDoNotAllowNotification() {
        clickElement(homePageElements.doNotAllowNotificationButton);
    }

    public void increaseItemQuantity(int item, int quantity) throws InterruptedException {
        if(driver.getPlatformName().equalsIgnoreCase("android")) {
            MobileElement element = null;
            element = homePageElements.plusButtonList.get(item - 1);
            for (int i = 0; i < quantity; i++) {
                tapElement(element);
            }
        }
    }

    public void clickDeliveryOption() {
        clickElement(homePageElements.editDeliveryButton);
    }

    public void waitForLoveShoppingPopUpDisplayed(){
        waitForDisplayed(homePageElements.loveShoppingPopUpText);
    }

    public void clickLoveShoppingYesButton(){
        clickElement(homePageElements.loveShoppingYesButton);
    }

    public void waitForRateShopPopup(){
        waitForDisplayed(homePageElements.ratingShopWindowText);
    }

    public void clickRateShopNotNowButton(){
        clickElement(homePageElements.ratingShopNotNowButton);
    }

    public void clickAutoSuggestItem(int arg0) {
        waitForDisplayed(homePageElements.currentTrendingText);
        if(getPlatformName().equalsIgnoreCase("ios")){
            clickElement(homePageElements.autoSuggestBread);
        } else {
            clickElement(homePageElements.autoSuggestSearchList.get(arg0 - 1));
        }
    }

    public void clickItemOnAisleList(String item) throws InterruptedException {
        waitForLoadingComplete();
        Thread.sleep(1000);
        tapElementCoordinate(findElementByName(item));
        waitForLoadingComplete();
    }

    public boolean verifyPreferenceDisplayed(String preference) {
        waitForDisplayed(homePageElements.editDeliveryButton);
        if (preference.equalsIgnoreCase("delivery")) {
            return homePageElements.editDeliveryButton.getText().contains("Delivery");
        } else if (preference.equalsIgnoreCase("pickup")){
            return homePageElements.editDeliveryButton.getText().contains("Pick Up");
        }
        return false;
    }

    public boolean waitForWindowDisplayed(String title) {
        waitForDisplayed(homePageElements.windowTitle);
        return homePageElements.windowTitle.getText().equalsIgnoreCase(title);
    }

    public void clickReserveTimeOption() {
        clickElement(homePageElements.editReserveTimeButton);
    }

    public void clickViewAllPopularItems() {
        clickElement(homePageElements.popularViewAllButton);
    }

    public void clickSortAndFilterButton() {
        clickElement(homePageElements.sortAndFilterButton);
    }

    public void waitForNoResultDisplayed() {
        waitForDisplayed(homePageElements.noSearchResult);
    }

    public void waitForProductDetailPageDisplayed() {
        waitForDisplayed(homePageElements.productImage);
    }

    public void waitForRelatedItemDisplayed() {
        scrollDownForElement(homePageElements.relatedProductText);
        waitForDisplayed(homePageElements.relatedProductText);
    }

    public void clickAddProductButton() {
        scrollTop();
        clickElement(homePageElements.addProductButton);
    }

    public void clickProductFromSearchList(int arg0) throws InterruptedException {
        waitForLoadingComplete();
        clickElement(homePageElements.searchResultProductList.get(arg0 - 1));
    }

    public void waitForRecentSearchedItemDisplayed() {
        waitForDisplayed(homePageElements.recentlySearchedText);
    }

    public void waitForDealsToggleSwitchDisplayed() {
        waitForDisplayed(homePageElements.dealsToggleSwitch);
    }

    public void clickDealsToggleSwitch() {
        clickElement(homePageElements.dealsToggleSwitch);
    }

    public boolean dealsToggleSwitch(String switchStatus) {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            if (homePageElements.dealsToggleSwitch.
                    getAttribute("value").equalsIgnoreCase(switchStatus)) return true;
        } else if (driver.getPlatformName().equalsIgnoreCase("android")) {
            if (homePageElements.dealsToggleSwitch.
                    getAttribute("checked").equalsIgnoreCase("true") && switchStatus.equals("on"))
                return true;
            if (homePageElements.dealsToggleSwitch.
                    getAttribute("checked").equalsIgnoreCase("false") && switchStatus.equals("off"))
                return true;
        }
        return false;
    }

    public void androidNavigateBackArrow() {
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            clickElement(homePageElements.androidBackArrow);
        }
    }

    public void changeQuantityto(String arg0) {
        waitForLoadingComplete();
        waitForDisplayed(homePageElements.quantityButton);

        tapElementCoordinate(homePageElements.quantityButton);
        waitForDisplayed(homePageElements.quantityTextEdit);
        homePageElements.quantityTextEdit.sendKeys(arg0);
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            driver.findElementByName("Update").click();
        } else {
            tapEnterAndroidKeyboard();
        }
    }
}

