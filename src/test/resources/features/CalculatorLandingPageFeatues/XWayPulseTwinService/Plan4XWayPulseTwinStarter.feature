

Feature: Calculator Plan 4 X Way Pulse Twin Starter

  Scenario: User is using X Way Pulse Twin Starter Plan 4 to calculate expected Saas Price financially beneficial
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to use X Way Pulse Twin Starter and generated SaaS Price
    And User is using "METRIC" unit
    And User selects a service "X Way (Pulse + Twin)" from dropdown field Select a Service
    And User slides the Road Length  to value of 57 km
    And User slides the Number of Signalized Intersections equal 77
    Then User sees generated SaaS price of "SaaS Price*: $1 260 per month"
    And User sees generated Estimated ACR**: "Estimated ACR**: $6 000 per month"


