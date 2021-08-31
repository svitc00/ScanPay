Feature: Home Page


  Background: Sign in with valid credentials
    When User input correct email
    When User input correct password
    Then T&C page is displayed
    When User scroll down T&C
    Then User can checkboxes are enabled
    When User mark checkboxes
    Then Accept and Continue button enabled
    When User click Accept and Continue button
    Then Home page is displayed

    @smoke
    Scenario: Home page validation out of store
      Then Home page is displayed
      Then Validate Banner Name
      Then Validate welcome message
      Then Validate meassage to go to nearest store
      Then Validate Location and Hours link
      Then Validate Cart button
      Then Validate Help button
      Then Validate Enter PLU button
      Then Validate Scan Barcode button is disabled

  @smoke
  Scenario: Home page validation in store
    When Home page is displayed
    Then Click menu button
    Then Click Account
    Then Click Select store
    Then Enter store number
    Then Click Back button
    Then Home page is displayed
    Then Validate Banner Name
    Then Validate welcome message
    Then Validate Store Address
    Then Validate Transaction Item Limit
    Then Validate App Usage Hours
    Then Validate Savings message
    Then Validate Free WiFi button
    Then Validate Scan Barcode button is enabled
    Then Validate Scan Barcode message
    Then Validate Help button
    Then Validate Enter PLU button
