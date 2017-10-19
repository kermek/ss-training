package com.softserve.ita;

import java.lang.reflect.Method;

//import org.testng.ITestContext;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

public class DataPoviderTest {
	// Data Provider "SearchProvider"
	public Object[][] getSearchData() {
		return new Object[][] { 
			{ "Lorem", "1 result" },
			{ "Ipsum", "0 results" },
			{ "Test", "5 results" }
		};
	}
	
	// Test that uses data provider "SearchProvider"
	public void searchResultsCountTest(String query, String result) {
		System.out.println("Query " + query + " found " + result);
	}
	
	// Test that uses data provider "SearchProvider" from class TestData
	public void searchResults2CountTest(String query, String result) {
		System.out.println("Query " + query + " found " + result);
	}
}
