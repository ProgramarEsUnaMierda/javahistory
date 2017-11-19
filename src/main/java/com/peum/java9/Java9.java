package com.peum.java9;

import com.peum.java8.Java8;
import com.peum.java5.Version5;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Java9 extends Java8 {

    @Override
    protected Version5 getVersion() {
        return Version5.Java_SE_9;
    }

    @Override
    protected void printDescription() {
        System.out.println("");
        System.out.println("- Java 9 all about modules.");
        System.out.println("- Define your dependencies and export specific packages.");
        System.out.println("- Use variables in try-catch-with-resources.");
        System.out.println("");
    }

    @Override
    public void runScript() {
        InputStream is = this.getClass().getResourceAsStream("file.js");
        try (is) {
            evalThis(new InputStreamReader(is),"showVersion4","Nashorn");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    

}