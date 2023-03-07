package RunTests;

import Settings.iOS.iOSTestCase;
import Tests.iOS.iOSFirstTest;
import org.junit.jupiter.api.Test;

public class RunIOSTests extends iOSTestCase {

    @Test
    public void start (){
        iOSFirstTest ft = new iOSFirstTest(driver);
        ft
                .clickNextButton()
                .clickOnSwitch()
                .clickInButtonGetStarted();
    }
}
