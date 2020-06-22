package com.threadpro;

public class JavaTest implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        JavaTest javaTest = new JavaTest();
        JavaTest clone = (JavaTest)javaTest.clone();

        System.out.println(javaTest);
        System.out.println(clone);

    }
}
