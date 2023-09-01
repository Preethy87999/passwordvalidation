package com.simplilearn.TDDWorks;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testPassword() {
		//PasswordValidator validator = new PasswordValidator();
		//boolean result = validator.isValid("PqR@123");
		boolean result = PasswordValidator.isValid("PQR@123");
		Assert.assertEquals(true, result);
	}
}