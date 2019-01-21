package com.sof.loggyzer.model;

import java.util.Objects;

public class ExceptionInfo {
    private String name;
    private String clazz;
    private String methodName;
    private int line;
    private String description;
    private String key;

    public ExceptionInfo(String name, String clazz, String methodName, int line, String description) {
        this.name = name;
        this.clazz = clazz;
        this.methodName = methodName;
        this.line = line;
        this.description = description;

        this.key = generateKey(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExceptionInfo that = (ExceptionInfo) o;
        return line == that.line &&
                Objects.equals(name, that.name) &&
                Objects.equals(clazz, that.clazz) &&
                Objects.equals(methodName, that.methodName) &&
                Objects.equals(description, that.description);
    }

    public String generateKey(ExceptionInfo exceptionInfo){
        return new StringBuilder(exceptionInfo.getName())
                .append("_")
                .append(exceptionInfo.getLine())
                .toString()
                .replace(":", "_")
                .replace("\\.", "_");

    }
    @Override
    public int hashCode() {

        return Objects.hash(name, clazz, methodName, line, description);
    }

    @Override
    public String toString() {
        return "ExceptionInfo{" +
                "name='" + name + '\'' +
                ", clazz='" + clazz + '\'' +
                ", methodName='" + methodName + '\'' +
                ", line=" + line +
                ", description='" + description + '\'' +
                '}';
    }
}
