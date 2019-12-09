package Stepdefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pages.homepage;
import pages.practicepage;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.runner.RunWith;
import org.openqa.selenium.support.ui.Select;

import Academy.utilities;

public class TestUI extends utilities {

    @Given("^I'm in QA click academy landing page$")
    public void im_in_qa_click_academy_landing_page() throws Throwable {
    	Properties prop1 = new Properties();
		FileInputStream fist = new FileInputStream("C:\\Users\\Ananth Shenoy\\DemoProject\\src\\main\\java\\dataFile.properties");
		prop1.load(fist);
		
		String url = prop1.getProperty("url");
      driver= Intializedriver();	
		
		driver.get(url);
    }

    @When("^I click on pratice button$")
    public void i_click_on_pratice_button() throws Throwable {
       homepage hp= new homepage(driver);
       hp.praticebutton().click();
       
    }

    @Then("^I should be taken to practice page$")
    public void i_should_be_taken_to_practice_page() throws Throwable {
    	practicepage pp = new practicepage(driver);
    	pp.singupbutton().isDisplayed();
    		 
    }

    @And("^I perform all UI actions$")
    public void i_click_on_radio_button() throws Throwable {
        practicepage pp = new practicepage(driver);
        pp.radiobutton2().click();
        pp.countriesfield().sendKeys("India");
       Select S = new Select(pp.optiondropdown());
       S.selectByIndex(2);
        
    }

}