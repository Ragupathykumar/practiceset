package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verify extends Baseclass {
	public Verify() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="client-dropdown")
	private WebElement clickclientsmenu;
	@FindBy(xpath="//a[@id='client-dropdown']//following::ul[@id='swatch-menu']//child::a[text()='Clients']")
	private WebElement clickclients;
	@FindBy(xpath="//input[@data-ng-model='searchText']")
	private WebElement findby;
	@FindBy(xpath="//button[@class='btn btn-primary form-control']")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
	public WebElement getClickclientsmenu() {
		return clickclientsmenu;
	}
	public WebElement getClickclients() {
		return clickclients;
	}
	public WebElement getFindby() {
		return findby;
	}
	public void findby(String data) {
		movetoelement(getClickclientsmenu());
		movetoelement(getClickclients());
		click(getClickclients());
		type(getFindby(), data);
		click(getSearch());

	}
}
