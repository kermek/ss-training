package com.softserve.ita;

//import io.qameta.allure.Link;

//import org.testng.annotations.Test;
//
//import io.qameta.allure.Issue;
//import io.qameta.allure.TmsLink;

// Test class
public class LinksTest {

//	@Link("https://wiki.jenkins.io/")
//	@Link(name = "jenkins wiki", type = "customLink")
	public void customLinkTest() {
		System.out.println("Test with custom link");
	}

//	@Issue("JENKINS-46257")
//	@TmsLink("TEST-86")
	public void issueTrackerLinkTest() {
		System.out.println("Test with test case and issue tracker links");
	}
}
