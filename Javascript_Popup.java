package Day_4_10Wed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Popup {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/javascript-popup/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.xpath("//button[.=\"Click \"]"));
	e1.click();
	driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	
}
}
