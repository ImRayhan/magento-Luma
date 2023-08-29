package Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import elements.WomanCategories_Elements;
import steps.Common_Steps;

public class WomanCategories_Actions {
	WebDriver driver;
	Common_Steps commonSteps;
	WomanCategories_Elements womanCategoriesElements;

	public WomanCategories_Actions(Common_Steps commonSteps) {
		this.driver = commonSteps.getDriver();
		womanCategoriesElements = new WomanCategories_Elements(driver);

	}

	public void hoverOnWoman() {
		Actions act = new Actions(driver);
		act.moveToElement(womanCategoriesElements.womanCategoryElement).perform();

	}

	public void hoverOnWomanTops() {
		Actions act1 = new Actions(driver);
		act1.moveToElement(womanCategoriesElements.womanCategoriesTopsElement).perform();

	}

}
