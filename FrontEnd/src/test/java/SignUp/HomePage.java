package SignUp;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BaseClass.basetest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage extends basetest{
	
	@Test

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		driver.findElement(By.xpath("//*[@id=\"chatroom_boundary_id\"]/app-root/app-master-layout/div/div[2]/div/div[2]/div/button")).click();
		
		
		/*
		 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		// Navigate to a website
		// driver.get("https://sportsnewspak.com/");
		
		FileReader fr = new FileReader ("C:\\Users\\hamza\\eclipse-workspace\\FrontEnd\\src\\test\\resources\\configfiles\\config.properties");
		
		Properties p = new Properties ();
		
		p.load(fr);
		
		// driver.get(p.getProperty("url"));
		
		
		
		
		//Maximize current window
		//driver.manage().window().maximize();
		
		//Delay execution for 5 seconds to view the maximize operation
		//Thread.sleep(5000);
		//Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id=\"chatroom_boundary_id\"]/app-root/app-master-layout/div/div[2]/div/div[2]/div/button")).click();
		
		//Close the browser
		//driver.quit();
		
		 */

	}

}
