@test1
Feature: Calculator Plan 4 X Way Pulse Twin Starter

  Scenario: User is using X Way Pulse Starter Plan 4 to calculate expected Saas Price financially beneficial
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to use X Way Pulse Twin Starter plan4 and generated SaaS Price
    And User has a added by default unit switcher to "METRIC"
    And User has selected "X Way Pulse Twin" from dropdown Select a Service
    And User slides to 90 km in Road Length slider to generate Saas price
    And User slides  to 86 total count of Signalized Intersections slider
    Then User sees the  calculated SaaS price "SaaS Price*: $1 350 per month"
    Then User sees the  calculated Estimated ACR**: "Estimated ACR**: $9 500 per month"