package com.automation.pageElements;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WalletPageElements {


    //com.safeway.client.android.vons.debug:id/walletContainerFragment
   //android.widget.FrameLayout[@content-desc="WALLET"]

    //
    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "walletContainerFragment")
    public MobileElement walletIconButton;

    //
    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "contactless_pay_bg")
    public MobileElement walletContactless;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "txtTitle")
    public MobileElement vonsPageTitle;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "imgSettings")
    public MobileElement settingButton;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "btn_readyForCheckout")
    public MobileElement readyForCheckoutButton;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "lytPayment")
    public MobileElement paymentButton;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "btnAdd")
    public MobileElement addDebitCreditCardButton;

    //DebitCredit card add page
    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "edtName")
    public MobileElement nameField;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "edtNum")
    public MobileElement cardNumberField;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "edtExp")
    public MobileElement exparationDateField;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "edtCvv")
    public MobileElement cvvField;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "edtZip")
    public MobileElement zipCodeField;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "btnAddCard")
    public MobileElement addCardButton;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "rl_bank_account")
    public MobileElement existingCreditDebitCard;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "imgClose")
    public MobileElement closeButton;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "rl_bank_account_button")
    public MobileElement bankButtonOnVonsPage;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "txtSkip")
    public MobileElement skipButton;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "iv_discount_qr_code")
    public MobileElement discountQRCode;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "btnNext")
    public MobileElement nextButton;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "iv_pay_qr_code")
    public MobileElement payQRCode;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "iv_close_discount_code")
    public MobileElement closeQRCodeButton;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "iv_bankAccount_Options")
    public MobileElement creditDebitOptions;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "btn_removeAccount")
    public MobileElement removeCreditDebitCard;


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Receipts\"]")
    public MobileElement recieptsButton;


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "receiptItem")
    public MobileElement singleReceiptItem;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "txtHeaderTransactionDetails")
    public MobileElement receiptTransactionDetails;


    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "txtDate")
    public MobileElement receiptDate;
    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "rvReceipts")
    public MobileElement listOfReceipts;
    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "txtItemName")
    public MobileElement receiptItemName;

    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "txtPrice")
    public MobileElement itemPrice;
    @iOSXCUITFindBy(accessibility = "")
    @AndroidFindBy(id = "lytFinalTotal")
    public MobileElement receiptFinalTotl;








}
