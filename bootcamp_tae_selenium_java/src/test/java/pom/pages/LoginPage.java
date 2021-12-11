package pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="id_img_user")
    WebElement userIcon;
    @FindBy(name="ctl00$ContentPlaceHolderBody$txtEmailAddress")
    WebElement loginInput;
    @FindBy(name="ctl00$ContentPlaceHolderBody$txtPassword")
    WebElement passwordInput;
    @FindBy(id="ContentPlaceHolderBody_btnLogin")
    WebElement loginBtn;
    @FindBy(id="txtEmailAddress")
    WebElement emailInput;
    @FindBy(id="txtPassword")
    WebElement passInput;
    @FindBy(id="btnLogin")
    WebElement btnLogin;


    public LoginPage userLogin(){
        click(userIcon);
        wait.until(ExpectedConditions.elementToBeClickable(loginInput));
        loginInput.sendKeys(dotenv.get("name"));
        passwordInput.sendKeys(dotenv.get("password"));
        click(loginBtn);
        return this;
    }

    public LoginPage logIn(){
        emailInput.sendKeys(dotenv.get("name"));
        passInput.sendKeys(dotenv.get("password"));
        click(btnLogin);
        return this;
    }
}
