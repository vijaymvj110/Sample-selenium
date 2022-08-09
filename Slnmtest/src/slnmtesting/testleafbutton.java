package slnmtesting;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testleafbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/sithsabesh/Downloads/QA-VI/Automation/geckodriver-v0.31.0-linux64/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[2]/a/img")).click();
		WebElement getpositionbutton= driver.findElement(By.id("position"));
		Point xypoint=
	}

}
