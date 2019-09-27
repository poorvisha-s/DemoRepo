package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class SignUpPage extends GenericWrappers{
	public SignUpPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    public SignUpPage enterUserId(String data){
        enterByXpath("//*[@id='userRegistrationForm:userName']", data);
        return this;
  }
  public SignUpPage enterPassword(String data){
        enterByXpath("//*[@id='userRegistrationForm:password']", data);
        return this;
  }
  public SignUpPage enterConfirmPassword(String data){
        enterByXpath("//*[@id='userRegistrationForm:confpasword']", data);
        return this;
  }
  public SignUpPage selectSecurityQuestion(int data){
        selectIndexByXpath("//*[@id='userRegistrationForm:securityQ']", data);
        return this;
  }
  public SignUpPage enterSecurityAnswer(String data){
        enterByXpath("//*[@id='userRegistrationForm:securityAnswer']", data);
        return this;
  }
  public SignUpPage selectpreferredLanguage(int data){
        selectIndexByXpath("//*[@id='userRegistrationForm:prelan']", data);
        return this;
  }
  public SignUpPage enterFirstName(String data){
        enterByXpath("//*[@id='userRegistrationForm:firstName']", data);
        return this;
  }
  public SignUpPage enterMiddleName(String data){
        enterByXpath("//*[@id='userRegistrationForm:middleName']", data);
        return this;
  }
  public SignUpPage enterLastName(String data){
        enterByXpath("//*[@id='userRegistrationForm:lastName']", data);
        return this;
  }
  public SignUpPage selectGenderMale(){
        clickByXpath("//*[@id='userRegistrationForm:gender:0']");
        return this;
  }
  public SignUpPage selectGenderFemale(){
        clickByXpath("//*[@id='userRegistrationForm:gender:1']");
        return this;
  }
  public SignUpPage selectGenderTransgender(){
        clickByXpath("//*[@id='userRegistrationForm:gender:2']");
        return this;
  }
  public SignUpPage selectMaritalStatusMarried(){
        clickByXpath("//*[@id='userRegistrationForm:maritalStatus:0']");
        return this;
  }
  public SignUpPage selectMaritalStatusUnmarried(){
        clickByXpath("//*[@id='userRegistrationForm:maritalStatus:1']");
        return this;
  }
  public SignUpPage selectDOBDate(int data){
        selectIndexByXpath("//*[@id='userRegistrationForm:dobDay']", data);
        return this;
  }
  public SignUpPage selectDOBMonth(int data){
        selectIndexByXpath("//*[@id='userRegistrationForm:dobMonth']", data);
        return this;
  }
  public SignUpPage selectDOBYear(int data){
        selectIndexByXpath("//*[@id='userRegistrationForm:dateOfBirth']", data);
        return this;
  }
  public SignUpPage selectOccupation(int data){
        selectIndexByXpath("//*[@id='userRegistrationForm:occupation']", data);
        return this;
  }
  public SignUpPage enterAadhaarCardNo(String data){
        enterByXpath("//*[@id='userRegistrationForm:uidno']", data);
        return this;
  }
  public SignUpPage enterPanCard(String data){
        enterByXpath("//*[@id='userRegistrationForm:idno']", data);
        return this;
  }
  public SignUpPage selectCountry(int data){
        selectIndexByXpath("//*[@id='userRegistrationForm:countries']", data);
        return this;
  }
  public SignUpPage enterEmail(String data){
        enterByXpath("//*[@id='userRegistrationForm:email']", data);
        return this;
  }
  public SignUpPage enterISDMobile(String data){
        enterByXpath("//*[@id='userRegistrationForm:mobile']", data);
        return this;
  }
  public SignUpPage selectNationality(int data){
        selectIndexByXpath("//*[@id='userRegistrationForm:nationalityId']", data);
        return this;
  }
  public SignUpPage enterFlatNo(String data){
        enterByXpath("//*[@id='userRegistrationForm:address']", data);
        return this;
  }
  public SignUpPage enterStreet(String data){
        enterByXpath("//*[@id='userRegistrationForm:street']", data);
        return this;
  }
  public SignUpPage enterArea(String data){
        enterByXpath("//*[@id='userRegistrationForm:area']", data);
        return this;
  }
  public SignUpPage enterPincode(String data){
        enterByXpath("//*[@id='userRegistrationForm:pincode']", data);
        tabByXpath("//*[@id='userRegistrationForm:pincode']");
        return this;
  }
  public SignUpPage selectCity(int data){
              sleepThread(10000);
        selectIndexByXpath("//*[@id='userRegistrationForm:cityName']", data);
        return this;
  }
  public SignUpPage selectPostOffice(int data){
              sleepThread(3000);
        selectIndexByXpath("//*[@id='userRegistrationForm:postofficeName']", data);
        return this;
  }
  public SignUpPage enterPhone(String data){
        enterByXpath("//*[@id='userRegistrationForm:landline']", data);
        return this;
  }
  public SignUpPage selectCopyResidenceYes(){
        clickByXpath("//*[@id='userRegistrationForm:resAndOff:0']");
        return this;
  }
  public SignUpPage selectCopyResidenceNo(){
        clickByXpath("//*[@id='userRegistrationForm:resAndOff:1']");
        return this;
  }
  public SignUpPage enterCaptcha(String data){
        enterByXpath("//*[@id='nlpAnswer']", data);
        return this;
  }
  public SignUpPage selectNewsletterYes(){
        clickByXpath("//*[@id='userRegistrationForm:newsletter:0']");
        return this;
  }
  public SignUpPage selectNewsletterNo(){
        clickByXpath("//*[@id='userRegistrationForm:newsletter:1']");
        return this;
  }
  public SignUpPage selectPromotionsYes(){
        clickByXpath("//*[@id='userRegistrationForm:commercialpromo:0']");
        return this;
  }
  public SignUpPage selectPromotionsNo(){
        clickByXpath("//*[@id='userRegistrationForm:commercialpromo:1']");
        return this;
  }
  public SignUpPage selectSBIThroughPhoneYes(){
        clickByXpath("//*[@id='userRegistrationForm:irctcsbicard:0']");
        return this;
  }
  public SignUpPage selectSBIThroughPhoneNo(){
        clickByXpath("//*[@id='userRegistrationForm:irctcsbicard:1']");
        return this;
  }
  public SignUpPage clickOnTourism(){
        clickByXpath("//*[@id='bluemenu']/ul/li[2]/a");
        return this;
  }
  public SignUpPage clickOnStays(){
        clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/a");
        return this;
  }
  public TourismPage clickOnLounges(){
        clickByXpath("//*[@id='bluemenu']/ul/li[2]/ul/li[2]/ul/li[4]/a");
        switchToLastWindow();
        return new TourismPage(driver, test);
  }
  public SignUpPage clickOnMore(){
        clickByXpath("//*[@id='bluemenu']/ul/li[6]/a");
        return this;
  }
  public NVSPHomePage clickOnNVSP(){
        clickByXpath("//*[@id='bluemenu']/ul/li[6]/ul/li[3]/a");
        switchToLastWindow();
        return new NVSPHomePage(driver,test);
  }
}
