package Day14_10Mon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;


public class Ass_40Co_ordinatesOfAmazon {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	WebElement e1=driver.findElement(By.xpath("//a[.='About Amazon']"));
	Point p1=e1.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println("X-co-ordinate----"+x);
	System.out.println("Y-co-ordinate----"+y);
	Thread.sleep(2000);
	JavascriptExecutor js=    driver;
	js.executeScript("window.scrollBy(30,2000)");
	
	
	// search bar Amazon co-ordinates
	
	/*WebElement e2=driver.findElement(By.name("field-keywords"));
	Point p2=e2.getLocation();
	int x=p2.getX();
	int y=p2.getY();
	System.out.println("The search bar x is--->"+x);
	System.out.println("The search bar y is--->"+y);   */
}
}
