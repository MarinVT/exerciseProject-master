
Feature: Calculator Plan 6 X Way Pulse Twin Pro

  Scenario: User is using X Way Pulse Twin Pro Plan 6 to calculate expected Saas Price financially beneficial
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to use X Way Pulse Twin Pro and generated SaaS Price
    And User is using "METRIC" unit for Plan6
    And User selects a service "X Way (Pulse + Twin)" from dropdown field Select a Service for Plan6
    And User slides the Road Length  to value of 393 km to reach Standard plan6
    And User slides the Number of Signalized Intersections equal 302 to reach Standard plan6
    Then User sees generated SaaS price of "SaaS Price*: $4 275 per month" per month for plan6
    And User sees generated Estimated ACR**: "Estimated ACR**: $40 500 per month" per month for plan6