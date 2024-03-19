package com.example.test;

import com.example.AnimalFactory;
import com.example.logger.Logger;
import com.example.logger.Logger2;

public class Test1 {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log(Logger.LogLevel.COMMENT, "This is a comment.");
        logger.log(Logger.LogLevel.WARNING, "This is a warning.");
        logger.log(Logger.LogLevel.ERROR, "This is an error.");


    }
}
