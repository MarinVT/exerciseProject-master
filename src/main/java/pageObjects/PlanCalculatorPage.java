package pageObjects;

import basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlanCalculatorPage extends BasePage {

    public PlanCalculatorPage() {
        super();
    }

    @FindBy(xpath = "(//div[contains(.,'PLAN CALCULATOR')])[4]")
    private WebElement planCalculatorTitleLocator;

    @FindBy(xpath = "(//span[@role='slider'])[1]")
    private WebElement sliderRoadLengthLocator;

    @FindBy(xpath = "(//span[@role='slider'])[2]")
    private WebElement sliderSignalizedIntersectionsLocator;

//    @FindBy(xpath = "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input'][contains(.,'X Way Pulse')]")

    @FindBy(xpath = "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input'][contains(.,'X Way Pulse')]")
    private WebElement dropDownSelectServiceLocator;

    @FindBy(xpath = "//div[@class='metric active'][contains(.,'METRIC')]")
    private WebElement metricUnitSwitchLocator;

    @FindBy(xpath = "//div[@class='active'][contains(.,'IMPERIAL')]")
    private WebElement imperialUnitSwitchLocator;

    @FindBy(xpath = "//div[text()='Suggested Plan']")
    private WebElement suggestedPlanTitleLocator;

    @FindBy(xpath = "//div[text()='X Way Pulse']")
    private WebElement xWayPulseStartedLocator;

    @FindBy(xpath = "//span[@class='PlanPricing_suggestedPlan-package__2Ennc'][contains(.,'X Way (Pulse + Twin + Neural)')]")
    private WebElement defaultTitlePulseTwinNeuralLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $980 per month')]")
    private WebElement saasPriceLocatorPulseStarterLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $1 350 per month')]")
    private WebElement saasPriceGeneratedPulseTwin;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $1 885 per month')]")
    private WebElement saasPriceLocatorPulseStandardLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $1 680 per month')]")
    private WebElement saasPriceLocatorPulseTwinNeuralLocator;

    // SaaS Price*: $3 420 per month locator
    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $3 420 per month')]")
    private WebElement saasPriceLocatorPulseProLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $1 800 per month')]")
    private WebElement saasPricePulseTwinNeuralLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $2 500 per month')]")
    private WebElement estimatedACRPricePerMonthLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $7 500 per month')]")
    private WebElement pulseTwinNeuralGeneratedPriceLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $16 500 per month')]")
    private WebElement estimatedACRPricePerMonthStandardLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $41 000 per month')]")
    private WebElement estimatedACRPricePerMonthProLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $500 per month')]")
    private WebElement estimateACRlocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-3'][contains(.,'Estimated Communication/Data Fee***: $50 per month')]")
    private WebElement extimatedCommunicationDataFeeLocator;

    @FindBy(xpath = "//span[@class='PlanPricing_suggestedPlan-package__2Ennc'][contains(.,'X Way (Pulse + Twin)')]")
    private WebElement defaultTitlePulseTwinLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $1 260 per month')]")
    private WebElement defaultSaasPricePulseTwinLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $6 000 per month')]")
    private WebElement pulseTwinACRPriceLocator;

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

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $4 255 per month')]")
    private WebElement proPulseTwinNeuralSaasPriceLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $36 500 per month')]")
    private WebElement proPulseTwinNeuralStandardACRPriceLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $77 500 per month')]")
    private WebElement proPulseTwinNeuralProACRPriceLocator;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-1'][contains(.,'SaaS Price*: $5 985 per month')]")
    private WebElement proPulseTwinNeuralGeneratedSaasPrice;

    @FindBy(xpath = "//div[@data-testid='plan-price-line-2'][contains(.,'Estimated ACR**: $9 500 per month')]")
    private WebElement estimatedACRPricePulseTwin;



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
        assertEqualsByWebElementExpectedText(saasPriceGeneratedPulseTwin, expectedPricePulseTwin);
    }

    public void starterACRPricePulseTwin(String expectedStarterACRPRICEPulseTwin) {
        assertEqualsByWebElementExpectedText(estimatedACRPricePulseTwin, expectedStarterACRPRICEPulseTwin);
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

    public void pulseTwinNeuralGeneratedPrice(String saasPrice) {
        assertEqualsByWebElementExpectedText(saasPricePulseTwinNeuralLocator, saasPrice);
    }

    public void pulseTwinNeuralGeneratedACRPrice(String acrPrice) {
        assertEqualsByWebElementExpectedText(pulseTwinNeuralGeneratedPriceLocator, acrPrice);
    }

    public void pulseTwinNeuralStandardGeneratedACRPrice(String acrPrice) {
        assertEqualsByWebElementExpectedText(proPulseTwinNeuralStandardACRPriceLocator, acrPrice);
    }

    public void pulseTwinNeuralStandardGeneratedSaasPrice(String acrPrice) {
        assertEqualsByWebElementExpectedText(proPulseTwinNeuralSaasPriceLocator, acrPrice);
    }

    public void pulseTwinNeuralProdGeneratedACRPrice(String acrPrice) {
        assertEqualsByWebElementExpectedText(proPulseTwinNeuralProACRPriceLocator, acrPrice);
    }

    public void pulseTwinNeuralProdGeneratedSaasPrice(String saasPrice) {
        assertEqualsByWebElementExpectedText(proPulseTwinNeuralGeneratedSaasPrice, saasPrice);
    }


}
