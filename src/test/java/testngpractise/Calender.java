package testngpractise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Calender {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();		
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 10).click().perform();
		
		//driver.findElement(By.xpath("//a[@class='close']")).click();
		
		//driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		
		//Navigate to From and To Elements
		WebElement src = driver.findElement(By.xpath("//input[@id='fromCity']"));
		WebElement dst = driver.findElement(By.xpath("//input[@id='toCity']"));
		
		
		src.sendKeys("mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		
		Thread.sleep(2000);
		
		dst.sendKeys("Tirupati");
		driver.findElement(By.xpath("//p[text()='Tirupati, India']")).click();
		
		Thread.sleep(2000);
		
		//navigate to departure
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		//navigate to desired date in calender
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@aria-label='Fri Nov 25 2022']")).click();
		driver.findElement(By.xpath("//p[text()='Tap to add a return date for bigger discounts']")).click();
		driver.findElement(By.xpath("(//p[text()='3'])[3]")).click();
	}		
		
		//driver.findElement(By.xpath("//p[text()='New Delhi, India']")).click();
		
	}


