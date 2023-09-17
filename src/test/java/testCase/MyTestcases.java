package testCase;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.BaseClass;
import common.MyRetry;
import utilities.ReadPropertiesValue;


@Listeners(common.Listner.class)
public class MyTestcases extends BaseClass{

    @Test
	public static void loginNopeCommerce() throws Throwable {
    	ReadPropertiesValue pv = new ReadPropertiesValue();
    	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pv.getUrl("urlNopecommerce"));
		log.info("Nopecommerce App launched successfully");
		try {
		
			WebElement inputEmail = driver.findElement(By.xpath(pv.getLocaterNopecommerce("emailTextField")));
			inputEmail.clear();
			inputEmail.sendKeys(pv.getCredentials("userNopecommerce"));
			
			//Thread.sleep(3000);
			// Explicit wait
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20) );
	        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(pv.getLocaterNopecommerce("passwordField")))).sendKeys(pv.getCredentials("passwordZoho"));

			WebElement inputPassword = driver.findElement(By.cssSelector(pv.getLocaterNopecommerce("passwordField")));
			inputPassword.clear();
			inputPassword.sendKeys(pv.getCredentials("passwordNopecommerce"));
	        driver.findElement(By.xpath(pv.getLocaterNopecommerce("submitBtn"))).click();
	    	Thread.sleep(3000);
	    	String title = driver.getTitle();
	    	System.out.println(title);
	    	Assert.assertEquals(title, "Dashboard / nopCommerce administration");
	    	
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			log.error("Exception occured", new Exception("Element Not Found"));
			Assert.assertTrue(false);
		
		}	
	}
    
    @Test
	public static void logInDemoWebshop() throws Throwable {
    	ReadPropertiesValue pv = new ReadPropertiesValue();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pv.getUrl("urlDemoWebshop"));
		log.info("DemoWebshop App launched successfully");
		try {
		driver.findElement(By.xpath(pv.getLocaterDemoWebshop("loginBtn"))).click();		
		driver.findElement(By.xpath(pv.getLocaterDemoWebshop("emailTextField"))).sendKeys(pv.getCredentials("userDemoWebshop"));
		driver.findElement(By.cssSelector(pv.getLocaterDemoWebshop("passwordField"))).sendKeys(pv.getCredentials("PasswordDemoWebshop"));
        driver.findElement(By.xpath(pv.getLocaterDemoWebshop("submitBtn"))).click();
    	Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			log.error("Exception occured", new Exception("Element Not Found"));
			Assert.assertTrue(false);
		}
    		
	}
    @Test(retryAnalyzer = MyRetry.class)
	public static void logInSauceLab() throws Throwable {
    	ReadPropertiesValue pv = new ReadPropertiesValue();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pv.getUrl("urlSauceLab"));	
		log.info("SauceLab App launched successfully");
		try {
		driver.findElement(By.xpath(pv.getLocaterSaucelab("Let's fail this test"))).sendKeys(pv.getCredentials("userSauceLab"));
		driver.findElement(By.xpath(pv.getLocaterSaucelab("passwordField"))).sendKeys(pv.getCredentials("passwordSauceLab"));
        driver.findElement(By.xpath(pv.getLocaterSaucelab("submitBtn"))).click();
    	Thread.sleep(3000);

		}
		catch(Exception e) {
			System.out.print(e.getMessage());
			log.error("Exception occured", new Exception("Element Not Found"));
			Assert.assertTrue(false);
		}
    
    		
	}
    
    }



