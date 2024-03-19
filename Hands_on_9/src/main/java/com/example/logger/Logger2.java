package com.example.logger;

public class Logger2 {
    public static final String ANSI_YELLOW = "\u001B[33m";

    public enum LogLevel {
        COMMENT,
        WARNING,
        ERROR
    }

    public static void log(LogLevel level, String message) {
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
