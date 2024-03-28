

Feature: Calculator Plan 2 X Way Pulse Standard

  Scenario: User is using X Way Pulse Standard Plan 2 to calculate expected Saas Price financially beneficial
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to use X Way Pulse Standard and generated SaaS Price
    And User has unit switcher "METRIC"
    And User has a service "X Way Pulse" taken from dropdown Select a Service
    And User adds Road Length equal to value of 160 km
    And User adds Number of Signalized Intersections equal 169
    And User is getting SaaS price of "SaaS Price*: $1 885 per month"
    Then User is getting Estimated ACR**: "Estimated ACR**: $16 500 per month"
