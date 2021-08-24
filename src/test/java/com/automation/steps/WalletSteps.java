package com.automation.steps;

import com.automation.mobile.appium.AppiumDriverManager;
import com.automation.pages.WalletPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class WalletSteps  {

    AppiumDriver driver = AppiumDriverManager.getDriver();
    public WalletPage walletPage = new WalletPage(driver);


    @When("^navigate to wallet page$")
    public void user_click_wallet_icon_on_bot_menu() {
        walletPage.waitForLoadingComplete();
        walletPage.clickWalletIcon();
    }


    @Then("^user skips tutorial pop-up$")
    public void skip_tutorial_popup() {
        walletPage.waitForLoadingComplete();
        walletPage.skipTutorialPopup();
    }

    @Then("^user enters zip code if pop-up is displyed$")
    public void zip_code_enter_popup() {

    }

    @Then("^wallet page is displayed$")
    public void wallet_page_is_displayed() {
        walletPage.waitForWalletPageDisplayed();
    }

    @When("^User click setup contactless pay button$")
    public void user_click_contacless_tab() {
        walletPage.clickContaclessPayTab();
    }

    @Then("^Vons pay page is displayed$")
    public void vons_page_is_displayed() {
        walletPage.waitForLoadingComplete();
        walletPage.vonsPageDisplayed();
    }

    @When("^user click settings button$")
    public void user_click_settings_button() {
        walletPage.clickSettingsButton();
    }

    @Then("^settings page is displayed$")
    public void settings_page_is_displayed() {
        walletPage.settingsPageDisplayed();
    }

    @When("^user click Payment button$")
    public void user_click_payment_button() {
        walletPage.clickPaymentButton();
    }

    @When("^User clicks on single receipt$")
    public void user_click_signle_receipt_button() {
        walletPage.clickSingleRecieptButton();
    }


    @Then("^Add payment page is displayed$")
    public void add_payment_page_is_displayed() {
        walletPage.addPaymentPageDisplayed();
    }
    @When("^User clicks add credit/debit button$")
    public void user_click_add_debitCredit_button() {
        walletPage.clickAddCreditDebitButton();
    }


    @And("^Fills out name on card field with \"([^\"]*)\"$")
    public void user_inputs_name_for_credit_card(String name){
        walletPage.inputNameOnCard(name);
    }

    @And("^Fills out card number field with \"([^\"]*)\"$")
    public void user_inputs_cardNumber_for_credit_card(String cardNumber){
        walletPage.inputCardNumber(cardNumber);
    }

    @And("^Fills out cvv field with \"([^\"]*)\"$")
    public void user_inputs_cvv_for_credit_card(String cvv){
        walletPage.inputCvv(cvv);
    }
    @And("^Fills out expiration date field with \"([^\"]*)\"$")
    public void user_inputs_exparationDate_for_credit_card(String expDate){
        walletPage.inputExparationDate(expDate);
    }
    @And("^Fills out zip code field with \"([^\"]*)\"$")
    public void user_inputs_zipCode_for_credit_card(String zipCode){
        walletPage.inputZipCode(zipCode);
    }

    @And("^User clicks add button$")
    public void user_clicks_submit_add_card_button(){
        walletPage.clickAddSubmitCardButton();
    }

    @Then("^Card is added$")
    public void new_card_is_displayed() {
        walletPage.crediDebitNewCardIsDisplayed();
    }

    @When("^User goes back$")
    public void user_click_exit_button() {
        walletPage.clickCloseButton();
    }
    @Then("^Card is added on Vons Pay screen$")
    public void vons_screen_new_card_is_displayed() {
        walletPage.vonsScreenCrediDebitNewCardIsDisplayed();
    }

    @When("^User clicks ready for checkout button$")
    public void user_click_ready_for_checkout_button() {
        walletPage.clickReadyForCheckoutButton();
    }

    @Then("^Discount QA code page is displayed$")
    public void discount_QR_CODE_displayed() {
        walletPage.dicounttQRCodeIsDisplayed();
    }
    @When("^User clicks next$")
    public void clickNextButton() {
        walletPage.clickNextButton();
    }
    @Then("^Payment code is displayed$")
    public void payment_QR_CODE_displayed() {
        walletPage.paymentQRCodeIsDisplayed();
    }
    @When("^User click exit$")
    public void clickExitButton() {
        walletPage.clickExitButton();
    }

    @When("^user click option on credit/debit card$")
    public void clickOptionOnCreditDebitButton() {
        walletPage.clickCreditDebitOptionButton();
    }
    @Then("^Remove credit card is displayed$")
    public void removeCreditCardButton_displayed() {
        walletPage.waitRemoveButtonDisplayed();
    }

    @When("^User clicks Receipts button$")
    public void clickRecieptButton() {
        walletPage.clickRecieptsTabButton();
    }

    @Then("^Single Receipt Item is displayed$")
    public void siingleRecieptItem_displayed() {
        walletPage.signleRecieptButtonIsDisplayed();
    }

    @Then("^Transaction Details is displayed$")
    public void trnsaction_details_is_displayed() {
        walletPage.transactionDetilsIsDisplayed();
    }


    @Then("^Receipt list is displayed$")
    public void receiptListIsDisplayed() {
        walletPage.receiptListIsDisplayed();
    }
    @Then("^Date is displayed$")
    public void receiptDateIsDisplayed() {
        walletPage.receiptDateIsDisplayed();
    }
    @Then("^Price is displayed$")
    public void receiptPriceIsDisplayed() {
        walletPage.receiptItemPriceIsDisplayed();
    }
    @Then("^Item name is displayed$")
    public void receiptItemNameIsDisplyed() {
        walletPage.receiptItemNameIsDisplayed();
    }
    @Then("^Final total price is displayed$")
    public void receiptFinalTotalPriceIsDisplayed() {
        walletPage.receiptFinalTotalIsDisplayed();
    }


}
