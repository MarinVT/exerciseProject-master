
Feature: Calculator default values of plan 7 X Way (Pulse + Twin + Neural) Starter

  Scenario: User should see default values for each slider, suggested plan title and saas price
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to verify default values of X Way Pulse + Twin + Neural starter plan
    And User sees listed Road Length with initial value of 1 km
    And User sees listed Number of Signalized Intersections with initial value of 1
    And User chooses "X Way (Pulse + Twin + Neural)" from the dropdown Select a Service
    And User sees title X Way Pulse + Twin + Neural starter "X Way (Pulse + Twin + Neural)"
    And User sees listed Saas Price equal to "SaaS Price*: $1 680 per month"


