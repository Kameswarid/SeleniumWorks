package Day_4_10Wed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/drag-and-drop/");
	
	WebElement e1=driver.findElement(By.id("drag2"));
	WebElement e2=driver.findElement(By.id("div2"));
	Thread.sleep(2000);
	Actions a1=new Actions(driver);
	a1.dragAndDrop(e1,e2).perform();
	//WebElement e2=driver.findElement(By.id("div2"));
	Thread.sleep(2000);
	WebElement e3=driver.findElement(By.id("drag2"));
	WebElement e4=driver.findElement(By.id("container-1"));
	Thread.sleep(2000);
	Actions a2=new Actions(driver);
	a2.dragAndDrop(e3,e4).perform();
}
}
