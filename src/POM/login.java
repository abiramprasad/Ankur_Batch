package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy(id = "username")
	private WebElement username;
	@FindBy(name = "pwd")
	private WebElement password;
	@FindBy(id = "loginButton")
	private WebElement loginBtn;

	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void username(String un) {
		username.sendKeys(un);
	}

	public void setpassword(String pw) {
		password.sendKeys(pw);
	}

	public void loginButton() {
		loginBtn.click();

	}

}
