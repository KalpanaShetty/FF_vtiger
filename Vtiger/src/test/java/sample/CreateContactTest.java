
package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateContactTest {
@Test
public void createContact() throws Throwable {
WebDriver driver= new ChromeDriver();
driver.get("http://localhost:8888");
driver.manage().window().maximize();
Thread.sleep(20);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
//Login page verification
String loginButtonAttributeText = driver.findElement(By.id("submitButton")).getAttribute("value");
System.out.println(loginButtonAttributeText);
Assert.assertEquals(loginButtonAttributeText, "Login");

driver.findElement(By.name("user_name")).sendKeys("admin");
driver.findElement(By.name("user_password")).sendKeys("admin");
driver.findElement(By.id("submitButton")).click();
Thread.sleep(20);
//Home Page Verification
boolean HomeSisplayed = driver.findElement(By.xpath("//a[contains(text(),\"Home\")]")).isDisplayed();
Assert.assertEquals(HomeSisplayed, true);
//a[@class="hdrLink"]
//a[contains(text(),"Home")]
driver.findElement(By.linkText("Contacts")).click();
//Contacts page verification
boolean contactsDisplayed = driver.findElement(By.xpath("//a[.=\"Contacts\" and @class=\"hdrLink\"]")).isDisplayed();
Assert.assertEquals(contactsDisplayed, true);

//driver.close();
	
}
}
