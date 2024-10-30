package Day_4_10Wed;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Right-click to inspect doesnt work in Flipkart.So, in HTML go to sources and pause the code
//then go to elements and inspect for code
public class FlipKart_AutoSuggestion {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.name("q"));
	e1.sendKeys("mobiles");
	Thread.sleep(6000);
List<WebElement> li=driver.findElements(By.xpath("//form[@class='Hy6F9O header-form-search']/ul/li"));

Thread.sleep(5000);
int count=li.size();
Thread.sleep(4000);
System.out.println(count);
li.get(5).click();
//li.get(count-5).click();


}
}