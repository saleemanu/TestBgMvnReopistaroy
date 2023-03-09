package testNGBaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(dataProvider = "logindata")
	public void loginclick(String username, String password) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		driver.close();

	}

	@DataProvider
	public Object[][] logindata() {
		Object data[][] = { 
				{ "standard_user", "secret_sauce" }, 
				{ "locked_out_user", "secret_sauce" },
				{ "problem_user", "secret_sauce" }, 
				{ "performance_glitch_user", "secret_sauce" } };
		return data;
	}
}
