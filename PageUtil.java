package com.cleartrip.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageUtil {

	public static <T> T initElements(WebDriver driver, Class<T> pageClass){
		return PageFactory.initElements(driver, pageClass);
	}
}
