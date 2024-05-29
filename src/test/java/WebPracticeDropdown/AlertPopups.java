package WebPracticeDropdown;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopups {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@href='https://demoqa.com'])[1]")).click();
		Set<String> id = driver.getWindowHandles();
		Iterator<String> itrateValue = id.iterator();
		String firstWindowId = itrateValue.next();
		String secondtWindowId = itrateValue.next();
		
		driver.switchTo().window(secondtWindowId);
		Thread.sleep(200L);
		driver.findElement(By.xpath("//div[@class='card-body']/h5[contains(text(),'Elements')]")).click();
		
		
//		String handleId = driver.getWindowHandle(;);
//		
//		System.out.println(handleId);
	}

}
