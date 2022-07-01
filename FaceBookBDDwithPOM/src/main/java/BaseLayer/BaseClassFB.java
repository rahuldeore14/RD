package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassFB {
	public static WebDriver driver;
	public static Properties prop;

	public BaseClassFB() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Rahul\\\\eclipse-workspace\\\\OrangeHRMBDDwithPOM\\\\src\\\\main\\\\java\\\\ConfigPackage\\\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Download\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		driver.get("url");

	}
}