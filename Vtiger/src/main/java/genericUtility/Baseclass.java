package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;

public class Baseclass {
public DatabaseUtility dLib= new DatabaseUtility();
public ExcelUtility eLib= new ExcelUtility();
public FileUtility fLib= new FileUtility();
public JavaUtility jLib= new JavaUtility();
public WebDriverUtility wLib= new WebDriverUtility();

public WebDriver driver;
public static WebDriver sdriver;
@BeforeSuite
public void configBS() throws Throwable {
	//dLib.connectToDB();
	System.out.println("DB connection done");
}
@BeforeClass
public void configBC() throws Throwable {
	String Browser=fLib.readDataFromPropertryFile("browser");
	
	System.out.println(Browser);
	if(Browser.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
	}else if(Browser.equalsIgnoreCase("firefox")){
		driver= new FirefoxDriver();
	}else {
		driver= new ChromeDriver();
	}
	wLib.maximizeWindow(driver);
	System.out.println("Browser Launched");
}
@BeforeMethod
public void configBM() throws Throwable {
String	URL=fLib.readDataFromPropertryFile("url");
String Username = fLib.readDataFromPropertryFile("username");
String Password=fLib.readDataFromPropertryFile("password");
driver.get(URL);
wLib.waitForPageLoad(driver);
LoginPage lp= new LoginPage(driver);
lp.login(Username, Password);
	System.out.println("Login to App is done");
}
@AfterMethod
public void configAM() {
	HomePage hp= new HomePage(driver);
	hp.signOut(driver);
	System.out.println("Logout from the App is done");
}
@AfterClass
public void configAC() {
	driver.quit();
	System.out.println("close the browser");
}
@AfterSuite
public void configAS() throws Throwable {
	//dLib.closeDB();
	System.out.println("Disconnect from the Database");
	
}
}
