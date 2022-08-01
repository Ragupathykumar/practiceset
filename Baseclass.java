package org.stepdef;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	static  WebDriver driver;
	public void loadbrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get(url);
	}
	public static  void type(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static  void type2(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void click(WebElement element) {
		element.click();
	}
	public void implicitwait(int time) {
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	public void maximise() {
		driver.manage().window().maximize();
	}
	public void threadsleep(int millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	public String geturl() {
		String string = driver.getCurrentUrl();
		return string;
	}
	public void robot() throws AWTException {
		Robot r=new Robot();
		for (int i = 0; i < 1; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void robot1() throws AWTException {
		Robot r=new Robot();

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void robot3() throws AWTException {
		Robot r=new Robot();
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void javatype(WebElement element,String data) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;	
		executor.executeScript("arguments[0].setAttribute('value','"+data+"')", element);

	}
	public void javaclick(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor)driver;	
		executor.executeScript("arguments[0].click()", element);
	}
	public WebElement findbyid(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;

	}
	public void movetoelement(WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();

	}
	public void selectbyoptionbyvisibletext(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	public void selectbyoptionbyindex(WebElement element,int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
}
