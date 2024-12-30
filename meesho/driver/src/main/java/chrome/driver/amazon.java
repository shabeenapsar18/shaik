package chrome.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\Users\Admin\Downloads\chrome-win64/.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.close();
		driver.quit();
		

	}

}
