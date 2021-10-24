package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;

import java.io.IOException;


public class CalculatorTest {
    @Test
    public void testGetNumberOfChar() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        Calculator calculator = new Calculator();
        assert (calculator.getNumberOfChar("D:\\Java\\task51\\src\\test\\resources\\test.zip", '1').equals(3));
        assert (calculator.getNumberOfChar("D:\\Java\\task51\\src\\test\\resources\\test.zip", '-').equals(2));
        assert (calculator.getNumberOfChar("D:\\Java\\task51\\src\\test\\resources\\test.zip", 'a').equals(0));
    }

    @Test
    public void testGetMaxWordLength() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        Calculator calculator = new Calculator();
        assert (calculator.getMaxWordLength("D:\\Java\\task51\\src\\test\\resources\\test.zip").equals(2));
        assert (calculator.getMaxWordLength("D:\\Java\\task51\\src\\test\\resources\\test1.zip").equals(12));
    }
}
