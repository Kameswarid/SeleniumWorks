package Day14_10Mon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Headless_mode {
public static void main(String[] args) {
	ChromeOptions c1=new ChromeOptions();
	c1.addArguments("--headless");
	
	ChromeDriver driver=new ChromeDriver(c1);
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement e1= driver.findElement(By.linkText("Gmail"));
	Actions a1=new Actions(driver);
	a1.doubleClick(e1).perform();
}
}
