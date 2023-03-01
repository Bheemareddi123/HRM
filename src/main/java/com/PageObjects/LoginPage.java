package com.PageObjects;

import com.SeleniumCommands.SeleniumCommands;

public class LoginPage extends SeleniumCommands {
    private void username(String uname)
    {
        String xpath="//input[@placeholder='Username']";
        this.enterText(xpath,uname);
    }
    private void password(String pwd)
    {
        String xpath="//input[@placeholder='Password']";
        this.enterText(xpath,pwd);
    }
    private void loginButton()
    {
        String xpath="//button[@type='submit']";
        this.click(xpath);
    }

    public void login(String username,String password)
    {
        this.username(username);
        this.password(password);
        this.loginButton();
    }
}
