@MyAccount
Feature: Wallet Feature

  Background: setup user on Wallet Page
    When navigate to wallet page
    Then wallet page is displayed
    Then user skips tutorial pop-up

    #User is able to add new credit/debit card on Vons Pay page
#  @smoke
#  Scenario: add credit/debit card
#    When User click setup contactless pay button
#    Then Vons pay page is displayed
#    When user click settings button
#    Then settings page is displayed
#    When user click Payment button
#    Then Add payment page is displayed
#    When User clicks add credit/debit button
#    And Fills out name on card field with "Test Test"
#    And Fills out card number field with "6011208700022232"
#    And Fills out expiration date field with "12/21"
#    And Fills out cvv field with "444"
#    And Fills out zip code field with "00000"
#    And User clicks add button
#    Then Card is added
#    Then Add payment page is displayed
#    When User goes back
#    Then settings page is displayed
#    When User goes back
#    Then Card is added on Vons Pay screen
#

#  @smoke
#  Scenario: Generate Discount and Payment QR codes
#    When User click setup contactless pay button
#    Then Vons pay page is displayed
#    When User clicks ready for checkout button
#    Then Discount QA code page is displayed
#    When User clicks next
#    Then Payment code is displayed
#    When User click exit
#    Then Vons pay page is displayed
#
#  @smoke
#  Scenario: User deletes his credit/debit card
#    When User click setup contactless pay button
#    Then Vons pay page is displayed
#    When user click settings button
#    Then settings page is displayed
#    When user click Payment button
#    Then Add payment page is displayed
#    When user click option on credit/debit card
#    Then Remove credit card is displayed
#    When User clicks remove credit card
#    Then Credit card is removed
#    When User goes back
#    Then settings page is displayed
#    When User goes back
#    Then Vons pay page is displayed
#    When User goes back
#    Then wallet page is displayed

  @smoke
  Scenario: User checks receipts
    When User click setup contactless pay button
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


