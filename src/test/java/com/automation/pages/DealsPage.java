package com.automation.pages;

import com.automation.pageElements.DealsPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class DealsPage extends BasePage{
    public DealsPageElements pageElements = new DealsPageElements();
    public DealsPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageElements);
    }


    public void waitForPageDisplayed() {
       waitForDisplayed(pageElements.dealPageTitle);
    }

    public void clickBackButton() {
        clickElement(pageElements.backButton);
    }

    public void clickPromoCode() {
        clickElement(pageElements.promoCodeDeal);
    }

    public void waitForPromoCodeWindowDisplayed() {
        waitForDisplayed(pageElements.promoCodeTitle);
    }

    public void clickClubCard() {
        clickElement(pageElements.clubCardSpecials);
    }

    public void clickBuyOneGetOneFree() {
        clickElement(pageElements.buyOneGetOneFree);
    }

    public void waitForClubCardDealsWindowDisplayed() {
        waitForDisplayed(pageElements.clubCardSpecialsTitle);
    }

    public void waitForBuyOneGetOneFreeDisplayed() {
        waitForDisplayed(pageElements.buyOneGetOneFree);
    }

    public void clickSearchIcon() {
        clickElement(pageElements.searchIcon);
    }
}
