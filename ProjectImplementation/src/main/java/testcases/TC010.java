package testcases;
 
import org.testng.annotations.Test;

import utils.DP010;
import wrappers.ProjectWrappers;
 
public class TC010 extends ProjectWrappers{
    @Test(dataProvider="fetchData", dataProviderClass=DP010.class)
    public void indianFrro(String userId, String password, String confmPas, String secQues,
        String secAns, String name, String gender, String dob, String desgn, String email,
        String mobile, String phone, String nationality, String sName, String sCapacity,
        String sAddress, String sState, String sCity, String sType, String sGrade,
        String sEmail, String sMobile, String sPhone, String oName1, String oAddress1,
        String oState1, String oCity1, String oEmail1, String oPhone1, String oMobile1,
        String oName2, String oAddress2, String oState2, String oCity2, String oEmail2,
        String oPhone2, String oMobile2, String oName3, String oAddress3, String oState3,
        String oCity3, String oEmail3, String oPhone3, String oMobile3){
  
  int inSecQues = Integer.parseInt(secQues);
  int inGender = Integer.parseInt(gender);
  int inNation = Integer.parseInt(nationality);
  int inState = Integer.parseInt(sState);
  int inCity = Integer.parseInt(sCity);
  int inType = Integer.parseInt(sType);
  int inGrade = Integer.parseInt(sGrade);
  int inState1 = Integer.parseInt(oState1);
  int inCity1 = Integer.parseInt(oCity1);
  int inState2 = Integer.parseInt(oState2);
  int inCity2 = Integer.parseInt(oCity2);
  int inState3 = Integer.parseInt(oState3);
  int inCity3 = Integer.parseInt(oCity3);
                                              

          invokeApp("chrome", "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
          clickByXpath("/html/body/table/tbody/tr[1]/td/center[1]/table/tbody/tr[1]/td/a");
          enterById("u_id", userId);
          enterById("u_pwd", password);
          enterById("u_repwd", confmPas);
          selectIndexById("u_secques", inSecQues);
          enterById("u_secans", secAns);
          enterById("u_name", name);
          selectIndexById("u_gender", inGender);
          enterById("u_dob", dob);
          enterById("u_designation", desgn);
          enterById("u_emailid", email);
          enterById("u_mobile", mobile);
          enterById("u_phone", phone);
          selectIndexById("u_nationality", inNation);
          enterById("name", sName);
          enterById("capacity", sCapacity);
          enterById("address", sAddress);
          selectIndexById("state", inState);
          sleepThread(3000);
          selectIndexById("city_distr", inCity);
          selectIndexById("acco_type", inType);
          selectIndexById("star_rat", inGrade);         
          enterById("email", sEmail);
          enterById("mcontact", sMobile);
          enterById("contact", sPhone);
          enterByName("name_o", oName1);
          enterByName("address_o", oAddress1);
          selectIndexById("state_o", inState1);
          sleepThread(3000);
          selectIndexById("citydistr_o", inCity1);
          enterByName("emailid_o", oEmail1);
          enterByName("phoneno_o", oMobile1);
          enterByName("mobile_o", oPhone1);
          clickByName("add");
          sleepThread(5000);
          enterByName("name_o", oName2);
          enterByName("address_o", oAddress2);
          selectIndexById("state_o", inState2);
          sleepThread(3000);
         selectIndexById("citydistr_o", inCity2);
          enterByName("emailid_o", oEmail2);
          enterByName("phoneno_o", oMobile2);
          enterByName("mobile_o", oPhone2);
          clickByName("add");
          sleepThread(5000);
          enterByName("name_o", oName3);
          enterByName("address_o", oAddress3);
          selectIndexById("state_o", inState3);
          sleepThread(3000);
          selectIndexById("citydistr_o", inCity3);
          enterByName("emailid_o", oEmail3);
          enterByName("phoneno_o", oMobile3);
          enterByName("mobile_o", oPhone3);
          closeAllBrowsers();
        
    }
}

