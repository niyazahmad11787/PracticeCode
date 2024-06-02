package WebPracticeDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassPractice {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_7qhce485bd_e&adgrpid=1322714095756137&hvadid=82669897710514&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=149083&hvtargid=kwd-82670512756912:loc-90&hydadcr=14453_2334184");
		
		 List<WebElement> getData = driver.findElements(By.xpath("//div[@id='nav-xshop-container']//a"));
		 for(int i=0;i<getData.size();i++) {
			 
			  WebElement text = getData.get(i);
			  Actions action=new Actions(driver);
			  action.moveToElement(text).build().perform();//To hover over element
			  action.click();//To perform left click.
			  action.doubleClick();//To perform double click.
			  action.contextClick();//To perform right click.
			  action.build().perform();
//			  action.dragAndDrop("Source location", "Drag location");
			  //Keyboard Action
			  action.sendKeys("Webelement","data needs to send");
//			  action.keyDown(WebElement,Keys.SHIFT).sendKeys("text").build().perform();
//			  action.keyUp(WebElement,Keys.SHIFT).sendKeys("text").build().perform();
			  action.sendKeys(Keys.DOWN);
			  action.sendKeys(Keys.ENTER);
			  action.build().perform();
			 
			  
			
			  Thread.sleep(2000);
			
		 }
	}
	

}
