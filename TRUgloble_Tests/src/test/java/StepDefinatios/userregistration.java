package StepDefinatios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userregistration {
	static WebDriver driver;
	
	@Given("user oprn the amazon")
	public void user_oprn_the_amazon() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

	@Then("user navigates to the Amazon registration page")
	public void user_navigates_to_the_amazon_registration_page() {
		WebElement acc = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		acc.click();
		WebElement newAcc = driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]"));
		newAcc.click();
	}

	@When("user provides registration details")
	public void user_provides_registration_details() {
		WebElement name = driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
		name.sendKeys("Sudarshan Chavan");
		WebElement phonumb = driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]"));
		phonumb.sendKeys("1234567890");
		WebElement email = driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		email.sendKeys("abc@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		pass.sendKeys("Pass@123");
	}

	@When("user submits the registration form")
	public void user_submits_the_registration_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be registered successfully")
	public void user_should_be_registered_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
