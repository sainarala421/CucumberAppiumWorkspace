package resources.mobile.keywords.global;

import co.nz.enhanceconsulting.cucumberappium.keywords.ApplicationManagement;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class KeywordsApplicationManagement{
	public static ApplicationManagement applicationInstance = new ApplicationManagement();
	protected static String remoteURL = System.getProperty("remoteURL", "");
	
	@Before
	public void launch_mobile_application () throws Throwable{
		System.out.print("Launching application...");
		applicationInstance.openApplication(remoteURL);
	}

    @Given("^User opens app \"(.*?)\"$")
    public void user_opens_app(String application) throws Throwable{
    	System.out.printf("Opening app %s", application);
    }
}