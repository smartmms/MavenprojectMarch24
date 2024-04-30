package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOginpage extends Baseclass {

	public void start() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement Txtusername;

	@FindBy(id="pass")
	private WebElement Txtpassword;

	@FindBy(name="login")
	private WebElement btnlogin;
	
	//GETTER

	public WebElement getTxtusername() {
		return Txtusername;}

	public WebElement getTxtpassword() {
		return Txtpassword;}

	public WebElement getBtnlogin() {
		return btnlogin;}



}



