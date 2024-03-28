package stepDefinitions.testCases.planCalculatorTCs.XWayPulseService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.PlanCalculatorPage;

public class Plan2XWayPulseStandardSteps {

    private PlanCalculatorPage planCalculatorPage;

    public Plan2XWayPulseStandardSteps(PlanCalculatorPage planCalculatorPage) {
        this.planCalculatorPage = planCalculatorPage;
    }

    @Given("User opens {string} to use X Way Pulse Standard and generated SaaS Price")
    public void user_opens_to_use_x_way_pulse_standard_and_generated_saa_s_price(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }

    @And("User has unit switcher {string}")
    public void user_has_unit_switcher(String switcherMetric) {
        planCalculatorPage.metricSwitcherDefaultMetric(switcherMetric);
    }

    @And("User has a service {string} taken from dropdown Select a Service")
    public void user_has_a_service_taken_from_dropdown_select_a_service(String serviceXWayPulse) {
        planCalculatorPage.defaultValueSelectService(serviceXWayPulse);
    }

    @And("User adds Road Length equal to value of {int} km")
    public void user_adds_road_length_equal_to_value_of_km(int roadLengthSlider) throws InterruptedException {
        planCalculatorPage.slideToSpecificNumberRoadLength(roadLengthSlider);
    }

    @And("User adds Number of Signalized Intersections equal {int}")
    public void user_adds_number_of_signalized_intersections_equal(int numberOfIntersections) throws InterruptedException {
        planCalculatorPage.slideToSpecificNumberSignalizedIntersections(numberOfIntersections);
    }

    @And("User is getting SaaS price of {string}")
    public void user_is_getting_saa_s_price_of(String expectedSaasPrice) throws InterruptedException {
        planCalculatorPage.saasPricePulseStandard(expectedSaasPrice);
    }

    @Then("User is getting Estimated ACR**: {string}")
    public void user_is_getting_estimated_acr(String expectedSaasPrice) throws InterruptedException {
        planCalculatorPage.estimatedACRPriceStandardListed(expectedSaasPrice);
    }

}
