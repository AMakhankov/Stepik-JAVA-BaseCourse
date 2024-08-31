package org.stepik.java.Task412;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] methods;
        methods = new Throwable().getStackTrace();

        if (methods.length>2){

            return methods[2].getClassName()+"#"+methods[2].getMethodName();

        }
        return null;
    }
}