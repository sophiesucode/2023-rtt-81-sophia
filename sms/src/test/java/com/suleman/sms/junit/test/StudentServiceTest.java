package com.suleman.sms.junit.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import com.suleman.sms.jpa.service.StudentService;
import com.suleman.sms.jpa.dao.StudentDao;

public class StudentServiceTest {
	

	
	@Test
	public void testGetStudentByEmail() {
		StudentDao student= new StudentService();
		
		
	}
	@Test
	public void testValidateStudentDetails() {
		//Given
		StudentDao student= new StudentService();
		String validEmail= "cjaulme9@bing.com";
		String validPassword="FnVklVgC6r6";
		
		//When
		boolean studentExists=  student.validateStudent(validEmail, validPassword);
		//Then
		
		assertTrue(studentExists);
	}
	
	
	@Test
	public void testIsStudentValid() {
		//Given
		StudentDao student= new StudentService();
		String validEmail= "cjaulme9@bing.com";
		String invalidPassword="JwwfrtlzVg3r6";
		
		//When
		boolean areStudentDetailsValid= student.validateStudent(validEmail, invalidPassword);
		
		//then
		
		assertFalse(areStudentDetailsValid);
	}
	
	
	@Test
	public void testAreStudentDetailsValid() {
		//Given
		StudentDao student= new StudentService();
		String invalidEmail= "cjaaulme9@bing.com";
		String validPassword="FnVklVgC6r6";
		
		//When
		boolean areStudentDetailsValid= student.validateStudent(invalidEmail, validPassword);
		
		//then
		
		assertFalse(areStudentDetailsValid);
	}
	
	
}

