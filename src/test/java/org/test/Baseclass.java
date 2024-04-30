package org.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
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

	public static void Url(String url) {
		driver.get(url);}
	
     public static void navigateTo(String url) {
    	 driver.navigate().to(url);
     }
     
     public static void back() {
    	 driver.navigate().back();
     }
     public static void forward() {
    	 driver.navigate().forward();
     }
     public static void refresh() {
    	 driver.navigate().refresh();
     }
     public static boolean isDisplayed(WebElement e) {
    	 Boolean displayed=e.isDisplayed();
    	 return displayed;
    	 }
     public static boolean isEnabled(WebElement e) {
    	 Boolean Enabled=e.isEnabled();
    	 return Enabled;
    	 }
     public static boolean isSelected(WebElement e) {
    	 Boolean Selected=e.isSelected();
    	 return Selected;
    	 }
     
     public static void clear (WebElement e) {
    	 e.clear();
     }
  
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
	
	public static void clickandHold(WebElement e) {
		Actions a=new Actions(driver);
		a.clickAndHold(e).perform();}
	
	public static void doubleclick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();}
	
	public static void contextclick(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick(e).perform();}
	
	public static void release(WebElement e) {
		Actions a=new Actions(driver);
		a.release(e).perform();}
	
	
	public static void SimpleAlert() {
		Alert l=driver.switchTo().alert();
		l.accept();}
	public static void ConfirmAlert(int num) {
		Alert l=driver.switchTo().alert();
		if(num==0) {
			l.accept();}
		else {
		l.dismiss();
		}}
	public static void promptAlert(int num,String e) {
		Alert l=driver.switchTo().alert();
		if(num==0) {
			l.accept();}
		else if (num==1){
		l.dismiss();
		}else {
			l.sendKeys(e);
		}}
	
	public static void SelectByindex(WebElement e, int index){	
		Select S=new Select(e);
		S.selectByIndex(index);}
	
	public static void SelectByVisibleText(WebElement e, String text){	
		Select S=new Select(e);
		S.selectByVisibleText(text);}
	
	public static void SelectByvalue(WebElement e, String value){	
		Select S=new Select(e);
		S.selectByValue(value);}
	
	public static void deSelectAll(WebElement e, int index){	
		Select S=new Select(e);
		S.deselectAll();}
	
	public static void deSelectbyIndex(WebElement e, int index){	
		Select S=new Select(e);
		S.selectByIndex(index);}
	
	public static void deSelectbyvalue(WebElement e, int index){	
		Select S=new Select(e);
		S.selectByIndex(index);}
	
	public static void deSelectbyVisibleText(WebElement e, String text){	
		Select S=new Select(e);
		S.deselectByVisibleText(text);}
	
	public static boolean isMultiple(WebElement e){	
		Select S=new Select(e);
		boolean mul=S.isMultiple();
		return mul;
	}
	public static void allOption(WebElement e) {	
		Select S=new Select(e);
	List<WebElement> allOptions = S.getAllSelectedOptions();
		for(int i=0; i<allOptions.size();i++) {
			String oplist=allOptions.get(i).getText();
		}
	}
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
		
	public static void jsSendkey(String Data,WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+Data+"')",e);
	}
	public static void jsClick(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}
	public static  String JsgetAttribute(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object obj=js.executeScript("return arguments[0].getAttribute('value')", e);
		String s=obj.toString();
				return s;
	}	
	public static void scrollup(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoview(false)", e);
	}
	public static void scrolldown(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoview(true)", e);
	}
	public static void frameid(String id) {
		driver.switchTo().frame(id);
	}
	public static void framename(String name) {
		driver.switchTo().frame(name);
	}
	public static void frameweb(WebElement e) {
		driver.switchTo().frame(e);
	}
	public static void frameindex(int index) {
		driver.switchTo().frame(index);
	}
	public static void parentframe() {
		driver.switchTo().parentFrame();
	}
	public static void outofAllFrame() {
		driver.switchTo().defaultContent();
	}
}
	
		
	












