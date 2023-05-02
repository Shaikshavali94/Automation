package com.pack.airlines;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripDateSelection {
	
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");		

        // Initialize a new WebDriver instance
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        // Navigate to the MakeMyTrip website
        driver.get("https://www.makemytrip.com/");

        // Wait for the page to load
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Click the "From" input field and enter the origin city
        WebElement fromInput = driver.findElement(By.id("fromCity"));
        fromInput.click();
        fromInput.sendKeys("Hyderabad");

        // Wait for the city dropdown to appear and select the first option
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement fromCityOption = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"));
        fromCityOption.click();

        // Click the "To" input field and enter the destination city
        WebElement toInput = driver.findElement(By.id("toCity"));
        toInput.click();
        toInput.sendKeys("Kolkata");

        // Wait for the city dropdown to appear and select the first option
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement toCityOption = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']"));
        toCityOption.click();

        // Click the "Departure Date" input field
        WebElement departureInput = driver.findElement(By.xpath("//span[text()='Departure']"));
        departureInput.click();

        // Wait for the calendar to appear and select the desired date
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement departureDate = driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sun Apr 30 2023')]"));
        departureDate.click();

        // Close the browser
       // driver.quit();
    }
}
