package com.peum;

import com.peum.java5.Java5;
import com.peum.java6.Java6;
import com.peum.java7.Java7;
import com.peum.java8.Java8;
import com.peum.java9.Java9;

public class JavaHistory {

    public static void main(String[] args) {

        Java5 j5 = new Java5();
        j5.printReleaseDate();
        j5.printConstant();
        j5.printVersions();
        j5.printRandomNumbersInOrder();
        j5.printRandomOddNumbers();

        Java6 j6 = new Java6();
        j6.printReleaseDate();
        j6.printConstant();
        j6.printVersions();
        j6.printRandomNumbersInOrder();
        j6.printRandomOddNumbers();
        j6.printScriptManagers();
        j6.runScript();


        Java7 j7 = new Java7();
        j7.printReleaseDate();
        j7.printConstant();
        j7.printVersions();
        j7.printRandomNumbersInOrder();
        j7.printRandomOddNumbers();
        j7.printScriptManagers();
        j7.runScript();

        Java8 j8 = new Java8();
        j8.printReleaseDate();
        j8.printConstant();
        j8.printVersions();
        j8.printRandomNumbersInOrder();
        j8.printRandomOddNumbers();
        j8.printScriptManagers();
        j8.runScript();

        Java8 j9 = new Java9();
        j9.printReleaseDate();
        j9.printConstant();
        j9.printVersions();
        j9.printRandomNumbersInOrder();
        j9.printRandomOddNumbers();
        j9.printScriptManagers();
        j9.runScript();

    }
}