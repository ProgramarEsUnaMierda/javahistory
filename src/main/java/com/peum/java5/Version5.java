package com.peum.java5;

import java.util.List;
import java.util.ArrayList;

public enum Version5 {
    J2SE_5 ("September 30, 2004"), 
    Java_SE_6 ("December 11, 2006"), 
    Java_SE_7 ("July 28, 2011"), 
    Java_SE_8 ("March 18, 2014"), 
    Java_SE_9 ("September 21, 2017");

    private String releaseDate;

    Version5(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

}