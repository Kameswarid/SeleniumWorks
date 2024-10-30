package Day_4_10Wed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_ShoeAmazon {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.name("field-keywords"));
	e1.sendKeys("shoes");
	Thread.sleep(3000);
	List<WebElement> l1=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	int count = l1.size();
	l1.get(count-5).click();
	
	//l1.get(count);
}
}
