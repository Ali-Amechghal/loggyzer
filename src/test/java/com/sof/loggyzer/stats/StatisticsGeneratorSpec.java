package com.sof.loggyzer.stats;

import com.sof.loggyzer.model.ExceptionInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StatisticsGeneratorSpec {


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


}
