package StepDefinatios;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addtocartstepdefi {

	static WebDriver driver;


	@Given("user open the amazon")
	public void user_open_the_amazon() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@When("user searches for iPhone")
	public void user_searches_for_i_phone() {
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchBox.sendKeys("Iphone");
		WebElement buttonSearch = driver.findElement(By.xpath("//*[@id=\"nav-search-bar-form\"]/div[3]"));
		buttonSearch.click();
	}

	@When("user selects from the list")
	public void user_selects_from_the_list() {
		WebElement firstResult = driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]"));
		firstResult.click();
	}

	@And("goes to the product details page")
	public void goes_to_the_product_details_page() {
		Set<String> s = driver.getWindowHandles();
		ArrayList<String> ar = new ArrayList<String>(s);
		driver.switchTo().window((String)ar.get(1));

	}

	@And("selects and stores the price in a variable")
	public void selects_and_stores_the_price_in_a_variable() {
		WebElement titleElememnt = driver.findElement(By.xpath("(//span[@id='productTitle'])[1]"));
		String name = titleElememnt.getText();
		System.out.println("Name : "+ name);
		WebElement priceElement = driver.findElement(By.xpath("(//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay'])[1]"));
		String price = priceElement.getText();
		System.out.println("Price: " + price);

	}

	@Then("adds the iPhone to the cart")
	public void adds_the_i_phone_to_the_cart() {
		WebElement addtocart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[1]"));
		addtocart.click();
	}

}
