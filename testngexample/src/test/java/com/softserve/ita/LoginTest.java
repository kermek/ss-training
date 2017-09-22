package com.softserve.ita;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Creating new user");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Deleting previously created user");
  }
  
  @Test
  public void loginWithValidPasswordTest() {
	  Assert.assertEquals(1, 2);
	  System.out.println("First testcase");
  }
  
  @Test
  public void loginWithInvalidPasswordTest() {
	  System.out.println("Second testcase");
  }
}
