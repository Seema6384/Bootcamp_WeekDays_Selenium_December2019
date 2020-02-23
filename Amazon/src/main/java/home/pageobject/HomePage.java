package home.pageobject;

import home.webelement.WebElementHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends WebElementHomePage {
  //  static String url="https://www.google.com/";
    //static String amazonUrl="http://www.amazon.com/";
  //  static WebDriver driver;
    //public static void main(String[] args) {
        //private static void navigateTo(String url) {
      //  System.setProperty("webdriver.chrome.driver", "BrowserDriver/chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //driver.navigate().to(amazonUrl);

    //}
    @FindBy(how = How.XPATH, using = WebElementHomePage.webelementSignUpButton)
    public static WebElement SignUpButton;
    public static WebElement getSignUpButton() {return SignUpButton;}
    public static void doSignUpButton() {
        getSignUpButton().click();
    }
    @FindBy(how = How.XPATH, using = WebElementHomePage.webelementEmailBox)
    public static WebElement EmailBox;
    public static WebElement getEmailBox() {return EmailBox;}
    public static void doEmailBox(String value) {
       getEmailBox().sendKeys(value);
    }
   @FindBy(how = How.CLASS_NAME,using = WebElementHomePage.webelementContinuousButton)
    public static WebElement ContinuousButton;
    public static WebElement getContinuousButton() {return ContinuousButton;}
    public static void doContinuousButton() {
        getContinuousButton().click();
    }

}