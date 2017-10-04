package com.softserve.ita;

//import org.testng.annotations.AfterGroups;
//import org.testng.annotations.BeforeGroups;
//import org.testng.annotations.Test;

public class GroupsDependencies {
	// this should run before group - database
	public void setupDB() {
		System.out.println("setupDB()");
	}

	// this should run after group - database
	public void cleanDB() {
		System.out.println("cleanDB()");
	}

	// test belongs to group - selenium-test
	public void runSelenium1() {
		System.out.println("runSelenium1()");
	}

	// test belongs to group - database
	public void testConnectOracle() {
		System.out.println("testConnectOracle()");
	}

	// test that runs after both selenium-test and database group are finished
	public void runFinal() {
		System.out.println("runFinal");
	}
}