package com.softserve.ita;

//import org.testng.annotations.Test;

public class UserTest {
	// Test
	public void createUserTest() {
		System.out.println("Create user");
	}
  
	// Test that depends on createUserTest
	public void deleteUser() {
		System.out.println("Delete user");
	}
}
