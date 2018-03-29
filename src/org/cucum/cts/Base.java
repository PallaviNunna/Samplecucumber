package org.cucum.cts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public Boolean edit (WebElement element) {
		 Boolean d= element.isEnabled();
		return d;
				}
	public Boolean verify (WebElement element) {
	 Boolean k=element.isDisplayed();
	return k;}
			   public void caltest(WebElement element ,String nam) {
			if (edit(element)&& verify(element)&&nam!=null){
			 element.sendKeys(nam);}
				}public void submclk(WebElement element ) {
			element.click();
				}public void closeAppIn(WebDriver C) {
			if(C!=null)
			 C.close();
		}public WebDriver link() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prasad\\eclipse-workspace\\SeleniumTest\\lib\\selenium3jars\\chromedriver.exe");
	WebDriver C= new ChromeDriver();
	C.get("http://demoqa.com/registration/");
	return C;
		}
	public void attrivalue (WebElement element) {
		 String name=element.getAttribute("value");
				System.out.println(name);
			 }
							   
	}

