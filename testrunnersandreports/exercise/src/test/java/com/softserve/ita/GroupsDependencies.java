package com.softserve.ita;

//import org.testng.annotations.AfterGroups;
//import org.testng.annotations.BeforeGroups;
//import org.testng.annotations.Test;

public class GroupsDependencies {
	// this should run before group - email-delivery
	public void loginToGmail() {
		System.out.println("loginToGmail");
	}

	// this should run after group - email-delivery
	public void cleanUpInbox() {
		System.out.println("cleanUpInbox");
	}

	// test belongs to group - trigger-email
	public void emailProcessingTest1() {
		System.out.println("emailProcessingTest1");
	}
	
	// test belongs to group - trigger-email
	public void emailProcessingTest2() {
		System.out.println("emailProcessingTest2");
	}

	// test belongs to group - email-delivery
	public void emailDeliveryTest1() {
		System.out.println("emailDeliveryTest1");
	}
	
	// test belongs to group - email-delivery
		public void emailDeliveryTest2() {
			System.out.println("emailDeliveryTest2");
		}

	// test that runs after both email-delivery and trigger-email are finished
	public void checkEmailQueue() {
		System.out.println("checkEmailQueue");
	}
}