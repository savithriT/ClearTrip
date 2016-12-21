/**
 * 
 */
package com.cleartrip.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.TestCase;

/**
 * @author stummara
 *
 */
public class TestBase extends TestCase {

	static WebDriver driver = null;
	
	String testCaseName;
	
	protected TestBase(String testCaseName){
		super(testCaseName);
	}
	
	protected void setUp(){
		
	}
	
	public static void initializeWebDriver(){
		
		if(null==driver){
			driver = new FirefoxDriver();
		}
	}
	
	public void openPage(String url){
		
		driver.get(url);
	}
}
