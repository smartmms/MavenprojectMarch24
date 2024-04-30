package org.testt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.handler.codec.http.cookie.ClientCookieDecoder;

public class adactin {
	
     public static void main(String[] args) throws InterruptedException {
    	WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
    	 
         Thread.sleep(2000);    
    	 driver.get("http://adactinhotelapp.com/");
   
    	WebElement user = driver.findElement(By.xpath("//input[@name=\"username\"]"));
    	user.sendKeys("meenakshisundaram");
    	WebElement user1 = driver.findElement(By.xpath("//input[@name=\"password\"]"));
    	user1.sendKeys("Mmsvp28@@");
    	WebElement user11 = driver.findElement(By.id("login"));
    	user11.click();
    	WebElement location = driver.findElement(By.id("location"));
    	Select s=new Select(location);
    	s.selectByValue("Melbourne");
    	WebElement hotelss = driver.findElement(By.id("hotels"));
    	Select h=new Select(hotelss);
    	h.selectByValue("Hotel Sunshine");
    	WebElement roomtype = driver.findElement(By.id("room_type"));
    	Select r=new Select(roomtype);
    	r.selectByValue("Double");
    	WebElement roomnos = driver.findElement(By.id("room_nos"));
    	Select rm=new Select(roomnos);
    	rm.selectByValue("1");
    	WebElement datepickin = driver.findElement(By.id("datepick_in"));
    	datepickin.clear();
    	datepickin.sendKeys("1/04/2024");
    	WebElement datepickout = driver.findElement(By.id("datepick_out"));
    	datepickout.clear();
    	datepickout.sendKeys("2/04/2024");
        WebElement adultroom = driver.findElement(By.id("adult_room"));
    	Select c=new Select(adultroom);
    	c.selectByValue("1");
    	WebElement childroom = driver.findElement(By.id("child_room"));
    	Select m=new Select(childroom);
    	m.selectByValue("1");
    	WebElement submit = driver.findElement(By.id("Submit"));
    	Thread.sleep(2000);
    	submit.click();
    	WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
    	radiobutton.click();
    	WebElement continu = driver.findElement(By.id("continue"));
    	continu.click();
    	WebElement user43 = driver.findElement(By.id("first_name"));
    	user43.sendKeys("sundar");
    	WebElement user67 = driver.findElement(By.id("last_name"));
    	user67.sendKeys("am");
    	WebElement useer = driver.findElement(By.id("address"));
    	useer.sendKeys("no25,kumarannagar,chennai,pincode873337");
    	WebElement usertr = driver.findElement(By.id("cc_num"));
    	usertr.sendKeys("1234567894544646778");
    	WebElement userttr = driver.findElement(By.id("cc_type"));
    	userttr.sendKeys("MAST");
    	WebElement userttr1 = driver.findElement(By.id("cc_exp_month"));
    	Select m1=new Select(userttr1);
    	m1.selectByValue("8");
    	WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
    	Select n=new Select(cc_exp_year);
    	n.selectByValue("2022");
    	WebElement userttr11 = driver.findElement(By.id("cc_cvv"));
    	userttr11.sendKeys("234");
    	WebElement booknow = driver.findElement(By.id("book_now"));
    	booknow.click();
    	WebElement itenary = driver.findElement(By.id("my_itinerary"));
    	itenary.click();
    	WebElement logout = driver.findElement(By.id("logout"));
    	logout.click();
    	System.out.println("hotel booking done"); 
    	
    	
    }}

	
     
     
