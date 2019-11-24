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
	
	public WebElement radiobutton2(){
		return radiobutton2;
	}
	
}
;