package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import Grid.BaseClass;

public class GridExecution extends BaseClass{
	@Test
	public void prjtTest() throws MalformedURLException
	{
		driver.get("https://www.facebook.com");
		URL url=new URL("http://192.168.20.1:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("http://rmgtestingserver/domain/Supply_Chain_Management/");
	}
}
