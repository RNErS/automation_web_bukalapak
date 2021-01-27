package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step {
	
	WebDriver driver;
	
	@Given("^Navigate to Bukalapak$")
	public void navigate_to_bukalapak() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Other\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bukalapak.com/");
	}
	
	@When("^I click button register$")
	public void i_click_button_register() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"vm__white-header-dweb\"]/section/header/div[3]/div/div/div[2]/div/a[1]")).click();
	}

	@Then("^Page will direct to page register$")
	public void page_will_direct_to_page_register() throws Throwable {
	    driver.getCurrentUrl().equals("https://accounts.bukalapak.com/register/simple?from=nav_header&comeback=https://www.bukalapak.com/");
	}
	
	String email = "test2301@test.com";

	@Then("^I input phone number or email")
	public void i_input_phone_number_or_email() throws Throwable {
	    driver.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div[1]/div/input")).sendKeys(email);
	}

	@Then("^I click button Register step one$")
	public void i_click_button_Register_step_one() throws Throwable {
	    driver.findElement(By.xpath("/html/body/main/div/div[2]/div[2]/button")).click();																																																																																																																						
	}

	@Then("^Page will direct to registration form$")
	public void page_will_direct_to_registration_form() throws Throwable {
		String registerUrl = "https://www.bukalapak.com/register?username=".concat(email);
	    driver.getCurrentUrl().equals(registerUrl);
	}

	@Then("^I input fullname in fullname text box$")
	public void i_input_fullname_in_fullname_text_box() throws Throwable {
	    driver.findElement(By.id("user_name")).sendKeys("Tubang Test");
	}

	@Then("^I choose gender$")
	public void i_choose_gender() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[3]/label[1]/span")).click();
	    driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	}
	
	@Then("^Suggestion username will be display on username text box$")
	public void suggestion_username_will_be_display_on_username_text_box() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[4]/div/div[3]")).isDisplayed();
	}
	
	String password = "Tubang12345";
	@Then("^I input password in password text box$")
	public void i_input_password_in_password_text_box() throws Throwable {
	    driver.findElement(By.id("user_password")).sendKeys(password);
	}

	@Then("^Warning message confirmation password will be display$")
	public void warning_message_confirmation_password_will_be_display() throws Throwable {
	    driver.findElement(By.className("c-fld__error")).isDisplayed();
	}

	@Then("^I input confirmation password in confirmation password box$")
	public void i_input_confirmation_password_in_confirmation_password_box() throws Throwable {
		driver.findElement(By.id("user_password_confirmation")).sendKeys(password);
		driver.findElement(By.className("c-fld__error")).isDisplayed();
	}

	@Then("^I click checkbox agreement$")
	public void i_click_checkbox_agreement() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[8]/label/span")).click();
	}
	
	@Then("^I click button Register step two$")
	public void i_click_button_Register_step_two() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"new_user\"]/button")).click();
	}

	@Then("^Page will direct to dashboard user$")
	public void page_will_direct_to_dashboard_user() throws Throwable {
	    driver.getCurrentUrl().equals("https://www.bukalapak.com/?from_page=registration");
	}
}
