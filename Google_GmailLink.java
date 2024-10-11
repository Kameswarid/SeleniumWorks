package basics.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_GmailLink {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Gmail")).click();
	//WebElement e2= driver.findElement(By.xpath(//a[@class="gb_X"));
}
}
