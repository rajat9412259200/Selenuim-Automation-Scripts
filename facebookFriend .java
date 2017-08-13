package package2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class facebookFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("xxxx@df.com");//enter username
		driver.findElement(By.id("pass")).sendKeys("1234556");//enter password
		driver.findElement(By.xpath("//input[@value='Log In']")).click();//click on login button
	   driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//div[@class='_1k67 _4q39']/a//span")).click();//click on your link so that you go to your profile when facebook home page is open
	   driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	  System.out.println(driver.findElement(By.xpath("//div[@class='fsm fwn fcg']/a[@class='_39g6']")).isEnabled());
	   Actions act= new Actions(driver);
	   int livefb=Integer.parseInt(driver.findElement(By.xpath("//a[@class='_6-6']/span[@class='_gs6']")).getText());
	   int total=0;
	   act.moveToElement(driver.findElement(By.xpath("//div[@class='fsm fwn fcg']/a[@class='_39g6']"))).perform();
	   driver.findElement(By.xpath("//div[@class='fsm fwn fcg']/a[@class='_39g6']")).click();//click your friend link
	   List<WebElement> fb1= driver.findElements(By.xpath("//ul[@class='uiList _262m _4kg']/li//div[@class='clearfix _5qo4']//div[@class='fsl fwb fcb']/a"));//find all friend
	   for(WebElement loop:fb1)
	   {
		   System.out.println(loop.getText());
		   act.moveToElement(loop).perform();
		   total++;
	   }
	   int i=1,flag=0;
	   List<WebElement> fb2= driver.findElements(By.xpath("//ul[@class='uiList _262m expandedList _4kg'][1]/li//div[@class='clearfix _5qo4']//div[@class='fsl fwb fcb']/a"));
	   String dxath1="//ul[@class='uiList _262m expandedList _4kg'][1]/li//div[@class='clearfix _5qo4']//div[@class='fsl fwb fcb']/a";
	   String dx2=dxath1;
	   System.out.println("hello");
	   System.out.println(driver.findElement(By.xpath(dxath1)).isDisplayed());
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  while(true)
	  {
		  //System.out.println("hello+x");
		  if(driver.findElement(By.xpath(dxath1)).isDisplayed())
		  {
			  dxath1="//ul[@class='uiList _262m expandedList _4kg']["+i+"]/li//div[@class='clearfix _5qo4']//div[@class='fsl fwb fcb']/a";
			  int j=i;
			  fb2=driver.findElements(By.xpath(dxath1));
				   for(WebElement loop:fb2)
				   {
					   System.out.println(loop.getText());
					   act.moveToElement(loop).perform();
					   total++;
					  
				   }
					   fb2.removeAll(fb2);
					   ++i;
					   ++j;
					   try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				     }
					   
					   dx2="//ul[@class='uiList _262m expandedList _4kg']["+j+"]/li//div[@class='clearfix _5qo4']//div[@class='fsl fwb fcb']/a";
					   System.out.println(driver.findElement(By.xpath(dx2)).isDisplayed()+dx2);
					   if(driver.findElement(By.xpath(dx2)).isDisplayed()==false)
					   {
					   System.out.println(driver.findElement(By.xpath(dxath1)).isDisplayed()+dxath1);
					   flag=1;
					  // break;
					   }
		}
			 /* if(driver.findElement(By.xpath(dx2)).isDisplayed()==false)
			   {
				  System.out.println(driver.findElement(By.xpath(dxath1)).isDisplayed()+dxath1);
				  break;
			   }*/
			  System.out.println("loop");
			  
			 /*else if(driver.findElement(By.xpath(dxath1)).isDisplayed()==false)
			  {
				  System.out.println(dxath1);
				  break;
			  }*/
			  if(flag==1)
			  {
				  System.out.println("break time");
				  break;
			  }
	  }
	  System.out.println(total);
	  act.moveToElement(driver.findElement(By.xpath("//div[@id='userNavigationLabel']"))).perform();//logout code
	  driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  act.moveToElement(driver.findElement(By.xpath("//a[@class='_54nc']//span[@class='_54nh']/form"))).click();
	  //driver.findElement().click();
	   
	   
	   
	   /*try
	   {
		   String dxpath="//ul[@class='uiList _262m expandedList _4kg'][1]/li[1]//div[@class='clearfix _5qo4']//div[@class='fsl fwb fcb']/a";
		   String d1="";String d2="";
		   int i=1,j=1;
		   while(driver.findElement(By.xpath(dxpath)).isDisplayed())
		   {
			   d1="//ul[@class='uiList _262m expandedList _4kg']["+i+"]/li[1]//div[@class='clearfix _5qo4']//div[@class='fsl fwb fcb']/a";
			   if(driver.findElement(By.xpath(d1)).isDisplayed())
			   {
				  d2=dxpath;
				  while(driver.findElement(By.xpath(d2)).isDisplayed())
				  {
					  d2="//ul[@class='uiList _262m expandedList _4kg'][i]/li["+j+"]//div[@class='clearfix _5qo4']//div[@class='fsl fwb fcb']/a";
					  if(driver.findElement(By.xpath(d2)).isDisplayed())
					  System.out.println(driver.findElement(By.xpath(d2)).getText());
					  else
					  {
						  break;
					  }
					  j++;
				  }
			   }
			   else
			   {
				   break;
			   }
			   i++;
		   }
	   }
	   catch(Exception e)
	   {
		  e.printStackTrace();
	   }*/
	   
	   
	   
	   ////ul[@class='uiList _262m _4kg']/li
	   ////ul[@class='uiList _262m expandedList _4kg'][26]/li[1]//div[@class='clearfix _5qo4']//div[@class='fsl fwb fcb']/a
	   
	   
	}

}
