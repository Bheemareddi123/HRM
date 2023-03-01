package StepDefinition;

import com.PageObjects.LoginPage;
import com.PageObjects.PIMPage;
import com.SeleniumCommands.Base;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PIMSD extends Base {
	LoginPage loginPage = new LoginPage();
	PIMPage pimPage = new PIMPage();
	@Given("User has launched the OrangeHRM Application")
	public void user_has_launched_the_OrangeHRM_Application() {
		loginPage.initDriver();
	}

	@When("User log into application by entering {string} and {string}")
	public void user_log_into_application_by_entering_and(String username, String password) {
		this.delayScript(5);
		loginPage.login(username, password);
	}

	@When("User click on PIM menu and clicks on add employee button")
	public void user_click_on_PIM_menu_and_clicks_on_add_employee_button() {
		this.delayScript(5);
		pimPage.clickOnAddEmployeeButton();
	}

	@When("User enters {string},{string},{string} and {string}")
	public void user_enters_and(String firstName, String middleName, String lastName, String employeeID) {
		this.delayScript(2);
		pimPage.addEmployee(firstName, middleName, lastName, employeeID);
	}

	@Then("User verifies the Added Employee by entering {string}")
	public void user_verifies_the_Added_Employee_by_entering(String firstName) {
		pimPage.EmployeeVerification(firstName);
		this.closeBrowser();
	}

}
