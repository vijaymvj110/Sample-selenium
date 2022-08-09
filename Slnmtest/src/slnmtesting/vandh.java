package slnmtesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.Listener;

public class vandh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/sithsabesh/Downloads/QA-VI/Automation/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://dev.viewandhire.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("vijay110m@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("pass@123"+Keys.ENTER);
		
		List<WebElement> selectable= driver.findElements(By.xpath("//*[@id=\"navbarNav\"]/ul/li"));
		int listsize= selectable.size();
		System.out.println(listsize);
		
		WebElement candidate= driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/div/li[2]/a"));
		candidate.click();
	}

}
