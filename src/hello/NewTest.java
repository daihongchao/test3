package hello;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

import org.testng.annotations.BeforeTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class NewTest {
	public static AppiumDriver driver;
	@BeforeTest
    public static void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities(); 
       	capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
       	capabilities.setCapability("noReset", true);
    	capabilities.setCapability("platformName", "iOS");
    	capabilities.setCapability("platformVersion", "8.4");
        capabilities.setCapability("deviceName", "iPhone Simulator");
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities); 
    }

   @Test
   public void g() {
	 System.out.println("my hellowrld！");
	 String a=driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[2]")).getText();
	 assertEquals(a, "");	
	 System.out.println("Finish！");
	 
   }
@AfterTest
   public static void tearDown() throws Exception {
       driver.quit();
   }
}

