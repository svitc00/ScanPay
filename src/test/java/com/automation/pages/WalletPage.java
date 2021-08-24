package com.automation.pages;

import com.automation.pageElements.WalletPageElements;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WalletPage extends BasePage{
    public WalletPageElements walletPageElements = new WalletPageElements();
    public WalletPage(AppiumDriver driver){
        super(driver);
        PageFactory.initElements(new AppiumFieldDecorator(driver), walletPageElements);
    }
    public void skipTutorialPopup(){
       try{
           walletPageElements.skipButton.click();
       }
       catch(NoSuchElementException e) {
           System.out.println("No tutorial this time!");
       }
    }
    public void clickWalletIcon(){
        walletPageElements.walletIconButton.click();
    }
    public void clickContaclessPayTab(){
        walletPageElements.walletContactless.click();
    }
    public void clickSettingsButton() { walletPageElements.settingButton.click(); }
    public void clickCloseButton() { walletPageElements.closeButton.click(); }
    public void clickPaymentButton() { walletPageElements.paymentButton.click(); }
    public void clickAddCreditDebitButton() { walletPageElements.addDebitCreditCardButton.click(); }
    public void clickAddSubmitCardButton() { walletPageElements.addCardButton.click(); }
    public void clickReadyForCheckoutButton() { walletPageElements.readyForCheckoutButton.click(); }
    public void clickNextButton() { walletPageElements.nextButton.click(); }
    public void clickExitButton() { walletPageElements.closeQRCodeButton.click(); }
    public void clickCreditDebitOptionButton() { walletPageElements.creditDebitOptions.click(); }
    public void clickRecieptsTabButton() { walletPageElements.recieptsButton.click(); }
    public void clickSingleRecieptButton() { walletPageElements.singleReceiptItem.click(); }

    public void inputNameOnCard(String name){
        enterKey(walletPageElements.nameField, name);
    }
    public void inputCardNumber(String cardNumber){
        enterKey(walletPageElements.cardNumberField, cardNumber);
    }
    public void inputExparationDate(String exparationDate){
        enterKey(walletPageElements.exparationDateField, exparationDate);
    }
    public void inputCvv(String cvv){
        enterKey(walletPageElements.cvvField, cvv);
    }
    public void inputZipCode(String zipCode){
        enterKey(walletPageElements.zipCodeField, zipCode);
    }

    public void waitForWalletPageDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.walletContactless));
        Assert.assertTrue(walletPageElements.walletContactless.isDisplayed());
    }
    public void crediDebitNewCardIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.existingCreditDebitCard));
        Assert.assertTrue(walletPageElements.existingCreditDebitCard.isDisplayed());
    }
    public void vonsScreenCrediDebitNewCardIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.bankButtonOnVonsPage));
        Assert.assertTrue(walletPageElements.bankButtonOnVonsPage.isDisplayed());
    }
    public void vonsPageDisplayed() {
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.vonsPageTitle));
        Assert.assertEquals( "Vons Pay", walletPageElements.vonsPageTitle.getText());
    }

    public void settingsPageDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.vonsPageTitle));
        Assert.assertEquals( "Settings", walletPageElements.vonsPageTitle.getText());
    }
    public void addPaymentPageDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.vonsPageTitle));
        Assert.assertEquals( "Add Payments", walletPageElements.vonsPageTitle.getText());
    }

    public void dicounttQRCodeIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.discountQRCode));
        Assert.assertTrue(walletPageElements.discountQRCode.isDisplayed());
    }
    public void paymentQRCodeIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.payQRCode));
        Assert.assertTrue(walletPageElements.payQRCode.isDisplayed());
    }

    public void waitRemoveButtonDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.removeCreditDebitCard));
        Assert.assertTrue(walletPageElements.removeCreditDebitCard.isDisplayed());
    }

    public void signleRecieptButtonIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.singleReceiptItem));
        Assert.assertTrue(walletPageElements.singleReceiptItem.isDisplayed());
    }

    public void transactionDetilsIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.receiptTransactionDetails));
        Assert.assertTrue(walletPageElements.receiptTransactionDetails.isDisplayed());
    }
    public void waitForLoadingComplete(){
        waitVar.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//AndroidLoading | //iOSLoading"))));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitVar.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//AndroidLoading | //iOSLoading"))));
    }


    public void receiptItemPriceIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.itemPrice));
        Assert.assertTrue(walletPageElements.itemPrice.isDisplayed());
    }
    public void receiptDateIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.receiptDate));
        Assert.assertTrue(walletPageElements.receiptDate.isDisplayed());
    }
    public void receiptItemNameIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.receiptItemName));
        Assert.assertTrue(walletPageElements.receiptItemName.isDisplayed());
    }
    public void receiptFinalTotalIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.receiptFinalTotl));
        Assert.assertTrue(walletPageElements.receiptFinalTotl.isDisplayed());
    }
    public void receiptListIsDisplayed(){
        waitForLoadingComplete();
        waitVar.until(ExpectedConditions.visibilityOf(walletPageElements.listOfReceipts));
        Assert.assertTrue(walletPageElements.listOfReceipts.isDisplayed());
    }

}
