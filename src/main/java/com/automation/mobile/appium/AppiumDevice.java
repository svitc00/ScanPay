package com.automation.mobile.appium;

import com.automation.mobile.entities.BannerConfType;
import com.automation.mobile.entities.ConfigType;
import com.automation.mobile.entities.MobileConfType;

import java.util.HashMap;
import java.util.Map;

public class AppiumDevice {

    private Map<String, String> appiumDeviceData = new HashMap<>();

    public AppiumDevice(Map<String, String> deviceData) {
        deviceData.forEach((k, v) -> appiumDeviceData.put(k, v));
    }

    public String getConfigureData(String configureName){
        return appiumDeviceData.get(configureName);
    }

    public String getMobileName() {
        return appiumDeviceData.get(ConfigType.MOBILE_DEVICE_NAME);
    }

    public String getBanner() {
        return appiumDeviceData.get(ConfigType.BANNER);
    }

    public String getEnv() {
        return appiumDeviceData.get(ConfigType.APP_ENVIRONMENT);
    }

    public String getUdid() {
        return appiumDeviceData.get(MobileConfType.UDID);
    }

    public String getDeviceName() {
        return appiumDeviceData.get(MobileConfType.DEVICE_NAME);
    }

    public String getPlatform() {
        return appiumDeviceData.get(MobileConfType.PLATFORM_NAME);
    }

    public String getCloudUserName() {
        return appiumDeviceData.get(MobileConfType.CLOUD_USER);
    }

    public String getCouldPassword() {
        return appiumDeviceData.get(MobileConfType.CLOUD_PASSWORD);
    }

    public String getCloudUrl() {
        return appiumDeviceData.get(MobileConfType.CLOUD_SERVER);
    }

    public String getCouldToken() {
        return appiumDeviceData.get(MobileConfType.CLOUD_TOKEN);
    }

    public String getDeviceType() {
        return appiumDeviceData.get(MobileConfType.DEVICE_TYPE);
    }

    public String getApplicationName() {
        return appiumDeviceData.get(MobileConfType.DEVICE_TYPE);
    }

    public String getPlatformVersion() {
        return appiumDeviceData.get(MobileConfType.PLATFORM_VERSION);
    }

    public String getXcodeOrgId() {
        return appiumDeviceData.get(MobileConfType.IOS_XCODE_ORGID);
    }

    public String getXcodeSignId(){
        return appiumDeviceData.get(MobileConfType.IOS_XCODE_SIGNINGID);
    }

    public String getActivityName() {
        return appiumDeviceData.get(BannerConfType.ACTIVITY_NAME);
    }

    public String getPackageName() {
        return appiumDeviceData.get(BannerConfType.PACKAGE_NAME);
    }

    public String getBundleId() {
        return appiumDeviceData.get(BannerConfType.BUNDLE_ID);
    }

    public String getZipCode() {
        return appiumDeviceData.get(BannerConfType.BANNER_ZIPCODE);
    }

    public String getAccountUser() {
        return appiumDeviceData.get(BannerConfType.BANNER_USERNAME);
    }

    public String getAccountPass() {
        return appiumDeviceData.get(BannerConfType.BANNER_PASSWORD);
    }

    public String getAccountPhone() {
        return appiumDeviceData.get(BannerConfType.BANNER_PHONE_NUMBER);
    }

    public String getAccountFirstName() {
        return appiumDeviceData.get(BannerConfType.BANNER_FIRST_NAME);
    }

    public String getAccountLastName() {
        return appiumDeviceData.get(BannerConfType.BANNER_LAST_NAME);
    }

    public String getAddressLine1() {
        return appiumDeviceData.get(BannerConfType.BANNER_ADDRESS_LINE1);
    }

    public String getAddressLine1SR() {
        return appiumDeviceData.get(BannerConfType.BANNER_ADDRESS_LINE1_FORSR);
    }
}
