package pom.irctc.pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;

public class Form6Page extends GenericWrappers{
	public Form6Page(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
    public Form6Page selectLanguage(int data){
        sleepThread(5000);
  selectIndexByXpath("//select[@id='language']", data);
  return this;
}
public Form6Page selectState(int data){
        selectIndexByXpath("//select[@id='stateList']", data);
  return this;
}
public Form6Page selectDistrict(int data){
        selectIndexByXpath("//select[@id='distList']", data);
  return this;
}
public Form6Page selectAssembly(int data){
        selectIndexByXpath("//select[@id='acList']", data);
  return this;
}
public Form6Page selectFirstTimeVoter(){
  clickByXpath("//input[@id='isNewVoter']");
  return this;
}
public Form6Page selectShiftingConstituency(){
  clickByXpath("//input[@id='isExistingVoter']");
  return this;
}
public Form6Page enterName(String data){
  enterByXpath("//input[@id='applicantName']", data);
  return this;
}
public Form6Page enterSurname(String data){
  enterByXpath("//input[@id='applicantSurname']", data);
  return this;
}
public Form6Page enterRelativeName(String data){
  enterByXpath("//input[@id='applicantFMHName']", data);
  return this;
}
public Form6Page enterRelativeSurname(String data){
  enterByXpath("//input[@id='applicantFMHSurname']", data);
  return this;
}
public Form6Page selectTypeOfRelation(int data){
  selectIndexByXpath("//select[@id='applicantRelationType']", data);
  return this;
}
public Form6Page clickOnAge(){
  clickByXpath("//input[@id='RbdAgeOnJan']");
  return this;
}
public Form6Page selectAgeYears(int data){
  selectIndexByXpath("//select[@id='transposedPersonResidingSinceYear']", data);
  return this;
}
public Form6Page SelectAgeMonths(int data){
  selectIndexByXpath("//select[@id='transposedPersonResidingSinceMonth']", data);
  return this;
}
public Form6Page clickOnDOB(){
clickByXpath("//input[@id='RbdDateOfBirth']");
  return this;
}
public Form6Page enterDOB(String data){
enterByXpath("//input[@id='txtDateOfBirth']", data);
  return this;
}
public Form6Page selectGender(int data){
selectIndexByXpath("//select[@id='elector_gender']", data);
  return this;
}
public Form6Page enterCurrentHouseNo(String data){
  enterByXpath("//input[@id='applicantPresentHouseNo']", data);
  return this;
}
public Form6Page enterCurrentStreet(String data){
  enterByXpath("//input[@id='applicantPresentStreet']", data);
  return this;
}
public Form6Page enterCurrentTown(String data){
  enterByXpath("//input[@id='applicantPresentVillage']", data);
  return this;
}
public Form6Page enterCurrentPostOffice(String data){
  enterByXpath("//input[@id='applicantPresentPostoffice']", data);
  return this;
}
public Form6Page enterCurrentPinCode(String data){
  enterByXpath("//input[@id='applicantPresentPincode']", data);         
  return this;
}
public Form6Page clickOnSameAsAbove(){
  clickByXpath("//input[@id='chkPermanent']");
  return this;
}
public Form6Page enterEPICNo(String data){
  enterByXpath("//input[@id='applicantFamilyPrevepicno']", data);
  return this;
}
public Form6Page selectDisabilityVisualImpairment(){
  clickByXpath("//input[@id='IS_VISUALLY_IMPAIRED']");
  return this;
}
public Form6Page selectDisabilitySpeachAndHearing(){
  clickByXpath("//input[@id='IS_SPEECH_HEARING_DISABLED']");
  return this;
}
public Form6Page selectDisabilityLocomotor(){
  clickByXpath("//input[@id='IS_LOCOMOTOR_DISABLED']");
  return this;
}
public Form6Page enterDisabilityOther(String data){
  enterByXpath("//input[@id='Other']", data);
  return this;
}
public Form6Page enterEmailId(String data){
  enterByXpath("//input[@id='applicantEmail']", data);
  return this;
}
public Form6Page enterMobileNo(String data){
  enterByXpath("//input[@id='applicantMobile']", data);
  return this;
}
public Form6Page enterBirthTown(String data){
  enterByXpath("//input[@id='applicantBirthVillage']", data);
  return this;
}
public Form6Page selectBirthState(int data){
  selectIndexByXpath("//select[@id='applicantBirthState']", data);
  return this;
}
public Form6Page selectBirthDistrict(int data){
  selectIndexByXpath("//select[@id='applicantBirthDistrict']", data);
  return this;
}
public Form6Page enterResidentSince(String data){
  enterByXpath("//input[@id='txtRESIDENT_SINCE']", data);
  return this;
}
public Form6Page selectPreviousState(int data){
  selectIndexByXpath("//select[@id='ddPrevState']", data);
  return this;
}
public Form6Page selectPreviousAssembly(int data){
 selectIndexByXpath("//select[@id='ddPrevac']", data);
  return this;
}
public Form6Page enterPreviousHouseNo(String data){
  enterByXpath("//input[@id='applicantPreHouseNo']", data);
  return this;
}
public Form6Page enterPreviousStreet(String data){
  enterByXpath("//input[@id='applicantPreStreet']", data);
  return this;
}
public Form6Page enterPreviousTown(String data){
  enterByXpath("//input[@id='applicantPreVillage']", data);
  return this;
}
public Form6Page enterPreviousPostOffice(String data){
  enterByXpath("//input[@id='applicantPrePostoffice']", data);
  return this;
}
public Form6Page enterPreviousPinCode(String data){
  enterByXpath("//input[@id='applicantPrePincode']", data);       
  return this;
}
public Form6Page selectPreviousDistrict(int data){
  selectIndexByXpath("//select[@id='Prev_DistNo']", data);
  return this;
}
public Form6Page enterPlace(String data){
  enterByXpath("//input[@id='applicantFormPlace']", data);
  return this;
}
}