package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleItemRemovePage {

	WebDriver driver;

	public SingleItemRemovePage(WebDriver driver) {
		this.driver = driver;
	}

	// Element library
	@FindBy(how = How.NAME, using = ("todo[1]"))
	WebElement CHECKBOX_AUTOMATION;
	@FindBy(how = How.NAME, using = ("submit"))
	WebElement REMOVE_BUTTOM;
	
	//methodes to interact with element
	public void clickAutomationCheckBox() {
		CHECKBOX_AUTOMATION.click();
		
	}
	public void clickRemoveButtom() {
		REMOVE_BUTTOM.click();
		
	}
	public void verifycheckboxIsRemoved() {
		waitForElement(driver, 5, CHECKBOX_AUTOMATION);
		Assert.assertTrue("checkbox is removed!", CHECKBOX_AUTOMATION.isDisplayed());
		System.out.println("checkbox Test pass");
	}
	private void waitForElement(WebDriver driver, int time, WebElement LOCATOR) {
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOf(LOCATOR));

	}

		
	}
	


