Feature: Campaign for election


@Aniket
Scenario: Campaign day 1 for election

Given User is on campaign day
When User is travelling to location
And User reaches at location
Then User started campaigning

@Regression
Scenario: Campaign day 2 for election

Given User is on campaign day 2
When User is travelling to 2 location
And User reaches at 2 location
Then User started campaigning 