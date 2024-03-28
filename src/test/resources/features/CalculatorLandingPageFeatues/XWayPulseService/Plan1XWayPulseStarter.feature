

Feature: Calculator Plan 1 X Way Pulse Starter

  Scenario: User is using X Way Pulse Starter Plan 1 to calculate expected Saas Price financially beneficial
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to use X Way Pulse Starter and generated SaaS Price
    And User is using unit switcher metric "METRIC"
    And User selects a service "X Way Pulse" from dropdown Select a Service
    And User sets Road Length equal to value of Twenty 20 km
    And User selects Number of Signalized Intersections equal 7
    Then User gets SaaS price of "SaaS Price*: $980 per month"
    And User get Estimated ACR**: "Estimated ACR**: $2 500 per month"


