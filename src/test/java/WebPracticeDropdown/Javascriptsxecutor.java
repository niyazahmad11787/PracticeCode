package WebPracticeDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascriptsxecutor {
	
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/default.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement clickBtn = driver.findElement(By.xpath("//button[@type='button']"));
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);	
		js.executeScript("arguments[0].style.border='3px solid red'", clickBtn);//To highlight the webelement
		
		String titlebyjs = js.executeScript("return document.title;").toString();//To get the title of the page
		System.out.println(titlebyjs);
		
		
//		js.executeScript("arguments[0].click();", clickBtn);// To click on webelement
		
//		js.executeScript("alert('" + "The w3c Site is launched" + "')");// To shown a runtime popup on specific operation.
		
		js.executeScript("history.go(0)");//To refresh the page.
		
		js.executeScript("scroll(0,1000)");//To scroll down the page.
		
		js.executeScript("arguments[0].scrollIntoView(true);", clickBtn);//To scroll down for specific webelement
		
		
		
	}

}
