package common;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadPropertiesValue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class BaseClass {

	static ReadPropertiesValue ob = new ReadPropertiesValue();
	public static WebDriver driver = null;
	public static Logger log;
	
    @BeforeTest
	public void setUp() throws IOException {
    	log= LogManager.getLogger(BaseClass.class);
		if (ReadPropertiesValue.getBrowser().equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			log.info("Chrome browser launched successfully");

		} else if (ReadPropertiesValue.getBrowser().equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			log.info("Firefox browser launched successfully");

		} else if (ReadPropertiesValue.getBrowser().equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			log.info("Edge browser launched successfully");
		}
	};
    @AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Teardown successful");
		log.info("browser closed successfully");
	};

}
