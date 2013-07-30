package com.ddap.utils;

import java.io.File;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetStartSelenium {
	WebDriver driver;
	Wait wait;

	public void instantiateBrowser(BrowserType browserType, String url) {
	    driver = getWebDriver(browserType);
	    wait = new WebDriverWait(driver, 30);
	    driver.get(url);
	}

	public void closeBrowser() {
	    driver.close();
	}

	public WebDriver getWebDriver(BrowserType browserType) {
	    switch (browserType) {
	        case FIREFOX:
	            // Need to implement
	            return null;
	        case IE:
	            // Need to implement
	            return null;
	        case CHROME:
	            // Need to implement
	            return null;
	        case SAFRI:
	            // Need to implement
	            return null;
			case ANDROID:
	            // Need to implement
	            return null;
			case OPEAR:
	            // Need to implement
	            return null;
			case HTMLUNIT:
	            // Need to implement
	            return null;			
	        default:
	            throw new RuntimeException("Browser type unsupported");
	    }
	}
	
	public FirefoxDriver initFirefox(String profileDirectory){
		File profile = new File(profileDirectory);
		FirefoxProfile ffprofile = new FirefoxProfile(profile);
		return new FirefoxDriver(ffprofile);
	}

	public enum BrowserType {
	    FIREFOX, IE, CHROME, SAFRI, OPEAR, ANDROID, IPHONE, HTMLUNIT
	}
	
}
