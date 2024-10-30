package Day_4_10Wed;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_currenttime {
public static void main(String[] args) throws IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	Date d1=new Date();
	System.out.println(d1.getTime()+(1000*60*60*24*0));
	String s2=(d1.toString());
//	System.out.println(s2);
	String s3=s2.replaceAll(":", "");
	
TakesScreenshot ts=  driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File Destination=new File("C:\\Users\\Admin\\OneDrive\\Desktop\\Py-9pm\\"+s3+ new Screenshot_currenttime().getClass()+".png" );
	FileHandler.copy(source,Destination);
	

}
}
