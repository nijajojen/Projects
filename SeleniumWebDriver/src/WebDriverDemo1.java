
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class WebDriverDemo1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/nija/Desktop/Selenium/chromedriver85");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='fbNotificationsJewel']/a/div"));
		driver.findElement(By.xpath("//div[@id='100002047375180_1_req_status']/div"));
		String result= driver.findElement(By.xpath("//div[@id='100002047375180_1_req_status']/div")).getText();
		System.out.println(result);
		driver.quit();	
				

	}

}
