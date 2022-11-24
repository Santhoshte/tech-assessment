package TestPage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.openmrs.page.Loginpage;

public class Assessment extends BaseClass{
	
	public String screenshotFilepath = "C:\\Users\\Admin\\eclipse-workspace\\AssessmentTask\\target\\TestEvidences\\" ;
	public String propFilepath = "C:\\Users\\Admin\\eclipse-workspace\\AssessmentTask\\src\\test\\resources\\config.properties";
	public String patientId = null;
	Loginpage page = new Loginpage();
	
	@Test
	public void techAssessment() throws Exception {
		launchBrowser(readProperty(propFilepath, "browser"));
		launchURL(readProperty(propFilepath, "url"));
		maxBrowser();
		implicitWait();
		screenshot(screenshotFilepath);
		enterText(page.userName, (readProperty(propFilepath, "user")));
		enterText(page.password, (readProperty(propFilepath, "pwd")));
		clickElement(page.outpatientClinic);
		clickElement(page.login);
		screenshot(screenshotFilepath);
		assertion(page.admin, readProperty(propFilepath, "assert"));
		System.out.println("user is "+ getData(page.admin)+" page is verified");
		clickElement(page.clickRegisterPatient);
		screenshot(screenshotFilepath);
		
		enterText(page.givenName,readProperty(propFilepath, "gName"));
		enterText(page.familyName,readProperty(propFilepath,"fName"));		
		clickElement(page.nextButton);
		clickElement(page.gender);
		clickElement(page.nextButton);
		enterText(page.birthDay,readProperty(propFilepath, "bDay"));
		clickElement(page.selectBirthMonth);
		clickElement(page.birthMonth);
		enterText(page.BirthYear,readProperty(propFilepath, "bYear"));
		clickElement(page.nextButton);
		enterText(page.address1, readProperty(propFilepath,"add1"));
		enterText(page.address2,readProperty(propFilepath, "add2"));
		enterText(page.cityVillage,readProperty(propFilepath, "Village"));
		enterText(page.stateProvince,readProperty(propFilepath, "state"));
		enterText(page.country,readProperty(propFilepath, "co"));
		enterText(page.postalCode,readProperty(propFilepath, "pin"));
		clickEnter(page.nextButton);
		enterText(page.phoneNumber,readProperty(propFilepath, "mob"));
		clickElement(page.nextButton);		
		clickElement(page.nextButton);
		screenshot(screenshotFilepath);// verify details
		assertionSub(page.NameAss, readProperty(propFilepath, "assert1"));
		System.out.println("Name is "+substr(page.NameAss) +" And Name is verified");
		assertionSub(page.GenderAss, readProperty(propFilepath, "assert2"));
		System.out.println("Gender is "+ substr(page.GenderAss)+" And Gender is verified");
		assertionSub(page.BirthdayAss, readProperty(propFilepath, "assert3"));
		System.out.println("Birthday is "+ substr(page.BirthdayAss)+" And Birthday date is verified");
		assertionSub(page.AddressAss, readProperty(propFilepath, "assert4"));
		System.out.println("Address is "+ substr(page.AddressAss)+" And Address is verified");
		assertionSub(page.PhoneNoAss, readProperty(propFilepath, "assert5"));
		System.out.println("Phone Number is "+ substr(page.PhoneNoAss)+" And Phone Number is verified");
		clickElement(page.submit);
		screenshot(screenshotFilepath);
		
		clickElement(page.startVisit1);
		clickElement(page.clickConfirm);
		Thread.sleep(3000);
		clickElement(page.attachments);// verify attachment file and date
		clickElement(page.dropFile); // upload file
		Thread.sleep(4000);
		uploadFile("C:\\Users\\Admin\\Downloads\\demo.jpg");
		enterText(page.textCaption,readProperty(propFilepath, "txt"));
		screenshot(screenshotFilepath);
		
		clickElement(page.uploadFile);
		clickElement(page.clickText);
		screenshot(screenshotFilepath);
		
		clickElement(page.endVisit1);
		clickElement(page.clickYes);

		clickElement(page.startVisit2);
		clickElement(page.clickConfirm);

		clickElement(page.captureVitals);
		enterText(page.height,readProperty(propFilepath, "high"));
		clickElement(page.nextButton);		
		enterText(page.weight,readProperty(propFilepath, "wgt"));
		clickElement(page.nextButton);
		screenshot(screenshotFilepath);
		
		clickElement(page.nextButton); 
		clickElement(page.saveForm);
		screenshot(screenshotFilepath);
		
		clickElement(page.clickSave);
		clickElement(page.endVisit2);
		clickElement(page.confirm01);
		Thread.sleep(3000);
		clickElement(page.head);
		screenshot(screenshotFilepath);
		
		clickElement(page.mergeVisits);
		clickElement(page.merge1);
		clickElement(page.merge2);
		clickElement(page.mergeAll);
		clickElement(page.rtn);
		screenshot(screenshotFilepath);
		
		clickElement(page.addPastVisit);
		screenshot(screenshotFilepath);
		
		clickElement(page.cancelprb);
		patientId = getTextFromElement(page.patientID,"innerText"); 
		System.out.println("Generated PatientId is : " + patientId);
		screenshot(screenshotFilepath);
		
		clickElement(page.deletePatient);
		enterText(page.reason,readProperty(propFilepath, "rsn"));
		screenshot(screenshotFilepath);
		
		clickElement(page.confirm);
		enterText(page.searchOldId,patientId);
		Thread.sleep(3000);
		screenshot(screenshotFilepath);
		
		Thread.sleep(3000);
		
		quit();
		
	}
}
