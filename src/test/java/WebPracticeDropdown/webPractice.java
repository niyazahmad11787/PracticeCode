package WebPracticeDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webPractice {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=17816302926083524514&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007751&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("sam");
		
		 List<WebElement> ottions = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		 
		 for(int i=0;i<ottions.size();i++) {
			 System.out.println("This is dropdown data");
			 
			String value = ottions.get(i).getText();
			
			System.out.println(value);
		 }
		
		
	}

}
