package slnmtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/sithsabesh/Downloads/QA-VI/Automation/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailbox= driver.findElement(By.id("email"));
		emailbox.sendKeys("vijay@123.com");
		
		WebElement appendbox= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input"));
		appendbox.sendKeys("TEXT");
		
        WebElement textbox= driver.findElement(By.name("username"));
        String value= textbox.getAttribute("value");
        System.out.println(value);
	    WebElement clearbox= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/input"));
	    clearbox.clear();
	    WebElement disabledbox= driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/div/div/input"));
	   boolean enabled= disabledbox.isEnabled();
	   System.out.println(enabled);
	}

}
