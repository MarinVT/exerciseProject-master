@pulse
Feature: Calculator default values of plan 4 X Way (Pulse + Twin) Starter

  Scenario: User should see default values for each slider, suggested plan title and saas price
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to verify default values of X Way Pulse + Twin starter
    And User sees Road Length with initial value of 1 km
    And User sees Number of Signalized Intersections with initial value of 1
    And User pick ups "X Way (Pulse + Twin)" from the dropdown Select a Service
    Then User sees Saas Price equal to "SaaS Price*: $1 260 per month"
    And User sees title X Way Pulse + Twin starter "X Way (Pulse + Twin)"

