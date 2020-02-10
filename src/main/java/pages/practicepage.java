package pages;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class practicepage {

	public WebDriver driver;
	public practicepage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@value='radio2']")
	WebElement radiobutton2;
	
	@FindBy(xpath="/html/body/header/div/button[3]")
	WebElement signup;
	
	@FindBy(css="input[id='autocomplete']")
	WebElement selectcountries;
	
	@FindBy(id="dropdown-class-example")
    WebElement optiondropdown;
	
	@FindBy(id="checkBoxOption2")
	WebElement option_2;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="alertbtn")
	WebElement alertbutton;
	
	@FindBy(id="opentab")
	WebElement opentab;
	
	@FindBy(id="openwindow")
	WebElement openwindow;
	
	@FindBy(id="mousehover")
	WebElement mousehover;
	
	@FindBy(xpath="/html/body/div[4]/div/fieldset/div/div/a[1]")
	WebElement top;
	
	
	public WebElement radiobutton2(){
		return radiobutton2;
	}
		public WebElement singupbutton(){
			return signup;
		}
		
		public WebElement countriesfield(){
			return selectcountries;
		}
		
		public WebElement optiondropdown(){
			return optiondropdown;
		}
		
		public WebElement option2(){
			return option_2;
		}
		
		public WebElement name(){
		   return name;
		}
		
		public WebElement alertbutton(){
			return alertbutton;
		}
		
		public WebElement opentab(){
			return opentab;
		}
		
		public WebElement openwindow(){
			return openwindow;
		}
		
		public WebElement mousehover(){
			return mousehover;
		}
		
		public WebElement top(){
			return top;
		}
		
		}
	
	
