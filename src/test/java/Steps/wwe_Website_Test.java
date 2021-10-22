package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class wwe_Website_Test {
	
	WebDriver driver;
	
	@Given("^User opens Chrome browser$")
	public void user_opens_Chrome_browser() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sitesh\\Selenium\\chromedriver");
		driver = new ChromeDriver();
		driver.get("www.google.com");
	}

	@Given("^User visits https://www\\.wwe\\.com/$")
	public void user_visits_https_www_wwe_com() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User clicks on Tickets$")
	public void user_clicks_on_Tickets() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User clicks on third list item for Bobby Lashley and clicks on More Details$")
	public void user_clicks_on_third_list_item_for_Bobby_Lashley_and_clicks_on_More_Details() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Verify text \"([^\"]*)\" is present$")
	public void verify_text_is_present(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
