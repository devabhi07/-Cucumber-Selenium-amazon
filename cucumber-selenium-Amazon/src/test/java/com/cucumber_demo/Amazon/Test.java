package com.cucumber_demo.Amazon;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	WebDriver dr;
	@Given("Open the Browser with url")
	public void open_the_browser_with_url() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 dr = new ChromeDriver();
		 dr.get("https://www.amazon.in/");
		 Thread.sleep(1000);
	}
	@Then("click on the Sign button")
	public void click_on_the_sign_button() throws InterruptedException {
		 dr.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		 Thread.sleep(1000);
		dr.findElement(By.id("ap_email")).sendKeys("abhisinghbhu55@gmail.com");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("ap_password")).sendKeys("@Abhinav20");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("MacBook air");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(1000);
		dr.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
        Set<String> ids = dr.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentId = it.next();
        String childId = it.next();
        dr.switchTo().window(childId);
	}
	@When("click on the Add to Cart button")
	public void click_on_the_add_to_cart_button() throws InterruptedException {
		dr.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(1000);
		 dr.get("https://www.amazon.in/");
		 dr.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		 dr.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		 dr.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		 Set<String> ids = dr.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        String subchildId = it.next();
	        dr.switchTo().window(subchildId);
	        dr.findElement(By.id("add-to-cart-button")).click();
			Thread.sleep(1000);
			 dr.get("https://www.amazon.in/");
	}
	@Then("add final Product")
	public void last_Product() throws InterruptedException {
		 dr.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy Buds Live Bluetooth Truly Wireless in Ear Earbuds with Mic, Upto 21 Hours Playtime, Mystic Black");
		 dr.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		 dr.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		 Set<String> ids = dr.getWindowHandles();
	        Iterator<String> it = ids.iterator();
	        String parentId = it.next();
	        String childId = it.next();
	        String subchildId = it.next();
	        String subchildId2 = it.next();
	        dr.switchTo().window(subchildId2);
	        dr.findElement(By.id("add-to-cart-button")).click();
			Thread.sleep(1000);
			 dr.get("https://www.amazon.in/");
			 Thread.sleep(1000);
			 dr.findElement(By.id("nav-cart")).click();
	}
	
	
	





}