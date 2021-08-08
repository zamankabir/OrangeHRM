@smokeTest @regressionTest
Feature:  Verify login OrangeHRM website
Scenario: User able to successfully login to OrangeHRM site
Given user go to orangeHRM home page
When user enter valid username and password
And user click on the log in button
Then user navigate to the welcome page
And User verify the page title as "OrangeHRM"
And user verify user name is disply at to right
Then user log out
And user close browser