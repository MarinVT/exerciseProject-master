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


    @Given("User opens {string} to use X Way Pulse Twin Starter plan4 and generated SaaS Price")
    public void user_opens_to_use_x_way_pulse_twin_starter_plan4_and_generated_saa_s_price(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }

    @Given("User has a added by default unit switcher to {string}")
    public void user_has_a_added_by_default_unit_switcher_to(String unitMetric) {
        planCalculatorPage.metricSwitcherDefaultMetric(unitMetric);
    }

    @Given("User has selected {string} from dropdown Select a Service")
    public void user_has_selected_from_dropdown_select_a_service(String selectServicePulseTwin) {
        planCalculatorPage.selectPlanDropdownPulseTwinService(selectServicePulseTwin);
    }

    @Given("User slides to {int} km in Road Length slider to generate Saas price")
    public void user_slides_to_km_in_road_length_slider_to_generate_saas_price(int roadLengthNumber) {
        planCalculatorPage.slideToSpecificNumberRoadLength(roadLengthNumber);
    }

    @Given("User slides  to {int} total count of Signalized Intersections slider")
    public void user_slides_to_total_count_of_signalized_intersections_slider(int numberOfIntersections) {
        planCalculatorPage.slideToSpecificNumberSignalizedIntersections(numberOfIntersections);
    }

    @Then("User sees the  calculated SaaS price {string}")
    public void user_sees_the_calculated_saa_s_price(String expectedSaasPrice) {
        planCalculatorPage.starterSaasPricePulseTwin(expectedSaasPrice);
    }

    @Then("User sees the  calculated Estimated ACR**: {string}")
    public void user_sees_the_calculated_estimated_acr(String expectedACRPrice) {
        planCalculatorPage.starterACRPricePulseTwin(expectedACRPrice);
    }

}
