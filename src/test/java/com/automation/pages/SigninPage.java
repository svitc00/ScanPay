package com.automation.pages;

import com.automation.pageElements.SigninPageElements;
import com.automation.pageElements.WalletPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SigninPage extends BasePage {
    public SigninPageElements signinPageElements = new SigninPageElements();

    public SigninPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), signinPageElements);
    }
    public void justForYouLogIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(signinPageElements.justforyouimage));
        Assert.assertTrue(signinPageElements.justforyouimage.isDisplayed());
    }
}
