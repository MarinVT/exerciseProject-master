package stepDefinitions.testCases.planCalculatorTCs.XWayPulseService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.PlanCalculatorPage;

public class Plan1XwayPulseStarterSteps {

    private PlanCalculatorPage planCalculatorPage;

    public Plan1XwayPulseStarterSteps(PlanCalculatorPage planCalculatorPage) {
        this.planCalculatorPage = planCalculatorPage;
    }

    @Given("User opens {string} to use X Way Pulse Starter and generated SaaS Price")
    public void user_opens_to_use_x_way_pulse_starter_and_generated_saa_s_price(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }

    @And("User is using unit switcher {string}")
    public void user_is_using_unit_switcher(String metricUnitSwitcher)  {
        planCalculatorPage.metricSwitcherDefaultMetric(metricUnitSwitcher);
    }
    @And("User selects a service {string} from dropdown Select a Service")
    public void user_selects_a_service_from_dropdown_select_a_service(String xWayPulse) {
        planCalculatorPage.defaultValueSelectService(xWayPulse);
    }

    @And("User sets Road Length equal to value of Twenty {int} km")
    public void user_sets_road_length_equal_to_value_of_twenty_km(int value) {
        planCalculatorPage.slideToSpecificNumberRoadLength(value);
    }
    @Then("User gets SaaS price of {string}")
    public void user_gets_saa_s_price_of(String expectedSaasPrice) throws InterruptedException {
        planCalculatorPage.saasPricePulseStarter(expectedSaasPrice);
    }
    @And("User get Estimated ACR**: {string}")
    public void user_get_estimated_acr(String expectedAcrPrice) {
        planCalculatorPage.estimatedACRPriceListed(expectedAcrPrice);
    }

    @And("User selects Number of Signalized Intersections equal {int}")
    public void user_selects_number_of_signalized_intersections_equal(int signalizedNumberOfIntersections) throws InterruptedException {
        planCalculatorPage.slideToSpecificNumberSignalizedIntersections(signalizedNumberOfIntersections);
        Thread.sleep(3000);
    }

}
