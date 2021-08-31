package com.automation.pages;

import com.automation.pageElements.CheckoutPageElements;
import com.automation.pageElements.SortFilterPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class SortFilterPage extends BasePage {
    public SortFilterPageElements pageElements = new SortFilterPageElements();
    public SortFilterPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageElements);
    }

    public void sortAndFilterPageDisplayed() {
        waitForDisplayed(pageElements.sortFilterTitle);
    }

    public void clickSortBy() {
        clickElement(pageElements.selectSortText);
    }

    public void waitForSortFilterByWindowDisplayed() {
        waitForDisplayed(pageElements.sortByWindowTitle);
    }

    public void selectBestMatch() {
        clickElement(pageElements.selectBestMatch);
    }

    public void selectClubCardSpecial() {
        clickElement(pageElements.selectClubCardSpecial);
    }

    public void selectMostPopular() {
        clickElement(pageElements.selectMostPopular);
    }

    public void selectPriceLowToHigh() {
        clickElement(pageElements.selectPriceLowToHigh);
    }

    public void waitForSelectedSortByOptionDisplayed(String arg0) {
            waitForDisplayed(pageElements.selectSortText);
            Assert.assertTrue(pageElements.selectSortText.getText().contains(arg0));
    }

    public void clickSavePage() {
        clickElement(pageElements.saveSortFilterPage);
    }
}
