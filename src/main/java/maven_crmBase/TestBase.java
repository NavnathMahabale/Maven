package maven_crmBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
	{
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static void init()
	{	
		prop = new Properties();
		try
		{
		FileInputStream file = new FileInputStream("C:\\Users\\nkmin\\eclipse-workspace\\Maven.zip_expanded\\Maven\\configuration.properties");
		prop.load(file);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
//******************************************************************************************************
		//chrome
		//Chrome
		//CHROME
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","E:\\Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
		else 
		{
			System.out.println("Please Select Valid Browser");
		}
//**********************************************************************************************
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	}