package slnmtesting;

import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Viewandhire {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/sithsabesh/Downloads/QA-VI/Automation/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://dev.viewandhire.com/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);



		driver.findElement(By.id("username")).sendKeys("vijay110m@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Pass@123"+Keys.ENTER);

		WebElement joblink= driver.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/div/li[1]/a"));
		joblink.click();

		WebElement registerjob=driver.findElement(By.xpath("//*[@id=\"navbarsExample03\"]/ul/li[1]/span"));
		registerjob.click();
		WebElement jobtitle=driver.findElement(By.id("companyName"));
		jobtitle.sendKeys("Quality analyst");
		WebElement organizationdropdown=driver.findElement(By.id("size"));
		Select select=new Select(organizationdropdown);
		select.selectByIndex(3);
		WebElement jobcategorydropdown=driver.findElement(By.id("jobCategory"));
		Select select1=new Select(jobcategorydropdown);
		select1.selectByValue("IT/Software");
		WebElement employmenttype=driver.findElement(By.id("Type"));
		Select select2=new Select(employmenttype);
		select2.selectByVisibleText("Part Time");

		WebElement experiencedropdown=driver.findElement(By.id("experience"));
		Select selectexperience=new Select(experiencedropdown);
		selectexperience.selectByIndex(8);

		WebElement majorskillcheckbox=driver.findElement(By.id("MS-HL4FCN2353"));
		majorskillcheckbox.click();
		WebElement subskillcheckbox=driver.findElement(By.id("SS-52C5F4JE5J"));
		subskillcheckbox.click();

		WebElement vacancy=driver.findElement(By.id("vacancy"));
		vacancy.sendKeys("10");

		WebElement description= driver.findElement(By.xpath("//*[@id=\"reg-input\"]/form/div[5]/div/div/div/div/textarea"));
		description.sendKeys("Include more than one example of duties and responsibilities. Provide past job experience examples that would be helpful in the position. Define what it takes to excel in the role. "
				+ "Ensure the applicant finds opportunity for growth when writing a job spec. "
				+ "The title of a job is arguably the most important element of a great job description. "
				+ "This is what will make11");

		WebElement nextbutton=driver.findElement(By.xpath("//*[@id=\"reg-input\"]"
				+ "/form/div[7]/div/div/button[2]"));
		nextbutton.click();
		Thread.sleep(5000);
		WebElement roundradiobutton=driver.findElement(By.xpath("//*[@id=\"auto\"]"));
		roundradiobutton.click();

		//Actions radiobutton =  new Actions(driver);
		//radiobutton.moveToElement(driver.findElement(By.xpath("//*[@id=\"auto\"]"))).click().perform();

		WebElement rounddropdown=driver.findElement(By.xpath("//*[@id=\"reg-input\"]/table/tbody/div/div/div/div[1]/div[2]/div[1]/div/div/span"));
		rounddropdown.click();

		WebElement technical=driver.findElement(By.id("Technical"));
		technical.click();

		WebElement hoursdropdown=driver.findElement(By.xpath("//*[@id=\"reg-input\"]/table/tbody/div/div/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/span"));
		hoursdropdown.click();

		WebElement hoursselection=driver.findElement(By.xpath("//*[@id=\"3 Hrs\"]"));
		hoursselection.click();

		WebElement savebutton=driver.findElement(By.xpath("//*[@id=\"reg-input\"]/table/tbody/div/div/div/div[1]/div[2]/div[2]/button"));
		savebutton.click();

		//WebElement next1=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[3]/div/div/button[2]"));
		//next1.click();
		driver.navigate().refresh();
		WebElement next1=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[3]/div/div/button[2]"));
		next1.click();
		
		WebElement interviewpanel1=driver.findElement(By.id("8dba21ec-07d3-4595-9202-a0930c4a7c8a"));
		interviewpanel1.click();
		
		WebElement interviewpanel2=driver.findElement(By.id("ecf94bf5-0d11-4573-b834-c4dd5294a14e"));
		interviewpanel2.click();
		                        
		WebElement interviewpanel3=driver.findElement(By.id("0790690b-06fe-4025-8358-ed73fb2f85fe"));
		interviewpanel3.click();
		
		WebElement completebutton=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[1]/div[3]/div/button[2]"));
		completebutton.click();
		driver.navigate().refresh();
		WebElement logout=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/span/span"));
		logout.click();
		WebElement logyes=driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/div[2]/span[1]"));
		logyes.click();
	}

}
