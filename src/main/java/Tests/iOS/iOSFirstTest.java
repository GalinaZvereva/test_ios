package Tests.iOS;

import Settings.iOS.BaseIOSTest;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;

public class iOSFirstTest extends BaseIOSTest {
    public iOSFirstTest(IOSDriver driver) {
        super(driver);
    }

    public iOSFirstTest clickNextButton(){
        String element = "label == \"Next\" AND name == \"Next\" AND type == \"XCUIElementTypeButton\"";
        setWait(MobileBy.iOSNsPredicateString("label == 'The free encyclopedia'"));
        tapElement(MobileBy.iOSNsPredicateString(element));
        setWait(MobileBy.iOSNsPredicateString("label == \"New ways to explore\""));
        tapElement(MobileBy.iOSNsPredicateString(element));
        setWait(MobileBy.iOSNsPredicateString("label == \"Search in nearly 300 languages\""));
        tapElement(MobileBy.iOSNsPredicateString(element));
        setWait(MobileBy.iOSNsPredicateString("label == \"Help make the app better\""));
        return this;
    }
    public iOSFirstTest clickOnSwitch(){
        String element = "label == \"Send usage reports\" AND name == \"Send usage reports\" AND value == \"0\"";
        tapElement(MobileBy.iOSNsPredicateString(element));
        return this;
    }
    public iOSFirstTest clickInButtonGetStarted(){
        String element = "label == \"Get started\" AND name == \"Get started\" AND type == \"XCUIElementTypeButton\"";
        tapElement(MobileBy.iOSNsPredicateString(element));
        return this;
    }
}
