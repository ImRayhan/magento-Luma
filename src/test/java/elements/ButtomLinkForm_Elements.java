package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtomLinkForm_Elements {

	WebDriver driver;

	public ButtomLinkForm_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='mce-EMAIL']")
	public WebElement emailElement;

	@FindBy(xpath = "//input[@id='mce-FNAME']")
	public WebElement firstNameElement;

	@FindBy(xpath = "//input[@id='mce-LNAME']")
	public WebElement lastNameElement;

	@FindBy(xpath = "//input[@id='mce-COMPANY']")
	public WebElement companyElement;

	@FindBy(xpath = "//input[@id='mce-POSITION']")
	public WebElement positionElement;

	@FindBy(xpath = "//input[@id='mc-embedded-subscribe']")
	public WebElement subscribeElement;

}
