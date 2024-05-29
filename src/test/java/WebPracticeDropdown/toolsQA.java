package WebPracticeDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class toolsQA {
	

	public static void formData(WebDriver driver) {

		driver.findElement(By.xpath("//div[@class='card-body']//h5[contains(text(),'Elements')]")).click();
		driver.findElement(By.xpath("//ul[@class='menu-list']//span[contains(text(),'Text Box')]")).click();
		driver.findElement(By.cssSelector("input#userName")).sendKeys("Niyaz Ahmad");
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("niyazahmad@gmail.com");
		driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys("Noida Delhi");
		driver.findElement(By.cssSelector("textarea#permanentAddress")).sendKeys("Gurgaon");
//		Actions action=new Actions(driver);
		WebElement submitBtn = driver.findElement(By.xpath("//button[@id='submit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submitBtn);
		
		
//		action.moveToElement(submitBtn).click();

		List<WebElement> output = driver.findElements(By.xpath("//div[@id='output']//p"));
		for (int i = 0; i < output.size(); i++) {

			String outputValue = output.get(i).getText();

			System.out.println(outputValue);
		}

	}

	public static void handleCheckBox(WebDriver driver) {

		// Handle check box
		driver.findElement(By.xpath("//span[@class='text'][text()='Check Box']")).click();
		driver.findElement(By.xpath("(//button[@title='Toggle'])[1]")).click();
		WebElement result = driver.findElement(By.xpath("(//span[@class='rct-checkbox'])[1]"));
		boolean data = result.isSelected();
		if (data == false) {
			result.click();
		}

	}
	
	public static void handleradioButton(WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath("//span[@class='text'][text()='Radio Button']")).click();
		WebElement yesBtn = driver.findElement(By.xpath("//label[@for='yesRadio']"));
		boolean yesSelected = yesBtn.isSelected();
		if(yesSelected==true) {
			yesBtn.click();
		}
		else {
			WebElement impressiveBtn = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		boolean btn = impressiveBtn.isSelected();
		if(btn==false) {
			impressiveBtn.click();
		}
		}
//		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		formData(driver);
		Thread.sleep(200L);
		handleCheckBox(driver);
		Thread.sleep(200L);
		handleradioButton(driver);
		
		

	}

}
