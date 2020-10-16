package com.github.smchsoft.core;

public class StringUtil {

    public static final String EMPTY = "";

    public static boolean isEmpty(String str) {
        return null==str || EMPTY.equals(str);
    }
}
