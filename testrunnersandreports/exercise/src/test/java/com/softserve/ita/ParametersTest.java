package com.softserve.ita;

//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;

public class ParametersTest {
	// Test with two parameters "username" and "defaultLanguage" and description "This is test description"
	public void usersDefaultLangugeTest(String username, String defaultLanguage) {
		System.out.println("User Name is " + username);
		System.out.println("Default language is " + defaultLanguage);
	}
	
	// Test that uses data provider "wordList"
	public void translatorTest(String original, String translated) {
		System.out.println("Word " + original + " is translated to " + translated);
	}
	
	// Data Provider "wordList"
	public Object[][] wordList() {
		return new Object[][] { 
			{ "Test", "Тест" },
			{ "Сlass", "Клас" },
			{ "Method", "Метод" }
		};
	}
}
