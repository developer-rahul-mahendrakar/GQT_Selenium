// WAS to open Firefox browser by adding geckodriver by using environment variables

package com.gqt.selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch9 {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.close();
	}
}