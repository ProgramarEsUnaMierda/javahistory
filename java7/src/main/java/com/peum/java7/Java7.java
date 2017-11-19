package com.peum.java7;

import com.peum.java6.Java6;
import com.peum.java5.Version5;
import static com.peum.java7.Constants7.*;

import java.io.Reader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;

public class Java7 extends Java6 {

    @Override
    protected int getConstant() {
        return CONSTANT;
    }

    @Override
    protected Version5 getVersion() {
        return Version5.Java_SE_7;
    }

    @Override
    protected void printDescription() {
        System.out.println("");
        System.out.println("- Java 7 improve Generics and try-catch adding resources.");
        System.out.println("- Now you can use _ to create more legible numbers (1_234_567).");
        System.out.println("");
    }
    
    @Override
    public void runScript() {
        try (InputStream is = this.getClass().getResourceAsStream("file.js")) {
            evalThis(new InputStreamReader(is),"showVersion2","JavaScript");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }


    @Override
    protected void evalThis(Reader fr, String funcName, String engine) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine js = manager.getEngineByName(engine);
            js.eval(fr);
            Invocable invocable = (Invocable)js;
            invocable.invokeFunction(funcName, getVersion());        
        } catch (ScriptException | NoSuchMethodException ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    protected List<Integer> getIntegerList() {
        List<Integer> random = new ArrayList<>();
        return random;
    }

}