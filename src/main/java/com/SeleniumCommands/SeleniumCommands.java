package com.SeleniumCommands;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumCommands {

	public static WebDriver driver;

	public void initDriver() {

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	      	driver.manage().window().maximize();
	 } 
	 public WebElement getWebElementUsingXpath(String xpath) {
	        WebElement element = SeleniumCommands.driver.findElement(By.xpath(xpath));
	        return element;
	    }
	 public void click(String xpath) {
	        WebElement element = this.getWebElementUsingXpath(xpath);
	        if (element.isEnabled()) {
	            element.click();
	        }
	 }

		public void enterText(String xpath, String data) {
			WebElement element = this.getWebElementUsingXpath(xpath);
			// element.clear();
			// if (element.isEnabled()) {
				this.click(xpath);
				element.sendKeys(data);
				// }
		}
	        public void hoverOnElement(String xpath2) {
	            WebElement element = this.getWebElementUsingXpath(xpath2);
	            Actions actions = new Actions(SeleniumCommands.driver);
	            Action act = actions.moveToElement(element).build();
	            act.perform();
	        }

	        public void Scroll(String Filter) {
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            WebElement down = driver.findElement(By.xpath("//div[text()='"+Filter+"']"));
	            js.executeScript("arguments[0].scrollIntoView(true)", down);
	        }       
	        public void ScrollUp(String Filter) {
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            WebElement up = driver.findElement(By.xpath("//div[text()='"+Filter+"']"));
	            js.executeScript("arguments[0].scrollIntoView(false)", up);
	        }   
	        public void windowHandle() {
	        	Set<String>win=driver.getWindowHandles();
				Iterator<String>it=win.iterator(); 
				String parentId=it.next();
				String childId=it.next();
				driver.switchTo().window(childId);
				}

				public void scroll() {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,500)");
				}

				public String getText(String xpath) {
					WebElement element = this.getWebElementUsingXpath(xpath);
					String text = element.getText();
					System.out.println("the selected item is :" + text);
					return text;
				}

}
