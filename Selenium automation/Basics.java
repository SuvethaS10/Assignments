package automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Basics {
	public static void main(String[] args) {
		//To open the chrome browser
		WebDriver driver = new ChromeDriver();
		//To open the URL
		driver.get("https://www.quora.com/");
		//To validate the title of the page
		String s=driver.getTitle();
		if(s.equals("Quora - A place to share knowledge and better understand the world")) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
		//To close the browser
		driver.quit();
	}

}
