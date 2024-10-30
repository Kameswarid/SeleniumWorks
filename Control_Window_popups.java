package Day_4_10Wed;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Control_Window_popups {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	WebElement e1=	driver.findElement(By.xpath("//span[.='Google']"));	
	e1.click();
	Set<String> s1=	driver.getWindowHandles();
	
	System.out.println(s1);
					
		Iterator<String> i1=			s1.iterator();
			String parentid=		i1.next();
			String childid=		i1.next();
			System.out.println( parentid);
			System.out.println(childid);
			
	driver.switchTo().window(childid);
	Thread.sleep(2000);
	driver.close();
	
	
	
			
}
}
