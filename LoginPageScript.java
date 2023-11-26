package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageScript {

	public static void main(String[] args) {
		 System.setProperty("'webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");//driver file
		 ChromeDriver driver=new ChromeDriver();//launch the browser
		 driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("priyankag5050@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Pass@123");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.close();

	}

}
