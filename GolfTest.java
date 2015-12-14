package Examples;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GolfTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.americangolf.co.uk/");
		driver.manage().window().maximize();
		Actions actions = new Actions (driver);
		WebElement golfclubs = driver.findElement(By.xpath(".//*[@id='navigation']/nav/ul/li[1]/a"));
		actions.moveToElement(golfclubs).build().perform();
		
		
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//move to wedges and click on wedges
		WebElement wedges = driver.findElement(By.xpath(".//*[@id='CLUBS_1']/div[1]/ul[1]/li/ul/li[2]/ul/li[2]/a"));
		actions.moveToElement(wedges).click().build().perform();
		
	
	// drag and drop slider
	
	WebElement slider = driver.findElement(By.xpath(".//*[@id='secondary']/div[1]/div[2]/div[1]/div[1]/span[1]"));
	actions.dragAndDropBy(slider, 30, 0).build().perform();

	}
}
