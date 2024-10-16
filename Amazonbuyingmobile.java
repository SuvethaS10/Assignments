package marathon1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazonbuyingmobile {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//*[@id=\"p_123/648962\"]/span/a/div")).click();
		driver.findElement(By.xpath("//*[@id=\"p_123/418063\"]/span/a/div/label/i")).click();
		/*WebElement a=driver.findElement(By.className ("a-native-dropdown a-declarative"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"s-result-sort-select\"]/option[2]]"));
		Actions act =new Actions(driver);
		act.moveToElement(a).moveToElement(b).perform();*/
		String s=driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]")).getText();
		System.out.println("The total no of available items:" +s);
		List<WebElement> search =driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
		for (int i=0; i<search.size(); i++) {
	             System.out.println(search.get(i).getText());
			}
		driver.findElement(By.xpath("//div[@data-index=\"2\"]")).click();
		List<String>ids =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ids.get(1));
		String a=driver.getTitle();
		System.out.println(a);
		
	}

}
