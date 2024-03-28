package stepDefinitions.testCases.planCalculatorTCs.XWayPulseTwinService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.PlanCalculatorPage;

public class Plan4XWayPulseTwinStarterSteps {

    private PlanCalculatorPage planCalculatorPage;

    public Plan4XWayPulseTwinStarterSteps(PlanCalculatorPage planCalculatorPage) {
        this.planCalculatorPage = planCalculatorPage;
    }

    @Given("User opens {string} to use X Way Pulse Twin Starter and generated SaaS Price")
    public void user_opens_to_use_x_way_pulse_twin_starter_and_generated_saa_s_price(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }
    @And("User is using {string} unit")
    public void user_is_using_unit(String unitMetric) {
        planCalculatorPage.metricSwitcherDefaultMetric(unitMetric);
    }
    @And("User selects a service {string} from dropdown field Select a Service")
    public void user_selects_a_service_from_dropdown_field_select_a_service(String selectServicePulseTwin) {
        planCalculatorPage.selectPlanDropdownPulseTwinService(selectServicePulseTwin);
    }
    @And("User slides the Road Length  to value of {int} km")
    public void user_slides_the_road_length_to_value_of_twenty_km(int roadLengthNumber) {
        planCalculatorPage.slideToSpecificNumberRoadLength(roadLengthNumber);
    }
    @And("User slides the Number of Signalized Intersections equal {int}")
    public void user_slides_the_number_of_signalized_intersections_equal(int numberOfIntersections) {
        planCalculatorPage.slideToSpecificNumberSignalizedIntersections(numberOfIntersections);
    }
    @Then("User sees generated SaaS price of {string}")
    public void user_sees_generated_saa_s_price_of(String expectedSaasPrice) {
        planCalculatorPage.starterSaasPricePulseTwin(expectedSaasPrice);
    }
    @And("User sees generated Estimated ACR**: {string}")
    public void user_sees_generated_estimated_acr(String expectedACRPrice) throws InterruptedException {
        planCalculatorPage.starterACRPricePulseTwin(expectedACRPrice);
    }

}
