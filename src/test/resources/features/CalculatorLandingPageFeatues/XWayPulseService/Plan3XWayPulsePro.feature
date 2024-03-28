

Feature: Calculator Plan 3 X Way Pulse Pro

  Scenario: User is using X Way Pulse Pro Plan 3 to calculate expected Saas Price financially beneficial
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to use X Way Pulse Pro and generated SaaS Price
    And User is using unit switcher set to "METRIC"
    And User selects "X Way Pulse" from dropdown Select a Service
    And User slides to 399 km in Road Length slider
    And User slides to 299 in Signalized Intersections slider
    And User gets calculated SaaS price "SaaS Price*: $3 420 per month"
    Then User gets calculated Estimated ACR**: "Estimated ACR**: $41 000 per month"