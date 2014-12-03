package com.selenium.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Assetmanagment_Module {
	 public static WebElement element=null;
	 public static WebDriver driver;
	 public static  WebElement Asset_Mod(WebDriver driver){
	        element= driver.findElement(By.xpath("//div/div/span[text()='Asset Management']"));
	        element.click();
	return element;
	
}
	 public static  WebElement QuartersDetails(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Quarters Details')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement QuarterAllotment(WebDriver driver){
	        element= driver.findElement(By.xpath("//div/li[2]/ul/li[2]/div/a/span[contains(text(),'Allotment')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement QuarterVacant(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Vacant')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement GodownDetails(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Godown Details')]"));
	        element.click();
	        return element;
	 } 
	 public static  WebElement GodownAllotment(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Allotment')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement GodownStockInward(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Stock Inward')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement GodownStockOutward(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Vacant')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement LandDetails(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Land Details')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement SaleList(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Sale List')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement SiteCreation(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Site Creation')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement ShopsDetails(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Shops Details')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement AllotmentList(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Allotment List')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement shopsales(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Sales')]"));
	        element.click();
	        return element;
	 }
	 public static  WebElement shopVacant(WebDriver driver){
	        element= driver.findElement(By.xpath("//a/span[contains(text(),'Vacant')]"));
	        element.click();
	        return element;
	 }
}
