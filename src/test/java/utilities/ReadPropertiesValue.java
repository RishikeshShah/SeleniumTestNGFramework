package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesValue {

	public static String getBrowser() throws IOException{
		// We need to FileReader class from java.io and provide the location of properties file
		//System.getProperty("user.dir") return the project location
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		//We create an object of Properties class to load the content of the properties file
		Properties pr = new Properties();
		pr.load(fr);
		String browserName = pr.getProperty("browser");
		return browserName;		
	}
	public  String getUrl(String urlName) throws IOException {
		// We need to FileReader class from java.io and provide the location of properties file
		//System.getProperty("user.dir") return the project location
		FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		//We create an object of Properties class to load the content of the properties file
		Properties pr = new Properties();
		pr.load(fr);
		String url = pr.getProperty(urlName);
		return url;
	}
	public  String getLocaterNopecommerce(String locatorName) throws IOException {
		// We need to FileReader class from java.io and provide the location of properties file
		//System.getProperty("user.dir") return the project location
			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\locatorNopecommerce.properties");
			//We create an object of Properties class to load the content of the properties file
			Properties pr = new Properties();
			pr.load(fr);
			String loc = pr.getProperty(locatorName);
			return loc;
	
	}
	public  String getLocaterDemoWebshop(String locatorName) throws IOException {
		// We need to FileReader class from java.io and provide the location of properties file
		//System.getProperty("user.dir") return the project location

			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\locatorDemoWebshop.properties");
			//We create an object of Properties class to load the content of the properties file
			Properties pr = new Properties();
			pr.load(fr);
			String loc = pr.getProperty(locatorName);
			return loc;
		
	}
	public  String getLocaterSaucelab(String locatorName) throws IOException {
		// We need to FileReader class from java.io and provide the location of properties file
		//System.getProperty("user.dir") return the project location

			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\locaterSauceLab.properties");
			//We create an object of Properties class to load the content of the properties file
			Properties pr = new Properties();
			pr.load(fr);
			String loc = pr.getProperty(locatorName);
			return loc;
		
	}
	public  String getCredentials(String credential) throws IOException {
		// We need to FileReader class from java.io and provide the location of properties file
		//System.getProperty("user.dir") return the project location

			FileReader fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\userCredential.properties");
			//We create an object of Properties class to load the content of the properties file
			Properties pr = new Properties();
			pr.load(fr);
			String loc = pr.getProperty(credential);
			return loc;
		
	}


}
