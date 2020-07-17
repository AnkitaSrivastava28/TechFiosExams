package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllItemRemovePage {
	WebDriver driver;

	public AllItemRemovePage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.NAME, using = ("allbox"))
	WebElement TOGGLE_ALL_CHECKBOX;
	@FindBy(how = How.NAME, using = ("submit"))
	WebElement REMOVE_BUTTOM;

	public void clicktoggleAllCheckBox() {
		TOGGLE_ALL_CHECKBOX.click();

	}
	public void clickRemoveButtom() {
		REMOVE_BUTTOM.click();
		
	}
	public void verifyAllItemListRemoved() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		Assert.assertTrue("All Checked items are removed!", checkboxes.isEmpty());
		System.out.println("All Checked items are removed!");
	
	}
		
}

