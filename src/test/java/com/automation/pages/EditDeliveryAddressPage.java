package com.automation.pages;

import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDeviceManager;
import com.automation.mobile.entities.BannerConfType;
import com.automation.mobile.manager.ConfigFileManager;
import com.automation.pageElements.EditDeliveryAddressPageElements;
import com.automation.pageElements.MyAccountPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.Map;

public class EditDeliveryAddressPage extends BasePage  {
    private EditDeliveryAddressPageElements pageElements  = new EditDeliveryAddressPageElements();
    public EditDeliveryAddressPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), pageElements);
    }

    public void enterAddressLine1(String address){
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            deleteCurrentTextInEditText(pageElements.addressLine1TextField);
        } else {
            pageElements.addressLine1TextField.clear();
        }
        enterKey(pageElements.addressLine1TextField, address);
    }
    public void editNewAddress() throws IOException {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String address = device.getConfigureData(BannerConfType.BANNER_ADDRESS_LINE1_FORSR);
        enterAddressLine1(address);
    }
    public void editOriginalAddress() throws IOException {
        AppiumDevice device = AppiumDeviceManager.getDevice();
        String address = device.getConfigureData(BannerConfType.BANNER_ADDRESS_LINE1);
        enterAddressLine1(address);
    }

    public void navigateBackTopLeftArrow() {
            clickElement(pageElements.topLeftArrowBack);
    }
}
