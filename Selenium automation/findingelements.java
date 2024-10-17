package automation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingelements{

	public static void main(String[] args) {
		WebDriver dr= new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.get("https://google.com/");
		dr.manage().window().maximize();
		boolean status =dr.findElement(By.cssSelector("img[class=\"lnXdpd\"]")).isDisplayed();
		if(status==true) {
		System.out.println("Google logo found");
		}else {
			System.out.println("Google logo not found");
		}
		dr.findElement(By.linkText("Gmail")).click();
		dr.navigate().back();
		dr.findElement(By.id("APjFqb")).sendKeys("flowers");
		dr.close();
		}
		
}
