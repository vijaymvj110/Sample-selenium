package slnmtesting;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fifox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver","/home/sithsabesh/Downloads/QA-VI/Automation/geckodriver-v0.31.0-linux64/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.co.in");
         driver.get("https://stg.viewandhire.com/");
         driver.findElement(By.id("mat-input-0")).sendKeys("vijaymvj110@gmail.com");
	     driver.findElement(By.id("mat-input-1")).sendKeys("pass@123");
	     driver.findElement(By.id("//*[@id=\"reg-input\"]/form/div[3]/button")).click();
	    
         
       
        
        
        
        
        //driver.findElement(By.name("q")).sendKeys("India"+Keys.ENTER);
       
       // driver.quit();
	}

}
