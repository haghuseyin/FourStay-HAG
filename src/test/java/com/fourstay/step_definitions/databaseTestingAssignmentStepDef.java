package com.fourstay.step_definitions;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;

import com.fourstay.pages.EditProfile;
import com.fourstay.utilities.BrowserUtilities;
import com.fourstay.utilities.DBUtility;
import com.fourstay.utilities.DBUtility.DBType;

import cucumber.api.java.en.Then;

public class databaseTestingAssignmentStepDef {
	String query = "select first_name, last_name, lower(email), phone_number from employees";
	String firstNameFromSql;
	String lastNameFromSql;
	String emailFromSql;
	String phoneNumberFromSql;

	@Then("^the user account details should match with db$")
	public void the_user_account_details_should_match_with_db() throws Throwable {

		EditProfile editprofile = new EditProfile();

		String actualFirstName = editprofile.accountFirstName.getAttribute("value");
		String actualLastName = editprofile.accountLastName.getAttribute("value");
		String[] ArrayActualEmail = editprofile.accountEmail.getAttribute("value").split("@");
		String actualEmail = ArrayActualEmail[0];
		String actualPhoneNumber = editprofile.accountPhoneNumber.getAttribute("value");

		DBUtility.establishConnection(DBType.MYSQL);

		List<String[]> accountDetailsFromSql = DBUtility.runSQLQuery(query);

		DBUtility.closeConnections();

		for (int listindex = 0; listindex < accountDetailsFromSql.size(); listindex++) {

			String[] rowdataFromSql = accountDetailsFromSql.get(listindex);

			firstNameFromSql = rowdataFromSql[0];
			lastNameFromSql = rowdataFromSql[1];
			emailFromSql = rowdataFromSql[2];
			phoneNumberFromSql = rowdataFromSql[3].replace(".", "");

			if (firstNameFromSql.equals(actualFirstName) && lastNameFromSql.equals(actualLastName)) {
				Assert.assertEquals(actualFirstName, firstNameFromSql);
				Assert.assertEquals(actualLastName, lastNameFromSql);
				Assert.assertEquals(actualEmail, emailFromSql);
				Assert.assertEquals(actualPhoneNumber, phoneNumberFromSql);
			} else {
				continue;
			}

		}

	}

}
