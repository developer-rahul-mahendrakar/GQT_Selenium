//		 WAS to automate the following Scenario
//	-->  Open the Chrome Browser
//	-->  Navigate to Gmail Application [https://www.gmail.com]
//	-->  Wait for 5 sec's
//	-->  Close the Browser

package com.gqt.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch4 {
	public static void main(String[] args) throws InterruptedException {
		
		// opening the Chrome Application
		System.setProperty("webdriver.chrome.driver", "E:\\GQT Softwares\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String url = "https://www.gmail.com";
		
		// navigate to Gmail Application
		driver.get(url);
		
		// wait for 5 sec's
		Thread.sleep(5000);
		
		// close the Browser
		driver.close();
		
	}
}
