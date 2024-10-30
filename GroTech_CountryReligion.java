package Day_4_10Wed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTech_CountryReligion {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/registration/");
	WebElement e1=driver.findElement(By.id("fname"));
	e1.sendKeys("Kameswari");
	Thread.sleep(2000);
	
	WebElement e2=driver.findElement(By.xpath("//input[@id='lname']"));
	e2.sendKeys("Duvvuri");
	Thread.sleep(2000);
	
	WebElement e3=driver.findElement(By.name("email"));
	e3.sendKeys("kameswari@gmail.com");
	Thread.sleep(2000);
	
	WebElement e4=driver.findElement(By.id("password"));
	e4.sendKeys("1234");
	Thread.sleep(2000);
	
	WebElement e5=driver.findElement(By.id("Female"));
	e5.click();
	Thread.sleep(2000);
	
	WebElement e6=driver.findElement(By.className("Skills"));
	Select s1=new Select(e6);
	s1.selectByVisibleText("Technical Skills");
	Thread.sleep(2000);
	
	WebElement e7=driver.findElement(By.id("technicalskills"));
	Select s2=new Select(e7);
	s2.selectByIndex(3);
	//Thread.sleep(2000);
	
	WebElement e8=driver.findElement(By.id("Country"));
	Select s3=new Select(e8);
	s3.selectByValue("France");
	Thread.sleep(2000);
	
	WebElement e9=driver.findElement(By.id("Present-Address"));
	e9.sendKeys("Hyderabad");
	Thread.sleep(2000);
	
	WebElement e10=driver.findElement(By.id("Permanent-Address"));
	e10.sendKeys("Hyderabad");
	Thread.sleep(2000);
	
	WebElement e14=driver.findElement(By.id("Pincode"));
	e14.sendKeys("500090");
	Thread.sleep(2000);
	
	WebElement e15=driver.findElement(By.name("Relegion"));
	Select s5=new Select(e15);
	s5.selectByValue("Hindu");
	Thread.sleep(2000);
	
	WebElement e11=driver.findElement(By.id("relocate"));
	e11.click();
	Thread.sleep(2000);
	
	WebElement e12=driver.findElement(By.id("file"));
	e12.sendKeys("//C:/Users/Admin/Downloads/AIfor20HR20Managers.pdf");
	Thread.sleep(2000);
	
	WebElement e13=driver.findElement(By.name("Submit"));
	e13.click();
	//Thread.sleep(2000);
}
}
