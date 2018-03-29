package org.cucum.cts;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	 WebDriver driver;
	 WebElement firstName, lastName, phonenumber, username, email, aboutyourSelf, password, confirmPassword;
	 
	 @Given("^The user is in Google page$")
	 public void the_user_is_in_Google_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prasad\\eclipse-workspace\\ProjCucumber\\lib\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://demoqa.com/registration/");
			System.out.println("end of given");
	}
	    
	

	 @When("^The entered searchword$")
	 public void the_entered_searchword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 firstName = driver.findElement(By.id("name_3_firstname"));
			firstName.sendKeys("Pallavi");
			lastName = driver.findElement(By.id("name_3_lastname"));
			lastName.sendKeys("nunna");
			phonenumber = driver.findElement(By.id("phone_9"));
			phonenumber.sendKeys("8328658711");
			username = driver.findElement(By.id("username"));
			username.sendKeys("PallaviN");
			email = driver.findElement(By.id("email_1"));
			email.sendKeys("nunnapallavi12@gmail.com");
			aboutyourSelf = driver.findElement(By.id("description"));
			aboutyourSelf.sendKeys("cucumberframes");
			password = driver.findElement(By.id("password_2"));
			password.sendKeys("1234@np");
			confirmPassword = driver.findElement(By.id("confirm_password_password_2"));
			confirmPassword.sendKeys("1234@np");
			System.out.println("end of when");

		
	}

	 @Then("^The text displayed in the google Sucessfully$")
	 public void the_text_displayed_in_the_google_Sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Assert.assertEquals("Pallavi", firstName.getAttribute("value"));
			Assert.assertEquals("nunna", lastName.getAttribute("value"));
			Assert.assertEquals("8328658711", phonenumber.getAttribute("value"));
			Assert.assertEquals("PallaviN", username.getAttribute("value"));
			Assert.assertEquals("nunnapallavi12@gmail.com", email.getAttribute("value"));
			Assert.assertEquals("cucumberframes", aboutyourSelf.getAttribute("value"));
			Assert.assertEquals("1234@np", password.getAttribute("value"));
			Assert.assertEquals("1234@np", confirmPassword.getAttribute("value"));
			System.out.println("end of then");
	}	

@Given("^I want to write a step for demoqa$")
public void i_want_to_write_a_step_for_demoqa() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
}
}
