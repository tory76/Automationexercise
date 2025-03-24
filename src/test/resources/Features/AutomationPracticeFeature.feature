Feature: Assessment
  Background:
    Given user navigate to "https://automationexercise.com/"

  @testCase1
  Scenario: search product
    When verify that home page is visible
    And user click on product button
    And verify all product page is visible
    And user search for product
    And verify all searched product is visible
    Then verify all search related product page is visible


  @testCase2
  Scenario: Add To Cart Product
    And user click on view Product
    And verify product details is opened
    And user increase product to four
    And user click add to cart button
    And user click on view cart button
    Then verify that product is displayed in cart page with quantity




