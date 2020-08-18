package com.intellij.pom;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
 private WebDriver driver;
  
 public BasePage(WebDriver driver) {
	 this.driver=driver;
 }
 
 public WebDriver chromeDriverConnection() {
	 System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver3.exe");
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 return driver;
 }
  
 public void type(String inputText,By locator) {
 	driver.findElement(locator).sendKeys(inputText);    }
  
 public String getTexto(WebElement element) {
	 return element.getText();}
 
 public String getTexto(By locator) {
	 return driver.findElement(locator).getText();}
 
 public void click(By locator) {
		 driver.findElement(locator).click();}
 
 public void visit(String url) {driver.get(url);}

 public Boolean isDisplayed(By locator) {
	    try { return driver.findElement(locator).isDisplayed();	}//este try retornara un V o F
	    catch(org.openqa.selenium.NoSuchElementException e){return false;}
	    }
 public List<WebElement> findElements(By locator){return driver.findElements(locator);}
 
}
