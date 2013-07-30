package com.xiaowu.sendbox;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.thoughtworks.selenium.*;

public class CalcTest {
	private static Calc calc = new Calc();
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void testMup() {
		System.out.println("=============do testing");
		Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox3 D:/Program Files/Mozilla Firefox/firefox.exe", "http://www.dangdang.com");
		selenium.open("http://www.dangdang.com");
		System.out.println(selenium.getLocation());
		selenium.close();
	}	
	
	
	@Test
	public void testAdd() {
		calc.add(1);
		calc.add(2);
		assertEquals(3, (int)calc.getResult());
	}

	@Ignore
	@Test
	public void testSub() {
		fail("Not yet implemented");
	}

	@Test
	public void testDiv() {
		fail("Not yet implemented");
	}

	@Test
	public void testMod() {
		fail("Not yet implemented");
	}

	@Test
	public void testReset() {
		fail("Not yet implemented");
	}

}
