package Day_4_10Wed;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class TakeScreenshot {
public static void main(String[] args) throws IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.Flipkart.in/");
	driver.manage().window().maximize();
	
	TakesScreenshot ts=  driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	File Destination=new File("c:\\Users\\Admin\\OneDrive\\Desktop\\Py-9pm\\ "+new TakeScreenshot().getClass()+Math.random()+".png");
	FileHandler.copy(source, Destination);
}
}
