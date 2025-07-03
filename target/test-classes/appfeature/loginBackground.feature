Feature: login functionality validation

Background:
Given I am at the login page
When Enter valid username
And Enter valid password
And Click on login button

Scenario: login with valid credentials
Then User should be successfully logged in


Scenario: Validate title on the Dashboard page
Then Validate user is on Dashboard page
And Validate title of the page