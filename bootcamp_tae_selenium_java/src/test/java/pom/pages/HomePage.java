package pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="id_img_user")
    WebElement userIcon;
    @FindBy(css="#panelNavbar > header > nav > span.nav-points.nav-points-desktop")
    WebElement pointsText;
    @FindBy(linkText = "CERRAR SESIÓN")
    WebElement logOutBtn;
    @FindBy(css = "img[src='/images/res/user-outline.png']")
    WebElement noUserImg;


    public WebElement myPoints(){
        return pointsText;
    }
    public WebElement noUserImg(){
        return noUserImg;
    }

    public HomePage userIcon(){
        click(userIcon);
        return this;
    }

    public HomePage logOut(){
        wait.until(ExpectedConditions.elementToBeClickable(logOutBtn));
        logOutBtn.isDisplayed();
        click(logOutBtn);
        return this;
    }
}
