package com.automation.pages;

import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.pageElements.DeliverPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;

public class DeliverPage extends BasePage {
    public AppiumDevice device = AppiumDeviceManager.getDevice();
    public DeliverPageElements pageElements = new DeliverPageElements();
    public DeliverPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageElements);
    }


    public void waitForOrderInfoWindowDisplayed() {
        waitForDisplayed(pageElements.saveButton);
    }

    public void selectDeliveryOption(String deliverOption) {
        if(deliverOption.toLowerCase().contains("unattend")){
            clickElement(pageElements.unattendedButton);
        }else if(deliverOption.toLowerCase().contains("attend")){
           clickElement(pageElements.attendedButton);
        }
    }

    public void clickSaveButton() {
        waitForLoadingComplete();
        waitForClickableAndClick(pageElements.saveButton);
    }

    public void waitForDateTimePickerDisplayed() {
        waitForDisplayed(pageElements.datePicker);
    }

    public void changeDatePickerToEnableSave() throws InterruptedException {
        waitForLoadingComplete();
        scrollDown();
        MobileElement element = null;
        element = pageElements.datePicker;

        if (device.getPlatform().equalsIgnoreCase("ios")) {
            HashMap<String, Object> params = new HashMap<>();
            params.put("order", "next");
            params.put("offset", 0.15);
            params.put("element", ((RemoteWebElement) element).getId());
            driver.executeScript("mobile: selectPickerWheelValue", params);
        } else {
            Dimension dimension = element.getSize();
            Point center = element.getCenter();
            Point tapPoint = new Point(center.x, (int) (center.y + dimension.height * 0.5));

            scroll(tapPoint.x, tapPoint.y, center.x, center.y);
        }
        Thread.sleep(2000);
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.elementToBeClickable(pageElements.saveButton));
    }

    public void selectHourOption(int hour) {
        MobileElement hourElement = null;

        switch (hour) {
            case 1:
                hourElement = pageElements.oneHourDeliveryButton;
                break;
            case 2:
                hourElement = pageElements.twoHourDeliveryButton;
                break;
            case 4:
                hourElement = pageElements.fourHourDeliveryButton;
                break;
            default:
                break;
        }
        clickElement(hourElement);
    }
}
