
Feature: Buy Products


  @TEST2
  Scenario: Add products to cart
    Given login to the jumbo site "https://www.jumbo.cl/"
    When Click on: Search
    And Write on search "toallas higienicas"
    And Click on: Always night towels
    And Click on: Kotex ultra fine towels
    And Click on: Toallas Higiénicas Ladysoft Básicas Sin Alas
    And Click on: Shopping cart
    And 2 Click on: Plus button on Kotex ultra fine towels
    And Click on: Empty cart
    And Click on: Confirm empty cart
