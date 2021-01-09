package com.example.registerandlogin;

public class Info {
    protected static String name;
    protected static String password;
    Info(){}
    public static void setName(String name) {
        Info.name = name;
    }
    public static void setPassword(String password) {
        Info.password = password;
    }

    public static String getName() {
        return name;
    }

    public static String getPassword() {
        return password;
    }
}
