package org.stepdef;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Client extends Baseclass{
	public  Create_Client() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(css="#firstname")
	private WebElement firstname;
	@FindBy(css="#lastname")
	private WebElement lastname;
	@FindBy(id="dateofbirth")
	private WebElement dob;
	@FindBy(xpath="//button[@class='btn-black btn-block']")
	private WebElement yearbtn1;
	@FindBy(xpath="//button[@class='btn-black pull-left']")
	private WebElement leftarr;
	@FindBy(xpath="//tr[@ng-repeat='row in rows'][4]//child::td[@ng-repeat='dt in row'][1]")
	private WebElement yearselect;
	@FindBy(xpath="//div[@id='genderId_chosen']//child::a")
	private WebElement selectgender ;
	@FindBy(xpath="//tr[@ng-repeat='row in rows'][2]//child::td[3]")
	private WebElement monthselect;
	@FindBy(xpath="//span[text()='31']")
	private WebElement dateselect;
	@FindBy(xpath="//div[@id='clienttypeId_chosen']//child::a")
	private WebElement select ;
	@FindBy(xpath="//div[@id='clientClassificationId_chosen']//child::a")
	private WebElement clientcls;
	@FindBy(xpath="//select[@chosen='addressTypes']//following::div[1]//child::a")
	private WebElement addressselect;
	@FindBy(xpath="//button[@ng-click='addAddress()']")
	private WebElement address;
	@FindBy(xpath="//select[@id='clientcountry']//following::div[1]//child::a")
	private WebElement country;
	@FindBy(xpath="//input[@name='street0']")
	private WebElement street;
	@FindBy(xpath="//select[@id='clientstate']//following::div[1]//child::a")
	private WebElement state;
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	@FindBy(xpath="//select[@id='districtId']//following::div[1]//child::a")
	private WebElement district;
	@FindBy(id="mobileNo")
	private WebElement mobile;
	@FindBy(id="save")
	private WebElement subbtn;


	public WebElement getDob() {
		return dob;
	}
	public WebElement getYearbtn1() {
		return yearbtn1;
	}
	public WebElement getLeftarr() {
		return leftarr;
	}
	public WebElement getYearselect() {
		return yearselect;
	}
	public WebElement getMonthselect() {
		return monthselect;
	}
	public WebElement getDateselect() {
		return dateselect;
	}
    public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getSelectgender() {
		return selectgender;
	}
	
	public WebElement getSelect() {
		return select;
	}
	
	public WebElement getClientcls() {
		return clientcls;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getAddressselect() {
		return addressselect;
	}
	public WebElement getStreet() {
		return street;
	}
	
	public WebElement getCountry() {
		return country;
	}
	public WebElement getDistrict() {
		return district;
	}
	
	public WebElement getSubbtn() {
		return subbtn;
	}
		
	public WebElement getState() {
		return state;
	}
	public WebElement getCity() {
		return city;
	}
		
	public WebElement getMobile() {
		return mobile;
	}
	public void formfilling(String fname,String lname,String mobile,int index,String street,String city) throws AWTException  {
		
		type(getFirstname(), fname);
		type(getLastname(), lname);
		type(getMobile(), mobile);
		click(getDob());
		click(getYearbtn1());
		click(getYearbtn1());
		click(getLeftarr());
		click(getLeftarr());
		click(getYearselect());
		click(getMonthselect());
		click(getDateselect());
		click(getSelectgender());
		robot();
		click(getSelect());
		robot1();
		click(getClientcls());
		robot1();
		click(getAddress());
		click(getAddressselect());
		robot3();
		type(getStreet(), street);
		click(getCountry());
		robot1();
		click(getDistrict());
		robot();
		click(getState());
		type(getCity(), city);
		click(getSubbtn());
	}
}
















