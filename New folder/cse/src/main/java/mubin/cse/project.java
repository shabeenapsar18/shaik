package mubin.cse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class project {


	public static void main(String[] args) throws InterruptedException {
		//system.set Proper("webdriver.chrome.driver","chromedriver-win64/.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/in/");
		Thread.sleep(4000);
		//scroll by
		//class name reference variable = new class name();
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0,3000).perform();
		//radio Button click
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(6000);
		driver.findElement(By.name("sex")).click();
		WebElement femaleRadiobutton = driver.findElement(By.xpath("//input[@value = female]"));
		//syntax:if(condition){
		//body-SYSOUT//}
		//else{//SYSOUT//}
		if(femaleRadiobutton.isSelected()) {
			System.out.println("display female radio button is selected");
		}
		else
		{
			System.out.println("display male & custom radio buttons are unslected");
		
		}
		
		
		

	}

}
