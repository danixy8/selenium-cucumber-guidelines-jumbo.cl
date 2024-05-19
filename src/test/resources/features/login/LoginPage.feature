Feature: Login to Saucedemo Application

Scenario: Login Functionality
Given User is on login page "https://www.saucedemo.com/"
When User submit email and password
Then User should be able to login sucessfully and new page open