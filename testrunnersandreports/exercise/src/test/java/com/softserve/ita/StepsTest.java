package com.softserve.ita;

//import org.testng.annotations.Test;
//
//import io.qameta.allure.Step;

public class StepsTest {
	
	// Test with steps
	public void testWithSteps() {
		openUrl("http://google.com");
		performSearch("Allure");
		assertResultCount(5000);
	}
	
	// Step "Open {url} url."
	private void openUrl(String url) {
		System.out.println("Opening url " + url);
	}
	
	// Step "Perform search: {query}"
	private void performSearch(String query) {
		System.out.printf("performSearch: " + query);
	}
	
	// Step "Assert result count: {count}"
	private void assertResultCount(int count) {
		System.out.println("assertResultCount: " + count);
	}
}
