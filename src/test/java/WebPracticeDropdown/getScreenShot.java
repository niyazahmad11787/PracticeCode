package WebPracticeDropdown;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getScreenShot {
	
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		File screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileUtils.copyFile(screenshot, new File("/home/niyaz/eclipse-workspace/practiseWebAutomation/Screenshots/sc1.png") );
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
