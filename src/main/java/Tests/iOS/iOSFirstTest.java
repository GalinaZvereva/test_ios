package Tests.iOS;

import Settings.iOS.BaseIOSTest;
import io.appium.java_client.ios.IOSDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iOSFirstTest extends BaseIOSTest {
    public iOSFirstTest(IOSDriver driver) {
        super(driver);
    }

    public iOSFirstTest clickNextButton(){
        setWait(By.id("The free encyclopedia"));
        tapElement(By.xpath("//XCUIElementTypeStaticText[@name='Next']"));
        setWait(By.id("New ways to explore"));
        tapElement(By.xpath("//XCUIElementTypeStaticText[@name='Next']"));
        setWait(By.id("Search in over 300 languages"));
        tapElement(By.xpath("//XCUIElementTypeStaticText[@name='Next']"));
        return this;
    }
    public iOSFirstTest clickButtonGetStarted(){
        tapElement(By.xpath("//XCUIElementTypeStaticText[@name='Get started']"));
        return this;
    }
    public iOSFirstTest assertLogotypeIsVisible(){
        String xPath_wiki_logo = "//XCUIElementTypeButton[@name='wikipedia']";
        setWait(By.xpath(xPath_wiki_logo));
        WebElement wikipedia = driver.findElement(By.xpath(xPath_wiki_logo));
        Assertions.assertTrue(wikipedia.isDisplayed(), "Cant found Wikipedia logotype");
        return this;
    }
}
