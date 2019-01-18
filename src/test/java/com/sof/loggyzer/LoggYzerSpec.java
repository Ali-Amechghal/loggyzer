package com.sof.loggyzer;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

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

	@Test
	void shouldReturnMapExceptionsWithCount(){
		// initialiser une hashmap avec 3 instances de la class LoggerException:
		// NullPointerEXceptiion  , nullpointeerexception, illegalargumentException
		// nullpointerexception:2, illegalargumentException : 1
		// asserts junit
         //creation of Hashmap
		public static final HashMap<Integer, String> map = new HashMap<Integer, String>();
		{
			//adding value to Hashmap
			map.put(2, "nullPointException");
			map.put(1,"illegalArgumentException");
            System.out.println("Testing .isEmpty() method");

            if (!map.isEmpty())
            {
                System.out.println("map : " + map.get(2));
                System.out.println("map : " + map.get(1));
                System.out.println("Size of HashMap : " + map.size());
            }
		}




	}

}
