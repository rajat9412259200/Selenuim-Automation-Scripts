package RAJATPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.common.SystemCache;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailunredeable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("xxyy@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@id='password']/div[@class='aCsJod oJeWuf']//input[@class='whsOnd zHQkBf']")).sendKeys("07101994");
		//jse.executeScript("window.scrollBy(0,500)",driver.findElement(By.xpath("//content[@class='CwaK9']/span[@class='RveJvd snByac']")));
		//System.out.print("hello");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//content[@class='CwaK9']/span[@class='RveJvd snByac']")));
		driver.findElement(By.xpath("//content[@class='CwaK9']/span[@class='RveJvd snByac']")).click();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		List<WebElement> xpath = driver.findElements(By.xpath("//tr[@class='zA zE']"));
		for(WebElement s:xpath)
		{
			System.out.println(s.getTagName());
			
		}

	}
