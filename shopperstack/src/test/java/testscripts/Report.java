package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {
	ExtentReports report = new ExtentReports("./Reports/report.html");
	ExtentTest test = report.startTest("LoginTest");
	@Test
	public void reportTest() {
WebDriver driver = new ChromeDriver();
test.log(LogStatus.INFO, "Chrome browser launched");
driver.manage().window().maximize();
test.log(LogStatus.INFO, "chrome browser maximized");
driver.get("https://demowebshop.tricentis.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.partialLinkText("Log in")).click();
driver.findElement(By.id("Email")).sendKeys("anirudhv91@gmail.com");
driver.findElement(By.id("Password")).sendKeys("anir@211");
driver.findElement(By.cssSelector("[value='Log in")).click();
Assert.assertEquals(driver.findElement(By.linkText("Log out")).isDisplayed(), true, "Log out not displayed");
test.log(LogStatus.FAIL,"Log in successful");
report.endTest(test);
driver.quit();
	}	
	public void reportTest2() {
WebDriver driver = new ChromeDriver();
test.log(LogStatus.INFO, "Chrome browser launched");
driver.manage().window().maximize();
test.log(LogStatus.INFO, "chrome browser maximized");
driver.get("https://demowebshop.tricentis.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.partialLinkText("Log in")).click();
driver.findElement(By.id("Email")).sendKeys("anirudhv91@gmail.com");
driver.findElement(By.id("Password")).sendKeys("anir@211");
driver.findElement(By.cssSelector("[value='Log in")).click();
Assert.assertEquals(driver.findElement(By.linkText("Log out")).isDisplayed(), true, "Log out not displayed");
test.log(LogStatus.PASS,"Log in successful");
report.endTest(test);
report.flush();
driver.quit();
	}	
	
}
