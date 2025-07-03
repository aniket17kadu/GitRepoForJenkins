Feature: Login functionality

Scenario: Validate logon with valid credential
Given User should be on login page
When enter username "Aniket@17"
And enter passward 12345 or "1234@ak"
And click on 1 login button
Then User should be successfully logged in to the system