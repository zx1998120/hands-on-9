package com.example.test;

import com.example.logger.Logger2;

public class Test2 {
    public static void main(String[] args) {
        Logger2.log(Logger2.LogLevel.COMMENT, "This is a comment.");
        Logger2.log(Logger2.LogLevel.WARNING, "This is a warning.");
        Logger2.log(Logger2.LogLevel.ERROR, "This is an error.");
    }
}
