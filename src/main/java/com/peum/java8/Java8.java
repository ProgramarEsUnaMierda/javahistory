package com.peum.java8;

import com.peum.java7.Java7;
import com.peum.java5.Version5;

import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public class Java8 extends Java7 implements Interface8 {

    @Override
    protected Version5 getVersion() {
        return Version5.Java_SE_8;
    }

    @Override
    protected void printDescription() {
        System.out.println("");
        System.out.println("- Java 8 loves functional programming.");
        System.out.println("- Now you can add lambda to your code.");
        System.out.println("- And add default implementation of interface methods.");
        System.out.println("");
    }

    @Override
    public void printScriptManagers() {
        ScriptEngineManager manager = new ScriptEngineManager();
        List<ScriptEngineFactory> factories = manager.getEngineFactories();
        factories.forEach(sef -> System.out.println(sef.getNames()));
    }
    
    @Override
    protected void printAll(String title, List<Integer> l) {
        System.out.print(title+": ");
        l.forEach(n->System.out.print("("+n+")"));
        System.out.println("");
    }

    @Override
    protected List<Integer> getSortedList(List<Integer> l) {
        l.sort((o1,o2) -> o1.compareTo(o2));
        return l;
    }

    @Override
    protected List<Integer> getFilterList(List<Integer> l) {
        List<Integer> result = l.stream()
            .filter(n -> n%2 != 0)
            .collect(Collectors.toList()); 
        return result;
    }

    @Override
    public void runScript() {
        try (InputStream is = this.getClass().getResourceAsStream("file.js")) {
            evalThis(new InputStreamReader(is),"showVersion3","nashorn");
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    protected void printVersion(Version5...ver) {
        System.out.print("All versions: ");
        Stream.of(ver).forEach(v -> System.out.print("("+v.name()+")"));
        System.out.println("");
    }
    
}