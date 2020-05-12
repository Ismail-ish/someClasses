package technatomy

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Simple class which displays the "About FCC" page
public class fcc_About{

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//Open target URL and maximize browser window
		driver.get("https://www.fcc.gov/");
		driver.manage().window().maximize();
		
		//Driver should wait 3 seconds before searching for element(s)		
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		//Navigate to "About FCC page"
		driver.findElement(By.xpath("//*[@id=\'block-accessible-mega-menu-main-menu-enhanced\']/ul/li[1]/a/span")).click();
		
	}

}
