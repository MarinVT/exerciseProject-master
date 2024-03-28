package stepDefinitions.testCases.planCalculatorTCs.XWayPulseTwinNeuralService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.PlanCalculatorPage;

public class Plan9XWayPulseTwinNeuralProSteps {

    private PlanCalculatorPage planCalculatorPage;

    public Plan9XWayPulseTwinNeuralProSteps(PlanCalculatorPage planCalculatorPage) {
        this.planCalculatorPage = planCalculatorPage;
    }

    @Given("User opens {string} to use X Way Pulse Twin Neural Pro and generated SaaS Price")
    public void user_opens_to_use_x_way_pulse_twin_neural_pro_and_generated_saa_s_price(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }

    @And("User  is using {string} unit to  calculate the saas  price")
    public void user_is_using_unit_to_calculate_the_saas_price(String unitMetric) {
        planCalculatorPage.metricSwitcherDefaultMetric(unitMetric);
    }

    @And("User selects {string} from dropdown field Select a Service1")
    public void user_selects_from_dropdown_field_select_a_service1(String pulseTwinNeuralService) throws InterruptedException {
        planCalculatorPage.selectPlanDropdownPulseTwinNeuralService(pulseTwinNeuralService);
    }

    @And("User  slides the Road Length to value of {int} km")
    public void user_slides_the_road_length_to_value_of_km(int roadLengthNumber) {
        planCalculatorPage.slideToSpecificNumberRoadLength(roadLengthNumber);
    }

    @And("User slides  the Number of Signalized Intersections equal {int}")
    public void user_slides_the_number_of_signalized_intersections_equal(int numberOfIntersections) {
        planCalculatorPage.slideToSpecificNumberSignalizedIntersections(numberOfIntersections);
    }

    @Then("User  sees generated SaaS price of {string}")
    public void user_sees_generated_saa_s_price_of(String expectedSaasPrice) {
        planCalculatorPage.pulseTwinNeuralProdGeneratedSaasPrice(expectedSaasPrice);
    }

    @And("User  sees generated Estimated price ACR**: {string}")
    public void user_sees_generated_estimated_price_acr(String expectedACRPrice) throws InterruptedException {
        planCalculatorPage.pulseTwinNeuralProdGeneratedACRPrice(expectedACRPrice);
        Thread.sleep(3000);
    }

}
