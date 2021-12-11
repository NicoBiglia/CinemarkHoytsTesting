package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CandyPage extends BasePage{

    public CandyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "CANDY")
    WebElement candyLink;
    @FindBy(linkText = "TODOS LOS PRODUCTOS")
    WebElement allProductsLink;
    @FindBy(id = "category33")
    WebElement productDiv;


    public void goToCandy(){
        click(candyLink);
        wait.until(ExpectedConditions.elementToBeClickable(allProductsLink));
        click(allProductsLink);
    }

    public CandyPage selectCinema() {
        Select selectCinema = new Select(driver.findElement(By.id("ddlCinemas")));
        selectCinema.selectByVisibleText("Hoyts Nuevocentro");
        wait.until(ExpectedConditions.visibilityOf(productDiv));
        return this;
    }

    public WebElement merch(){
        return productDiv;
    }
}
