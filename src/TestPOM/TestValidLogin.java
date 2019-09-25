package TestPOM;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import GenericMethods.baseTest;
import GenericMethods.excel;
import POM.EnterTimeTrackPage;
import POM.login;

public class TestValidLogin extends baseTest {
	@Test
	public void testValidLogin()
			throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {

		String un = excel.getdata(XL_PATH, "Sheet1", 1, 0);
		String pw = excel.getdata(XL_PATH, "Sheet1", 1, 1);
		String title = excel.getdata(XL_PATH, "Sheet1", 1, 2);

		login lp = new login(driver);
		lp.username(un);
		lp.setpassword(pw);
		lp.loginButton();
		EnterTimeTrackPage etp = new EnterTimeTrackPage(driver);
		etp.verifyHPDisplayed(driver, 5, title);
	}

}
