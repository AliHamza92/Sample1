package BaseClass;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {

	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;

	@BeforeTest
	public void setup() throws IOException, InterruptedException {

		if (driver == null) {
			FileReader fr = new FileReader(
					"C:\\Users\\hamza\\eclipse-workspace\\FrontEnd\\src\\test\\resources\\configfiles\\config.properties");
			prop.load(fr);
		}

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			// Maximize current window
			driver.manage().window().maximize();

			// Delay Time
			Thread.sleep(50000);

			// Home Page
			driver.get(prop.getProperty("url"));

		}

		else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			// Maximize current window
			driver.manage().window().maximize();
			
			//Delay Time
			Thread.sleep(5000);
			
			// 

		}

		else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			// Maximize current window
			driver.manage().window().maximize();

		}

	}

	@AfterTest
	public void tearDown() {

		driver.close();
		System.out.println("TearDown Successfull");

	}

}
