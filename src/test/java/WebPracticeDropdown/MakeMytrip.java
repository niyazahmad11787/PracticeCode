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
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.cssSelector("span.commonModal__close")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#fromCity")));
		driver.findElement(By.cssSelector("input#fromCity")).sendKeys("Kan");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='makeFlex column flexOne']")));
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//p"));
		try {

			for (int i = 0; i < options.size(); i++) {
				WebElement value = options.get(i);
				if (value.getText().equalsIgnoreCase("Kanpur, India")) {
					value.click();

				}
			}
		} catch (Exception e) {

			System.out.println("Exception" + e);
		}

	}
}
