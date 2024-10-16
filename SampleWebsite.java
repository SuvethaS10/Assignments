package marathon1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleWebsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Suvetha");
		driver.findElement(By.xpath("//input[@placeholder='Enter EMail']")).sendKeys("suvetha10@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9876534120");
		driver.findElement(By.id("textarea")).sendKeys("Nethaji Nagar,Trichy");
		driver.findElement(By.id("female")).click();
		List<WebElement> days =driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Number of days listed in option:" +days.size());
		for(int i=1; i<=5; i++) {
			days.get(i).click();
		}
		WebElement country= driver.findElement(By.id("country"));
		Select cntry = new Select(country);
		cntry.selectByVisibleText("India");
		WebElement cr =driver.findElement(By.id("colors"));
		Select color = new Select(cr);
		color.selectByIndex(0);
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.linkText("10")).click();
		driver.findElement(By.name("SelectedDate")).click();
		WebElement dt =driver.findElement(By.className("ui-datepicker-month"));
		Select date2 = new Select(dt);
		date2.selectByValue("8");
		WebElement mt =driver.findElement(By.className("ui-datepicker-year"));
		Select month = new Select(mt);
		month.selectByIndex(7);
		driver.findElement(By.linkText("9")).click();
		List<WebElement> table1=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		System.out.println("Size of table is:" +table1.size());
		List <WebElement> header= driver.findElements(By.xpath("//table[@name='BookTable']//th"));
	    System.out.println("No.of header in table1:"+header.size());   
		for(int i=2; i<table1.size(); i++) {
			for(int j=1; j<header.size(); j++) {
				String value= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value+ "\t");}
				System.out.println(); 
			}
		for(int i=2; i<table1.size(); i++) {
		for(int j=1; j<header.size(); j++) {
		String value =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
		if(value.equals("Mukesh")) {
					System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[3]")).getText());
			}		
		}}
		List<WebElement> tablepage= driver.findElements(By.xpath("//*[@id='pagination']//li"));
		System.out.println("The Size of the table is:" +tablepage.size());
		List<WebElement> header2 = driver.findElements(By.xpath("//table[@id='productTable']//th"));
		System.out.println("The number of column is:" +header2.size());
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']//tr"));
		System.out.println(rows.size());
		for(int i=1; i<=tablepage.size(); i++) {
			if(i>=1) {
				 WebElement active_page = driver.findElement(By.xpath("//*[@id='pagination']//li["+i+"]"));
				 active_page.click();}
			for(int r=1; r<rows.size(); r++) {
				String id=driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr["+r+"]")).getText();
				driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr["+r+"]/td[4]/input")).click();
				System.out.println(id);
				}
			  }
		driver.findElement(By.xpath("//*[@id=\"input1\"]")).sendKeys("Welcome");
		driver.findElement(By.xpath("//button[@class=\"button btn1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"input2\"]")).sendKeys("to");
		driver.findElement(By.xpath("//*[@class=\"button btn2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"input3\"]")).sendKeys("Selenium Automation");
		driver.findElement(By.xpath("//*[@class=\"button btn3\"]")).click();
		if(driver.findElement(By.id("mobiles")).isDisplayed()) {
			System.out.println("Mobile lable is displayed");
		}
		if(driver.findElement(By.id("moto")).isDisplayed()) {
			System.out.println("Samsung Lable is displayed");
		}
		driver.findElement(By.linkText("Dell")).click();
		driver.navigate().back();
		driver.findElement(By.className("wikipedia-search-input")).sendKeys("Selenium");
		driver.findElement(By.className("wikipedia-search-button")).click();
		List<WebElement> options= driver.findElements(By.id("wikipedia-search-result-link"));
		System.out.println("The list of options displayed by Wikipedia Search:" +options.size());
		for(int p=0; p<options.size(); p++) {
			System.out.println("Wikipedia search options:" +options.get(p).getText());
			}
		WebElement link=driver.findElement(By.linkText("Selenium"));
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
		driver.findElement(By.id("alertBtn")).click();
		driver.switchTo().alert().accept();
		System.out.println("Alert1 closed");
		driver.findElement(By.id("confirmBtn")).click();
		driver.switchTo().alert().dismiss();
		System.out.println("Alert2 closed");
		driver.findElement(By.id("promptBtn")).click();
		Alert a=driver.switchTo().alert();
		System.out.println("Alert3 closed");
		a.sendKeys("Selenium");
		a.accept();
		driver.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"HTML5\"]/div[1]/button")).click();	
		System.out.println("Toggle button test done");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));	
		Actions act=new Actions(driver);
		act.doubleClick(button).build().perform();
		System.out.println("Double click tested");
		WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));	
		WebElement target=driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).build().perform();
		System.out.println("drag and drop option tested");
		WebElement slide = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		System.out.println(slide.getLocation());
		act.dragAndDropBy(slide, 100, 0).perform();
		System.out.println("slider test completed");
		System.out.println("Test completed successfully");
		} 
	}
