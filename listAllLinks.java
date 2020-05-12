package Technatomy

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Simple class which displays the total number of links on "FCC.GOV" and 
//then prints it out on this Eclipse console. 

public class listAllLinks{

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Open target URL and maximize browser window
		driver.get("https://www.fcc.gov/");
		driver.manage().window().maximize();
		
		//Driver should wait 3 seconds before searching for element(s)		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//Prints how many links are on a page
		System.out.println(links.size());
		 
		//Prints out all of the links on a page
		for (int i = 1; i<=links.size(); i=i+1)
		 
		{
		 
		   System.out.println(links.get(i).getText());
		 
		 }
				
	}

}
