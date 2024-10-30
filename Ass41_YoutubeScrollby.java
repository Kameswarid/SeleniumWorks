package Day14_10Mon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass41_YoutubeScrollby {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.name("search_query"));
	e1.sendKeys(("India")+Keys.ENTER);
	Thread.sleep(3000);
	//WebElement e1=driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[5]"));
	//e1.sendKeys("India"+Keys.ENTER);
	Point p1=e1.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println(y);
	
	
	//JavascriptExecutor j1=driver;*/
	
	
}
}
