package pom.test.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pom.pages.CandyPage;
import pom.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.pages.LoginPage;

public class BaseTest {

    private WebDriver driver;
    private final String mainUrl = "https://www.cinemarkhoyts.com.ar/";
    protected HomePage homePage;
    protected CandyPage candyPage;
    protected LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
        homePage = new HomePage(driver);
        candyPage = new CandyPage(driver);
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown(){

        //driver.quit();
    }
}