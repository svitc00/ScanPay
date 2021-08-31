@MyAccount
Feature: SignIn Feature

 # Background: setup user on Wallet Page
    #When navigate to wallet page
    #Then wallet page is displayed
    #Then user skips tutorial pop-up
@smoke
  Scenario: Validate Sign in screen
  Then Validate just for U logo
  Then Validate Sign In button
  Then Validate Create Account link
  Then Validate Forgot password link
  Then Validate Enter email field
  Then Validate Enter password field
  Then Validate show password button
  Then Validate close button

  @smoke
  Scenario: Sign in with empty credentials
    When User click sign in button
    Then Enter email address is required
    Then Enter password is required
    Then Sign in page is displayed

  @smoke
  Scenario: Sign in with wrong email
    When User input wrong email
    When User input correct password
    Then Error message is displayed
    Then Sign in page is displayed

  @smoke
  Scenario: Sign in with wrong password
    When User input wrong password
    When User input correct email
    Then Error message is displayed
    Then Sign in page is displayed

  @smoke
  Scenario: Sign in with valid credentials
    When User input correct email
    When User input correct password
    Then T&C page is displayed
    When User scroll down T&C
    Then User can checkboxes are enabled
    When User mark checkboxes
    Then Accept and Continue button enabled
    When User click Accept and Continue button
    Then Home page is displayed

    # For first time IOS applePay detected in sigh (Scan and OTF)
    # MFA login 4 onboarding screens




