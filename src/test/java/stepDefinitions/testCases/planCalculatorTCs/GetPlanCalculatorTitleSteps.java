package stepDefinitions.testCases.planCalculatorTCs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.PlanCalculatorPage;

public class GetPlanCalculatorTitleSteps {

    private PlanCalculatorPage planCalculatorPage;

    public GetPlanCalculatorTitleSteps(PlanCalculatorPage planCalculatorPage) {
        this.planCalculatorPage = planCalculatorPage;
    }

    @Given("User opens {string} to verify that the category title is listed")
    public void user_opens_to_verify_that_the_category_title_is_listed(String url) {
        planCalculatorPage.navigateToSiteURL(url);
    }
    @And("User sees the title {string} in black background successfully listed")
    public void user_sees_the_title_in_black_background_successfully_listed(String expectedTitle) {
        planCalculatorPage.verifyPlanCalculatorTitle(expectedTitle);
    }


}
