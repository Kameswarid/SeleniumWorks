package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_textMSg {
	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath(//span[.='Mobile'][2]));

}
}