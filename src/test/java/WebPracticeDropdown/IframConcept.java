package WebPracticeDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframConcept {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// Frame concept.
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@title='Change Theme']")).click();
		
	}

}