package org.cucum.cts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.junit.Assertions;
import junit.framework.Assert;

public class GoogleText {
	 WebDriver driver;
	 WebElement googleSearch,click;
	@Given("^I want to write a step with google actions \"([^\"]*)\"$")
	public void i_want_to_write_a_step_with_google_actions(String arg1) throws Throwable {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prasad\\eclipse-workspace\\ProjCucumber\\lib\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=S3e7WoDfF4awX5fehYAH");
	}

	@When("^I want step for google actions \"([^\"]*)\"$")
	public void i_want_step_for_google_actions(String arg1) throws Throwable {
		googleSearch=driver.findElement(By.id("lst-ib"));
		googleSearch.sendKeys(arg1);
		click=driver.findElement(By.xpath("//input[@value='Google Search']"));
		click.click();
		
	    
	}

	
	@Then("^I verify the search word \"([^\"]*)\"$")
	public void i_verify_the_search_word(String arg1) throws Throwable {
		Assert.assertEquals(arg1, driver.findElement(By.xpath("//div[@class='kno-ecr-pt kno-fb-ctx K7UOjc']")).getText());
		Assert.assertEquals(arg1, driver.findElement(By.xpath("//div[@class='kno-ecr-pt kno-fb-ctx']")).getText());
		Assert.assertEquals(arg1, driver.findElement(By.xpath("//span[text()='TestNg']")).getText());
	}


}