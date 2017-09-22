package com.softserve.ita;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
	@Parameters({"username", "password"})
	@Test
	public void ParameterTest(String username, String password) {
		System.out.println("User Name passed as " + username);
		System.out.println("Password passed as " + password);
	}
}
