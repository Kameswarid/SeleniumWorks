package Day_4_10Wed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hover_Over {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		// click on your wishlist
		/*
		 * WebElement e1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		 * Actions a1=new Actions(driver); a1.moveToElement(e1).perform();
		 * Thread.sleep(2000); WebElement
		 * e2=driver.findElement(By.xpath("//span[.=\"Your Wish List\"]")); e2.click();
		 * //e1.click(); Thread.sleep(3000);
		 */
		
		//Hover over Languag-- Telugu
		WebElement e4 = driver.findElement(By.xpath("//span[@class='nav-line-1']"));

		Actions a4 = new Actions(driver);
		a4.moveToElement(e4).perform();
		Thread.sleep(3000);

		WebElement e5 = driver
				.findElement(By.xpath("(//a[@class='nav-link                                    nav-item'])[4]"));

		e5.click();


	}
}
