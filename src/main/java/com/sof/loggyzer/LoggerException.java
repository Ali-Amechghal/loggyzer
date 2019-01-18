package com.sof.loggyzer;

import java.rmi.activation.ActivationGroup_Stub;

public class LoggerException {

    public   key;
    //Patterns :
    var clazz = "((?:[\\w\\s](?:\\$+|\\.|/)?)+)";
    var method = "\\.([\\w|_|\\$|\\s|<|>]+)";
    var exceptionClazz = "((?:\\w(?:\\$+|\\.|/)?)+)";
    var exception = "(" + exceptionClazz + "(?:Exception|Error))(: null)?";
    var sourceChars = "[^\\(\\)]+";
    var source = "\\((" + sourceChars + "(?:\\([^\\)]*\\))?)\\)";
    var frame = exception+"(?:\\s*at\\s+)" + clazz + method + "\\s*" + source;
    String cause;

    {
        cause = "((?:\\s*...\\s+\\d+\\s+more)?\\s+Caused\\s+by:\\s+)" + exception;
    }





  var eexcpetionsArray  = [];
    public  LoggerException(name, clazz, method, line, var exception){
        Exception = exception;
        this.name  =  name;
        this.class =clazz;
        this.method = method;
        this.line=line;
        this.infos = infos;

        this.key = (function(_self){
            return UTILS.replaceAll(UTILS.replaceAll(_self.name +"_"+ _self.line,":","_"), '\\.','_');
        })(this);
    }

    private string Exception;

    public string LoggerException(){
                 this.class  == _exception.class;
                 this.method == _exception.method;
                 this.line == _exception.line;
        return this.name == _exception.name;
    }
     public Exception.prototype.getKey = LoggerException(){
        return this.key;
    }



    var exceptionStats = {};
           public boolean  excpetionsArray.forEach(LoggerException(exception) {
        if (exceptionStats[exception.key]) {
            exceptionStats[exception.key].count = exceptionStats[exception.key].count + 1;
        } else {
            exceptionStats[exception.key] = {};
            exceptionStats[exception.key].infos = exception.infos;
            exceptionStats[exception.key].count = 1;

        }

        console.log(exceptionStats);
            return true;

}
 return false;


    public string getException() {
        return Exception;
    }

    public void setException(string exception) {
        Exception = exception;
    }




}

