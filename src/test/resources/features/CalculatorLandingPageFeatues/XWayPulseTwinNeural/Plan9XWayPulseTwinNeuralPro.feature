@neural
Feature: Calculator Plan 8 X Way Pulse Twin Neural Pro

  Scenario: User is using X Way Pulse Twin Neural Pro Plan 9 to calculate expected Saas Price financially beneficial
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to use X Way Pulse Twin Neural Pro and generated SaaS Price
    And User  is using "METRIC" unit to  calculate the saas  price
    And User selects "X Way (Pulse + Twin + Neural)" from dropdown field Select a Service1
    And User  slides the Road Length to value of 757 km
    And User slides  the Number of Signalized Intersections equal 126
    Then User  sees generated SaaS price of "SaaS Price*: $5 985 per month"
    And User  sees generated Estimated price ACR**: "Estimated ACR**: $77 500 per month"


