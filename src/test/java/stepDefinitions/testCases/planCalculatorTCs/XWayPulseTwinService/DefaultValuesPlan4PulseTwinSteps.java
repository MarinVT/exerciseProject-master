package stepDefinitions.testCases.planCalculatorTCs.XWayPulseTwinService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.PlanCalculatorPage;

public class
DefaultValuesPlan4PulseTwinSteps {

    private PlanCalculatorPage planCalculatorPage;

    public DefaultValuesPlan4PulseTwinSteps(PlanCalculatorPage planCalculatorPage) {
        this.planCalculatorPage = planCalculatorPage;
    }

    @Given("User opens {string} to verify default values of X Way Pulse + Twin starter")
    public void user_opens_to_verify_default_values_of_x_way_pulse_twin_starter(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }
    @And("User sees Road Length with initial value of {int} km")
    public void user_sees_road_length_with_initial_value_of_km(int roadLengthNumber) {
        planCalculatorPage.slideToSpecificNumberRoadLength(roadLengthNumber);
    }
    @And("User sees Number of Signalized Intersections with initial value of {int}")
    public void user_sees_number_of_signalized_intersections_with_initial_value_of(int numberOfIntersections)  {
        planCalculatorPage.slideToSpecificNumberSignalizedIntersections(numberOfIntersections);
    }
    @And("User pick ups {string} from the dropdown Select a Service")
    public void user_pick_ups_from_the_dropdown_select_a_service(String selectTwinPulseService)  {
        planCalculatorPage.selectPlanDropdownPulseTwinService(selectTwinPulseService);
    }
    @Then("User sees Saas Price equal to {string}")
    public void user_sees_saas_price_equal_to(String expectedInitialSaasPriceValue) {
        planCalculatorPage.defaultSaasPricePulseTwin(expectedInitialSaasPriceValue);
    }
    @And("User sees title X Way Pulse + Twin starter {string}")
    public void user_sees_title_x_way_pulse_twin_starter(String expectedTitle) {
        planCalculatorPage.defaultTitlePulseTwin(expectedTitle);
    }

}
