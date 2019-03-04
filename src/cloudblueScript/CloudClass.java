package cloudblueScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloudClass {

	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "F:\\Software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//try{
			//WebElement s = driver.findElement(By.name("q"));
			//if( s == null)
			//throw new Exception();
			//s.sendKeys("");
		    //}catch( Exception e){
			//System.out.println("Iteam not found.");
	     	//}
	    Thread.sleep(5000);
		System.out.println("Google is successfully opened...Thankyou.");
		driver.close();
	    
		
	}

    }
