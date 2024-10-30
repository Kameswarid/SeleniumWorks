package Day_4_10Wed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_isDispEnabSele {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Admin/Downloads/Learning.html");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.name("name1"));
	boolean b1=e1.isSelected();
	if(b1==true)
	{
		System.out.println("Enabled");
	}
		else
			e1.click();
		Thread.sleep(4000);
		WebElement e2=driver.findElement(By.name("lname"));
		boolean b2=e2.isDisplayed();
		System.out.println(b2);
		WebElement e3=driver.findElement(By.id("123"));
		boolean b3=e3.isEnabled();
		System.out.println(b3);
		
}
}
