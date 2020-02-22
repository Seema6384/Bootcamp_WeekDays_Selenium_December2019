package testhome;

import home.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    static HomePage homepage;
    //PageFactory
    public void getInItElements() {
        homepage = PageFactory.initElements(driver, HomePage.class);
    }
@Test(priority = 1)
    public void testDoSignUpButton() throws InterruptedException {
        getInItElements();
        doSignUpButton();
        sleepFor(2);
}
}
