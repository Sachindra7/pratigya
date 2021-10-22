Feature: Basic WWE Website Test

Scenario: Basic Validation

Given User opens Chrome browser
And User visits https://www.wwe.com/
When User clicks on Tickets
And User clicks on third list item for Bobby Lashley and clicks on More Details
Then Verify text "Meet Bobby Lashley in Houston " is present