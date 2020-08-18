package com.intellij.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Amazon_Test {
	private WebDriver driver;
	 NavPage navpage;

	@Before
	public void setUp() throws Exception {
		navpage = new NavPage(driver);
		driver=navpage.chromeDriverConnection();
		navpage.visit("https://www.amazon.com/");
	}

	
	@Test
	public void test() throws InterruptedException{
		navpage.typeYourGame();
		
		String dolar = navpage.CountInGame();
      String cost= navpage.priceInGame();
      assertEquals("US$", dolar);
      assertEquals("50", cost);
      System.out.println("your search price is" + dolar+ cost);
	}

	@After
	public void tearDown() throws Exception {
	}
}
