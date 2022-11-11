package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Noon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();;
		driver.get("https://www.learnatnoon.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//*[name()='svg' and @class='icon icon-noon pointer']"));
			System.out.println(ele.isDisplayed());
			
			
			WebElement ele1 = driver.findElement(By.xpath("(//*[name()='svg' and @width='150px'])[1]"));
			System.out.println(ele1.getLocation());
	}

}
