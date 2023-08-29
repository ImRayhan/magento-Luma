package Actions;

import org.openqa.selenium.WebDriver;

import steps.Common_Steps;

public class commonActions {
	WebDriver driver;
	Common_Steps commonSteps;

	public commonActions(Common_Steps commonSteps) {
		this.commonSteps = commonSteps;
		this.driver = commonSteps.getDriver();

	}

	public void gotoUrl(String Url) {

		driver.get(Url);
	}

	public String getCurrentTitle() {
		return driver.getTitle();

	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

}
