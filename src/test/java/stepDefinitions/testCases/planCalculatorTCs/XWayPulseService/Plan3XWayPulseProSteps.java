package stepDefinitions.testCases.planCalculatorTCs.XWayPulseService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.PlanCalculatorPage;

public class Plan3XWayPulseProSteps {

    private PlanCalculatorPage planCalculatorPage;

    public Plan3XWayPulseProSteps(PlanCalculatorPage planCalculatorPage) {
        this.planCalculatorPage = planCalculatorPage;
    }


    @Given("User opens {string} to use X Way Pulse Pro and generated SaaS Price")
    public void user_opens_to_use_x_way_pulse_pro_and_generated_saa_s_price(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }

    @And("User is using unit switcher set to {string}")
    public void user_is_using_unit_switcher_set_to(String unitSwitcherMetric) {
        planCalculatorPage.metricSwitcherDefaultMetric(unitSwitcherMetric);
    }

    @And("User selects {string} from dropdown Select a Service")
    public void user_selects_from_dropdown_select_a_service(String serviceXWayPulse) {
        planCalculatorPage.defaultValueSelectService(serviceXWayPulse);
    }

    @And("User slides to {int} km in Road Length slider")
    public void user_slides_to_km_in_road_length_slider(int roadLengthNumber) {
        planCalculatorPage.slideToSpecificNumberRoadLength(roadLengthNumber);
    }

    @And("User slides to {int} in Signalized Intersections slider")
    public void user_slides_to_in_signalized_intersections_slider(int numberIntersections) {
        planCalculatorPage.slideToSpecificNumberSignalizedIntersections(numberIntersections);
    }

    @And("User gets calculated SaaS price {string}")
    public void user_gets_calculated_saa_s_price(String expectedSaasPrice) {
        planCalculatorPage.saasPricePulsePro(expectedSaasPrice);
    }

    @Then("User gets calculated Estimated ACR**: {string}")
    public void user_gets_calculated_estimated_acr(String expectedACRPrice) {
        planCalculatorPage.estimatedACRPriceProListed(expectedACRPrice);
    }

}
