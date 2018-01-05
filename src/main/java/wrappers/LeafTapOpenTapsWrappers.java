package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class LeafTapOpenTapsWrappers extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;
	public static String incidentnum,leadid1,leadid2,leadid ;
	
	@BeforeSuite
	public void beforeSuite(){
		startResult();
	}

	@BeforeTest
	public void beforeTest(){
		loadObjects();
	}
	@BeforeClass
	public void setValues(){
		testCaseName = this.getClass().getName();
		if (testCaseName.equals("LeafTapsTests.LT05_MergeLeads")){
		dataSheetName="LT005";
		browserName="chrome";
		testDescription="Merging the Leads";
		authors="Raghu";
		category="Regression";
		}
		if (testCaseName.equals("LeafTapsTests.LT04_DuplicateLead")){
			dataSheetName="LT004";
			browserName="chrome";
			testDescription="Duplicate the Lead";
			authors="Raghu";
			category="Sanity";
			}
		if (testCaseName.equals("LeafTapsTests.LT03_DeleteLead")){
			dataSheetName="LT003";
			browserName="chrome";
			testDescription="Delete the Lead";
			authors="Raghu";
			category="Sanity";
			}
		if (testCaseName.equals("LeafTapsTests.LT02_EditLead")){
			dataSheetName="LT002";
			browserName="chrome";
			testDescription="Edit the Lead";
			authors="Raghu";
			category="Smoke";
			}
		if (testCaseName.equals("LeafTapsTests.LT01_CreateLead")){
			dataSheetName="LT001";
			browserName="chrome";
			testDescription="Create the Lead";
			authors="Raghu";
			category="Smoke";
			}
	}
	
	@BeforeMethod
	public void beforeMethod(){
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);
		test.assignAuthor(authors);
		invokeApp(browserName);
		
	}
		
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
		unloadObjects();
	}
	
	@AfterMethod
	public void afterMethod(){
		endTestcase();
		quitBrowser();
		
	}
	
	@DataProvider(name="fetchData")
	public  Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	
	
	
}






