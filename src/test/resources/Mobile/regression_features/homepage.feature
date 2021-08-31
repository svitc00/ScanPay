@homepage
Feature: Home page features

  Background: setup user on SignIn Page
    When navigate to home page
    Then home page is displayed

  @regression
  Scenario: Fulfillment Bar- Reserve Time for Delivery

    When user clicks delivery option on home page
    Then zipcode page is displayed
    When user enters "zipcode" in zipcode page
    And user clicks next button after registration on zipcode page
    Then select order type page is displayed
    When user click delivery option
    And user click start shopping button on Sign In page
    Then home page is displayed
    And verify "delivery" option is selected as preference on home page
    When user clicks reserve a time option on home page
    Then "Reserve a Time" window is displayed
    When user select "attended" option
    And user select 1 hour option on delivery window
    And scroll down the screen
    And user change date picker to enable save
    And user click save button on orderInfo window
    Then home page is displayed

  @regression
  Scenario: Fulfillment Bar- Reserve Time for DUG

    When user clicks delivery option on home page
    Then zipcode page is displayed
    When user enters "zipcode" in zipcode page
    And user clicks next button after registration on zipcode page
    Then select order type page is displayed
    When user clicks pickup on delivery select page
    Then store list is displayed
    And user click start shopping button on Sign In page
    Then home page is displayed
    And verify "pickup" option is selected as preference on home page
    When user clicks reserve a time option on home page
    Then "Reserve a Time" window is displayed
    And user change date picker to enable save
    And user click save button on orderInfo window
    Then home page is displayed

  @regression
  Scenario: Fulfillment Bar- Reserve Time Delivery - Change from Attended to Unattended and Vice Versa

    When user clicks delivery option on home page
    Then zipcode page is displayed
    When user enters "zipcode" in zipcode page
    And user clicks next button after registration on zipcode page
    Then select order type page is displayed
    When user click delivery option
    And user click start shopping button on Sign In page
    Then home page is displayed
    And verify "delivery" option is selected as preference on home page
    When user clicks reserve a time option on home page
    Then "Reserve a Time" window is displayed
    When user select "unattended" option
    And user change date picker to enable save
    And user click save button on orderInfo window
    Then home page is displayed
    When user clicks reserve a time option on home page
    Then "Reserve a Time" window is displayed
    When user select "attended" option
    And user click save button on orderInfo window
    Then home page is displayed
    When user clicks reserve a time option on home page
    Then "Reserve a Time" window is displayed
    When user select "unattended" option
    And user click save button on orderInfo window
    Then home page is displayed

  @regression
  Scenario: Fulfillment Bar- change preference from Delivery to DUG and verify slots updated as well

    When user clicks delivery option on home page
    Then zipcode page is displayed
    When user enters "zipcode" in zipcode page
    And user clicks next button after registration on zipcode page
    Then select order type page is displayed
    When user click delivery option
    And user click start shopping button on Sign In page
    Then home page is displayed
    And verify "delivery" option is selected as preference on home page
    When user clicks delivery option on home page
    Then zipcode page is displayed
    When user enters "zipcode" in zipcode page
    And user clicks next button after registration on zipcode page
    Then select order type page is displayed
    When user clicks pickup on delivery select page
    Then store list is displayed
    And user click start shopping button on Sign In page
    Then home page is displayed
    And verify "pickup" option is selected as preference on home page
    When user clicks reserve a time option on home page
    Then "Reserve a Time" window is displayed
    And user change date picker to enable save
    And user click save button on orderInfo window
    Then home page is displayed

  @regression
  Scenario: My Last Order/Popular items/Most viewed - View All links and sort or filters
    #android doesn't have sort and filters
    #last order/most viewed not applicable for new user
    And verify popular items is displayed on home page
    And verify most viewed is displayed on home page
    When user clicks view all from popular items
    Then "Popular Items" window is displayed
    When user click sort or filters from item list window
    Then "Sort & Filter By" window is displayed
    When user clicks navigate back to the previous page
    Then home page is displayed

  @regression
  Scenario: Home/My Purchases/Aisles/Deals are clickable
    When user click my purchase tab on home page
    When user clicks deals on home page
    When user click aisles tab on home page
    When user click menu button on home page
    Then menu page is displayed

