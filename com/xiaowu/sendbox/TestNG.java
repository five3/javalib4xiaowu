package com.xiaowu.sendbox;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import com.thoughtworks.selenium.*;

import org.openqa.jetty.util.URI;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.htmlunit.*;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestNG {
  @Test(enabled=true)
  public void webdriver() {
	  System.out.println("do testing");
//	  WebDriver driver = new ChromeDriver();
	  WebDriver driver = new FirefoxDriver();
//	  WebDriver driver = new HtmlUnitDriver();
//	  WebDriver driver = new InternetExplorerDriver();
	  driver.get("http://www.dangdang.com");
	  System.out.println(">>>>>>>>" + driver.getCurrentUrl());
	  driver.quit();	 	  
  }
 
  @Test(enabled=false)
  public void remote() throws MalformedURLException, InterruptedException {
      WebDriver wd;
      DesiredCapabilities ffDesiredcap = DesiredCapabilities.firefox();
      DesiredCapabilities chromeDesiredcap = DesiredCapabilities.chrome();
      DesiredCapabilities ieDesiredcap = DesiredCapabilities.internetExplorer();
      wd=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), ieDesiredcap);
      wd.get("http://www.google.com");
      Thread.sleep(1200);
      System.out.println(">>>>>>>>" + wd.getCurrentUrl());
      wd.quit();
  }

  @Test(enabled=false)
  public void selenium1() throws MalformedURLException, InterruptedException {
	  Selenium selenium;
      selenium=new DefaultSelenium("localhost", 4444, "*firefox", "http://www.baidu.com");
      selenium.start();
      selenium.open("http://www.google.com");
      Thread.sleep(1200);
      System.out.println(">>>>>>>>" + selenium.getTitle());
      selenium.close();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

}
