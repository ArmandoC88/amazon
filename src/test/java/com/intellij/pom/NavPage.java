package com.intellij.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavPage extends BasePage {
	By searchbox = By.id("twotabsearchtextbox");//searchbox in Amazon
	By Icon = By.className("nav-input");//Icon
	By dolar = By.className("a-price-symbol");//symbol dollar
    By cost = By.className("a-price-whole");//price
    

	
	public NavPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void typeYourGame() throws InterruptedException {
		 click(searchbox);
		Thread.sleep(2000);
		 if(isDisplayed(Icon)) {
	    type("Nintendo",searchbox);
	     click(Icon);
	     }else{  System.out.println("your game wasnÅLt found");}
	}
	
	
  //2 List WebElements because the locator in olar and price are diferent 
    public String CountInGame() {
    	List<WebElement> priceGame = findElements(dolar);
    	return this.getTexto(priceGame.get(0));
    			}
    
    public String priceInGame() {
    	List<WebElement> priceGame = findElements(cost);
    	return this.getTexto(priceGame.get(0));
    			}
}
