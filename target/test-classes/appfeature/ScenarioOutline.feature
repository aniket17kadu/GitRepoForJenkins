Feature: Sign up

Background:
Given user entered on dashboard
Then user is able to see options


Scenario Outline: Sign up functionality
Given user on sign up page
When User enter "<Name>" in name
And User select "<Gender>" from dropdown
And User select <slot> as well <weight>
Then Successfull sign up

Examples: 
| Name | Gender | slot | weight |
| Ram | Male | 2 |  66.67 |
| Syam | Male | 4| 99.00 |
| Gita | Female | 1 | 34.98 |
| Sita | Female | 3 | 78.98| 
