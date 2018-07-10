package co.nz.enhanceconsulting.cucumberappium.keywords;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class ApplicationManagement{
	
	public String openApplication(String remoteUrl) throws Throwable {
		DesiredCapabilities androidDesiredCapabilities = DesiredCapabilities.android();
		androidDesiredCapabilities.setCapability("platformName", "Android");
		androidDesiredCapabilities.setCapability("platformVersion", "6");
		androidDesiredCapabilities.setCapability("deviceName", "Pixel API 23");
		androidDesiredCapabilities.setCapability("app", "/Users/jarvis2/Documents/AppiumWorkspace/apk/com.tumblr.apk");
		androidDesiredCapabilities.setCapability("appActivity", "com.tumblr.onboarding.PreOnboardingActivity");
		androidDesiredCapabilities.setCapability("clearSystemFiles", "true");
		androidDesiredCapabilities.setCapability("newCommandTimeout", "60");
		System.out.print("Setting desired capabilities and launching application.");

		URL androidRemoteURL = new URL(remoteUrl);
		RemoteWebDriver remoteWebdriver = new RemoteWebDriver(androidRemoteURL, androidDesiredCapabilities);
		String sessionID = remoteWebdriver.getSessionId().toString();
		System.out.printf("Session ID %s", sessionID);
		
		return sessionID;
	}
}