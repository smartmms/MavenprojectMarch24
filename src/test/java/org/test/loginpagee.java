package org.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class loginpagee {

	public class Loginpage extends Baseclass {

		public void start() {

			PageFactory.initElements(driver, this);
		}

		@CacheLookup
		//ANDOPERATOR
		@FindBys({@FindBy(id="email"),@FindBy(xpath="input[@name='email']")})
		private WebElement Txtusername;
		//OROPERATOR
		@FindAll ({ @FindBy(id="flipkart"),@FindBy(xpath="input[@name='pass']")}) 
		private WebElement Txtpassword;

		@FindBy(name="login")
		private  WebElement btnlogin;

		//GETTER

		public List< WebElement> getTxtusername() {
			return getTxtusername();}

		public WebElement getTxtpassword() {
			return Txtpassword;}

		public List<WebElement> getBtnlogin() {
			return getBtnlogin();}

		public void login(String user,String pass) {
			Loginpage l=new Loginpage();
			l.getTxtusername().get(0).sendKeys(user);
			l.getTxtpassword().sendKeys(pass);
			l.getBtnlogin().get(0);

	}}}
