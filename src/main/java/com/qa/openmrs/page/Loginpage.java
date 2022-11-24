package com.qa.openmrs.page;

import org.openqa.selenium.By;

public class Loginpage {
	public By userName = By.xpath("//label[normalize-space()='Username:']//following-sibling::input");
	public By password = By.xpath("//label[normalize-space()='Password:']//following-sibling::input");
	public By outpatientClinic = By.xpath("//*[normalize-space()='Outpatient Clinic']");
	public By login = By.xpath("//input[@value='Log In']");

	public By clickRegisterPatient = By.xpath("//*[normalize-space()='Register a patient']");

	public By givenName = By.xpath("//input[@name='givenName']");
	public By familyName = By.xpath("//input[@name='familyName']");
	public By nextButton = By.xpath("//button[@id='next-button']");
	public By gender = By.xpath("//option[contains(text(),'Male')]");
	public By birthDay = By.xpath("//input[@name='birthdateDay']");
	public By selectBirthMonth = By.xpath("//select[@name='birthdateMonth']");
	public By birthMonth = By.xpath("//option[text()='January']");
	public By BirthYear = By.xpath("//input[@name='birthdateYear']");
	public By address1 = By.xpath("//input[@id='address1']");
	public By address2 = By.xpath("//input[@id='address2']");
	public By cityVillage = By.xpath("//input[@id='cityVillage']");
	public By stateProvince = By.xpath("//input[@id='stateProvince']");
	public By country = By.xpath("//input[@id='country']");
	public By postalCode = By.xpath("//input[@id='postalCode']");
	public By phoneNumber = By.xpath("//input[@name='phoneNumber']");

	public By relationType = By.xpath("//select[@id='relationship_type']");
	public By sibling = By.xpath("//option[normalize-space()='Sibling']");
	public By personName = By.xpath("//input[@placeholder='Person Name']");
	public By submit = By.xpath("//input[@id='submit']");

	public By startVisit1 = By.xpath("//div[contains(text(),'Start Visit')]");
	public By clickConfirm = By.xpath("//button[@id='start-visit-with-visittype-confirm']");
	public By attachments = By.xpath("//a[normalize-space()='Attachments']");
	public By dropFile = By.xpath("//div[text()='Click or drop a file here.']");

	public By textCaption = By.xpath("//textarea[@placeholder='Enter a caption']");
	public By uploadFile = By.xpath("//button[text()='Upload file']");
	public By clickText = By.xpath("//i[@class='icon-chevron-right link']//following-sibling::a");
	public By endVisit1 = By.xpath("(//a[normalize-space()='End Visit'])[2]");
	public By clickYes = By.xpath("(//button[text()='Yes'])[2]");
	public By startVisit2 = By.xpath("//div[normalize-space()='Start Visit']");
	public By captureVitals = By.xpath("//a[normalize-space()='Capture Vitals']");

	public By height = By.xpath("//input[@class='number numeric-range focused']");
	public By backbutton = By.xpath("//button[@id='prev-button']");

	public By weight = By.xpath("//input[@id='w10']");

	public By saveForm = By.xpath("//a[@id='save-form']");
	public By clickSave = By.xpath("//button[normalize-space()='Save']");
	public By endVisit2 = By.xpath("//a[normalize-space()='End Visit']");
	public By confirm01 = By.xpath("(//button[text()='Yes'])[3]");
	public By head = By.xpath("//span[@class='labeled']");

	public By mergeVisits = By.xpath("//a[normalize-space()='Merge Visits']");
	public By merge1 = By.xpath("(//input[@type='checkbox'])[1]");
	public By merge2 = By.xpath("(//input[@type='checkbox'])[2]");
	public By mergeAll = By.xpath("//input[@value='Merge Selected Visits']");
	public By rtn = By.xpath("//input[@value='Return']");
	public By addPastVisit = By.xpath("//div[@class='row']//div[normalize-space()='Add Past Visit']");

	public By cancelprb = By.xpath("(//*[text()='Cancel'])[7]");
	public By patientID = By.xpath("//*[text()='Patient ID']/following-sibling::span");
	public By deletePatient = By.xpath("(//div[normalize-space()='Delete Patient'])[2]");
	public By reason = By.xpath("//input[@id='delete-reason']");
	public By confirm = By.xpath("(//button[text()='Confirm'])[4]");
	public By searchOldId = By.xpath("//input[@placeholder='Search by ID or Name']");
	public By admin=By.xpath("//i[@class='icon-user small']//parent::li");
	public By NameAss=By.xpath("(//span[contains(text(),'Name')])[2]//parent::p");
	public By GenderAss=By.xpath("(//span[contains(text(),'Gender')])[2]//parent::p");
	public By BirthdayAss=By.xpath("(//span[contains(text(),'Birthdate')])[2]//parent::p");
	public By AddressAss=By.xpath("(//span[contains(text(),'Address')])[2]//parent::p");
	public By PhoneNoAss=By.xpath("(//span[contains(text(),'Phone Number')])[2]//parent::p");
}
