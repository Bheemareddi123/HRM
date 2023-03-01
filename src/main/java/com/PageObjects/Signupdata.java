package com.PageObjects;

import org.openqa.selenium.By;

import com.PageObjects.SignUpPage;
import com.SeleniumCommands.SeleniumCommands;

public class Signupdata extends SignUpPage {
	public static void main(String[] args) throws InterruptedException {
		SeleniumCommands sel = new SeleniumCommands();
		// sel.initDriver("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		SignUpPage sign = new SignUpPage();
		String user = driver.findElement(By.xpath("//p[text()='Username : Admin']")).getText();
		System.out.println(user);
		String username[] = user.split(":");
		System.out.print(username[0] + " " + username[1]);
		String usernam = username[1].trim();
		System.out.println(usernam);

		// p[text()='Password : admin123']
		String pwd = driver.findElement(By.xpath("//p[text()='Password : admin123']")).getText();
		System.out.println(pwd);
		String pass[] = pwd.split(":");
		System.out.println(pass);
		String password = pass[1].trim();
		System.out.println(password);
		sign.login(usernam, password);
		Thread.sleep(5000);
		sel.click("//span[text()='PIM']");
		Thread.sleep(5000);
		sel.click("//a[text()='Add Employee']");
		Thread.sleep(2000);
		sel.enterText("//input[@placeholder='First Name']", "Gundya");
		sel.enterText("//input[@placeholder='Middle Name']", "gondya");
		sel.enterText("//input[@placeholder='Last Name']", "Ghantya");
		sel.enterText(
				"//label[text()='Employee Id']/../following-sibling::div/input[@class='oxd-input oxd-input--active']",
				"1435");
		Thread.sleep(2000);
		sel.click("//input[@//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
		Thread.sleep(2000);
		// sel.scroll();
		sel.enterText("//input[@class='oxd-input oxd-input--active oxd-input--error']", "Gundu");
		sel.click("//label[text()='Enabled']");
		sel.enterText("//label[text()='Password']/../following-sibling::div/input[@type='password']", "Gundu@123");
		sel.enterText("//label[text()='Confirm Password']/../following-sibling::div/input[@type='password']",
				"Gundu@123");
		sel.click("//button[text()=' Save ']");

		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://opensource-demo.orangehrmlive.com/");
		 * driver.manage().window().maximize(); Thread.sleep(5000);
		 * driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(
		 * "Admin");
		 * driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(
		 * "admin123");
		 * driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		 */
	}
}
