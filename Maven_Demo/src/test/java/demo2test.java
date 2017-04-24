import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo2test {

	@Test
	public void testApp() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		System.out.println("Google Launched");
		driver.quit();
	}
}
