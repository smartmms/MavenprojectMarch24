package org.testt;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public static void Chromelaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void EdgeLaunch() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	public static void browserrlaunch(String browserrname) {

		switch(browserrname) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;}
	}

	public static void UrlLaunch(String url) {
		driver.get(url);}


	public static void impwait(int Sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Sec));
		driver.manage().window().maximize();
	}

	public static void sendkeys(WebElement e,String data) {
		e.sendKeys(data);
	}

	public static String   getcurrenturl() {
		String url = driver.getCurrentUrl();
		return url;}

	public static void click(WebElement e) {
		e.click();}
	
	public static  String  getAtt(WebElement e) {
		String x=e.getAttribute("value");
		return x ;
		
	}

	public static void quit() {
		driver.quit();}

	public static void threadsleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();}}

	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();}

	public static void draganddrop(WebElement from,WebElement to) {
		Actions a=new Actions(driver);
		a.dragAndDrop(from, to).perform();}
	
	public static void SimpleAlert() {
		Alert l=driver.switchTo().alert();
		l.accept();}
		
	public static void SelectByindex(WebElement e, int index){	
		Select S=new Select(e);
		S.selectByIndex(index);}
	
	public static void SwitchIntoframe(int index) {
		driver.switchTo().frame(index);}
	
	public static void Switchoutsideframe() {
		driver.switchTo().defaultContent();}
		
	public static void screenshot(String filename) throws IOException	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from=ts.getScreenshotAs(OutputType.FILE);
		File  to= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot\\"+filename+".png");
		FileUtils.copyFile(from, to);}
		
	public void Windowhandle(int no) {
		Set <String> allid =driver.getWindowHandles();
		ArrayList <String> li=new ArrayList<>();
		li.addAll(allid);
		driver.switchTo().window(li.get(no));
	}
		
	}
		
	












