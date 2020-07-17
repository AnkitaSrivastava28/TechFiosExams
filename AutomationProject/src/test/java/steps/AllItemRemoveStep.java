package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AllItemRemovePage;
import util.BrowserFactory;

public class AllItemRemoveStep extends TestBase {
	WebDriver driver;

	public AllItemRemoveStep() {
	}
	
	public AllItemRemoveStep(WebDriver driver) {
		this.driver = driver;
	}
	
	
	@When("^user click on remove buttom$")
	public void user_click_on_remove_buttom() throws Throwable {
		try {
		AllItemRemovePage removeallitem = PageFactory.initElements(driver, AllItemRemovePage.class);
		removeallitem.clickRemoveButtom();}
		catch(Exception e) {
			e.printStackTrace();
			//screenShot(driver,"C:\\screenShotFile\\RemoveAILFalure.jpg");
			
		}
	    
	}

	@Then("^All list item should be removed$")
	public void all_list_item_should_be_removed() throws Throwable {
		
		AllItemRemovePage removeallitem = PageFactory.initElements(driver, AllItemRemovePage.class);
		removeallitem.verifyAllItemListRemoved();
	}

	
	   
	

	



}
