package Day9_10Wed;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AddToWishlist {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("caps"+Keys.ENTER);
	WebElement e2=driver.findElement(By.className("s-image"));
	e2.click();
	Set<String> s1=driver.getWindowHandles();
	Iterator i1=s1.iterator();
	String parentid=(String) i1.next();
	String childid=(String) i1.next();
	driver.switchTo().window(childid);
	Thread.sleep(2000);
	WebElement e3=driver.findElement(By.linkText("Add to Wish List"));
	e3.click();
}
}
