package Actions;

import org.openqa.selenium.WebDriver;

import elements.ButtomLinkForm_Elements;
import steps.Common_Steps;

public class ButtomLinkForm_Actions {

	WebDriver driver;
	ButtomLinkForm_Elements buttonElemenet;
	Common_Steps commonSteps;

	public ButtomLinkForm_Actions(Common_Steps commonSteps) {
		this.driver = commonSteps.getDriver();

		buttonElemenet = new ButtomLinkForm_Elements(driver);

	}

	public void enterEmail(String email) {
		buttonElemenet.emailElement.sendKeys(email);

	}

	public void enterFirstName(String firstName) {
		buttonElemenet.firstNameElement.sendKeys(firstName);

	}

	public void enterLastName(String lastName) {
		buttonElemenet.lastNameElement.sendKeys(lastName);

	}

	public void companyName(String companyName) {
		buttonElemenet.companyElement.sendKeys(companyName);

	}

	public void position(String position) {
		buttonElemenet.positionElement.sendKeys(position);

	}

	public void clickSubscribe() {
		buttonElemenet.subscribeElement.click();

	}

}
