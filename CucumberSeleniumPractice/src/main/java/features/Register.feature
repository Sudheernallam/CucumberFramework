Feature: Login Validation

Scenario: Login for Valid User

Given User is on HomePage
When User enters user ID and password
And Clicks on login button
Then User should be on Authenticated page