package ash.org;

import org.openqa.selenium.WebDriver;

public class ClassLogin extends LoginPagee {
	
	public static void main(String[] args) {
		WebDriver getdriver = getdriver();
		
		geturl("https://www.facebook.com/");
		
		LoginPagee l = new LoginPagee();
		insertdata(LoginPagee.getUsername(), "selenium");
		insertdata(LoginPagee.getPassword(), "simple");
		uclick(LoginPagee.getLogin());
		uquit();
		
	}

}
