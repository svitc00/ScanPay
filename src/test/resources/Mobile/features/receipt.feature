@MyAccount
Feature: Receipt Feature

 # Background: setup user on Wallet Page
    #When navigate to wallet page
    #Then wallet page is displayed
    #Then user skips tutorial pop-up

  @smoke
  Scenario: User checks receipts
    # When User click setup contactless pay button
    When User click
    Then Vons pay page is displayed
    When User clicks Receipts button
    Then Single Receipt Item is displayed
    Then Date is displayed
    Then Price is displayed
    Then Receipt list is displayed
    When User clicks on single receipt
    Then Item name is displayed
    Then Price is displayed
    Then Final total price is displayed
    Then Transaction Details is displayed
    Then User goes back
    Then Single Receipt Item is displayed


