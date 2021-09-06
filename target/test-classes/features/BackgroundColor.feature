Feature: Sky Blue Background Validation Test
Background:
Given user is on Cucumber project Page
Scenario: user should be able to see SkyBlue Background on Clicking SkyBlue Background button

And SkyBlue Background Button Exist
When user click SkyBlue Background boutton
Then the background color will change to sky blue 

Scenario:  White Background Change
Given  White background button exist 
When I click on the button 
Then the background color will change to white
