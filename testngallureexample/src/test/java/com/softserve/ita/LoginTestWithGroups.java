package com.softserve.ita;

import org.testng.annotations.*;

public class LoginTestWithGroups {
  @Test(groups = "Smoke")
  public void loginWithValidPasswordTest() {
	  System.out.println("	First testcase");
  }
  
  @Test(groups = "Regression")
  public void loginWithInvalidPasswordTest() {
	  System.out.println("Second testcase");
  }
 
  @Test(groups = { "IEOnly", "Smoke" } )
  public void activeXTest() {
	  System.out.println("Third testcase");
  }
}
