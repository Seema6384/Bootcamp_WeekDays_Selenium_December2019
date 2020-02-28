package testhome;

import home.pageobject.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
@Test(priority = 4)
    public void testDoENButton() throws InterruptedException {
        getInItElements();
        doENButton();
        sleepFor(2);
}
    @Test(priority = 4)
    public void testDoCheckButton() throws InterruptedException {
        getInItElements();
        doENButton();
        sleepFor(2);
        doCheckButton();
        sleepFor(2);
    }
    @Test(priority = 4)
    public void testDoSaveChangesButton() throws InterruptedException {
        getInItElements();
        doENButton();
        sleepFor(2);
        doCheckButton();
        sleepFor(2);
        doSaveChangesButton();
        sleepFor(2);
    }
    @Test(priority = 5)
    public void testDoSearchBox() throws InterruptedException {
        getInItElements();
        doSearchBox("mobile phone");
        sleepFor(2);
    }
    @Test(priority = 6)
    public void testDoSearchButton() throws InterruptedException {
        getInItElements();
        doSearchBox("mobile phone");
        sleepFor(2);
        doSearchButton();
        sleepFor(2);
    }
    @Test(priority = 7)
    public void testDoHoverTryPrimeButton() throws InterruptedException {
        getInItElements();
        doHoverTryPrimeButton();
        sleepFor(2);
    }
    @Test(priority = 8)
    public void testDoHoverAccountAndList() throws InterruptedException {
        getInItElements();
        doHoverAccountAndList();
        sleepFor(2);
    }
    @Test(priority = 9)
    public void testDoClickStartHere() throws InterruptedException {
        getInItElements();
        doHoverAccountAndList();
        sleepFor(2);
        doHoverStartHere();
        sleepFor(2);
    }
    @Test(priority = 10)
    public void testDoPutYourName() throws InterruptedException {
        getInItElements();
        doHoverAccountAndList();
        sleepFor(2);
        doHoverStartHere();
        sleepFor(2);
        doPutYourName("abc");
    }
    @Test(priority = 11)
    public void testDoPutEmail() throws InterruptedException {
        getInItElements();
        doHoverAccountAndList();
        sleepFor(2);
        doHoverStartHere();
        sleepFor(2);
        doPutYourName("abc");
        sleepFor(2);
        doPutEmail("abc@gmail.com");
    }
    @Test(priority = 12)
    public void testDoPutPassword() throws InterruptedException {
        getInItElements();
        doHoverAccountAndList();
        sleepFor(2);
        doHoverStartHere();
        sleepFor(2);
        doPutYourName("abc");
        sleepFor(2);
        doPutEmail("abc@gmail.com");
        sleepFor(2);
        doPutPassword("abcdef");
    }
    @Test(priority = 13)
    public void testDoPutReEnteredPassword() throws InterruptedException {
        getInItElements();
        doHoverAccountAndList();
        sleepFor(2);
        doHoverStartHere();
        sleepFor(2);
        doPutYourName("abc");
        sleepFor(2);
        doPutEmail("abc@gmail.com");
        sleepFor(2);
        doPutReEnteredPassword("abcdef");
        sleepFor(2);
    }
    @Test(priority = 14)
    public void testDoClickCreateYourAmazonAccount() throws InterruptedException {
        getInItElements();
        doHoverAccountAndList();
        sleepFor(2);
        doHoverStartHere();
        sleepFor(2);
        doPutYourName("abc");
        sleepFor(2);
        doPutEmail("abc@gmail.com");
        sleepFor(2);
        doPutReEnteredPassword("abcdef");
        sleepFor(2);
        doClickCreateYourAmazonAccount();
    }
}
