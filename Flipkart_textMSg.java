package Day_4_10Wed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_textMSg {
	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
//WebElement e1= driver.findElement(By.linkText("Fashion"));
//e1.click();
WebElement e1= driver.findElement(By.xpath("//span[.=\"Fashion\"]"));
		e1.click();
}
}