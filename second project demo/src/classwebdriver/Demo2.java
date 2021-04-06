package classwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Demo2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\chrome version\\chromedriver.exe");
  WebDriver driver= new ChromeDriver();
  driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
  WebElement username=driver.findElement(By.id("txtUsername"));
  if(username.isEnabled())
  {
	  username.clear();
	  username.sendKeys("Admin");
	  	  
  }
  if(username.isDisplayed())
  {
	  WebElement pwd =driver.findElement(By.id("txtPassword"));
	  pwd.clear();
	  pwd.sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	 
	 
	  java.util.List<WebElement> link =driver.findElements(By.tagName("a"));
	  System.out.println(link.size());
	  for(int i=0;i<link.size();i++)
	  {
		  System.out.println(link.get(i).getText());
	  }
  }
	  else 
	  {
		  System.out.println("Not displayed");
		
	}
	  
		  
	  
  }
	  
	}


