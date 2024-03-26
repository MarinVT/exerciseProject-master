package stepDefinitions.testCases.planCalculatorTCs.positiveTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.PlanCalculatorPage;

public class DefaultValuesCalculatorSteps {

    private PlanCalculatorPage planCalculatorPage;

    public DefaultValuesCalculatorSteps(PlanCalculatorPage planCalculatorPage) {
        this.planCalculatorPage = planCalculatorPage;
    }

    @Given("User opens {string} to verify each field and its value")
    public void user_opens_to_verify_each_field_and_its_value(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }

    @And("User gets Road Length with start value of {string}")
    public void user_gets_road_length_with_start_value_of(String expectedValueOf_1) {
        planCalculatorPage.defaultValueRoadLengthIsOne(expectedValueOf_1);
    }

    @And("User gets Number of Signalized Intersections with start value of {string}")
    public void user_gets_number_of_signalized_intersections_with_start_value_of(String expectedValueOf_1) {
        planCalculatorPage.defaultValueNumberOfSignalizedIntersectionsIsOne(expectedValueOf_1);
    }

    @And("User gets Select a Service with default value of {string}")
    public void user_gets_select_a_service_with_default_value_of(String defaultValueSelectServiceXWayPulse) {
        planCalculatorPage.defaultValueSelectService(defaultValueSelectServiceXWayPulse);
    }

    @And("User gets default selected metric {string}")
    public void user_gets_default_selected_metric(String defaultValueMetric) {
        planCalculatorPage.metricSwitcherDefaultMetric(defaultValueMetric);
    }


}
