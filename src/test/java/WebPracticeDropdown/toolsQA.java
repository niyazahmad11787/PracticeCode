package WebPracticeDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolsQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//div[@class='card-body']//h5[contains(text(),'Elements')]")).click();
		driver.findElement(By.xpath("//ul[@class='menu-list']//span[contains(text(),'Text Box')]")).click();
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Niyaz Ahmad");
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("niyazahmad@gmail.com");
		driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys("Noida Delhi");
		driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("Gurgaon");
		
		driver.findElement(By.id("submit")).click();
		
		List<WebElement> output = driver.findElements(By.xpath("//div[@id='output']//p"));
		for(int i=0;i<output.size();i++) {
			
			String outputValue=output.get(i).getText();
			
			System.out.println(outputValue);
		}

	}

}
