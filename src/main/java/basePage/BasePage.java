package basePage;
import org.openqa.selenium.interactions.Action;
import seleniumDriver.DriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Global_Vars;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BasePage {

    public WebDriverWait wait;

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
    }

    //    public static WebDriver driver;
    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    // NAVIGATE TO URL CUSTOM METHOD
    public void navigateToSiteURL(String url) {
        getDriver().get(url);
    }

    //  FIND METHOD
    public WebElement findWebElementByLocator(By locator) {
        WebDriverWait webDriverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        return getDriver().findElement(locator);
    }

    //Wait Wrapper Method using BY by - https://www.swtestacademy.com/page-object-model-java/
    public void waitVisibilityOfElementsLocatedBy(By by) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    // WAIT VISIBILITY OF WEBELEMENT PASSING WEBELEMENT
    public void waitVisibilityOfWebElement(WebElement element) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    // WAIT VISIBILITY OF WEBELEMENT
    public void waitElementToBeVisible(WebElement element) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementAndClickOnIt(WebElement webElement) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        WebElement findElement = wait.until(ExpectedConditions.elementToBeClickable(webElement));
        findElement.click();
    }

    // Hover methods using Actions
    public void hoverEffectOverAnElement(WebElement webElement) {
        Actions actions = new Actions(getDriver());
        waitVisibilityOfWebElement(webElement);
        actions.moveToElement(webElement);
        actions.perform();
    }

    // Hover method and pause for 1 second using Actions
    public void hoverOverAnElementPause1Second(WebElement webElement) {
        Actions actions = new Actions(getDriver());
        waitVisibilityOfWebElement(webElement);
        actions.moveToElement(webElement);
        actions.pause(1000).perform();
    }

    public void waitHoverOverElement(WebElement webElement) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(wait.until(ExpectedConditions.visibilityOf(webElement))).perform();
//        waitCustomMethod(2000);
    }

    public void hoverAndClick(WebElement webElement) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable(webElement))).click().perform();
    }

    public void hoverHoldAndClickOnElement(WebElement webElement) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        Actions actions = new Actions(getDriver());
        actions.moveToElement(wait.until(ExpectedConditions.visibilityOf(webElement))).clickAndHold().build().perform();
    }

    // SENDKEYS CUSTOM METHOD USING BY AND STRING TO BE ENTERED
    public void sendKeysLocatedByEnterString(By by, String stringToEnter) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(stringToEnter);
    }

    // SENDKEYS CUSTOM USING WEBELEMENT AND STRING TO BE ENTERED
    public void sendKeysViaWebElementAndEnterString(WebElement webElement, String stringToEnter) {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Vars.DEFAULT_EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(webElement)).sendKeys(stringToEnter);
    }

    public void waitCustomMethod(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // VALIDATE CORRECT PAGE METHOD
    public void validateCorrectPage(String searchString) {
        if (getDriver().getTitle().contains(searchString.trim())) {
            throw new IllegalStateException(
                    "This is not "
                            + searchString + " .The actual Url is: "
                            + getDriver().getCurrentUrl());
        }
    }

    // GET CURRENT PAGE METHOD
    public String getCurrentURL() {
        return getDriver().getCurrentUrl();
    }

    // DROPDOWN METHOD SELECTION BY TEXT
    public void selectFromDropDownByText(WebElement element, String selectByText) {
        Select select = new Select(element);
        select.selectByVisibleText(selectByText);
    }

    // DROPDOWN METHOD SELECTION BY VALUE
    public void selectFromDropDownByValue(WebElement element, String selectByValue) {
        Select select = new Select(element);
        select.selectByValue(selectByValue);
    }

    //WRITE TEXT
    public void writeText (By elementBy, String text) {
        waitVisibilityOfElementsLocatedBy(elementBy);
        getDriver().findElement(elementBy).sendKeys(text);
    }
    //CLEAR METHOD
    public void clear(By locator) {
        findWebElementByLocator(locator).clear();
    }

    //READ TEXT USING By
    public String readTextUsingBy (By elementBy) {
        waitVisibilityOfElementsLocatedBy(elementBy);
        return getDriver().findElement(elementBy).getText();
    }

    //READ TEXT USING By by
    public String readText (By by) {
        waitVisibilityOfElementsLocatedBy(by);
        return getDriver().findElement(by).getText();
    }

    // Method returns webElement's text
    public String readTextWebElement(WebElement webElement) {
        return webElement.getText();
    }

    //ASSERT METHOD using By by
    public void assertEqualsByElementExpectedTextUsingBy(By elementBy, String expectedText) {
        waitVisibilityOfElementsLocatedBy(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
        System.out.println("Main text is: " + expectedText);
    }

    //ASSERT METHOD using WebElement
    public void assertEqualsByWebElementExpectedText(WebElement webElement, String expectedText) {
        waitVisibilityOfWebElement(webElement);
        Assert.assertEquals(readTextWebElement(webElement), expectedText);
        System.out.println("Main text is: " + expectedText);
    }

    // Get message method
    public String getErrorMessage(WebElement element) {
        String strErrorMsg = null;
//        WebElement errorMsg = driver.findElement(errorMsgTxt);
        if(element.isDisplayed() && element.isEnabled())
            strErrorMsg = element.getText();
        return strErrorMsg;
    }

    // Switch to alert
    public void waitForAlertWindowAndValidateText(String text) {
        String alertMessage = getDriver().switchTo().alert().getText();
        Assert.assertEquals(alertMessage, text);
    }

    // SWITCH TO NEW TAB IN THE BROWSER
    public void openNewTab() {
        Set<String> handles = getDriver().getWindowHandles();
        List<String> list = new ArrayList<>(handles);
        waitCustomMethod(2000);
        String newWindow = list.get(1);
        getDriver().switchTo().window(newWindow);
    }

    // SCROLL DOWN ACTION
    public void scrollDown(WebElement webElement) {
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.PAGE_DOWN);
        actions.perform();
    }

    // SCROLL DOWN ACTION TO ELEMENT
    public void scrollDownToElement(WebElement webElement) {
        waitVisibilityOfWebElement(webElement);
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(10, 10);
        Actions actions = new Actions(getDriver());
        actions.scrollFromOrigin(scrollOrigin, 0, 2000).perform();
    }

    // Slide method
    public void sliderLeftRight(WebElement sliderElement, int numberMoveTo) {
        waitVisibilityOfWebElement(sliderElement);
        Actions moveSlider = new Actions(getDriver());
        moveSlider.dragAndDropBy(sliderElement, ((numberMoveTo*-25)/100), 0).build();
    }

    // Slide method 2
    public void sliderLeftRight2(WebElement sliderElement, int numberMoveTo) {
        waitVisibilityOfWebElement(sliderElement);
        Actions moveSlider = new Actions(getDriver());
        moveSlider
                .dragAndDropBy(sliderElement, 0, numberMoveTo).perform();
    }

    public void moveSliderKey(WebElement sliderElement, boolean isRightSliding, int keyPressTimes) {
        waitVisibilityOfWebElement(sliderElement);
        Actions moveSlider = new Actions(getDriver());

        if (isRightSliding) {
            for (int i = 0; i < keyPressTimes; i++) {
                moveSlider.sendKeys(Keys.ARROW_RIGHT).perform();
            }

        }

    }

    public void moveSliderKey2(WebElement sliderElement, boolean isRightSliding, int keyPressTimes) {
        waitVisibilityOfWebElement(sliderElement);

        if (isRightSliding) {
            for (int i = 1; i < keyPressTimes; i++) {
                sliderElement.sendKeys(Keys.ARROW_RIGHT);
            }

        }

    }



//    Actions action = new Actions(driver);
//        for (int i = 0; i < 5; i++)
//    {
//        action.DragAndDropToOffset(sliderA, 50, 0).Build().Perform();
//        Thread.Sleep(300);
//
//        action.DragAndDropToOffset(sliderB, 50, 0).Build().Perform();
//        Thread.Sleep(300);
//    }



    /*
    Get desired values method and returns list with items - LINK BELOW
    https://www.testingminibytes.com/courses/java-8-for-automation-qa-power-of-functional-programming/optimising-gettext-gettagname-getattribute-methods-in-selenium

    NOTE: This is a selector that will be passed to the method - private By menuItems = By.xpath("//div[@id='nav-xshop']/a")
    List<WebElement> elements = driver.findElements(menuItems)
    List<String> takeAllValues1 = getValues(elements(Webelement, Webelement::getText)
    List<String> takeAllValues2 = getValues(elements(Webelement, e -> e.getAttribute("href"))
    List<String> takeAllValues3 getValues(elements(Webelement, Webelement::getTagName)
     */
    public List<String> getValuesFromDropDown(List<WebElement> elements, Function<WebElement, String> function) {
        return elements.stream().map(function).collect(Collectors.toList());
    }
    /*
    Call the method ->
    getValues.foreach(System::println)
     */

}
