package com.peum.java8;

public interface Interface8 {

    static String staticMethod() {
        return "Interface";
    }

    default void interfaceMethod() {
        System.out.println(staticMethod());
    }

}