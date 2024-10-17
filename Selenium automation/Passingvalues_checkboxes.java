package automation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class Passingvalues_checkboxes {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.get("https://www.quora.com/");
		boolean s=dr.findElement(By.className("logo_fill")).isDisplayed();
		if(s==true) {
			System.out.println("Logo of the page is present");
		}else {
			System.out.println("Logo of page is missing");
		}
		dr.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("shasu1004@gmail.com");
		dr.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Suve@1004");
		//Automation does not support captcha
		//dr.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		//dr.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/div/div[2]/div[2]/div[4]/button/div/div/div")).click();
		String id=dr.getWindowHandle();
		System.out.println(id);		
		dr.close();
	}

}
