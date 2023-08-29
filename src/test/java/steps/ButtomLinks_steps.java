package steps;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Actions.ButtomLinkForm_Actions;
import Actions.commonActions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ButtomLinks_steps {
	WebDriver driver;
	commonActions commonAction;
	Common_Steps commonSteps;
	ButtomLinkForm_Actions buttonLinkActions;

	public ButtomLinks_steps(Common_Steps commonSteps, commonActions commonAction,
			ButtomLinkForm_Actions buttonLinkActions) {
		this.commonAction = commonAction;
		this.buttonLinkActions = buttonLinkActions;
		this.driver = commonSteps.getDriver();

	}

	@When("I click {string} in step")
	public void i_click_in_step(String string) {
		driver.findElement(By.linkText(string)).click();

	}

	@Then("I verify the {string} and {string} in step")
	public void i_verify_the_and_in_step(String string, String string2) {

		if (!commonAction.getCurrentUrl().equals(string)) {
			fail("url dosnt match");

		} else if (!commonAction.getCurrentTitle().equals(string2)) {
			fail("title dosnt match");

		}

	}

	@When("I click {string}")
	public void i_click(String string) {
		driver.findElement(By.linkText(string)).click();

	}

	@Then("I enter {string}  {string} {string}  {string}  {string}")
	public void i_enter(String string, String string2, String string3, String string4, String string5) {
		buttonLinkActions.enterEmail(string);
		buttonLinkActions.enterFirstName(string2);
		buttonLinkActions.enterLastName(string3);
		buttonLinkActions.companyName(string4);
		buttonLinkActions.position(string5);

	}

	@Then("I verfy the {string} and {string}")
	public void i_verfy_the_and(String string, String string2) {
		String expectedUrl = commonAction.getCurrentUrl();
		String expectTitle = commonAction.getCurrentTitle();
		Assert.assertEquals(expectedUrl, string);
		Assert.assertEquals(expectTitle, string2);

	}

	@Then("I hit subscrive")
	public void i_hit_subscrive() {
		buttonLinkActions.clickSubscribe();

	}

}
