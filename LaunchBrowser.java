package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/main");
		dr.manage().window().maximize();
		dr.findElement(By.id("username")).sendKeys("DemoSalesmanager");
		dr.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		dr.findElement(By.partialLinkText("CRM/SFA")).click();
		System.out.println("URL launched successfully");	
	}

}
