package com.sof.loggyzer.stats;

import com.sof.loggyzer.model.ExceptionInfo;

import java.util.Map;
import java.util.Optional;

public class StatisticsGeneratorSpec {

    /**
     * Count the exceptions and return stats
     * same logic as :
     *
     *exceptionsMap.forEach(function(exception) {
     *                 if(exceptionStats[exception.key]){
     *                  exceptionStats[exception.key].count = exceptionStats[exception.key].count + 1;
     *                 }else{
     *                     exceptionStats[exception.key] = {};
     *                     exceptionStats[exception.key].infos = exception.infos;
     *                     exceptionStats[exception.key].count = 1;
     *
     *                 }
     *
     *             });
     * @param exceptionsMap
     * @return
     */
    public Optional<Map<String,Integer>> generateStatsByException(Map<String,
            ExceptionInfo> exceptionsMap){
        return Optional.empty();
    }

}
