package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PHPTravelsTest {
	
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "G:\\Tugas\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.phptravels.net/");
	}
	
	public void loginSignUp() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn-outline-primary > .ladda-label")).click();
	}
	
	public void searchFlights() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("nav > ul > li:nth-child(3) > .waves-effect")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".col-lg-4:nth-child(2) .col-7")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		PHPTravelsTest obj = new PHPTravelsTest();
		obj.launchBrowser();
		obj.loginSignUp();
		obj.searchFlights();
	}

}
