package WebPracticeDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMytrip {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("span.commonModal__close")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#fromCity")));
		driver.findElement(By.cssSelector("input#fromCity")).sendKeys("Kan");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='makeFlex column flexOne']")));
		List<WebElement> options = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
		for(int i=1;i<options.size();i++) {
			String value = options.get(i).getText();
			System.out.println(value);
//			if(value.getText().equalsIgnoreCase("Kanpur, India")) {
//				value.click();
//			   
//			}
		}
		
	}

}
