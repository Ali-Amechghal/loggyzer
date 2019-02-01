package com.sof.loggyzer.stats;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Extractor {

    private static String REGEX = "a*b";
    private static String INPUT = "aabfooaabfooabfoob";
    private static String REPLACE = "-";
    String clazz = "((?:[\\w\\s](?:\\$+|\\.|/)?)+)";
    String method = "\\.([\\w|_|\\$|\\s|<|>]+)";
    String exceptionClazz = "((?:\\w(?:\\$+|\\.|/)?)+)";
    String exception = "(" + exceptionClazz + "(?:Exception|Error))(: null)?";
    String sourceChars = "[^\\(\\)]+";
    String source = "\\((" + sourceChars + "(?:\\([^\\)]*\\))?)\\)";
    String frame = exception + "(?:\\s*at\\s+)" + clazz + method + "\\s*" + source;
    String cause = "((?:\\s*...\\s+\\d+\\s+more)?\\s+Caused\\s+by:\\s+)" + exception;

    public static List<ExceptionInfo> extract(StringBuilder sb) {
        List<ExceptionInfo> list = new ArrayList<>();
        return null;

    }

    public static void main(String[] args) {

        Pattern p = Pattern.compile(REGEX,Pattern.CASE_INSENSITIVE);

        // get a matcher object
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()) {
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }


}
