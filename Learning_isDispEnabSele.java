package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_isDispEnabSele {
public static void main(String[] args) {
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
		
	}
	
}

