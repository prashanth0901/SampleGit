package ash.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagee extends BaseClass {
	
	public LoginPagee() {
		PageFactory.initElements(driver, this);
	}

	//initialize all locators
	
	@FindBy (id="email")
	private static WebElement username;
	
	@FindBy (id="pass")
	private static WebElement password;
	
	@FindBy (id="login")
	private static WebElement login;

	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getLogin() {
		return login;
	}
	
}
