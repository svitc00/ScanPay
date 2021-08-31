package com.automation.pages;

import com.automation.pageElements.OrderPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {
    public OrderPageElements pageElements = new OrderPageElements();
    public OrderPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageElements);
    }

    public void waitForPageDisplayed() {
        waitForDisplayed(pageElements.orderTitle);
    }

    public void clickCancelOrder() {
        waitForClickableAndClick(pageElements.cancelOrderButton);
    }

    public void waitForCancelOrderPopUp() {
        waitForDisplayed(pageElements.cancelOrderAlertWindow);
    }

    public void clickCancelOrderConfirmation() {
        clickElement(pageElements.cancelOrderConfirmButton);
    }

    public boolean verifyNoPendingOrderDisplayed() throws InterruptedException {
        Thread.sleep(5000);
            if (pageElements.orderNumberList.size() == 0) return true;
            else return false;

    }

    public void clickBackButtonToMenuPage() {
        clickElement(pageElements.backButtonToMenu);
    }

    public void pendingOrderDisplayed() {
    }

    public void waitForPastOrderList() {
        waitForDisplayed(pageElements.pastOrder);
    }
}
