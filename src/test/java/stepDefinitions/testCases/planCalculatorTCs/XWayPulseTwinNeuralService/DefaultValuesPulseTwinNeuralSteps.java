package stepDefinitions.testCases.planCalculatorTCs.XWayPulseTwinNeuralService;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.PlanCalculatorPage;

public class DefaultValuesPulseTwinNeuralSteps {

    private PlanCalculatorPage planCalculatorPage;

    public DefaultValuesPulseTwinNeuralSteps(PlanCalculatorPage planCalculatorPage) {
        this.planCalculatorPage = planCalculatorPage;
    }

    @Given("User opens {string} to verify default values of X Way Pulse + Twin + Neural starter plan")
    public void user_opens_to_verify_default_values_of_x_way_pulse_twin_neural_starter_plan(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }

    @And("User sees listed Road Length with initial value of {int} km")
    public void user_sees_listed_road_length_with_initial_value_of_km(int roadLengthNumber) {
        planCalculatorPage.slideToSpecificNumberRoadLength(roadLengthNumber);
    }

    @And("User sees listed Number of Signalized Intersections with initial value of {int}")
    public void user_sees_listed_number_of_signalized_intersections_with_initial_value_of(int numberOfIntersections) {
        planCalculatorPage.slideToSpecificNumberSignalizedIntersections(numberOfIntersections);
    }

    @And("User chooses {string} from the dropdown Select a Service")
    public void user_chooses_from_the_dropdown_select_a_service(String xWayPulseTwinNeuralService) {
        planCalculatorPage.selectPlanDropdownPulseTwinNeuralService(xWayPulseTwinNeuralService);
    }

    @And("User sees title X Way Pulse + Twin + Neural starter {string}")
    public void user_sees_title_x_way_pulse_twin_neural_starter(String expectedTitle) {
        planCalculatorPage.defaultPulseTwinNeuralTitle(expectedTitle);
    }

    @And("User sees listed Saas Price equal to {string}")
    public void user_sees_listed_saas_price_equal_to(String expectedDefaultPrice) {
        planCalculatorPage.defaultSaasPricePulseTwinNeural(expectedDefaultPrice);
    }

}
