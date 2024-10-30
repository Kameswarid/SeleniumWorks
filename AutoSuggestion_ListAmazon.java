package Day_4_10Wed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_ListAmazon {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.className("gLFyf"));
	e1.sendKeys("Banglore");
	Thread.sleep(2000);
	List<WebElement> e2=driver.findElements(By.xpath("//div[@class='LVal7b']/ul/li"));
	
	//Thread.sleep(2000);
	int count= e2.size();
	//System.out.println(count);
	e2.get(9).click();
	e2.get(count-10).click();
}
}
