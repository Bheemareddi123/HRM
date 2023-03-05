package com.PageObjects;

import com.SeleniumCommands.Base;

public class AdminPage extends Base {

	// Page Objects
    private void adminPanel()
    {
        String xpath="//span[text()='Admin']";
        this.click(xpath);
    }
    private void addButton()
    {
        String xpath="//button[text()=' Add ']";
        this.click(xpath);
    }

	private void UserRole()
    {
        String xpath="//label[text()='User Role']/../following-sibling::div//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']";
        this.click(xpath);
        String xpath1="//div[@class='oxd-select-option']//span[text()='Admin']";
        this.click(xpath1);
    }

	private void EmpName(String Ename) 
    {
        String xpath="//input[@placeholder='Type for hints...']";
        this.enterText(xpath,Ename);
		this.delayScript(2);
		String xpath1 = "//span[text()='" + Ename + "']";
		this.click(xpath1);
    }
    private void userName(String uname)
    {
		String xpath = "//label[text()='Username']/../following-sibling::div/input[@class='oxd-input oxd-input--active']";
        this.enterText(xpath,uname);
    }
    private void pwd(String pwd)
    {
		String xpath = "//label[text()='Password']/../following-sibling::div/input[@class='oxd-input oxd-input--active']";
        this.enterText(xpath,pwd);
    }
    private void confirmPwd(String cpwd)
    {
		String xpath = "//label[text()='Confirm Password']/../following-sibling::div/input[@class='oxd-input oxd-input--active']";
        this.enterText(xpath,cpwd);
    }

	private void status() {
        String xpath="//label[text()='Status']/../following-sibling::div";
        this.click(xpath);
		this.delayScript(2);
        String xpath1="//span[text()='Enabled']";
        this.click(xpath1);
    }
    private void save()
    {
        String xpath="//button[text()=' Save ']";
        this.click(xpath);
    }

	private void records() {
		String xpath = "//div[@class='oxd-table']";
		String txt = this.getText(xpath);
		System.out.println(txt);
	}

	private void searchUser(String user) {
		String xpath = "//label[text()='Username']/../following-sibling::div/input[@class='oxd-input oxd-input--active']";
		this.enterText(xpath, user);
	}

	private void search() {
		String xpath = "//button[text()=' Search ']";
		this.click(xpath);
	}

	// Methods
	public void clickOnAddButton() 
    {
        this.adminPanel();
		this.delayScript(2);
        this.addButton();
    }

	public void AddUser(String EmployeeName, String Username, String Password, String ConfirmPassword) {
        this.UserRole();

        this.EmpName(EmployeeName);
        this.status();
		this.delayScript(2);
        this.userName(Username);
		this.delayScript(2);
        this.pwd(Password);
		this.delayScript(2);
        this.confirmPwd(ConfirmPassword);
		this.delayScript(2);
        this.save();
    }

	public void adminVerification(String UserName) {
		this.delayScript(5);
		this.searchUser(UserName);
		this.delayScript(2);
		this.search();
		this.scroll();
		this.delayScript(2);
		this.records();

	}

}
