package com.sof.loggyzer.stats;

import com.sof.loggyzer.model.ExceptionInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StatisticsGenerator {

    /**
     * Count the exceptions and return stats
     *
     * @param exceptions
     * @return
     */
    public Optional<Map<String,Integer>> generateStatsByException(List<ExceptionInfo> exceptions){

        Map<String , Integer> statsMap = new HashMap<>();

        if(exceptions == null || exceptions.size() == 0){
            return Optional.empty();
        }


        for(ExceptionInfo exceptionInfo : exceptions){
           if(statsMap.get(exceptionInfo.getKey()) != null) {

               statsMap.replace(exceptionInfo.getKey(),statsMap.get(exceptionInfo.getKey())+1);

           }else{
               statsMap.put(exceptionInfo.getKey(),1);
           }

        }

        return Optional.of(statsMap);
    }

}
