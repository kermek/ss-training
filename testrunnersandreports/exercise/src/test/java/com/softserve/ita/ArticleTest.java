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

public class ArticleTest {

  // this should run before all test methods in this class
  public void createArticle() {
	  System.out.println("Creating new article");
  }

  // this should run after all test methods in this class
  public void deleteArticle() {
	  System.out.println("Deleting previously created atricle");
  }
  
  // test
  public void viewArticleTest() {
	  System.out.println("First testcase");
//	  Assert.assertEquals(1, 2);
  }
    
  // test
  public void editArticleTest() {
	  System.out.println("Second testcase");
  }
  
  // test
  public void renameArticleTest() {
	  int[] array = null;
	  System.out.println(array[1]);
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
