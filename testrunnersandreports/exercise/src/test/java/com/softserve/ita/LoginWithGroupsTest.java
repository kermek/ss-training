package com.softserve.ita;

//import org.testng.annotations.*;

public class LoginWithGroupsTest {
  //  Test belongs to group "Smoke"
  public void loginWithValidPasswordTest() {
	  System.out.println("	First testcase");
  }
  
  //  Test belongs to group "Regression"
  public void loginWithInvalidPasswordTest() {
	  System.out.println("Second testcase");
  }
 
  //  Test belongs to groups "Smoke" and "IEOnly"
  public void activeXTest() {
	  System.out.println("Third testcase");
  }
}
