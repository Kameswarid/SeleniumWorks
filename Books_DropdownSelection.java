package Day_4_10Wed;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Books_DropdownSelection {
	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement e1= driver.findElement(By.id("searchDropdownBox"));
	Select s1=new Select(e1);
	s1.selectByVisibleText("Books");
	WebElement e2= driver.findElement(By.id("twotabsearchtextbox"));
	e2.sendKeys("Power of Mind" + Keys.ENTER);
}
}