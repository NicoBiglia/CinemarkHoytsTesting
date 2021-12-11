package pom.pages;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.Core.LocalDriverManager;

import java.util.Set;

public abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Dotenv dotenv = Dotenv.load();

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected WebElement findElementBy(By by) {
        return LocalDriverManager.getInstance().getDriver().findElement(by);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    protected void click(WebElement webElement) {
        webElement.click();
    }




    protected void type(String text, By locator) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }


    protected void submit(By locator) {
        find(locator).sendKeys(Keys.ENTER);
    }

    public boolean isDisplayed(By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}