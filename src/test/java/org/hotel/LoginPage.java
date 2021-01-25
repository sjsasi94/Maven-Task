package org.hotel;

import org.baseclass.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
	public LoginPage() {
PageFactory.initElements(driver, this);	
	}
	@FindBy(id="username") 
	private WebElement userName;
	@FindBy(id="password") 
	private WebElement password;
	@FindBy(id="login") 
	private WebElement login;
	public void setUserNameAndPassword(String name,String pass) {
		userName.sendKeys(name);
		password.sendKeys(pass);
	}
	public void login() {
login.click();
	}

}
