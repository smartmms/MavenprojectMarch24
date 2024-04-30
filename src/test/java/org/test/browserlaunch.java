package org.test;

public class browserlaunch extends Baseclass {
	public static void main(String[] args) {
	
	Chromelaunch();
	Url("https://www.facebook.com");
	//UrlLaunch("https://www.flipkart.com");
	impwait(10);
	
	LOginpage l =new LOginpage();
	l.start();
	sendkeys(l.getTxtusername(),"Dinesh");
	sendkeys(l.getTxtpassword(),"78695");
	click(l.getBtnlogin());
	
	driver.navigate().refresh();
	
	sendkeys(l.getTxtusername(),"Greentech");
	sendkeys(l.getTxtpassword(),"8797589");
	click(l.getBtnlogin());
	
	
	
}}
