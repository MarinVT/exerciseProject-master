package pageObjects;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlanCalculatorPage extends BasePage {

    public PlanCalculatorPage() {
        super();
    }

    // Returns title "Plan Calculator" title from main section in black background locator
    @FindBy(xpath = "(//div[contains(.,'PLAN CALCULATOR')])[4]")
    private WebElement planCalculatorTitleLocator;

    // ROAD LENGTH LOCATOR
//    @FindBy(xpath = "//span[@class='jss5'][contains(.,'1 km')]")
    @FindBy(xpath = "(//span[@role='slider'])[1]")
    private WebElement sliderRoadLengthLocator;

    // Number of Signalized Intersections LOCATOR
    @FindBy(xpath = "(//span[@class='jss5'][contains(.,'1')])[2]")
    private WebElement sliderSignalizedIntersectionsLocator;

    // Select a Service
    @FindBy(xpath = "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input'][contains(.,'X Way Pulse')]")
    private WebElement dropDownSelectService;

    // Metric locator field
    @FindBy(xpath = "//div[@class='metric active'][contains(.,'METRIC')]")
    private WebElement metricUnitSwitchLocator;

    // Imperial metric
    @FindBy(xpath = "//div[@class='active'][contains(.,'IMPERIAL')]")
    private WebElement imperialUnitSwitchLocator;

    // Suggested Plan locator
    @FindBy(xpath = "//div[text()='Suggested Plan']")
    private WebElement suggestedPlanTitleLocator;

    // X Way Pulse Starter locator
    @FindBy(xpath = "//div[text()='X Way Pulse']")
    private WebElement xWayPulseStartedLocator;

    // SaaS Price*: $980 per month locator
    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $980 per month')]")
    private WebElement saasPriceLocatorPulseStarter;

    // Estimated ACR**: $500 per month locator
    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $500 per month')]")
    private WebElement estimateACRlocator;

    // Estimated Communication/Data Fee***: $50 per month
    @FindBy(xpath = "//div[@data-testid='plan-price-line-3'][contains(.,'Estimated Communication/Data Fee***: $50 per month')]")
    private WebElement extimatedCommunicationDataFeeLocator;


    // Plan calculator methods
    public void verifyPlanCalculatorTitle(String expectedTitle) {
        assertEqualsByWebElementExpectedText(planCalculatorTitleLocator, expectedTitle);
    }

    public void defaultValueRoadLengthIsOne(String roadLengthDefaultValueOne) {
        assertEqualsByWebElementExpectedText(sliderRoadLengthLocator, roadLengthDefaultValueOne);
    }

    public void defaultValueNumberOfSignalizedIntersectionsIsOne(String NumberIntersectionsDefaultValueOne) {
        assertEqualsByWebElementExpectedText(sliderSignalizedIntersectionsLocator, NumberIntersectionsDefaultValueOne);
    }

    public void defaultValueSelectService(String defaultValueSelectService) {
        assertEqualsByWebElementExpectedText(dropDownSelectService, defaultValueSelectService);
    }

    public void metricSwitcherDefaultMetric(String metricSwitcher) {
        assertEqualsByWebElementExpectedText(metricUnitSwitchLocator, metricSwitcher);
    }

    public void saasPricePulseStarter(String saasPrice) {
        assertEqualsByWebElementExpectedText(saasPriceLocatorPulseStarter, saasPrice);
    }

    public void slideToSpecificNumber(int value) {
        waitVisibilityOfWebElement(sliderRoadLengthLocator);
        moveSliderKey2(sliderRoadLengthLocator, true, value);
    }


}
