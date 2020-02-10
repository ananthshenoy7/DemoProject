package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {

	public WebDriver driver;
	public homepage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='homepage']/header/div[2]/div/nav/ul/li[5]/a")
	WebElement practice;
	
	@FindBy(xpath="//*[@id='homepage']/header/div[2]/div/nav/ul/li[2]/a")
	WebElement courses;
	
	@FindBy(xpath="//*[@id='homepage']/header/div[2]/div/nav/ul/li[4]/a")
	WebElement interview;
	
	public WebElement praticebutton()
	{
		return practice;
	}
	
	public WebElement courses(){
		
		return courses;
	}
	
	public WebElement interview(){
		return interview;
	}
}
