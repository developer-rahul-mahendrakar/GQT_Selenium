// WAS to navigate to Facebook Application and type the email in the email field using "id" locator

// Link - https://www.facebook.com
// Email - rahulmahendrakar09@gmail.com

// HTML CODE FOR EMAIL WEB ELEMENT -
//		<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" 
//			placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">


package com.gqt.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch14 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("rahulmahendrakar09@gmail.com");
	}
}
