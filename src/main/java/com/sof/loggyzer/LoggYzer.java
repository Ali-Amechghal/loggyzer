package com.sof.loggyzer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LoggYzer
{

    public static void main(String[] args) {

        Map<String, String> argsMap = new LoggYzer().parseArguments(args);
        if(argsMap == null || argsMap.size() == 0)
            System.exit(1);


    }

    /**
     * Parse given arguments
     * @param args
     * @return
     */
    public  Map<String , String> parseArguments(String[] args){
        List<String> argsList = Arrays.asList(args);
        Map<String, String> argsMap = new HashMap<>();

        if(argsList == null || argsList.size() < 4){
            help();
            return null;
        }

        argsMap.put(argsList.get(0),argsList.get(1));
        argsMap.put(argsList.get(2),argsList.get(3));

        return argsMap;
    }

    /**
     * Display help about how to use the programm
     * it should display
     *  ===================== helo ============================
     *    Please use the command bellow to run the program
     *      java -cp loggyzer.jar com.sof.loggyzer \
     *        -d path/to/the/log/directory \
     *        -s /path/to/the/stats/directory
     *
     *     -d : specify the log directory path
     *     -s : specify the directory path where
     *          the stats will be generated
     *  ========================================================
     */
    public void help(){

        final String HELP_MESSAGE = "     *  ===================== Help ============================\n" +
                "     *    Please use the command bellow to run the program\n" +
                "     *      java -cp loggyzer.jar com.sof.loggyzer \\\n" +
                "     *        -d path/to/the/log/directory \\\n" +
                "     *        -s /path/to/the/stats/directory\n" +
                "     *\n" +
                "     *     -d : specify the log directory path\n" +
                "     *     -s : specify the directory path where\n" +
                "     *          the stats will be generated\n" +
                "     *  ========================================================\n";
        System.out.println(HELP_MESSAGE);

    }
}
