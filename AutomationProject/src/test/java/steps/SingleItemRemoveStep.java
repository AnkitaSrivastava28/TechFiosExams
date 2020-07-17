package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SingleItemRemovePage;
import util.BrowserFactory;

public class SingleItemRemoveStep {
	WebDriver driver =  BrowserFactory.startBrowser();


@When("^User click on automation check box$")
public void user_click_on_automation_check_box() throws Throwable {
	SingleItemRemovePage remove = PageFactory.initElements(driver, SingleItemRemovePage.class);
	remove.clickAutomationCheckBox();
}

@When("^user click on remove button$")
public void user_click_on_remove_button() throws Throwable {
	SingleItemRemovePage removetab = PageFactory.initElements(driver, SingleItemRemovePage.class);
	removetab.clickRemoveButtom();
	}
@Then("^check box should be removed$")
public void check_box_should_be_removed() throws Throwable {
	
	SingleItemRemovePage removetab = PageFactory.initElements(driver, SingleItemRemovePage.class);
	removetab.verifycheckboxIsRemoved();
}
}


