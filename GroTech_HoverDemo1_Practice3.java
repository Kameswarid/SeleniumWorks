package Day_4_10Wed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroTech_HoverDemo1_Practice3 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/hoverover/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//div[@class='toolrip4']"));
	Thread.sleep(4000);

	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();
	//e1.click();
	Thread.sleep(5000);

	WebElement e2=driver.findElement(By.xpath("//div[@class='popup4'][3]"));
	e2.click();

	
	
}
}
