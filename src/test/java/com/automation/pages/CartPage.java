package com.automation.pages;

import com.automation.pageElements.CartPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CartPage extends BasePage {
    private CartPageElements cartPageElements = new CartPageElements();

    public CartPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageElements);
    }


    public void waitForCartPageDisplayed() {
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(cartPageElements.myCartTitle));
    }

    public void waitForEmptyCartDisplayed() {
        waitVar.until(ExpectedConditions.visibilityOf(cartPageElements.emptyCartImage));
    }

    public void emptyCart() {
        while (true) {
            try {
                Thread.sleep(1000);
                if (cartPageElements.emptyCartImage.isDisplayed()) return;
            } catch (Exception e) {
                clickElement(cartPageElements.removeIcon);
            }
        }
    }

    public void closeCartPage() {
        cartPageElements.closeButton.click();
    }

    public boolean verifyTotalNumber(int num) {
        String displayedNum;
        if (driver.getPlatformName().equalsIgnoreCase("android")) {
            displayedNum = cartPageElements.totalNumber.getText().replace("(", "")
                    .replace(")", "");
        } else {//ios
            displayedNum = StringUtils.substringBetween(cartPageElements.totalNumber.getText(), "(", ")");
        }

        if (Integer.parseInt(displayedNum) == num) {
            return true;
        } else return false;
    }

    public void removeItem() {
        cartPageElements.removeIcon.click();
    }

    public void increaseItemQuantity(int item, int quantity) {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            MobileElement element = null;
            element = cartPageElements.plusButtonList.get(item - 1);
            for (int i = 0; i < quantity; i++) {
                clickElement(element);
                //waitForLoadingComplete();
            }
        }
    }

    public void clickCheckout() {
        waitForClickableAndClick(cartPageElements.checkoutButton);
    }

    public boolean checkoutButtonEnabled() {
        waitForDisplayed(cartPageElements.checkoutButton);
        return cartPageElements.checkoutButton.isEnabled();
    }


    public void clickChangeQuantityButtonOnItem(String changeQuantity, int item) {
        List<MobileElement> elements = null;
        if (changeQuantity.equalsIgnoreCase("increase")) {
            elements = cartPageElements.plusButtonList;
        } else if (changeQuantity.equalsIgnoreCase("decrease")) {
            elements = cartPageElements.minusButtonList;
        }
        for (MobileElement element : elements) {
            if (element.isDisplayed()) {
                item--;
                if (item == 0) {
                    clickElement(element);
                    return;
                }
            }
        }

    }

    public void clickSingleIncreaseMultipleTimes(int arg0) {
        waitForLoadingComplete();
        MobileElement element = cartPageElements.plusButton;
        for (int i = 0; i < arg0; i++) {
            clickElement(element);
        }
    }

    public boolean cartNotEmpty() {
        return cartPageElements.removeIcon.isDisplayed();
    }

    public void waitForEstimationTotalInformationIconDisplayed() {
        waitForDisplayed(cartPageElements.EstimatedTotalInfoIcon);
    }

    public void changeAllItemQuantity(String quantity) {
        for (MobileElement element : cartPageElements.quantityFieldList) {
            clickElement(element);
            element.sendKeys(quantity);
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                driver.findElementByName("Update").click();
            } else {
                tapEnterAndroidKeyboard();
            }
        }
    }

    public void increaseAllItemQuantity(int step) {
        for (MobileElement element : cartPageElements.plusButtonList) {
            for (int i = 0 ; i < step ; i ++) {
                clickElement(element);
                waitForLoadingComplete();
            }
            waitForLoadingComplete();
        }
    }

    public void decreaseAllItemQuantity(int step) {
        for (MobileElement element : cartPageElements.minusButtonList) {
            for (int i = 0 ; i < step ; i ++) {
                clickElement(element);
                waitForLoadingComplete();
            }
            waitForLoadingComplete();
        }
    }

    public void waitForEstimatedSavingsTotalInformationIconDisplayed() {
        waitForDisplayed(cartPageElements.EstimatedSavingsInfoIcon);
    }

    public void swipeLeftToRemoveAllItem() {
        for (MobileElement element : cartPageElements.cartItemsImageList) {
            swipeLeftOnElement(element);
            waitForDisplayed(cartPageElements.swipeRemoveButton);
            if (driver.getPlatformName().equalsIgnoreCase("ios")) {
                clickElement(cartPageElements.swipeRemoveButton);
            } else {
                tapCoordinate((int) (driver.manage().window().getSize().width * 0.95), element.getCenter().getY());
            }
            waitForLoadingComplete();
        }
    }

    public void clickGlobalSubstitutionCheckbox() {
        clickElement(cartPageElements.globalSubstitutionCheckbox);
    }

    public boolean globalSubstitutionCheckboxEnabled() {
        if (driver.getPlatformName().equalsIgnoreCase("ios")) {
            return cartPageElements.globalSubstitutionCheckbox.getText().contains("1");
        } else{
            String checked = cartPageElements.globalSubstitutionCheckbox.getAttribute("checked");
            if (checked.contains("false")) return false;
            else return true;
        }
    }

    public boolean checkedNoSubstitutionForAllItems() throws InterruptedException {
        Thread.sleep(3000);
        for (MobileElement element : cartPageElements.itemSubstitutionCheckboxList) {
            if(driver.getPlatformName().equalsIgnoreCase("ios")) {
                if (element.getText().contains("Not selected")) return false;
            } else {
                String checked = element.getAttribute("checked");
                if (checked.contains("false")) return false;
            }
        }
        return true;
    }

    public void waitForCartSummaryDisplayed() {
        waitForDisplayed(cartPageElements.cartSummary);
    }
}
