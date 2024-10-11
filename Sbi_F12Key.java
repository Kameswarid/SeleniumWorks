package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi_F12Key {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	WebElement e1= driver.findElement(By.linkText("CONTINUE TO LOGIN"));
	e1.click();
	
	WebElement e2= driver.findElement(By.id("username"));
	e2.sendKeys("kameswari");
	
	WebElement e3= driver.findElement(By.id("label2"));
	e3.sendKeys("Hello");
	
	WebElement e4= driver.findElement(By.name("loginCaptchaValue"));
	e4.sendKeys("3248b");
	
	
	WebElement e5= driver.findElement(By.id("Button2"));
	e5.click();
}
}
