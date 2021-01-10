package com.example.registerandlogin;

/**
 * This Class is for setting the info for the Register and Login
 */
public class Info {
    protected static String name;
    protected static String password;
    Info(){}

    /**
     * Setting the name
     * @param name new name
     */
    public static void setName(String name) {
        Info.name = name;
    }

    /**
     * Setting the password
     * @param password new password
     */
    public static void setPassword(String password) {
        Info.password = password;
    }

    /**
     * Getting the name
     * @return Name
     */
    public static String getName() {
        return name;
    }

    /**
     * Getting the Password
     * @return password
     */
    public static String getPassword() {
        return password;
    }
}
