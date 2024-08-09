package allPages;




import org.testng.annotations.Test;
import org.utility.BaseClass;

public class Locators extends BaseClass{

	public String Email="email";
	public String ValidEmailID="thirumaran0828@outlook.com";
	public String Password="password";
	public String ValidPassword="Thirumaran@1995";
	public String LoginBtn="kt_sign_in_submit";
	public String InvalidEmailID="thirumara0828@outlook.com";
	public String InvalidPassword="Thirumaran1995";
	public String DisabledEmailID="disabledmail@yopmail.com";
	public String Disabledpass="123123123123";
	public String EmailReq="//*[@id=\"kt_login_signin_form\"]/div[3]/div[1]/div/span";
	public String EmailLockMsg="//*[@id=\"kt_login_signin_form\"]/div[3]/div/span";
	//public String PassReq="//*[@id=\"kt_login_signin_form\"]/div[4]/div[2]/div/span";
	public String PassReq="//*[@id=\"kt_login_signin_form\"]/div[4]/div[3]/div/span";
	public String ForgetPassword="//div[@class='link-primary fs-6 fw-bolder']";
	public String TwoFAEmail="thirumaran@yopmail.com";
	public String TwoFAPass="123123123123";
	public String ValidEmailID1="test@yopmail.com";
	public String ValidPassword1="123412341234";
	public String SubmitBtn="btn btn-primary";
	public String OtpBox="twoFA";

	public String AdminBtn="/html/body/div/div[2]/div[1]/div[2]/div/div/div[7]/span/span[2]";
	public String ViewUserBtn="//*[@id=\"#kt_aside_menu\"]/div[7]/div/div[1]/a/span[2]";
	public String ViewUserStsDD="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/span[2]/div/select";
	public String ViewUserAct="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[2]/a";
	public String VUAccRgtsAct="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/button";
	public String VUAccRgtsAct1="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div[3]/div/div/button";
	public String VUAccRgtsActBckBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/a/div/div/div";
	public String VUAccRgtsActBckBtn1="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div[3]/div/div/div/a/div/div/div";
	public String ViewUserBckBtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[2]/div/a/div/div/div";
	public String VUBckBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/a/div/div/div";
	public String ViewUserSrchBtn="//input[@class='form-control form-control-solid w-250px ps-14 fs-6']";
	public String ViewUserSrchEditBtn="//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[8]/div/div/a/span";
	public String VUEmailEditBtn="//*[@id=\"kt_content_container\"]/div[2]/div/div[2]/div[3]/img";
	public String VUPassEditBtn="//*[@id=\"kt_content_container\"]/div[2]/div/div[3]/div[3]/img";
	public String VUNewPassBtn="(//input[@class='form-control form-control-lg form-control-solid' and @type='password' and @style='background-color: rgb(238, 243, 247);'])[1]";
	public String VUCnfrmPassBtn="/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div/div[3]/div[2]/input";
	public String VUNewEmailID="//input[@class='form-control form-control-lg form-control-solid' and @type='email']";
	public String VUNewEmailVerCode="//div[@class='btn btn-success' and text()='Get Verification Code']";
	public String VUNewEmailEtrOTP="//input[@class='form-control form-control-lg form-control-solid' and @type='text']";
	public String VUNewEmailUpdBtn="//button[text()='Update']";
	public String VUNewPassUpdBtn="//button[text()='Reset']";
	public String VUNewEmailClsBtn="//button[@class='ant-modal-close']";
	public String VUNewPassClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String VUStsClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span/span";
	public String VUStusEditBtn="//*[@id=\"kt_content_container\"]/div[2]/div/div[4]/div[3]/img";
	public String VUStusEditRdoYes="//input[@name='yes']";
	public String VUStusUpdBtn="//button[@title='Click here to update status']";
	public String VU2FAEditBtn="//*[@id=\"kt_content_container\"]/div[3]/div/div[3]/div[3]/img";
	public String VU2FAYesBtn="(//input[@type='radio' and @class='form-check-input cursor-pointer' and @name='radioOption' and @value='Y'])[1]";
	public String VU2FAUpdBtn="//button[text()='Update']";
	public String VU2FAClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span/span";
	public String VUAccRgtsBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/ul/li[3]/a/span";
	public String VUAccRgtsRepCB="REP";//name
	public String VUAccRgtsActSubBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[2]/div/div";
	public String VUAccRgtsActSubBtn1="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div[3]/div/div/div/div[2]/div/div";
	public String VUTimeShtAccBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/ul/li[5]/a";
	public String VUTimeShtAccEnblBtn="yes";//name
	public String VUTimeShtAccDsblBtn="no";//name
	public String VUInstMap="//*[@id=\"kt_content_container\"]/div[1]/div[2]/ul/li[2]/a/span";
	public String VUInstMapSpcInst="no";
	public String VUSpcInstTestCckbx="//*[@id=\"kt_content_container\"]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div/input";
	public String VUTestCckbxActEdtUsr="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[1]/div/a";
	public String VUTestCckbxActEdtUsr1="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div[3]/div/div/div/div[1]/div/a";




	public String AddBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/a/div/button"; 
	public String SaveBtn="//*[@id=\"kt_content_container\"]/form/div/div[3]/button[2]";
	public String MandatoryPopUp="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div/div";
	public String FirstName="FirstName";
	public String ClearBtn="//*[@id=\"kt_content_container\"]/form/div/div[3]/button[1]";
	public String LastName="LastName";
	public String EmailField="Email";
	public String UserRole="userRole";
	public String PhoneNum="Phone";
	public String Address1="Address1";
	public String Address2="Address2";
	public String City="City";
	public String ZipCode="ZipCode";
	public String EditButtonSymbol="//*[@id=\"kt_table_users\"]/tbody/tr/td[8]/div/div/a/span";
	public String BankSetupBtn="//*[@id=\"#kt_aside_menu\"]/div[7]/div/div[2]/a/span[2]";
	public String BankAddBtn="//*[@id=\"kt_content_container\"]/div/div/div[1]/div[2]/div/button";
	public String SaveBtnBankSetup="//button[@class='btn btn-primary btn-md']";
	public String WarningMsg="//*[@id=\"kt_body\"]/div[3]/div/div[2]/div/div[2]/div";
	public String BankName="bankName";
	public String AccNum="AccountNumber";
	public String ClrBtn="reset";
	public String Location="Location";
	public String DropDown="dropdownValue";
	public String AddAccntBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[3]/div[3]";
	public String SaveAccntBtn="//button[@title='Click here to Save']";
	public String AccntGrpName="AccountGroup";
	public String AccntGrpEditBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[3]/div[4]/span";
	public String StatusEnable="/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[5]/div[2]/div/input";
	public String StatusDisable="/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[5]/div[2]/div/span/input";
	public String AuthorizeYes="/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[7]/div[2]/div/input";
	public String AuthorizeNo="/html/body/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[1]/div[7]/div[2]/div/span/input";
	public String UpdateBtn="//button[@class='btn btn-primary btn-md']";
	public String ClrBankBtn="//*[@id=\"reset\"]";
	public String AccountNameDropDown="dropdownValuenew";
	public String SearchBox="search-txt";
	public String EditBttn="//*[@id=\"kt_table_users\"]/tbody/tr/td[8]/div/div/a";
	public String ModifiedBankname="BankName";
	public String BnkStpStsDsbl="//input[@class='form-check-input cursor-poniter' and @value='N']";
	public String BnkStpStsDsblSveBtn="//button[@title='Click here to save']";


	public String AuthorizedNetClick="//*[@id=\"#kt_aside_menu\"]/div[7]/div/div[3]/a/span[2]";
	public String AuthorizeAddBtn="//*[@id=\"kt_content_container\"]/div/div/div[1]/div[2]/div/a/div/button";
	public String AuthorizeSaveBtn="//*[@id=\"kt_content_container\"]/form/div/div[6]/button[2]";
	public String AuthorizeWarningMsg="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div/div";
	public String AuthorizeName="Name";
	public String AuthorizeTKey="TransactionKey";
	public String AuthorizeLoginID="LoginID";
	public String AuthorizeNotes="Notes";
	public String AuthoStatusRun="Running";
	public String AuthoStatusStop="Stop";
	public String AuthoSave="//*[@id=\"kt_content_container\"]/form/div/div[6]/button[2]";
	public String AuthoClr="//*[@id=\"kt_content_container\"]/form/div/div[6]/button[1]";
	public String AuthoBackBtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[2]/a/a";
	public String AuthoSearchBtn="search-txt";
	public String AuthoEditBtn="//*[@id=\"kt_table_users\"]/tbody/tr/td[7]/div/div/a/span";
	public String AutExistBackBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div/div[1]/div[2]/a";
	public String AutExistClrBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div[2]/div[5]/button[1]";
	public String AutExistUpdBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div[2]/div[5]/button[2]";
	public String AuthorizeExistName="Name";
	public String AuthorizeExistNotes="Notes";
	public String AuthoExistRun="Running";
	public String AuthoExistStop="Stop";

	public String IPWhitelistBtn="//*[@id=\"#kt_aside_menu\"]/div[7]/div/div[4]/a/span[2]";
	public String IpSearchBtn="search-txt";
	public String IpAddBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/div/button";
	public String IpAddress="ipAddress";
	public String IpResPerson="ResponsiblePerson";
	public String IpLocation="IPLocation";
	public String IpNotes="Notes";
	public String IpStatusEnbl="yes";
	public String IpStatusDSbl="no";
	public String IpAdressClr="//*[@id=\"reset1\"]";
	public String IpAdressSave="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/button[2]";
	public String IpCloseBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span/span";

	public String UsrLog="//*[@id=\"#kt_aside_menu\"]/div[7]/div/div[5]/a/span[2]";
	public String UsrLogSrch="//*[@id=\"kt_content_container\"]/div[1]/div/span[2]/div/input";
	public String UsrLogView="//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[9]/span/a";
	public String UsrLogBackBtn="//*[@id=\"kt_content_container\"]/div/div/div[1]/div[5]/a/div";

	public String EventLogBtn="//*[@id=\"#kt_aside_menu\"]/div[7]/div/div[6]/a/span[2]";
	public String EventLogSearchBtn="//*[@id=\"kt_content_container\"]/div[1]/div/span[2]/div/input";
	public String EventLogViewBtn="//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[8]/span/a";
	public String EventLogCloseBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span/span";

	public String ExceptionLogBtn="//*[@id=\"#kt_aside_menu\"]/div[7]/div/div[7]/a/span[2]";
	public String ExceSearchBtn="//*[@id=\"kt_content_container\"]/div[1]/div/span[2]/div/input";

	public String SetupBtn="//*[@id=\"#kt_aside_menu\"]/div[6]/span/span[2]";
	public String InstallerBtn="//*[@id=\"#kt_aside_menu\"]/div[6]/div/div[1]/a/span[2]";
	public String InstSearchBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div/input";
	public String InstAddBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/a/div/button";
	public String InstEditBtn="//*[@id=\"kt_table_users\"]/tbody/tr/td[8]/div/div/a/span";
	public String InstBackBtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[1]/div[2]/a/a";
	public String InstSaveBtn="//*[@id=\"kt_content_container\"]/form/div/div[3]/button[2]";
	public String InstClrBtn="reset1"; //ID
	public String InstAlrtMsg="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div/div";
	public String InstName="Installer";  
	public String InstStatusEnbl="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[2]/div[2]/label/div/input";
	public String InstStatusDSbl="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[2]/div[2]/label/div/span/input";
	public String InstCntryDD="status";
	public String InstStateDD="state";
	public String InstAdres1="Address1";
	public String InstAdres2="Address2";
	public String InstCity="City";
	public String InstZipCode="ZipCode";
	public String InstPhone ="Phone";
	public String InstEmail="Email";
	public String InstWebsite="Website";
	public String InstInvoiceCpy="SendInvoiceCopyto";
	public String InstCrmName="CRMName";
	public String InstCrmUrl="CRMUrl";
	public String InstApiActYes="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[15]/div[2]/label/div/input";
	public String InstApiActNo="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[15]/div[2]/label/div/span/input";	
	public String InstActionsBtn="//*[text()='Action']";
	public String EditInstaller="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[1]/div/div";
	public String InstUpdateBtn="//*[@id=\"kt_content_container\"]/form/div/div[3]/button[2]";
	public String InstResetBtn="reset1";
	public String InvstDetails="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[2]/div/div";
	public String InvstClseBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String InvstTraDate="Transactiondate"; //name
	public String InvstAmount="Amount"; //name
	public String InvstBankname="Bankname"; //name
	public String InvstAccnum="Accountnumber"; //name
	public String InvstRemarks="Remarks"; //name
	public String InvstDocAttach="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div/div[6]/label[2]/div/h6";
	public String InvstClrBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div/div[7]/button[1]";
	public String InvstSaveBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div/div[7]/button[2]";
	public String InvstBackBtn="//div[text()='Back']";
	public String InstStatusDD="status"; //name
	public String InvstEditBtn="//*[@id=\"kt_content_container\"]/div[2]/div/table/tbody/tr/td[9]/span/a/span";
	public String InvstCloseBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String InvstBankSetupBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/ul/li[2]/a";
	public String InvstNSFSetupBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/ul/li[3]/a";
	public String InvstNSFSetupUpdBtn="//*[@id=\"kt_content_container\"]/form/div/div/div[6]/button[2]";
	public String InvstNSFSetupAlrtBtn="//div[text()='Updated Successfully']";
	public String InvstNSFStpNoRadBtn="//*[@id=\"kt_content_container\"]/form/div/div/div[1]/div[2]/div/input";
	public String InvstNSFStpYesRadBtn="//*[@id=\"kt_content_container\"]/form/div/div/div[1]/div[2]/div/span/input";
	public String InvstNSFStpAtmptBtn="attempts";//id
	public String InvstNSFStpIntvBtn="intervals";//id
	public String InvstNSFStpClrBtn="//button[@class=\"btn btn-light me-3 btn-sm\"]";
	public String InvstNSFStpUpdBtn="//*[@id=\"kt_content_container\"]/form/div/div/div[4]/button[2]";
	public String InvstNSFStpUpdBtn1="//*[@id=\"kt_content_container\"]/form/div/div/div[6]/button[2]";
	public String InvstNSFStpAmtBtn="Amount";//name 
	public String InvstNSFStpSepTranBtn="ST";//name
	public String InvstNSFStpMonPayBtn="MP";//name
	public String InvstNSFStpActBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[4]/div/div/a";
	public String InvstNSFStpActBckBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[4]/div/div/div/a/div/div/div";




	public String InvestorBtn="//*[@id=\"#kt_aside_menu\"]/div[6]/div/div[2]/a/span[2]";
	public String InvstrSrch="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div/input";
	public String InvstrStatusDD="status";
	public String InvstrAddBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/a/div/button";
	public String InvstrExcelBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/div/div/button";	
	public String InvstrEditBtn="//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[8]/div/div/a/span";
	public String InvstrWarningMsg="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/button";
	//*[@id="kt_body"]/div[2]/div/div[2]/div/div[2]/div/div/div[2]/button
	public String InvstrName="Investor";//name
	public String InvstrEnblBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[2]/div[2]/label/div/input";
	public String InvstrDsblBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[2]/div[2]/label/div/span/input";
	public String InvstrCntry="status";//name
	public String InvstrState="state";//name
	public String InvstrAdd1="Address1";//name
	public String InvstrAdd2="Address2";//name
	public String InvstrCity="City";//name
	public String InvstrZipCode="ZipCode";//name
	public String InvstrPhone="Phone";//name
	public String InvstrEmail="Email";//name
	public String InvstrWebsite="Website";//name
	public String InvstrClrBtn="reset1";//id
	public String InvstrSaveBtn="//*[@id=\"kt_content_container\"]/form/div/div[3]/button[2]";
	public String InvstrBackBtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[1]/div[2]/a/a";
	public String InvstrActBtn="//*[text()='Action']";
	public String EditInvstrBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[1]/div/div";
	public String InvstrTransBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/ul/li[2]/a";
	public String InvstrAddTans="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[2]/div/div";
	public String InvstrTranDate="Transactiondate";//name
	public String InvstrTranAmt="Amount";//name
	public String InvstrTranBank="Bankname";//name
	public String InvstrTranAccNum="AccountNumber";//name
	public String InvstrTranRemarks="Remarks";//name
	public String InvstrAttachBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[6]/div[2]/label[2]/div/h6";
	public String InvstrTranSavBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[7]/button[2]";
	public String InvstrTranClrBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[7]/button[1]";
	public String InvstrTranBckBtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[2]/a/a";
	public String InvstrTranExcelBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[3]/div/div";
	public String InvstrActBckBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/a/div/div/div";
	public String InvstrAddCusBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[2]/div/div";
	public String InvstrSelInstlrDD="//*[@id=\"kt_content_container\"]/div[2]/div/div[2]/select";
	public String InvstrCusName="//*[@id=\"kt_content_container\"]/div[2]/div[1]/div[3]/input";
	public String InvstrCusChckBox="//*[@id=\"kt_content_container\"]/div[2]/div[2]/div/table/tbody/tr/td[8]/input";
	public String InvstrCusSavBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[2]/div/div";
	public String SettingSymbol="//*[@id=\"kt_aside_toolbar\"]/div[1]/div[2]/div/div[2]/a/span";
	public String SignOutBtn="//*[@id=\"kt_aside_toolbar\"]/div[1]/div[2]/div/div[2]/div/div[9]/a/div";
	public String InvstrTranEditbtn="//*[@id=\"kt_content_container\"]/div[2]/div/table/tbody/tr/td[9]/span/a/span";
	public String InvstrTranUpdBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[3]/button[2]";
	public String InvstrTranEditBckBtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[2]/a/div";
	public String InvstrDwldBtn="//*[@id=\"kt_content_container\"]/div[2]/div/table/tbody/tr/td[4]";
	public String InvstrCusEditBtn="//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[9]/div/div/a/span";
	public String InvstrCusSrch="//*[@id=\"kt_content_container\"]/div[2]/div/div[1]/div[3]/input";
	public String InvstrCusSelBtn="//*[@id=\"kt_content_container\"]/div[2]/div/div[2]/div/table/tbody/tr/td[8]/input";
	public String InvstrCusUpdBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[2]/div/div";
	public String InvstrDocuBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/ul/li[3]/a";
	public String InvstrViewBtn="//*[@id=\"kt_content_container\"]/div[2]/div/table/tbody/tr[1]/td[8]/span/a/span";
	public String InvstrDocUpdBtn="//button[@class='btn btn-primary btn-sm']";
	public String InvstrDocBckBtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/a/div/div";
	public String InvstrDocDwldBtn="//*[@id=\"kt_content_container\"]/div[2]/div/table/tbody/tr[1]/td[3]";
	public String InvstrAddDocBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[2]/div/div";
	public String InvstrFileName="Filename"; //name
	public String InvstrFileToast="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div/div/div[3]/button";
	public String InvstrFileUpldBtn="//*[@id=\"kt_content_container\"]/form/div/div[3]/div[2]/label[2]/div/h6";
	public String InvstrFileSaveBtn="//*[@id=\"kt_content_container\"]/form/div/div[5]/button";
	public String InvstrShowDashBrdYes="yes"; //name
	public String InvstrShowDashBrdNo="no"; //name
	public String InvstrShowToInvstrYes="//*[@id=\"kt_content_container\"]/form/div/div[5]/div[2]/div/input";
	public String InvstrShowToInvstrNo="//*[@id=\"kt_content_container\"]/form/div/div[5]/div[2]/div/span/input";
	public String InvstrFileAddSaveBtn="//*[@id=\"kt_content_container\"]/form/div/div[6]/button";
	public String InvstrNewFeedBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/ul/li[4]/a";
	public String InvstrNewFeedViewIcon="//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[7]/div/div/a/span";
	public String InvstrNewFeedUpdBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div/div[5]/button";
	public String InvstrAddFeedBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[2]/div/div";
	public String InvstrAddFeedSaveBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div/div[4]/button";
	public String InvstrFeedClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String InvstrAddFeedTitBtn="Title"; //name
	public String InvstrAddNewsFeedBtn="NewsFeeds";//name
	public String InvstrDashBrdYes="yes";//name
	public String InvstrDashBrdNo="no";//name
	public String InvstrAddShwYes="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div/div[4]/div/div/input";
	public String InvstrAddShwNo="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div/div[4]/div/div/span/input";	
	public String InvstrNewFeedSaveBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div/div[5]/button";
	public String InvstrRepBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/ul/li[5]/a";
	public String InvstrSubBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div/div/div[4]/div/div/div/div[2]/div/div";
	public String CusGrpBtn="//*[@id=\"#kt_aside_menu\"]/div[6]/div/div[3]/a/span[2]";

	public String CusSrchBox="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div/input";
	public String CusStsDD="status";//name
	public String CusAddBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/div/button";
	public String CusSelInstlrDD="dropdownValue";//id
	public String CusGrpName="Groupname";
	public String CusGrpStsEnbl="yes";//name
	public String CusGrpStsDsbl="no";//name
	public String CusGrpClrBtn="reset1";//id
	public String CusGrpSavBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div/div[2]/button[2]";
	public String CusGrpCloseBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String CusGrpEditBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div/table/tbody/tr/td[8]/a/span/span";
	public String CusGrpEditStsEnbl="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div/div[1]/div[4]/div[2]/label/div/input";
	public String CusGrpEditStsDsbl="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div/div[1]/div[4]/div[2]/label/div/span/input";
	public String CusGrpEditClrBtn="search-txt";//id
	public String CusGrpEditUpdBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div/form/div/div[2]/button[2]";

	public String CustomerBtn="//*[@id=\"#kt_aside_menu\"]/div[5]/span";
	public String CusListBtn="//*[@id=\"#kt_aside_menu\"]/div[5]/div/div[1]/a/span[2]";
	public String CusBankDD="installer";//name
	public String CusListNameBox="searchtxt";//id
	public String CusLisActBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/a";
	public String CusAddActBtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[2]/a";
	public String CusListAddBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/div/div[1]/a/div/div";
	public String CusListActSavBtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[2]/div/div[2]/div/div";
	public String CustID="CustomerId";//name
	public String CustName="CustomerName";//name
	public String CusInstDD="client";//id
	public String CusPort="portfolio";//name
	public String CusPTODate="date";//name
	public String CusCrdScre="Creditscore";//name
	public String CusPrjSts="Projectstatus";//name
	public String CusStsYes="yes";//name
	public String CusStsNo="no";
	public String CusEnblStsYes="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[9]/div[2]/label/div/input";
	public String CusEnblStsNo="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[9]/div[2]/label/div/span/input";
	public String CusTypLTF="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[11]/div[2]/label/div/input";
	public String CusTypPre="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[11]/div[2]/label/div/span[1]/input";
	public String CusTypMP="manualpay";//name
	public String CusMonPay="Monthlypayment";//name
	public String CusTotYrs="Totalyears";//name
	public String CusEscal="Escalation";//name
	public String CusTotConAmt="TotalContrcatAmount";//name
	public String CusPhone="Phone";//name
	public String CusEmail="Email";//name
	public String CusCntryDD="status";//name
	public String CusStDD="State";//id
	public String CusAdd1="Address1";//name
	public String CusAdd2="Address2";//name
	public String CusCity="City";//name
	public String CusZipCde="Zipcode";//name
	public String CusFinancing="Financing";//name
	public String CusProjCost="Projecctcost";//name
	public String CusSysCost="Systemcost";//name
	public String CusSysSize="Systemsize";//name
	public String CusProd="production";
	public String CusPipLn="Pipeline";
	public String CusLeadPipLn="Leadpipeline";
	public String CusPanels="Panels";
	public String CusBatt="Batteries";
	public String CusWattPerPan="Watts";
	public String CusInvBrnd="Inventor";
	public String CusPayoffAmtYes="payYes";
	public String CusPayoffAmtNo="payNo";
	public String CusAddClrBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[37]/button[1]";
	public String CusAddSavBtn="(//button[text()='Save'])";
	public String CussAddActBackBtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[2]/div/a/div/div/div";
	public String CusPortAddBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[4]/div[3]";
	public String CusAddPortName="addPortfolio";//name
	public String CusAddPortEditBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div[4]/div[4]";
	public String CusAddPortClrBtn="//button[@class='btn btn-light me-3 btn-md']";
	public String CusAddPortSavBtn="(//button[text()='Save'])[2]";
	public String CusAddPortClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String CusActBckbtn="//*[@id=\"kt_content_container\"]/form/div/div[1]/div[2]/div/a/div/div/div";
	public String CusNameEditBtn="//*[@id=\"kt_table_users\"]/tbody/tr/td[10]/div/div/a/span";
	public String CusAddNotesBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/div[3]/div[1]/div/a";
	public String CusNotesBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/textarea";
	public String CusNotesSavBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div[3]/div";
	public String CusNotesClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String CusEditActBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/a";
	public String CusEditActBtn1="//*[@id=\"kt_content_container\"]/div/form/div/div[1]/div[2]/a";
	public String CusEditCusBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/div/div[1]/a/div/div";
	public String CusEditClrBtn="(//button[text()='Clear'])";
	public String CusEditUpdBtn="(//button[text()='Update'])";
	public String CusEditUpdBtn1="//*[@id=\"kt_content_container\"]/div/form/div/div[1]/div[2]/div/div[2]/div/div";
	public String CusEditBckBtn="//*[@id=\"kt_content_container\"]/div/form/div/div[1]/div[2]/div/a/div/div/div";
	public String CusEditActBtn2="//*[@id=\"kt_content_container\"]/div/form/div/div[1]/div[2]/a";
	public String CusEditInstAddBtn="//*[@id=\"kt_content_container\"]/div/form/div/div[2]/div[4]/div[3]";
	public String CusEditPortSavBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/button[2]";
	public String CusEditPortName="addPortfolio";//name
	public String CusEditPortClrBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/button[1]";
	public String CusEditPortClseBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String CusEditPortEditBtn="//*[@id=\"kt_content_container\"]/div/form/div/div[2]/div[4]/div[4]";
	public String CusEditLTFBtn="//*[@id=\"kt_content_container\"]/div/form/div/div[2]/div[11]/div[2]/label/div/input";
	public String CusEditPreBtn="prepaid";//name
	public String CusEditUpdBtn2="//*[@id=\"kt_content_container\"]/div/form/div/div[1]/div[2]/div/div[2]/div/span";
	public String CusEditBckBtn2="//*[@id=\"kt_content_container\"]/div/form/div/div[1]/div[2]/div/a/div/div/div";
	public String CusEditPaySchBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/div/div[2]/a/div/div";
	public String CusEditPayUpdBtn="//*[@id=\"kt_content_container\"]/div[2]/div/div/div[1]/div/button";
	public String CusEditActPayBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/a";
	public String CusEditActPayBckBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/a[6]/div/div/div";
	public String CusEditActPayMergeBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/div/div[3]/a/div/div";
	public String CusEditActMergeBckBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/a[7]/div/div/div";
	public String CusEditMrgeAgreBtn="//*[@id=\"kt_content_container\"]/div[2]/div[2]/div/div[3]/div[3]/div[2]/div/input";
	public String CusEditMrgeBtn="//*[@id=\"kt_content_container\"]/div[2]/div[2]/div/div[3]/div[4]/div[2]/button";
	public String CusEditChoseMrgDD="//*[@id=\"kt_content_container\"]/div[2]/div[2]/div/div[3]/div[1]/div[2]/select";
	public String CusEditViewRcdPaymtsBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/div/div[4]/a/div/div";
	public String CusEditRcdPymntPrntbtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/div[1]/div[1]/div/div";
	public String CusEditRcdPymtActBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/a";
	public String CusEditMntlyPymnBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/div/a[1]/div/div/div";
	public String CusEditMntlyPymnSavBtn="//*[@id=\"kt_content_container\"]/div[2]/div[2]/form/div/div[4]/button";
	public String CusEditMnthlyPymnActBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/a";
	public String CusEditMnthlyPymnBckBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/a[7]/div/div/span";
	public String CusEditMntlyPayTab="monthlypay";//name
	public String CusEditMntlyEffFrom="//*[@id=\"kt_content_container\"]/div[2]/div[2]/form/div/div[2]/div/div[2]/div/div/div/input";
	public String CusEditMntlyRsonTab="reason";//name
	public String CusEditCRMMonitBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/div/a[6]/div/div/div";
	public String CusEditCRMUpdBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/form/div/div[3]/div[5]/div[2]/button";
	public String CusEditCRMDD="crm";//id
	public String CusEditCRMNameDD="crmname";//id
	public String CusEditProdEsc="productionescalation";//name
	public String CusEditFrstYrProd="firstyearproduction";//name
	public String CusEditCRMActBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/a";
	public String CusEditCrmBckBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/div/a[6]/div/div/span";
	public String CusEditDocStup="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/div/a[3]/div/div/div";
	public String CusEditDocChckBox="//*[@id=\"kt_content_container\"]/div[2]/div[2]/form/div/div/div[4]/div/input";
	public String CusEditDocStupSveBtn="//*[@id=\"kt_content_container\"]/div[2]/div[2]/form/div/div/div[5]/button";
	public String CusEditDocUpldBtn="//*[@id=\"kt_content_container\"]/div[2]/div[2]/form/div/div/div[2]/div/label/div/h6";
	public String CusEditDocActBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div[2]/a";
	public String CusEditDocBckBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div[2]/div/a[5]/div/div/span";
	public String CusEditDocEscProg="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/div/a[5]/div/div/div";
	public String CusEditEscAgreBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div[2]/div/div/div/input";
	public String CusEditEscRobtBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div[1]/div/div/div/input";
	public String CusEditEscUpdBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/div/div[3]/div[2]/div/div/div[3]/div/button";
	public String CusEditBackBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/div/a[7]/div/div/span";
	public String CusEditViewBtn="//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[6]/span/a";
	public String CusEditViewClseBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span/span";


	public String ACHFormBtn="//*[@id=\"#kt_aside_menu\"]/div[5]/div/div[2]/a/span[2]";
	public String ACHBankNameDD="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div[1]/select";
	public String ACHBnkSrch="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div[4]/input";
	public String ACHNameEditBtn="//*[@id=\"kt_table_users\"]/tbody/tr/td[10]/div/div/a/span";
	public String ACHEditClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String ACHType="type";//name
	public String ACHStatus="status";//name
	public String ACHEditManEtry="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/input";
	public String ACHEditUpdBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/button";
	public String ACHEditRobChckBox="//*[@id=\"kt_content_container\"]/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[1]/div/div/div/input";
	public String ACHCheckBox1="//*[@id=\"kt_content_container\"]/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[2]/div/div/div/input";
	public String ACHCheckBox2="//*[@id=\"kt_content_container\"]/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[3]/div/div/div/input";
	public String ACHEditUpdBtn1="//*[@id=\"kt_content_container\"]/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[4]/div/button";
	public String ACHEditMandChck="//*[@id=\"kt_body\"]/div[3]/div/div[2]/div/div[2]/div";
	public String ACHEditBckBtn="//*[@id=\"kt_content_container\"]/div/div[2]/form/div/div[5]/div[12]/div[3]/div/div/div[4]/div/a/button";
	public String ACHNamOnAcc="nameonaccount";//name
	public String ACHBnkNam="bankname";//name
	public String ACHAccNum="bankaccountnumber";//name
	public String ACHAccRoutNum="bankroutingnumber";
	public String ACHBnkLoc="banklocation";//name
	public String ACHSndToCus="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/span[1]/input";
	public String ACHScdToCusBckBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div[2]/div/a/div/div/div";
	public String ACHActBckBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div[2]/div/a/div/div/div";
	public String ACHSndBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div[8]/div/button";

	public String ACHActBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div[2]/a";
	public String ACHActSndToSls="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[1]/div[2]/div/div[2]/a/div/div";
	public String ACHActCngPayDte="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[1]/div[2]/div/div[3]/a/div/div";
	public String ACHActCngPayDteBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[3]/button";
	public String ACHActCngPayMandChk="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div";
	public String ACHCngPayDteEffFrm="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[1]/div/div/div/input";
	public String ACHCngpayDate="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[2]/select";
	public String ACHPayStsActBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div[2]/a";
	public String ACHSkipPay="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[4]/a/div/div";
	public String ACHSkipPayAgreBtn="confirm";//name
	public String ACHSkipPymntBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[5]/button";
	public String ACHSkipPymntMandMsg="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div/div";
	public String ACHSkpPyStrtMnth="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[1]/div/div/div/input";
	public String ACHSkpPyEndMnth="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/input";
	public String ACHSkpPyRsn="reason";//name
	public String ACHSndToSlsPerBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/span[2]/input";
	public String ACHSndToSlsSndBtn="//*[@id=\"kt_account_deactivate_account_submit\"]";
	public String ACHCngpayDateBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[3]/button";
	public String ACHSndToCusToMailId="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div[1]/div/input";
	public String ACHSndToCusSkpPyBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[1]/div[2]/div/div[4]/a/div/div";
	public String ACHSndToCusSkpPyMan="//button[text()='Skip Payment']";
	public String ACHSndToCusSkpPySrtMnt="startmonth";//name
	public String ACHSndToCusSkpPyEndMnt="endmonth";//name



	public String ACHUploadBtn="//*[@id=\"#kt_aside_menu\"]/div[5]/div/div[3]/a/span[2]";
	public String ACHSubBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/form/div[3]/button";
	public String ACHManMsgChk="//*[@id=\"kt_content_container\"]/div[1]/div[2]/form/div[2]/div/div";
	public String ACHUploadFileBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/form/div[2]/div/label/div/h6";
	public String ACHUploadDateBtn="//*[@id=\"kt_content_container\"]/div[2]/div[1]/div[2]";
	public String ACHUpldSampFilBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/form/div[1]/div[3]/a";
	public String ACHFrmStupBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/form/div[3]/a/button";
	public String ACHUpldInstlrDD="installer";//id
	public String CusLisExclUpldBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/div/a/div/div/div";
	public String CusLisExclUplSumBtn="//*[@id=\"kt_content_container\"]/div[1]/div[2]/form/div[3]/button";
	public String CusLisExclMandMsg="//*[@id=\"kt_content_container\"]/div[1]/div[2]/form/div[2]/div/div";
	public String CusListExclUpldFilUpld="//*[@id=\"kt_content_container\"]/div[1]/div[2]/form/div[2]/div/label/div/h6";
	public String CusListExclUpldDateBtn="//*[@id=\"kt_content_container\"]/div[2]/div[1]/div[2]/input";

	public String ReportsBtn="//*[@id=\"#kt_aside_menu\"]/div[2]/span/span[2]";
	public String OSReportBtn="//*[@id=\"#kt_aside_menu\"]/div[2]/div/div[1]/a/span[2]";
	public String OSReportExpBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[7]/button";
	public String OSBankName="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[3]/select";
	public String OSPyType="status";//name
	public String OSPySts="status";//name
	public String OSCusName="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[6]/input";
	public String OSEditBtn="//*[@id=\"kt_content_container\"]/div[1]/div[3]/div/table/tbody/tr[1]/td[10]/a/span";
	public String OSAddNotes="//*[@id=\"kt_content_container\"]/div/div[2]/div[5]/div[1]/div[2]/button";
	public String OSAddNtSavBtn="//div[@class='btn btn-primary btn-sm']";
	public String OSAddNtTxtBox="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/textarea";
	public String OSAddNtClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span/span";
	public String OSAddNtViewBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div[1]/span[3]/a";
	public String OSAddNtViewClsBtn="/html/body/div[3]/div/div[2]/div/div[2]/button";
	public String OSAddNtActBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[1]/div[2]/a";
	public String OSAddRcdPymt="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div";
	public String OSAddRcdPySubBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/button[2]";
	public String OSAddRcdPyClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span/span";
	public String OSAddManPymnt="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div";
	public String OSAddManSavBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/button";
	public String OSAddManClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String OSAddManDueMnt="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div[1]/div[1]/input";
	public String OSAddManPayBtn="yes";//name
	public String OSAddManPyNSF="no";//name
	public String OSAddMonPayAmt="Monthlypay";//name
	public String OSAddMonPayRsn="Reason";//name
	public String OSAddManSchDate="Scheduledate";//name
	public String OSAddRcdPyTranDate="TransactionDate";//name
	public String OSAddRcdPyTranDes="Transactiondescription";//name
	public String OSAddRcdPyAmnt="Amount";//name
	public String OSAddRcdPyMode="credit";//id
	public String OSAddRcdPyBnkName="banknamedropdown";//name
	public String OSAddRcdPyTyp="ACHdropdown";//id
	public String OSAddRcdPyCLrBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div[2]/button[1]";
	public String OSACtBckBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div[2]/div/a/div/div/div";

	public String TapeReprtBtn="//*[@id=\"#kt_aside_menu\"]/div[2]/div/div[2]/a/span[2]";
	public String TapeRepInstlrDD="//*[@id=\"kt_content_container\"]/div[1]/div/div[3]/div[2]/select";
	public String TapeRepRunRep="btnRunReport";//id
	public String TapeRepDwldBtn="//*[@id=\"dvdownload\"]/div/div/div/div/div/button";

	public String ACHTransBtn="//*[@id=\"#kt_aside_menu\"]/div[2]/div/div[3]/a/span[2]";
	public String ACHTransInstDD="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[1]/div[2]/select";//name
	public String ACHTransFrmDte="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[3]/div[2]/input";
	public String ACHCusSrch="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[5]/div[2]/input";
	public String ACHTransActBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[6]/a";
	public String ACHTransFileLog="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[6]/div/a[1]/div/div/div";
	public String ACHTransExcelExp="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[6]/div/div/div/div";
	public String ACHTransBckBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[6]/div/a[2]/div/div/div";
	public String ACHTransCusEditBtn="//*[@id=\"kt_content_container\"]/div[1]/div[3]/div/table/tbody/tr[1]/td[11]/a";
	public String ACHTransCusEditBCkBtn="achback";//id

	public String InvoiceLogBtn="//*[@id=\"#kt_aside_menu\"]/div[2]/div/div[5]/a/span[2]";
	public String InvLogBankDD="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[1]/select";
	public String InvLogPyType="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[2]/div/select";
	public String InvLogCusNam="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[5]/div/input";
	public String InvLogExprtBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[6]/button";
	public String InvLogCusEdtBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div/table/tbody/tr[1]/td[10]/a";
	public String InvLogFrmDate="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[3]/input";
	public String InvLogToDate="//*[@id=\"kt_content_container\"]/div/div[1]/div/div/div[4]/input";
	public String InvLogPymtUrl="lblPaymentUrl";//id
	public String InvLogRobBtn="//*[@id=\"ContentPlaceHolder1_checkRobot\"]";
	public String InvLogAgrBtn="ContentPlaceHolder1_checkTerms2";//id
	public String InvLogPayNw="ContentPlaceHolder1_inkbtnpaynow";//id
	public String InvLogCusEdtActBtn="invback";//id
	public String InvLogCusEdtActBckBtn="//*[@id=\"invback\"]/div/a/div/div/div";
	public String InvLogRsndInv="//*[@id=\"btnResendInvoice\"]/div/div";
	public String InvLogRsndYes="btnCnfmResendInvYes";//id
	public String InvLogRsndNo="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div[1]/button";
	public String InvLogDwldInv="//*[@id=\"btndownloadInvoice\"]/div/div";
	public String InvLogDwldRecp="//*[@id=\"btndownloadInvoice\"]/div/div";
	public String InvLogDwldAll="//*[@id=\"btndownloadall\"]/div/div";
	public String InvLogVoidInv="//*[@id=\"btnVoidInvoice\"]/div/div";
	public String InvLogVoidRmrk="Remarks";//name
	public String InvLogVoidYes="btnConfirmationYes";//id
	public String InvLogVoidNo="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div/div[3]/div/div[2]/div/div[1]/button";
	public String InvLogPayURLRob="ctl00$ContentPlaceHolder1$checkRobot";//name
	public String InvLogPayURLAgre="ctl00$ContentPlaceHolder1$checkTerms2";//name
	public String InvLogPayURLPay="ContentPlaceHolder1_inkbtnpaynow";//name
	public String InvLogPayURLName="ctl00$ContentPlaceHolder1$txtacname";//name
	public String InvLogPayURLAcc="ctl00$ContentPlaceHolder1$txtbankacno";//name
	public String InvLogPayURLRout="ctl00$ContentPlaceHolder1$txtbankroutingno";//name


	public String ActRepBtn="//*[@id=\"#kt_aside_menu\"]/div[2]/div/div[6]/a/span[2]";

	public String SchedBtn="//*[@id=\"#kt_aside_menu\"]/div[4]/span/span[2]";
	public String ACHSchBtn="//*[@id=\"#kt_aside_menu\"]/div[4]/div/div[1]/a/span[2]";
	public String SchBankDD="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/select";
	public String SchFrmDte="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/input";
	public String SchActBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[4]/a";
	public String SchCusViewBtn="//*[@id=\"kt_content_container\"]/div/div[3]/div/table/tbody/tr[1]/td[10]/a/span";
	public String SchCusActBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[6]/a";
	public String SchCusFileLogBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[6]/div/a[1]/div/div/div";
	public String SchCusFileExcelExpBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[6]/div/div/div/div";
	public String SchExcelExpBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[4]/div/div/div/div";
	public String SchCusFileBckBtn="//*[@id=\"kt_content_container\"]/div[1]/div[1]/div[6]/div/a[2]/div/div/div";
	public String SCHAchSchBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[4]/div/a/div/div/div";

	public String SCHNoPayBtn="//*[@id=\"#kt_aside_menu\"]/div[4]/div/div[2]/a/span[2]";
	public String NoPayActBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[4]/a";
	public String NoPayStopBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[4]/div/div[1]/div/div";
	public String NoPayRunBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[4]/div/div[2]/div/div";
	public String NoPaySunBtn="SUNDAY";//name
	public String NoPayMonBtn="MONDAY";//name
	public String NoPayTueBtn="TUESDAY";//name
	public String NoPayWedBtn="WEDNESDAY";//name
	public String NoPayThurBtn="THURSDAY";//name
	public String NoPayFriBtn="FRIDAY";//name
	public String NoPaySatBtn="SATURDAY";//name
	public String NoPayAddUsr="//*[@id=\"kt_content_container\"]/div[3]/div[1]/div/a";
	public String NoPayAddUsrSavBtn="//div[@class='btn btn-primary btn-sm text-end mb-3']";
	public String NoPayAddUSrNameBtn="//a[@class='text-dark text-hover-primary  fs-6 ']";
	public String NoPayAddUsrClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String NoPayExtAddUsrBtn="//*[@id=\"kt_content_container\"]/div[4]/div[1]/div[2]/a";
	public String NoPayExtAddUsrClrBtn="//button[@class='btn btn-light me-3 btn-sm']";
	public String NoPayExtAddUsrSavBtn="//button[@class='btn btn-primary btn-sm']";
	public String NoPayExtAddUsrName="Name";//name
	public String NoPayExtAddUsrMail="Emailid";//name
	public String NoPayExtAddUsrTyp="usertype";//name
	public String NoPayExtClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String NoPaySavBtn="//*[@id=\"kt_content_container\"]/div[5]/div[2]/div[2]/div[2]/div/a";
	public String NoPayEmailSign="//*[@id=\"kt_content_container\"]/div[5]/div[2]/div[1]/div[2]/div[1]/select";

	public String InvoicePayBtn="//*[@id=\"#kt_aside_menu\"]/div[5]/div/div[4]/a/span[2]";
	public String IPBankDD="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div[1]/select";
	public String IPPySts="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div[2]/select";
	public String IPSrchBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div[3]/input";
	public String IPExcelBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/button";
	public String IPCusEditBtn="//*[@id=\"kt_content_container\"]/div/div[3]/div[1]/table/tbody/tr[1]/td[10]/a/span/span";
	public String IPChngInvDate="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/div[3]/div/div/div[1]/div[1]/a/label/a";
	public String IPChngInvPayDatBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[3]/button";
	public String IPEffMonFrm="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[1]/div/div/div/input";
	public String IPPyDate="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[2]/select";
	public String IPChPyActBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[1]/div[2]/a";
	public String IPChPyEditPyBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[1]/div[2]/div/div[1]/a/div/div";
	public String IPChPyDepAccName="bankValue";//id
	public String IPChPyRobChck="//*[@id=\"kt_content_container\"]/form/div/div[2]/div/div[2]/div[10]/div[3]/div/div/div[1]/div/div/div/input";
	public String IPChPyAgrBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div/div[2]/div[10]/div[3]/div/div/div[2]/div/div/div/input";
	public String IPChPyUpdBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div/div[2]/div[10]/div[3]/div/div/div[3]/div/button";
	public String IPChPyBckBtn="//*[@id=\"kt_content_container\"]/form/div/div[2]/div/div[1]/div[2]/a/button";
	public String IPChPyStpPy="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div/div/div[3]/a/div/div";
	public String IPChPyStpActBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[1]/div[2]/a";
	public String IPChPySkpPy="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[1]/div[2]/div/div[3]/a/div/div";
	public String IPSkpPyStrtMnt="startmonth";//name
	public String IPSkpPyEndMnt="endmonth";//name
	public String IPSkpPyRsn="reason";//name
	public String IPSkpPyCnfrm="confirm";//name
	public String IPSkpPyBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[5]/button";
	public String IPChPyBackBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[1]/div[2]/div/a/div/div/div";
	public String IPChMntPyBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/div[3]/div/div/div[2]/div/a/label/a";
	public String IPChMntPyAmt="monthlypay";//name
	public String IPChMntPyEffDate="//*[@id=\"kt_content_container\"]/div[2]/div[2]/form/div/div[2]/div/div[2]/div/div/div/input";
	public String IPChMntPyRsn="reason";//name
	public String IPChMntPySavBtn="//*[@id=\"kt_content_container\"]/div[2]/div[2]/form/div/div[4]/button";
	public String IPChMntPyActBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/a";
	public String IPChMntPyEditCus="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/div[1]/a/div/div";
	public String IPChMntPyEditActBtn="//*[@id=\"kt_content_container\"]/div/form/div/div[1]/div[2]/a";
	public String IPChMntPyEditClrBtn="//*[@id=\"kt_content_container\"]/div/form/div/div[1]/div[2]/div/div[1]/div/div";
	public String IPChMntPyEditSavBtn="//*[@id=\"kt_content_container\"]/div/form/div/div[1]/div[2]/div/div[2]/div/div";
	public String IPChMntPyEditBckBtn="//*[@id=\"kt_content_container\"]/div/form/div/div[1]/div[2]/div/a/div/div/div";
	public String IPChMntPyAddCusPort="//*[@id=\"kt_content_container\"]/div/form/div/div[2]/div[4]/div[3]";
	public String IPChMntPyAddCusPortName="addPortfolio";//name
	public String IPChMntPyAddCusPortClr="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/button[1]";
	public String IPChMntPyAddCusPortSav="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/button[2]";
	public String IPChMntPyAddCusPortCls="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String IPChMntPyEdtCusPort="//*[@id=\"kt_content_container\"]/div/form/div/div[2]/div[4]/div[4]";
	public String IPChMntPyEdtCusPortClr="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/button[1]";
	public String IPChMntPyEdtCusPortSav="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/button[2]";
	public String IPChMntPyEdtCusPortCls="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";
	public String IPChMntPyEdtCusPortName="addPortfolio";//name
	public String IPChMntPyViwCusBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/div[2]/a/div/div";
	public String IPChMntPyEdPySch="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/div[3]/a/div/div";
	public String IPChMntPyEdPySchUpd="//*[@id=\"kt_content_container\"]/div[2]/div/div/div[1]/div/button";
	public String IPChMntPyMrgCus="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/div[4]/a/div/div";
	public String IPChMntPyMrgCusMan="//*[@id=\"kt_content_container\"]/div[2]/div[2]/div/div[3]/div[3]/div[2]/div/input";
	public String IPChMntPyMrgeBtn="//*[@id=\"kt_content_container\"]/div[2]/div[2]/div/div[3]/div[4]/div[2]/button";
	public String IPChMntPyMrgeCusDD="//*[@id=\"kt_content_container\"]/div[2]/div[2]/div/div[3]/div[1]/div[2]/select";
	public String IPChMntPyRcdPymts="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/div[5]/a/div/div";
	public String IPChMntPyRcdPyPrnt="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/div[1]/div[1]/div/div";
	public String IPChMntPyMonCRM="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/a[6]/div/div/div";
	public String IPChMntPyMonCRMUpd="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/form/div/div[3]/div[5]/div[2]/button";
	public String IPChMntPyMonCRMDD="crm";//id
	public String IPChMntPyMonCRMName="crmname";//id
	public String IPChMntPyMonCRMEsc="productionescalation";//name
	public String IPChMntPyMonCRMProd="firstyearproduction";//name
	public String IPChMntPyDocStup="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/a[3]/div/div/div";
	public String IPChMntPyDocStupAgree="//*[@id=\"kt_content_container\"]/div[2]/div[2]/form/div/div/div[4]/div/input";
	public String IPChMntPyDocStupSav="//*[@id=\"kt_content_container\"]/div[2]/div[2]/form/div/div/div[5]/button";
	public String IPChMntPyDocStupUpld="//*[@id=\"kt_content_container\"]/div[2]/div[2]/form/div/div/div[2]/div/label/div/h6";
	public String IPChMntPyBckBtn="//*[@id=\"kt_content_container\"]/div[1]/div/div/div[3]/div/a[7]/div/div/span";
	public String IPEditCusAct="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div/a";
	public String IPEditCusEditPy="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div/div/div[1]/a/div/div";
	public String IPEditCusRob="//*[@id=\"kt_content_container\"]/form/div/div[2]/div/div[2]/div[10]/div[3]/div/div/div[1]/div/div/div/input";
	public String IPEditCusAgree="//*[@id=\"kt_content_container\"]/form/div/div[2]/div/div[2]/div[10]/div[3]/div/div/div[2]/div/div/div/input";
	public String IPEditCusUpd="//*[@id=\"kt_content_container\"]/form/div/div[2]/div/div[2]/div[10]/div[3]/div/div/div[3]/div/button";
	public String IPEditCusChngInvDt="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div/div/div[2]/a/div/div";
	public String IPEditCusChngPyDt="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[3]/button";
	public String IPEditCusChngMan="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div/div/button";
	public String IPEditCusChngInvEff="effectivefrom";
	public String IPEditCusChngInvPyDte="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div/div[2]/select";
	public String IPEditCusStpPy="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div/div/div[3]/a/div/div";
	public String IPEditCusStpPyCnfrm="confirm";//name
	public String IPEditCusStpPyCnfrmBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[3]/div/div[4]/button";
	public String IPEditCusStpFrm="stopsfrom";//name
	public String IPEditCusStpRsn="Reason";//name
	public String IPQckUpld="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div/div/div[4]/a/div/div";
	public String IPQckUpldBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/button";
	public String IPQckUpldTost="//*[@id=\"1\"]/div[1]/div[2]";
	public String IPQckUpldSamFile="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/a";
	public String IPQckUpldFile="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[2]/div[2]/div[2]/label/div/h6";
	public String IPQckUpldMonth="//*[@id=\"kt_content_container\"]/div/div[2]/div[2]/div[1]/div[2]/input";
	public String IPEditCusBckBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[1]/div/div/a/div/div/div";

	public String CretInvBtn="//*[@id=\"#kt_aside_menu\"]/div[5]/div/div[5]/a/span[2]";
	public String CIBnkDD="//*[@id=\"kt_content_container\"]/div/div[1]/div/div[1]/select";
	public String CIPyOpt="//*[@id=\"kt_content_container\"]/div/div[1]/div/div[2]/select";
	public String CISrchCus="//*[@id=\"kt_content_container\"]/div/div[1]/div/div[4]/input";
	public String CIViewCusBtn="//*[@id=\"kt_table_users\"]/tbody/tr[1]/td[9]/div/div/a/span";
	public String CIViewCusAct="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div/div/div/div/div[5]/a";
	public String CIViewCusAddLine="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div/div/div/div/div[5]/div/div/div/div";
	public String CIViewCusBckBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div/div/div/div/div[5]/div/a/div/div/div";
	public String CIViewCusSavBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[4]/div/button";
	public String CIViewCusMPBtn="no";//name
	public String CIViewCusMPDueMnt="duemonth";//name
	public String CIViewCusMPDes="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[2]/div/input";//name
	public String CIViewCusMPAmt="amount";//name
	public String CIViewCusMPClrBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[5]/button[1]";
	public String CIViewCusMPSavBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/form/div/div[5]/button[2]/span";
	public String CIViewCusMPRadBtn="MP";//name
	public String CIViewCusMPChrgRadBtn="MAN";//name
	public String CIViewCusMPLFRadBtn="LF";//name
	public String CIViewCusMPClsBtn="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span";

	public String CheckPayBtn="//*[@id=\"#kt_aside_menu\"]/div[5]/div/div[6]/div/span[2]";
	public String CPBankDD="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div[1]/select";
	public String CPBankSrch="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div[2]/input";
	public String CPAddBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[2]/a/div/button";
	public String CPAddInstDD="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div[1]/div/select";
	public String CPAddCustName="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div[2]/div/div/input";
	public String CPAddSrchBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div[3]/button";
	public String CPAddSrchSugBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div/div[2]/div[2]/div/div/div[2]/div";
	public String CPCusEditRobBtn="//*[@id=\"kt_content_container\"]/div/div[2]/form/div/div[3]/div[3]/div/div/div[1]/div/div/div/input";
	public String CPCusEditSavBtn="//*[@id=\"kt_content_container\"]/div/div[2]/form/div/div[3]/div[3]/div/div/div[2]/button";
	public String CPCusEditBckBtn="//button[@class='btn btn-light me-3 btn-md']";
	public String CPCusEditDocBtn="//*[@id=\"kt_content_container\"]/div/div[2]/form/div/div[2]/label/div/p";
	public String CPCusEdiChkNam="check";//name
	public String CPCusEdiChkDate="checkdate";//name
	public String CPCusEdiChkAmt="amount";//name
	public String CPCusEdiNamAcc="nameaccount";//name
	public String CPCusEdiBnkAcc="bankaccountnumber";//name
	public String CPCusEdiBnkAccRout="bankroutingnumber";//name


	public String TicketsBtn="//*[@id=\"#kt_aside_menu\"]/div[9]/a/span/span[2]";
	public String TktDueMntCal="//*[@id=\"kt_content_container\"]/div/div[1]/div[1]/div[2]/input";
	public String TktInstDD="//*[@id=\"kt_content_container\"]/div/div[1]/div[3]/div[2]/select";
	public String TktStsDD="//*[@id=\"kt_content_container\"]/div/div[1]/div[4]/div[2]/select";
	public String TktRsnDD="//*[@id=\"kt_content_container\"]/div/div[1]/div[5]/div[2]/select";
	public String TktCusName="//*[@id=\"kt_content_container\"]/div/div[1]/div[6]/div[2]/input";
	public String TktExpBtn="//*[@id=\"kt_content_container\"]/div/div[1]/div[7]/button";
	public String TktViewBtn="//*[@id=\"kt_content_container\"]/div/div[3]/div/table/tbody/tr/td[9]/a";
	public String TktViewBtnActBtn="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[2]/a";
	public String TktViewBtnAddCmt="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[2]/div/div[1]/div/div";
	public String TktViewBtnAddCmtSave="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/button";
	public String TktViewBtnAddCmtMan="//*[@id=\"kt_body\"]/div[3]/div/div[2]/div/div[2]/div/div/div/center/button";
	public String TktViewBtnAddCmtCls="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span/span";
	public String TktViewBtnAddCmtBox="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/textarea";
	public String TktViewBtnSndMail="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[2]/div/div[2]/div/div";
	public String TktViewBtnSndMailSav="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[4]/button";
	public String TktViewBtnSndMailMan="//*[@id=\"kt_body\"]/div[3]/div/div[2]/div/div[2]/div/div/div/center/button";
	public String TktViewBtnSndMailSubj="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/input";
	public String TktViewBtnSndMailMsg="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/textarea";
	public String TktViewBtnSndMailCls="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/button/span/span";
	public String TktViewBtnClsTkt="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[2]/div/div[3]/div/div";
	public String TktViewBtnClsTktSav="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/button";
	public String TktViewBtnClsTktMan="//*[@id=\"kt_body\"]/div[3]/div/div[2]/div/div[2]/div/div/div/center/button";
	public String TktViewBtnClsTktClr="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div";
	public String TktViewBtnClsTktCls="//*[@id=\"kt_body\"]/div[2]/div/div/div/div[2]/button/span";
	public String TktViewBtnClsTktDes="//*[@id=\"kt_body\"]/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/textarea";


	public String TktViewBtnViewPyHstry="//*[@id=\"kt_content_container\"]/div/div[2]/div[1]/div[2]/div/div[4]/div/div";






































































}