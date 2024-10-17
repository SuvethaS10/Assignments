package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdropdown {

	public static void main(String[] args) {
		WebDriver dr= new ChromeDriver();
		dr.get("https://automationintesting.com/selenium/testpage/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title=dr.getTitle();
		System.out.println("title of the page:"+title);
		dr.findElement(By.id("firstname")).sendKeys("Suvetha");
		dr.findElement(By.id("surname")).sendKeys("S");
		WebElement gender=dr.findElement(By.id("gender"));
		Select gr=new Select(gender);
		List<WebElement> options =  gr.getOptions();
		System.out.println("Number of option in dropdown:" +options.size());
		for(int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		gr.selectByVisibleText("Female");
		dr.findElement(By.id("red")).click();
		boolean r= dr.findElement(By.id("red")).isEnabled();
		System.out.println(r);
		dr.findElement(By.xpath("//*[@id=\"contactus\"]/div[5]/div/label/textarea")).sendKeys("I'm foodie");
		dr.findElement(By.id("checkbox1")).click();
		dr.findElement(By.partialLinkText("Our")).click();
		dr.navigate().back();
		WebElement country=dr.findElement(By.id("continent"));
		Select ctry=new Select(country);
		List <WebElement> cntry= ctry.getOptions();
		System.out.println("Number of option in countries:" +cntry.size());
		for(WebElement ct:cntry) {
			System.out.println(ct.getText());
		}
		ctry.selectByIndex(0);
		dr.findElement(By.id("submitbutton")).click();
		System.out.println("Testing Done");
		dr.close();
		
	}

}
