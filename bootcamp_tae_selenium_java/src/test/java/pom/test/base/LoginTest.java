package pom.test.base;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import pom.pages.CandyPage;
import pom.pages.HomePage;


public class LoginTest extends BaseTest{

    private SoftAssert softAssert = new SoftAssert();
    private Assertion hardAssert = new Assertion();

    @Test
    public void logIn(){
        loginPage.userLogin();
        softAssert.assertTrue(homePage.myPoints().isDisplayed(), "Result is not as expected");
        hardAssert.assertTrue(homePage.myPoints().getText().contains("MIS PUNTOS 3884"), "Result is not as expected");
    }

    @Test
    public void logOut(){
        logIn();
        homePage.userIcon();
        homePage.logOut();
        hardAssert.assertTrue(homePage.noUserImg().isDisplayed());
    }

    @Test
    public void selectCandy(){
        candyPage.goToCandy();
        loginPage.logIn();
        candyPage.selectCinema();
        hardAssert.assertTrue(candyPage.merch().isDisplayed());
    }
}
