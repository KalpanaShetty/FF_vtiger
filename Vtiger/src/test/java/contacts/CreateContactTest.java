package contacts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.ObjectRepository.ContactsPage;
import com.crm.ObjectRepository.HomePage;

import genericUtility.Baseclass;

public class CreateContactTest extends Baseclass {
@Test
public void createContactTest() {
	HomePage hp= new HomePage(driver);
	boolean adminimg=hp.getAdministratorImg().isDisplayed();
	Assert.assertEquals(adminimg, true);

	hp.getConatcstsLink().click();
	ContactsPage cp= new ContactsPage(driver);
	boolean contactLookUp=cp.getCreateContLookUpImg().isDisplayed();
	Assert.assertEquals(contactLookUp, true);
	cp.getCreateContLookUpImg().click();
	
}
}
