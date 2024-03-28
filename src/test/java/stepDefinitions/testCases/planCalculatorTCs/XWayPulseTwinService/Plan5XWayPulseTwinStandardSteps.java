package stepDefinitions.testCases.planCalculatorTCs.XWayPulseTwinService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.PlanCalculatorPage;

public class Plan5XWayPulseTwinStandardSteps {

    private PlanCalculatorPage planCalculatorPage;

    public Plan5XWayPulseTwinStandardSteps(PlanCalculatorPage planCalculatorPage) {
        this.planCalculatorPage = planCalculatorPage;
    }

    @Given("User opens {string} to use X Way Pulse Twin Standard and generated SaaS Price")
    public void user_opens_to_use_x_way_pulse_twin_standard_and_generated_saa_s_price(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }

    @And("User is using {string} unit for Plan5")
    public void user_is_using_unit_for_plan5(String metric) {
        planCalculatorPage.metricSwitcherDefaultMetric(metric);
    }

    @And("User selects a service {string} from dropdown field Select a Service for Plan5")
    public void user_selects_a_service_from_dropdown_field_select_a_service_for_plan(String pulseTwinService) {
        planCalculatorPage.selectPlanDropdownPulseTwinService(pulseTwinService);
    }

    @And("User slides the Road Length  to value of {int} km to reach Standard plan5")
    public void user_slides_the_road_length_to_value_of_km_to_reach_standard_plan5(int roadLengthNumber) {
        planCalculatorPage.slideToSpecificNumberRoadLength(roadLengthNumber);
    }

    @Given("User slides the Number of Signalized Intersections equal {int} to reach Standard plan5")
    public void user_slides_the_number_of_signalized_intersections_equal_to_reach_standard_plan5(int numberOfIntersections) {
        planCalculatorPage.slideToSpecificNumberSignalizedIntersections(numberOfIntersections);
    }

    @Then("User sees generated SaaS price of {string} per month")
    public void user_sees_generated_saa_s_price_of_per_month(String expectedSaasPrice) {
        planCalculatorPage.standardSaasPricePulseTwin(expectedSaasPrice);
    }

    @And("User sees generated Estimated ACR**: {string} per month")
    public void user_sees_generated_estimated_acr_per_month(String expectedACRPrice) throws InterruptedException {
        planCalculatorPage.standardACRPricePulseTwin(expectedACRPrice);
        Thread.sleep(3000);
    }
}
