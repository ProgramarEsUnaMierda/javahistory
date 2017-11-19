package com.peum.java6;

import com.peum.java5.Java5;
import com.peum.java5.Version5;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.IOException;
import java.util.List;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Java6 extends Java5 {

    @Override
    protected Version5 getVersion() {
        return Version5.Java_SE_6;
    }

    @Override
    protected void printDescription() {
        System.out.println("");
        System.out.println("- Java 6 is script friendly.");
        System.out.println("- Now you have Script Engines to run JS.");
        System.out.println("");
    }
    
    public void printScriptManagers() {
        ScriptEngineManager manager = new ScriptEngineManager();
        List<ScriptEngineFactory> factories = manager.getEngineFactories();
        for(ScriptEngineFactory sef : factories){
            System.out.println(sef.getNames());
        }        
    }

    public void runScript() {
        InputStream is = null;
        try {
            is = this.getClass().getResourceAsStream("file.js");
            evalThis(new InputStreamReader(is),"showVersion","JavaScript");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (is!=null) {
                    is.close();
                }
            } catch (IOException ioe) {
                System.err.println(ioe.getMessage());
            }
        }
    }

    protected void evalThis(Reader in, String funcName, String engine) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine js = manager.getEngineByName(engine);
            js.eval(in);
            Invocable invocable = (Invocable)js;
            invocable.invokeFunction(funcName, getVersion());        
        } catch (ScriptException se) {
            System.err.println(se.getMessage());
        } catch (NoSuchMethodException nme) {
            System.err.println(nme.getMessage());
        }
    }

}