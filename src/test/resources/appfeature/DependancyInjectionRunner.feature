Feature: Placing order validation

Scenario: Ordering from amazon
Given User is on Home Page
When User select product
And User added in the Cart
And User buys product
Then Order placed succrssfully