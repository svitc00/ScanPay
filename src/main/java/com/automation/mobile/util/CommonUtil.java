package com.automation.mobile.util;

import com.automation.mobile.appium.AppiumDevice;
import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.mobile.entities.FileLocations;
import com.automation.mobile.entities.MobileConfType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.aspectj.util.FileUtil;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {
        static public String captureScreenshot(AppiumDevice device, AppiumDriver driver) throws IOException {
            String banner = device.getBanner();
            String deviceName = device.getConfigureData(MobileConfType.DEVICE_NAME);
            String currentDate = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            String path = FileLocations.REPORT_DIRECTORY + "screenshot/"
                    + banner + "_" +deviceName + "/" + "screenshot" + currentDate + ".png";
            File target = new File(path);
            FileUtil.copyFile(src, target);
            return "./screenshot/" + banner + "_" +deviceName + "/" + "screenshot" + currentDate + ".png";
            //return path;

        }
    }

