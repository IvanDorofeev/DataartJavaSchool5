package ru.dataart.academy.java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        System.out.println("Calculator get number of 1: " +
                calculator.getNumberOfChar("D:\\Java\\task5\\src\\test\\resources\\test.zip", '1'));
        System.out.println("Calculator get max length: " +
                calculator.getMaxWordLength("D:\\Java\\task5\\src\\test\\resources\\test.zip"));
    }
}