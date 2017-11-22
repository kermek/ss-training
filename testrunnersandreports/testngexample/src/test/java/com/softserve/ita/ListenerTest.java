package com.softserve.ita;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.softserve.ita.utils.MyTestResultListener;

@Listeners(MyTestResultListener.class)
public class ListenerTest {

	@Test
	public void customListenerTest() {
		Assert.assertTrue(false);
	}
	
}
