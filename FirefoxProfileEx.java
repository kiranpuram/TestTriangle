package Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
//checking the update
public class FirefoxProfileEx {

	public static void main(String[] args) {
		
		ProfilesIni profiles = new ProfilesIni();
		FirefoxProfile profile = profiles.getProfile("Selenium_User");
		WebDriver driver = new FirefoxDriver(profile);
}
}
