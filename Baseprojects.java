package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseprojects {
WebDriver driver;
private void type(WebElement element,String data) {
	element.sendKeys(data);

}
private void click(WebElement element) {
	element.click();

}
private void close() {
	driver.close();

}
private void quit() {
	driver.quit();

}
private WebElement xpath(String data) {
	WebElement findElement = driver.findElement(By.xpath(data));
	return findElement;

}
private String getattribute(WebElement element) {
 String string = element.getAttribute("value");
 return string;

}
private void javascript(WebElement element,String data) {
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].setAttribute('value',' "+data+"')", element);
	

}
}
