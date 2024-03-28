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
    @FindBy(xpath = "(//span[@role='slider'])[2]")
    private WebElement sliderSignalizedIntersectionsLocator;

    // Select a Service
    @FindBy(xpath = "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input'][contains(.,'X Way Pulse')]")
    private WebElement dropDownSelectServiceLocator;

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

    // X Way Pulse + Twin + Neural starter title
    @FindBy(xpath = "//span[@class='PlanPricing_suggestedPlan-package__2Ennc'][contains(.,'X Way (Pulse + Twin + Neural)')]")
    private WebElement defaultTitlePulseTwinNeuralLocator;

    // SaaS Price*: $980 per month locator
    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $980 per month')]")
    private WebElement saasPriceLocatorPulseStarterLocator;

    // SaaS Price*: $1 885 per month locator
    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $1 885 per month')]")
    private WebElement saasPriceLocatorPulseStandardLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $1 680 per month')]")
    private WebElement saasPriceLocatorPulseTwinNeuralLocator;

    // SaaS Price*: $3 420 per month locator
    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $3 420 per month')]")
    private WebElement saasPriceLocatorPulseProLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $2 500 per month')]")
    private WebElement estimatedACRPricePerMonthLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $16 500 per month')]")
    private WebElement estimatedACRPricePerMonthStandardLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $41 000 per month')]")
    private WebElement estimatedACRPricePerMonthProLocator;

    // Estimated ACR**: $500 per month locator
    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $500 per month')]")
    private WebElement estimateACRlocator;

    // Estimated Communication/Data Fee***: $50 per month
    @FindBy(xpath = "//div[@data-testid='plan-price-line-3'][contains(.,'Estimated Communication/Data Fee***: $50 per month')]")
    private WebElement extimatedCommunicationDataFeeLocator;

    // Service X Way Pulse Twin Locators
    @FindBy(xpath = "//span[@class='PlanPricing_suggestedPlan-package__2Ennc'][contains(.,'X Way (Pulse + Twin)')]")
    private WebElement defaultTitlePulseTwinLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $1 260 per month')]")
    private WebElement defaultSaasPricePulseTwinLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $6 000 per month')]")
    private WebElement pulseTwinACRPriceLocator;

    // Dropdown locator
    @FindBy(xpath = "(//div[contains(.,'X Way Pulse')])[10]")
    private WebElement selectServiceXWayPulseDropDownLocator;

    @FindBy(xpath = "//li[contains(@data-value,'X Way (Pulse + Twin)')]")
    private WebElement selectServiceOptionPulseTwinDropdown;

    @FindBy(xpath = "//li[contains(.,'X Way (Pulse + Twin + Neural)')]")
    private WebElement selectServiceOptionPulseTwinNeuralDropdown;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $2 320 per month')]")
    private WebElement standardPulseTwinGeneratedPriceLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $22 000 per month')]")
    private WebElement standardPulseTwinGeneratedACRPriceLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $4 275 per month')]")
    private WebElement proPulseTwinSaasPriceLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $40 500 per month')]")
    private WebElement proPulseTwinACRPriceLocator;




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
        assertEqualsByWebElementExpectedText(dropDownSelectServiceLocator, defaultValueSelectService);
    }

    public void metricSwitcherDefaultMetric(String metricSwitcher) {
        assertEqualsByWebElementExpectedText(metricUnitSwitchLocator, metricSwitcher);
    }

    public void saasPricePulseStarter(String saasPrice) {
        assertEqualsByWebElementExpectedText(saasPriceLocatorPulseStarterLocator, saasPrice);
    }

    public void saasPricePulseStandard(String saasPrice) {
        assertEqualsByWebElementExpectedText(saasPriceLocatorPulseStandardLocator, saasPrice);
    }

    public void saasPricePulsePro(String saasPrice) {
        assertEqualsByWebElementExpectedText(saasPriceLocatorPulseProLocator, saasPrice);
    }

    public void estimatedACRPriceListed(String expectedACRPRICE) {
        assertEqualsByWebElementExpectedText(estimatedACRPricePerMonthLocator, expectedACRPRICE);
    }

    public void estimatedACRPriceStandardListed(String expectedACRPRICE) {
        assertEqualsByWebElementExpectedText(estimatedACRPricePerMonthStandardLocator, expectedACRPRICE);
    }

    public void estimatedACRPriceProListed(String expectedACRPRICE) {
        assertEqualsByWebElementExpectedText(estimatedACRPricePerMonthProLocator, expectedACRPRICE);
    }

    public void slideToSpecificNumberRoadLength(int value) {
        waitVisibilityOfWebElement(sliderRoadLengthLocator);
        moveSliderKey2(sliderRoadLengthLocator, true, value);
    }

    public void slideToSpecificNumberSignalizedIntersections(int value) {
        waitVisibilityOfWebElement(sliderSignalizedIntersectionsLocator);
        moveSliderKey2(sliderSignalizedIntersectionsLocator, true, value);
    }

    public void selectPlanDropdownPulseTwinService(String selectService) {
        waitElementAndClickOnIt(dropDownSelectServiceLocator);
        waitElementAndClickOnIt(selectServiceOptionPulseTwinDropdown);
    }

    public void selectPlanDropdownPulseTwinNeuralService(String selectService) {
        waitElementAndClickOnIt(dropDownSelectServiceLocator);
        waitElementAndClickOnIt(selectServiceOptionPulseTwinNeuralDropdown);
    }

    public void defaultSaasPricePulseTwin(String expectedPricePulseTwin) {
        assertEqualsByWebElementExpectedText(defaultSaasPricePulseTwinLocator, expectedPricePulseTwin);
    }

    public void defaultTitlePulseTwin(String expectedTitlePulseTwin) {
        assertEqualsByWebElementExpectedText(defaultTitlePulseTwinLocator, expectedTitlePulseTwin);
    }

    public void starterSaasPricePulseTwin(String expectedPricePulseTwin) {
        assertEqualsByWebElementExpectedText(defaultSaasPricePulseTwinLocator, expectedPricePulseTwin);
    }

    public void starterACRPricePulseTwin(String expectedStarterACRPRICEPulseTwin) {
        assertEqualsByWebElementExpectedText(pulseTwinACRPriceLocator, expectedStarterACRPRICEPulseTwin);
    }

    public void standardSaasPricePulseTwin(String expectedPricePulseTwin) {
        assertEqualsByWebElementExpectedText(standardPulseTwinGeneratedPriceLocator, expectedPricePulseTwin);
    }

    public void standardACRPricePulseTwin(String expectedStarterACRPRICEPulseTwin) {
        assertEqualsByWebElementExpectedText(standardPulseTwinGeneratedACRPriceLocator, expectedStarterACRPRICEPulseTwin);
    }

    public void proPulseTwinSaasPrice(String expectedPricePulseTwin) {
        assertEqualsByWebElementExpectedText(proPulseTwinSaasPriceLocator, expectedPricePulseTwin);
    }

    public void proACRPricePulseTwin(String expectedStarterACRPRICEPulseTwin) {
        assertEqualsByWebElementExpectedText(proPulseTwinACRPriceLocator, expectedStarterACRPRICEPulseTwin);
    }

    public void defaultSaasPricePulseTwinNeural(String defaultSaasPrice) {
        assertEqualsByWebElementExpectedText(saasPriceLocatorPulseTwinNeuralLocator, defaultSaasPrice);
    }

    public void defaultPulseTwinNeuralTitle(String defaultSaasPrice) {
        assertEqualsByWebElementExpectedText(defaultTitlePulseTwinNeuralLocator, defaultSaasPrice);
    }


}
