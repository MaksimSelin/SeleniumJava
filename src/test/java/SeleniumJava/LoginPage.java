package SeleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "passp-field-login")
    private WebElement loginField;

    @FindBy(xpath = "//*[contains (text(), 'Войти')]/..")
    private WebElement loginBtn;

    @FindBy(id = "passp-field-passwd")
    private WebElement passwdField;

    public void inputLogin(String login){
        loginField.sendKeys(login);
    }

    public void inputPasswd(String passwd){
        passwdField.sendKeys(passwd);
    }

    public void clicLoginBtn(){
        loginBtn.click();
    }

}
