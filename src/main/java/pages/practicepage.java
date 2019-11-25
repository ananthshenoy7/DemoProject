package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
	
	public WebElement radiobutton2(){
		return radiobutton2;
	}
		public WebElement singupbutton(){
			return signup;
		}
	}
	
