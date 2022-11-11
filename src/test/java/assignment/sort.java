package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();;
		driver.get("http://localhost:8888");
		
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	WebElement ele =driver.findElement(null)
		driver.findElement(By.id("selectCurrentPageRec")).click();
		WebElement ele=driver.findElement(By.name("small"));
		Select s= new Select(ele);
		List<WebElement> option=s.getAllSelectedOptions();
		ArrayList<String>I=new ArrayList<String>();
		for(WebElement we:option)
		{
			String text=we.getText();
			I.add(text);
			
			
		}
		Collections.sort(I);
		for(String t:I)
		{
			System.out.println(t);
		}
		
		
	}

}
