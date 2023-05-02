package com.pack.airlines;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlightBookingTest {

	private WebDriver driver;

	@BeforeClass
	public void setUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void selectFromCity() throws Throwable {

		// Enter Depart city
		driver.findElement(By.id("fromCity")).click();
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']/label")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input"))
				.sendKeys("Kolkata");

		List<WebElement> dynamicList = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));

		for (int i = 0; i < dynamicList.size(); i++) {
			String flightsList = dynamicList.get(i).getText();
			System.out.println("Flight available from the City ::" + flightsList);
			if (flightsList.contains("Kolkata")) {
				dynamicList.get(i).click();
				break;
			}
		}
	}

	@Test(priority = 2)
	public void selectToCity() throws Throwable {

		// Enter To city
		driver.findElement(By.id("toCity")).click();
		//driver.findElement(By.xpath("//div[@class='fsw_inputBox searchToCity inactiveWidget ']/label")).click();
		Thread.sleep(1000);
		driver.findElement(By
				.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin makeFlex column spaceBetween']/div/input"))
				.sendKeys("Hyderabad");

		List<WebElement> dynamicList = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));

		for (int i = 0; i < dynamicList.size(); i++) {
			String flightsList = dynamicList.get(i).getText();
			System.out.println("Flights available to City ::" + flightsList);
			if (flightsList.contains("Hyderabad")) {
				dynamicList.get(i).click();
				break;
			}
		}
	}

	@Test(priority = 3)
	public void selectDateAndSearchFlights() throws InterruptedException {
		// Click the "Departure Date" input field
		WebElement departureInput = driver.findElement(By.xpath("//span[text()='Departure']"));
		departureInput.click();

		// Wait for the calendar to appear and select the desired date
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement departureDate = driver
				.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sun May 28 2023')]"));
		departureDate.click();
		WebElement search = driver.findElement(By.xpath("// p[@class='makeFlex vrtlCenter ']/a"));
		Thread.sleep(500);
		search.click();
	}

//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
}
