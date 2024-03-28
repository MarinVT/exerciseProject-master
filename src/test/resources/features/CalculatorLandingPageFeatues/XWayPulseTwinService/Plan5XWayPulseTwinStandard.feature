
Feature: Calculator Plan 5 X Way Pulse Twin Standard

  Scenario: User is using X Way Pulse Twin Standard Plan 5 to calculate expected Saas Price financially beneficial
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to use X Way Pulse Twin Standard and generated SaaS Price
    And User is using "METRIC" unit for Plan5
    And User selects a service "X Way (Pulse + Twin)" from dropdown field Select a Service for Plan5
    And User slides the Road Length  to value of 214 km to reach Standard plan5
    And User slides the Number of Signalized Intersections equal 145 to reach Standard plan5
    Then User sees generated SaaS price of "SaaS Price*: $2 320 per month" per month
    And User sees generated Estimated ACR**: "Estimated ACR**: $22 000 per month" per month
