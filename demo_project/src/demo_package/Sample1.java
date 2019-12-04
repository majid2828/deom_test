package demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws Exception
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul.lodi\\Desktop\\selenim\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://dnacore-staging.regeneron.regn.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("user_session[login]")).sendKeys("abdul.lodi");
		Thread.sleep(1000);
		driver.findElement(By.name("user_session[password]")).sendKeys("Bangladesh8769$");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
}
