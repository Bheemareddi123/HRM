package StepDefinition;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.PageObjects.AdminPage;
import com.PageObjects.LoginPage;
import com.SeleniumCommands.Base;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;

public class AdminSD extends Base {

        LoginPage loginPage=new LoginPage();
        AdminPage adminPage=new AdminPage();
@Given("User has launched OrangeHRM Application")
public void user_has_launched_orange_hrm_application() throws InterruptedException {
	loginPage.initDriver();
        }

@When("User log into application by entering common {string} and {string}")
public void user_log_into_application_by_entering_common_and(String username, String password) throws InterruptedException {
	this.delayScript(2);
        loginPage.login(username,password);
        }

@When("User click on Admin menu and clicks on add button")
public void user_click_on_admin_menu_and_clicks_on_add_button() throws InterruptedException {
	this.delayScript(2);
          adminPage.clickOnAddButton();
        }

@When("User Enters {string},{string},{string} and {string} and clicks on save")
public void user_enters_and_and_clicks_on_save(String EmployeeName, String Username, String Password, String ConfirmPassword) throws InterruptedException {
	this.delayScript(2);
        adminPage.AddUser(EmployeeName,Username,Password,ConfirmPassword);
        }

@Then("User verifies the Created Admin by entering {string}")
public void user_verifies_the_created_admin_by_entering(String UserName) throws InterruptedException {
	this.delayScript(2);
	adminPage.adminVerification(UserName);
	this.delayScript(2);

}

@Then("User closes the browser")
public void user_closes_the_browser() {
	this.closeBrowser();
}

@AfterStep
public void takeScreenshot(Scenario scenario) throws IOException {
	if (scenario.isFailed()) {
		byte[] scrennshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		Allure.addAttachment("ScreenShot", new ByteArrayInputStream(scrennshot));
	}
}



        }
