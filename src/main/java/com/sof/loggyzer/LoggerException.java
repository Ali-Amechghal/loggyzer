package com.sof.loggyzer;

import java.rmi.activation.ActivationGroup_Stub;

public class LoggerException {
    var UTILS = {};
    UTILS.replaceAll =  function(target ,searchPatten, replacement){
        return target.replace(new RegExp(searchPatten, 'g'), replacement);
    }


    var _instance  ={}
    var path = require('path'),
            fs = require('fs');

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

    _instance.help = function(){

        console.log('##################################');
        console.log('logAnalyzer Logpathfile AnalyseLevel');
        console.log('Logpathfile  : path to log file');
        console.log('AnalyseLevel : Analyzing level');
    }

    _instance.readFile = function(_path, _encoding, _callback){
        _encoding = (_encoding) || 'utf8';
        fs.readFile(_path ,_encoding, function(_error , _data){
            if(_error)
                _callback(_error, null);
            else
                _callback(null, _data);
        }
    }

    _instance.preProcessor = function(err,data){
        if(!err){
            _instance.data = data;

            var _lines = UTILS.replaceAll(UTILS.replaceAll(_instance.data ,"\r" , "") ,"\t" , "").split(/\n/);
            _instance.formattedData = _lines.join(" ");
            //console.log(_instance.formattedData);


            var arrysMtch =  _instance.formattedData.match(new RegExp(frame,'gi'));

    var eexcpetionsArray  = [];
    public  LoggerException(name, clazz, method, line, var exception){
        this.Exception = exception;
        this.name  =  name;
        this.class =clazz;
        this.method = method;
        this.line=line;
        this.infos = infos;

        this.key = (function(_self){
            return UTILS.replaceAll(UTILS.replaceAll(_self.name +"_"+ _self.line,":","_"), '\\.','_');
        })(this);
    }

    private var Exception;

    public string LoggerException(){
                 this.class  == _exception.class;
                 this.method == _exception.method;
                 this.line == _exception.line;
        return this.name == _exception.name;
    }
     public Exception.prototype.getKey = LoggerException(){
        return this.key;
    }


               var reg = new RegExp(frame,'gi');
               var match = reg.exec(_instance.formattedData);
                  while (match != null) {
                //console.log('::'+match[0]);
                var _exception =  new Exception(match[1], match[3], match[4],  match[5],match[0]);
                excpetionsArray.push(_exception);
                match = reg.exec(_instance.formattedData);
            }


                  var exceptionStats = {}
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

