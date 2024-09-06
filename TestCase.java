package demo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\SQA\\Selenium Automation Course\\Pre-requisites Softwares\\browser\\Chrome\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);	
		System.out.println("Title of this website is " + driver.getTitle());
	}

}
