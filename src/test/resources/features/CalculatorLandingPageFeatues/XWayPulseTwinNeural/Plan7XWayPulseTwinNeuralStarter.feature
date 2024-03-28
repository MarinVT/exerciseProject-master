@neural3

Feature: Calculator Plan 7 X Way Pulse Twin Neural Starter

  Scenario: User is using X Way Pulse Twin Neural Starter Plan 7 to calculate expected Saas Price financially beneficial
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to use X Way Pulse Twin Neural Starter and generated SaaS Price
    And User is using "METRIC" unit to calculate the saas price
    And User selects "X Way (Pulse + Twin + Neural)" from dropdown field Select a Service
    And User slides the Road Length to value of 71 km
    And User slides the Number of Signalized Intersections  equal 91
    Then User sees generated SaaS price of  "SaaS Price*: $1 800 per month"
    And User sees generated Estimated  ACR**: "Estimated ACR**: $7 500 per month"


