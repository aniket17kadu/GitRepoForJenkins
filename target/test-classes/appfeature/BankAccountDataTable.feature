Feature: Bank account

Scenario: Creating bank account
Given User is on account page
When User enters valid info
| Name | Lastname | Age | Email | Gender |
| Aniket | Kadu | 26 | aniketkadu1707@gmail.com | Male |
| Ram | More | 28 | rammore@gmail.com | Male |
| Gita | Kumari | 25 | gitakumari@gmail.com |Female |
And user click on submit
Then Successfull