package slnmtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSlnm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","/home/sithsabesh/Downloads/QA-VI/Automation/chromedriver_linux64/chromedriver");
     WebDriver driver = new ChromeDriver();

     driver.get("https://stg.viewandhire.com");
     driver.findElement(By.id("mat-input-0")).sendKeys("vijaymvj110@gmail.com");
     driver.findElement(By.id("mat-input-1")).sendKeys("pass@123");
     driver.findElement(By.id("//*[@id=\"reg-input\"]/form/div[3]/button")).click();
    

    
  
     
      
   //driver.findElement(By.id("input")).sendKeys("Tamil");
     
      
	}

}
