package steps;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class registration_steps {
//check UI of the registration Page.
	public static void TC_Registration_002(WebDriver driver, ExtentTest logger, ExtentReports report) {
		Launch_Awax();
		Validate_RegistrationPage();
//		you should be able to see foloowing webElements
//		1. private and Institutional tabs
//		2. under Private section we should have 
//		a.Title-Drop-down.
//		b.FirstName,LastName,Email,Phone,Password,Retype Password-Text box.
//		c.Tick box " fill in your profile details now (optional)"
//		3Check box for 
//		a.I confirm that I am 18 or more.
//		b. I agree with Awax Terms and Condition.
//		c.I agree with Awax Privac Policy.
//		4.register button.
		
	}

	public static void TC_Registration_003(WebDriver driver, ExtentTest logger, ExtentReports report) {
		Launch_Awax();
//		check for all WebElements for their desired input .
//		Title must be -Mr,Mrs,Miss.
//		Name and last can accept all alphabets.
//		emailID must take all the alphabets and numbers and @.
//		Password and retype password must take all the input char.
		
	}

	public static void TC_Registration_004(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1. Launch Awax.co.uk
		Launch_Awax();
//		2.do not fill in any fields
//		3. click on register
		
	}

	public static void TC_Registration_005(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1. Launch Awax.co.uk
//		2. fill in all fields
//		3. click on register without ticking I agree and I confirm check boxes.
		
	}

	public static void TC_Registration_006(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1. Launch Awax.co.uk
//		2. copy and paste password in Retype Password field.
		
	}

	public static void TC_Registration_007(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch awax.co.uk
//		2. select "Fill in your Profile details now(Optional)" check box.
//		3.you should be able to see following webElements
//		following checkboxes
//		a.Trading Platform ,Banking solution ,Social Network , Club-All in one row. And a select all button next to it in a flashing pink colour.
//		b.Date of birth,Month of birth,Year of Birth,Country of Birth ,Natinality and Gender-all in one row with drop down options.
//		c.Address line 1 and 2 -textboxes in one row
//		d.City , Postcode 
//		c.Address line 1 and 2 -textboxes in one row
//		d.Country- Drop down text box.
//		e. Employment status and occupation- Drop down text box in one row.
//		f.Annual Income and NetWorth-Text box which will accept only numbers  ',' and '.'
//		g.Accredited/Sophesticated Invester Identification certificate-Tick box along with choose file button next to it to upload requisite document as a proof.
		
	}

	public static void TC_Registration_008(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch awax.co.uk
//		2.Scroll down to check KYC/AML Submission 
//		3.You should be able to see following button for saying choose file to upload requisite documents.(choose file button)
//		a.Proof of ID
//		b.A Photo Proof of you and your ID.
//		c.Proof of address.
		
	}

	public static void TC_Registration_009(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch Awax.co.uk
//		2.Fill in all the fields in the Private section with valid data along with additional details ,upload requisite documents
//		3. Tick all the checkboxes at the botton to coinfrm and agree.
//		4.click on the Register button.
		
	}

	public static void TC_Registration_010(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch Awax.co.uk
//		2. fill in all the fields in the Private section except EmailID and Phone
//		3. Tick all the checkboxes at the botton to coinfrm and agree.
//		4.click on the Register button.
		
	}

	public static void TC_Registration_011(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch Awax.co.uk
//		2.Fill in all the fields in the Private section with valid data along with additional details without uploading requisite documents
//		3. Tick all the checkboxes at the botton to coinfrm and agree.
//		4.click on the Register button.
		
	}

	public static void TC_Registration_012(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1. Launch Awax.co.uk
//		2.click on the Institutional tab
//		3.do not fill in any fields
//		4. click on register
		
	}

	public static void TC_Registration_013(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1. Launch Awax.co.uk
//		2.click on the Institutional tab
//		3. fill in all fields,upload all the requisite documents.
//		4. click on register without ticking I agree and I confirm check boxes.
		
	}

	public static void TC_Registration_014(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1. Launch Awax.co.uk
//		2.click on the Institutional tab
//		3. copy and paste password in Retype Password field.
		
	}

	public static void TC_Registration_015(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch awax.co.uk
//		2.click on Institutional tab.
//		you should be able to see following webElements
//		1.following checkboxes
//		a.Trading Platform ,Banking solution ,Social Network , Club-All in one row. And a select all button next to it in a flashing pink colour.
//		b.Date of birth,Month of birth,Year of Birth,Country of Birth ,Natinality and Gender-all in one row with drop down options.
//		c.Address line 1 and 2 -textboxes in one row
//		d.City , Postcode 
//		c.Address line 1 and 2 -textboxes in different row
//		d.Country- Drop down text box.
//		e. Employment status and occupation- Drop down text box in one row.
//		f.Annual Income and NetWorth-Text box which will accept only numbers  ',' and '.'
//		g.Accredited/Sophesticated Invester Identification certificate-Tick box along with choose file button next to it to upload requisite document as a proof.
		
	}

	public static void TC_Registration_016(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch awax.co.uk
//		2.click on Institutional tab.
//		3.fill in all the mandatory fields.do not upload any requisite documents.
//		4.click on register button.
		
	}

	public static void TC_Registration_017(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch awax.co.uk
//		2.click on Institutional tab.
//		you should be able to see following webElements
//		1.following checkboxes
//		a.Address line 1 and 2 -should accept all chara.
//		b.City-only alpha , Postcode-alpha and numbers
//		c.Address line 1 and 2 -all chara
//		d.Annual Income and NetWorth-Text box which will accept only numbers  ',' and '.'
		
	}

	public static void TC_Registration_018(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch Awax.co.uk
//		2.click on Institution.
//		3.Fill in all the fields in the Institution section with valid data along with additional details ,upload requisite documents
//		4. Tick all the checkboxes at the botton to coinfrm and agree.
//		5.click on the Register button.
		
	}

	public static void TC_Registration_019(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch Awax.co.uk
//		2.click on Institution tab
//		3. fill in all the fields in the institution section except EmailID and Phone
//		4. Tick all the checkboxes at the botton to coinfrm and agree.
//		5.click on the Register button.
		
	}

	public static void TC_Registration_020(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		1.Launch Awax.co.uk
//		2.click on Institution tab
//		3. fill in all the fields in the institution section except EmailID and Phone
//		4. Tick all the checkboxes at the botton to coinfrm and agree.
//		5.click on the Register button.
		
	}

	public static void TC_Registration_021(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		Following webElements should be available.
//		a.Awax logo.
//		b.register tab.
//		c.Email , Password texbox.
//		D.Login , Forgot password button
		
	}

	public static void TC_Registration_022(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		    1.Launch http://dashboard.awaxgroup.co.uk/
//			2. enter correct emailId and Password.
//			3. click on login.
		
	}

	public static void TC_Registration_023(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		    1.Launch http://dashboard.awaxgroup.co.uk/
//			2. enter incorrect emailId and Password.
//			3. click on login.
		
	}

	public static void TC_Registration_024(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		    1.Launch http://dashboard.awaxgroup.co.uk/
//			2. enter Invalid emailId and valid Password
//			3. click on login.
		
	}

	public static void TC_Registration_025(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		    1.Launch http://dashboard.awaxgroup.co.uk/
//			2. enter Invalid password login and valid emailId.
//			3. click on login.
		
	}

	public static void TC_Registration_026(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		    1.Launch http://dashboard.awaxgroup.co.uk/
//			2.click on the register button
		
	}

	public static void TC_Registration_027(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		    1.Launch http://dashboard.awaxgroup.co.uk/
//			2.click on forgot password.
//			3 following webElements should be seen
//			a. Awax logo
//			b.your emailID textbox.
//			C.reset and back to login button.
		
	}

	public static void TC_Registration_028(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		    1.Launch http://dashboard.awaxgroup.co.uk/
//			2.click on forgot password.
//			3.click on reset button without entering anything .Verify error msg
//			4.click forgot Password .
//			5. send wronge EmailID.verify error msg.
//			6.click on forgot Password
//			7. send emailid without @.verify error msg.
//			8.click on forgot password.
//			9.send correct emailid ,click on reset button.
//			10.send correct emailid and new Password sent to registered emailid.Click on login.
//			11.enter valid PIN sent to your registered emailID.click on verify
		
	}

	public static void TC_Registration_029(WebDriver driver, ExtentTest logger, ExtentReports report) {
//		    1.Launch http://dashboard.awaxgroup.co.uk/
//			2.click on forgot password.
//			3. click on back to login button
		
	}

	public static void TC_Registration_030(WebDriver driver, ExtentTest logger, ExtentReports report) {
		// TODO Auto-generated method stub
		
	}

	

}
