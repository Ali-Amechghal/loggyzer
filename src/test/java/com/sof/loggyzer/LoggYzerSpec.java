package com.sof.loggyzer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggYzerSpec {
	
	@Test
	void shouldReturnGivenNameWithHello() {
		LoggYzer loggYzer = new LoggYzer();
		String message = loggYzer.getMessage("Maha");
		assertEquals("Hello Maha", message);
	}
	@Test
	void shouldAddTwoIntegers(){
		LoggYzer loggYzer = new LoggYzer();
		int result = loggYzer.add(2,3);
		assertEquals(5, result);
	}

}
