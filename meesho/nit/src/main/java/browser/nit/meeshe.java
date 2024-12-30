package browser.nit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meeshe {

	public static void main(String[] args) throws InterruptedException {
		// system.setproperty("webdriver.chrome.driver","C:\Users\Admin\Downloads\chrome-win64\chrome-win64.exe";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.close();
		driver.getCurrentUrl();
	}

}
