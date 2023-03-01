package com.PageObjects;

import com.SeleniumCommands.SeleniumCommands;

public class SignUpPage extends SeleniumCommands {
	private void user(String uname) {
		String xpath = "//input[@placeholder='Username']";
		this.enterText(xpath, uname);
	}

	public void passwd(String pwd) {
		String xpath = "//input[@placeholder='Password']";
		this.enterText(xpath, pwd);
	}

	// button[text()=' Login ']
	public void log() {
		String xpath = "//button[text()=' Login ']";
		this.click(xpath);
	}

	public void login(String uname, String pwd)
	{ 
		this.user(uname);
		this.passwd(pwd);
		this.log();
	}
}
