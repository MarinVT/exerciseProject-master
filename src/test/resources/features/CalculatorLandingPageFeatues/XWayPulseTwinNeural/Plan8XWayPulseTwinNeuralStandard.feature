@neural3

Feature: Calculator Plan 8 X Way Pulse Twin Neural Standard

  Scenario: User is using X Way Pulse Twin Neural Standard Plan 8 to calculate expected Saas Price financially beneficial
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to use X Way Pulse Twin Neural Standard and generated SaaS Price
    And User is using "METRIC" unit to calculate the  saas price
    And User selects  "X Way (Pulse + Twin + Neural)" from dropdown field Select a Service
    And User slides the  Road Length to value of 355 km
    And User slides the Number of  Signalized Intersections equal 149
    Then User sees generated SaaS price  of "SaaS Price*: $4 255 per month"
    And User sees generated Estimated ACR**:  "Estimated ACR**: $36 500 per month"


