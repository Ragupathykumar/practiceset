package org.stepdef;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends Baseclass {
	@Given("User is on Loginpage.")
	public void user_is_on_Loginpage() throws InterruptedException {
		loadbrowser("https://appsit.habiletechnologies.com/");
		maximise();
		//implicitwait(30);
		Thread.sleep(6000);
		Loginpage log=new Loginpage();
		log.login("default", "cb_admin", "password");
	}
	@When("I want to Go Clients menu, Select Client.")
	public void i_want_to_Go_Clients_menu_Select_Client() throws InterruptedException {
		threadsleep(2000);
		Clientdrop drop=new Clientdrop();
		drop.dropdown();
	}
	@When("Once create button is clicked, it directs to client details page.")
	public void once_create_button_is_clicked_it_directs_to_client_details_page() throws InterruptedException, AWTException {
		threadsleep(2000);
		Create_Client client=new Create_Client();
		client.formfilling("Ragu", "Radha","9789654269", 2,"Thallakulam", "Niles");	
	}
	@Given("I want click the Activate button it navigates to activation page.")
	public void i_want_click_the_Activate_button_it_navigates_to_activation_page() throws InterruptedException {
		threadsleep(3000);
		Activation_Page act=new Activation_Page();
		act.activateuser();
	}
	@Given("I want to select the Date in Datepicker to activate the client")
	public void i_want_to_select_the_Date_in_Datepicker_to_activate_the_client() throws InterruptedException {
		threadsleep(3000);
		Activatedate date=new Activatedate();
		date.activatedate();
	}
	@Then("I want verify whether the client information save or not .")
	public void i_want_verify_whether_the_client_information_save_or_not() throws InterruptedException {
		threadsleep(2000);
		Verify verify=new Verify();
		verify.findby("9789654269");
	}
}

