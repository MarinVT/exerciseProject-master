@smoke1
Feature: Calculator default values of X Way Pulse

  Scenario: User should see default values for each slider and dropdown field
    Given User opens "https://axilion.z6.web.core.windows.net/#/" to verify each field and its value
    And User gets Road Length with start value of "1 km"
    And User gets Number of Signalized Intersections with start value of "1"
    And User gets Select a Service with default value of "X Way Pulse"
    And User gets default selected metric "METRIC"

