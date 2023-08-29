package steps;

import org.openqa.selenium.WebDriver;

import Actions.WomanCategories_Actions;
import Actions.commonActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WomanCategories_Steps {
	WebDriver driver;
	Common_Steps commonSteps;
	commonActions commonActions;
	WomanCategories_Actions womanCategoriesActions;

	public WomanCategories_Steps(commonActions commonActions, Common_Steps commonSteps,
			WomanCategories_Actions womanCategoriesActions) {
		this.driver = commonSteps.getDriver();
		this.commonActions = commonActions;
		this.womanCategoriesActions = womanCategoriesActions;

	}

	@Given("I am on homepage")
	public void i_am_on_homepage() {
		commonActions.gotoUrl("https://magento.softwaretestingboard.com/");

	}

	@When("I hover my mouse on woman")
	public void i_hover_my_mouse_on_woman() throws InterruptedException {
		womanCategoriesActions.hoverOnWoman();
		Thread.sleep(2000);
		womanCategoriesActions.hoverOnWomanTops();

	}

	@Then("I validate the all tops and buttoms options are prasent")
	public void i_validate_the_all_tops_and_buttoms_options_are_prasent() {
		System.out.println("nothing implement here");
	}

}
