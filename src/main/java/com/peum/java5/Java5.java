package com.peum.java5;

import com.peum.java5.Version5;
import static com.peum.java5.Constants5.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Comparator;

public class Java5 {

    protected int getConstant() {
        return CONSTANT;
    }

    protected Version5 getVersion() {
        return Version5.J2SE_5;
    }

    protected void printDescription() {
        System.out.println("");
        System.out.println("- This is the Java you probably use every day.");
        System.out.println("- Generics, enhacement for loops, autoboxing/unboxing, enums, varargs, stactic imports and annotations");
        System.out.println("");
    }

    public void printConstant() {
        System.out.println("Constant: "+getConstant());
    }

    public void printReleaseDate() {
        System.out.println("");
        System.out.println("****************************");
        System.out.println(getVersion().name() + ": " + getVersion().getReleaseDate());
        System.out.println("****************************");
        printDescription();
    }

    protected List<Integer> getIntegerList() {
        List<Integer> random = new ArrayList<Integer>();
        return random;
    }

    protected List<Integer> getRandomNumbers() {
        Random r = new Random();
        List<Integer> random = getIntegerList();
        for (int n=0; n<10; n++) {
            random.add(r.nextInt(100));
        }
        return random;        
    }

    protected List<Integer> getSortedList(List<Integer> l) {
        l.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        });
        return l;
    }

    protected void printAll(String title, List<Integer> l) {
        System.out.print(title+": ");
        for (int n:l) {
            System.out.print("["+n+"]");
        }
        System.out.println("");
    }

    public void printRandomNumbersInOrder() {
        List<Integer> random = getRandomNumbers();
        random = getSortedList(random);
        printAll("Sort",random);
    }

    protected List<Integer> getFilterList(List<Integer> l) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer num : l) {
            if ((num % 2) != 0) {
                result.add(num);
            }
        }
        return result;
    }

    public void printRandomOddNumbers() {
        List<Integer> random = getRandomNumbers();
        random = getFilterList(random);
        printAll("Odd",random);
    }
    
    public void printVersions() {
        printVersion(Version5.values());
    }

    protected void printVersion(Version5...ver) {
        System.out.print("All versions: ");
        for (Version5 v:ver) {
            System.out.print("["+v.name()+"]");
        }
        System.out.println("");
    }

}