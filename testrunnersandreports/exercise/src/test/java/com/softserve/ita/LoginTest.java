package com.softserve.ita;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//import org.testng.Assert;
//import org.testng.annotations.*;
//
//import io.qameta.allure.Allure;

public class LoginTest {

  // this should run before all test methods in this class
  public void beforeClass() {
	  System.out.println("Creating new user");
  }

  // this should run after all test methods in this class
  public void afterClass() {
	  System.out.println("Deleting previously created user");
  }
  
  // test
  public void loginWithValidPasswordTest() {
	  System.out.println("First testcase");
//	  Assert.assertEquals(1, 2);
  }
  
  // test
  public void loginWithOldPasswordTest() {
	  int[] array = null;
	  System.out.println(array[1]);
  }
  
  // test
  public void loginWithInvalidPasswordTest() {
	  System.out.println("Second testcase");
  }
  
  // test
  public void failedWithAttachmentTest() throws IOException {
//	  Allure.addAttachment("Page source", new String(Files.readAllBytes(Paths.get("src/test/resources/source.txt"))));
//	  
//	  Path screenshot = Paths.get("src/test/resources/fail.png");
//	  Allure.addAttachment("Screenshot", Files.newInputStream(screenshot));
//	  
//	  Assert.assertEquals(1, 2);
  }
}
