package org.example;

public class Logger {
    private static Logger logger;
    private static Logger instance = null;
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }
    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}
