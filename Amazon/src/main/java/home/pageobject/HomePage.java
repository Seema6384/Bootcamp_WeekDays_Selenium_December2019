package home.pageobject;

import home.webelement.WebElementHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.net.URL;

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
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementENButton)
    public static WebElement ENButton;
    public static WebElement getENButton() {return ENButton;}
    public static void doENButton() {
        getENButton().click();
    }
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementCheckButton)
    public static WebElement CheckButton;
    public static WebElement getCheckButton() {return CheckButton;}
    public static void doCheckButton() {
        getCheckButton().click();
    }
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSaveChangesButton)
    public static WebElement SaveChangesButton;
    public static WebElement getSaveChangesButton() {return SaveChangesButton;}
    public static void doSaveChangesButton() {
        getSaveChangesButton().click();
    }
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSearchBox)
    public static WebElement SearchBox;
    public static WebElement getSearchBox() {return SearchBox;}
    public static void doSearchBox(String value) { getSearchBox().sendKeys("mobile phone"); }
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementSearchButton)
    public static WebElement SearchButton;
    public static WebElement getSearchButton() {return SearchButton;}
    public static void doSearchButton() {getSearchButton().click();}
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementTryPrimeButton)
    public static WebElement TryPrimeButton;
    public static WebElement getTryPrimeButton() {
        return TryPrimeButton;
    }
    public static void doHoverTryPrimeButton() {
        Actions actions=new Actions(driver);
        actions.moveToElement(getTryPrimeButton()).perform();}
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementAccountAndList)
    public static WebElement AccountAndList;
    public static WebElement getAccountAndList() {
        return AccountAndList;
    }
    public static void doHoverAccountAndList() {
        Actions actions=new Actions(driver);
        actions.moveToElement(getAccountAndList()).perform();}
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementStartHere)
    public static WebElement StartHere;
    public static WebElement getStartHere() {
        return StartHere;
    }
    public static void doHoverStartHere() {
        Actions actions=new Actions(driver);
        actions.moveToElement(getStartHere()).perform();
    }
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementYourName)
    public static WebElement YourName;
    public static WebElement getYourName() {return YourName;}
    public static void doPutYourName(String value) { getYourName().sendKeys("abc");
    }
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementEmail)
    public static WebElement Email;
    public static WebElement getEmail() {return Email;}
    public static void doPutEmail(String value) { getEmail().sendKeys("abc@gmail.com");}
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementPassword)
    public static WebElement Password;
    public static WebElement getPassword() {return Password;}
    public static void doPutPassword(String value) { getPassword().sendKeys("abcdef");}
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementReEnteredPassword)
    public static WebElement ReEnteredPassword;
    public static WebElement getReEnteredPassword() {return ReEnteredPassword;}
    public static void doPutReEnteredPassword(String value) { getReEnteredPassword().sendKeys("abcdef");}
    @FindBy(how = How.XPATH, using = WebElementHomePage.webElementCreateYourAmazonAccount)
    public static WebElement CreateYourAmazonAccount;
    public static WebElement getCreateYourAmazonAccount() {return CreateYourAmazonAccount;}
    public static void doClickCreateYourAmazonAccount() { getCreateYourAmazonAccount().click();}


}


