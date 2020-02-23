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
@Test(priority = 2)
    public void testDoEmailBox() throws InterruptedException {
        getInItElements();
        doSignUpButton();
        sleepFor(2);
        doEmailBox("9133063116");
        sleepFor(2);
}
@Test(priority = 3)
    public void testDoContinuousButton() throws InterruptedException {
        getInItElements();
        doSignUpButton();
        sleepFor(2);
        doEmailBox("9133063116");
        sleepFor(2);
        doContinuousButton();
        sleepFor(2);
}
}
