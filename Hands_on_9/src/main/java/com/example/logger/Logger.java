package com.example.logger;

public class Logger {
    public static final String ANSI_YELLOW = "\u001B[33m";

    public enum LogLevel {
        COMMENT,
        WARNING,
        ERROR
    }

    private static Logger instance = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(LogLevel level, String message) {
        switch (level) {
            case COMMENT:
                System.out.println("Comment: " + message);
                break;
            case WARNING:
                System.out.println(ANSI_YELLOW + "Warning: " + message + ANSI_YELLOW);
                break;
            case ERROR:
                System.err.println("Error: " + message);
                System.exit(1);
                break;
            default:
                break;
        }
    }
}
