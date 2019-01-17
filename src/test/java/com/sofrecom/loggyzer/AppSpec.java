package com.sofrecom.loggyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppSpec {
	
	@Test
	void shouldReturnGivenNameWithHello() {
		App app = new App();
		String message = app.getMessage("Maha");
		assertEquals("Hello Maha", message);
	}
	@Test
	void shouldAddTwoIntegers(){
		App app = new App();
		int result = app.add(2,3);
		assertEquals(5, result);
	}

}
