package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class utilities {


		public WebDriver driver;
		public WebDriver Intializedriver() throws IOException
			
		{
			
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\Ananth Shenoy\\DemoProject\\src\\main\\java\\dataFile.properties");
			prop.load(fis);
			
			String browser = prop.getProperty("browser");
			
			if(browser.equals("chrome")){
				System.setProperty("webdriver.chrome.driver", "C:\\Software Appications\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
				 driver.manage().window().maximize();
			}
			
			else if(browser.equals("firefox")){
				
				System.setProperty("webdriver.gecko.driver", "C:\\Software Appications\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
				
				
			}
			else if(browser.equals("ie")){
				System.setProperty("webdriver.ie.driver", "C:\\Software Appications\\msedgedriver.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
			}
			
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			return driver;
			
			
			
		}
	}
