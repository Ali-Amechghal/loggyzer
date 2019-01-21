package com.sof.loggyzer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

public class LoggYzerSpec {

	private LoggYzer loggYzer;
	private static final String HELP_MESSAGE = "     *  ===================== Help ============================\n" +
			"     *    Please use the command bellow to run the program\n" +
			"     *      java -cp loggyzer.jar com.sof.loggyzer \\\n" +
			"     *        -d path/to/the/log/directory \\\n" +
			"     *        -s /path/to/the/stats/directory\n" +
			"     *\n" +
			"     *     -d : specify the log directory path\n" +
			"     *     -s : specify the directory path where\n" +
			"     *          the stats will be generated\n" +
			"     *  ========================================================\n";
	@BeforeEach
	void init(){
		loggYzer =  new LoggYzer();
	}
	@Test
	void shouldVerifyTheHelpOutPut(){
		PrintStream out = Mockito.mock(PrintStream.class);
		System.setOut(out);
		loggYzer.help();
		Mockito.verify(out).println(HELP_MESSAGE);
	}


}
