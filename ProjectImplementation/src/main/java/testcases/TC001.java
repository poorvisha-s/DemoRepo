package testcases;
 

import org.testng.annotations.Test;

import utils.DP;
import wrappers.ProjectWrappers;
public class TC001 extends ProjectWrappers{

	@Test(dataProvider="fetchData", dataProviderClass=DP.class)
	public void irctcSignUp(String userName, String password, String confirmPassword, String secQues, 
			String secAns, String prefLang, String firstName, String middleName, String lastName, 
			String gender, String dobDate, String dobMonth, String dobYear, String occupation, String aadhaarNo, 
			String panNo, String country, String eMail, String mobile, String nationality, 
			String flat,String street, String area, String pinCode, String city, 
			String postOffice, String phone, String captcha) throws InterruptedException {
		int secQ = Integer.parseInt(secQues);
		int prefL = Integer.parseInt(prefLang);
		int occup = Integer.parseInt(occupation);
		int countryindex = Integer.parseInt(country);
		int nation = Integer.parseInt(nationality);
		int cityName = Integer.parseInt(city);
		int post = Integer.parseInt(postOffice);
		
		//invokeApp("chrome", "https://www.irctc.co.in");
		//clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[8]/span");
		//clickByXpath("//*[@id='loginFormId']/div[1]/div[2]/table[1]/tbody/tr[1]/td[3]/a");
		enterById("userRegistrationForm:userName", userName);
		enterById("userRegistrationForm:password", password);
		enterById("userRegistrationForm:confpasword", confirmPassword);
		selectIndexById("userRegistrationForm:securityQ", secQ);
		enterById("userRegistrationForm:securityAnswer", secAns);
		selectIndexById("userRegistrationForm:prelan", prefL);
		enterById("userRegistrationForm:firstName", firstName);
		enterById("userRegistrationForm:middleName", middleName);
		enterById("userRegistrationForm:lastName", lastName);
		if (gender.equals("male")) {
			clickById("userRegistrationForm:gender:0");
		} else if (gender.equals("female")) {
			clickById("userRegistrationForm:gender:1");
		}else {
			clickById("userRegistrationForm:gender:2");
		}
		clickById("userRegistrationForm:maritalStatus:0");
		selectVisibileTextById("userRegistrationForm:dobDay", dobDate);
		selectVisibileTextById("userRegistrationForm:dobMonth", dobMonth);
		selectVisibileTextById("userRegistrationForm:dateOfBirth", dobYear);
		selectIndexById("userRegistrationForm:occupation", occup);
		enterById("userRegistrationForm:uidno", aadhaarNo);
		enterById("userRegistrationForm:idno", panNo);
		selectIndexById("userRegistrationForm:countries", countryindex);
		enterById("userRegistrationForm:email", eMail);
		enterById("userRegistrationForm:mobile", mobile);
		selectIndexById("userRegistrationForm:nationalityId", nation);
		enterById("userRegistrationForm:address", flat);
		enterById("userRegistrationForm:street", street);
		enterById("userRegistrationForm:area", area);
		enterById("userRegistrationForm:pincode", pinCode);
		tabById("userRegistrationForm:pincode");
		sleepThread(5000);
		selectIndexById("userRegistrationForm:cityName", cityName);
		sleepThread(5000);
		selectIndexById("userRegistrationForm:postofficeName", post);
		enterById("userRegistrationForm:landline", phone);
		clickById("userRegistrationForm:resAndOff:0");
		enterById("nlpAnswer", captcha);
		clickById("userRegistrationForm:newsletter:1");
		clickById("userRegistrationForm:commercialpromo:1");
		clickById("userRegistrationForm:irctcsbicard:0");
	}
}