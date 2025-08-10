Feature: Home page funvtionality

Scenario: Verify title of paage
Given user is at the landing page
Then page title should contains "Amazon"

Scenario: Verify cart icon is displaying
Given user is at the landing page
Then cart icon should get displayed

Scenario: checkout the deal section
Given user is at the landing page
When user clicks on deals
Then user should redirect to deal page