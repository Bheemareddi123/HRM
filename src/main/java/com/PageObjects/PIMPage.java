package com.PageObjects;

import com.SeleniumCommands.Base;

public class PIMPage extends Base {
	private void pimPanel() {
		String xpath = "//span[text()='PIM']";
		this.click(xpath);
	}

	private void addEmployeeButton() {
		String xpath = "//a[text()='Add Employee']";
		this.click(xpath);
	}

	private void addEmployeelistButton() {
		String xpath = "//a[text()='Employee List']";
		this.click(xpath);
	}

	private void firstName(String Fname) {

		String xpath = "//input[@placeholder='First Name']";
		this.enterText(xpath, Fname);
	}

	private void lastName(String Lname) {

		String xpath = "//input[@placeholder='Last Name']";
		this.enterText(xpath, Lname);
	}

	private void middleName(String Mname) {

		String xpath = "//input[@placeholder='Middle Name']";
		this.enterText(xpath, Mname);
	}

	private void empID(String Eid) {

		String xpath = "//label[text()='Employee Id']/../following-sibling::div/input[@class='oxd-input oxd-input--active']";
		this.enterText(xpath, Eid);
	}

	private void save() {
		String xpath = "//button[text()=' Save ']";
		this.click(xpath);
	}

	private void empList(String fname) {
		String xpath = "//input[@placeholder='Type for hints...']";
		this.enterText(xpath, fname);
	}

	private void search() {
		String xpath = "//button[text()=' Search ']";
		this.click(xpath);
	}

	private void records() {
		String xpath = "//div[@role='table']";
		String txt = this.getText(xpath);
		System.out.println(txt);
	}

	private void getEID() {

	}
	public void EmployeeVerification(String firstName) {
		this.delayScript(2);
		this.empList(firstName);
		this.search();
		this.scroll();
		this.delayScript(2);
		this.records();

	}

	public void addEmployee(String firstName, String middleName, String lastName, String employeeID) {
		this.firstName(firstName);
		this.middleName(middleName);
		this.lastName(lastName);
		this.empID(employeeID);
		this.save();
		// this.getEID();
		this.addEmployeelistButton();
	}
	public void clickOnAddEmployeeButton() {
		this.pimPanel();
		this.delayScript(2);
		this.addEmployeeButton();
	}
}
