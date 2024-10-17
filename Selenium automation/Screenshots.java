package automation;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	public static void main(String[] args) {
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.get("https://about.google/?fg=1&utm_source=google-IN&utm_medium=referral&utm_campaign=hp-header");
		TakesScreenshot ts = (TakesScreenshot) dr;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"//Screenshot//Googleapppage.png");
		sourceFile.renameTo(targetFile);
		dr.close();
	}

}