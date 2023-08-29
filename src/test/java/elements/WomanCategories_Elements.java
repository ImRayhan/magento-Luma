package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomanCategories_Elements {
	WebDriver driver;

	public WomanCategories_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css  = "a[id='ui-id-4'] span:nth-child(2)")
	public WebElement womanCategoryElement;

	@FindBy(id = "ui-id-9")
	public WebElement womanCategoriesTopsElement;

	@FindBy(xpath = "//a[@id='ui-id-10']//span[contains(text(),'Bottoms')]")
	public WebElement womanCategoriesButtomsElement;
	
    

}
