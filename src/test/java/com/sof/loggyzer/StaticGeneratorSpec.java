package com.sof.loggyzer;

import com.sof.loggyzer.StaticGenerator.StatisticsGenerator;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static groovyjarjarantlr.Tool.help;

public class StaticGeneratorSpec<test> {
    import com.sof.loggyzer.model.ExceptionInfo
	import org.junit.Assert
	import org.junit.jupiter.api.Assertions
	import org.junit.jupiter.api.Test
	import java.util.*

    //  /public Optional<Map<String,Integer>> generateStatsByException(List<ExceptionInfo> exceptions){
//
  //      Map<String , Integer> statsMap = new HashMap<>();
//
      //  if(exceptions == null || exceptions.size() == 0){
    //        return Optional.empty();
  //      }
//
//
    //    for(ExceptionInfo exceptionInfo : exceptions){
  //          if(statsMap.get(exceptionInfo.getKey()) != null) {
//
  //              statsMap.replace(exceptionInfo.getKey(),statsMap.get(exceptionInfo.getKey())+1);
//
      //      }else{
    //            statsMap.put(exceptionInfo.getKey(),1);
  //          }
//
  //      }
//
     //   return Optional.of(statsMap);
   // }

    @Test
    void shouldReturnEmptyOptionalIfGivenListIsEmpty(){
        StatisticsGenerator statisticsGenerator = new StatisticsGenerator();

        List<ExceptionInfo> exceptionsEmpty =  new ArrayList<>();
        Optional<Map<String, Integer>> optionalWhenListIsNull = statisticsGenerator.generateStatsByException(null);
        Optional<Map<String, Integer>> optionalWhenListIsEmpty = statisticsGenerator.generateStatsByException(exceptionsEmpty);

        Assert.assertFalse(optionalWhenListIsNull.isPresent());
        Assert.assertFalse(optionalWhenListIsEmpty.isPresent());


    }

    @Test
    void shouldReturnMapExceptionsWithCount(){
        //String name, String clazz, String methodName, int line, String description
        ExceptionInfo nullPointerExceptionFirst = new ExceptionInfo("NullPointerExceptiion",
                "com.sof.LoggYzer.class","parseArgumets", 11, "exception description" );

        ExceptionInfo nullPointerExceptionSecond = new ExceptionInfo("NullPointerExceptiion",
                "com.sof.LoggYzer.class","parseArgumets", 11, "exception description" );

        ExceptionInfo illegalArgumentException = new ExceptionInfo("IllegalArgumentException",
                "com.sof.LoggYzer.class","parseArgumets", 13, "exception description" );


        List<ExceptionInfo> exceptions = Arrays.asList(nullPointerExceptionFirst,
                nullPointerExceptionSecond,
                illegalArgumentException);


        StatisticsGenerator statisticsGenerator = new StatisticsGenerator();

        Optional<Map<String, Integer>> optionalStatsMap = statisticsGenerator.generateStatsByException(exceptions);
        Assertions.assertTrue(optionalStatsMap.isPresent());

        Map<String, Integer> exceptionStatsMap = optionalStatsMap.get();
        Integer nbNullPointerExceptions =   exceptionStatsMap.get(nullPointerExceptionFirst.getKey());
        Assert.assertNotNull(nbNullPointerExceptions);
        Assertions.assertEquals(2,nbNullPointerExceptions.intValue());



    }
    //public  Map<String , String> parseArguments(String[] args){
      //  List<Object> argsList = Arrays.asList(args);
        //Map<String, String> argsMap = new HashMap<>();

        //if (argsList == null || argsList.size() < 4) {
       //     help();
          //  return null;
        //}

        //argsMap.put(argsList.get(0), argsList.get(1));
       // argsMap.put(argsList.get(2), argsList.get(3));

       // return argsMap;
    //}


         @org.junit.Test




    void ShouldRetrunargsMaps () {

             List<LoggZer> argsList = new ArrayList<>();
             List<LoggZer>  argsList = argsList.get();
             Map<String, String> parseArgumentsIsNull = null;
             List<LoggZer> argsMap;
             argsMap = new ArrayList<LoggZer>();
             Map<String, String>  parseArgumentsIsFull = (Map<String, String>) argsMap.get(0);
             Assertions.assertEquals( LoggZer.help(),parseArgumentsIsNull);
             Assert.assertArrayEquals(argsMap.toArray() ,argsList);



         }
}
