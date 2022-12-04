package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testSum() {
        double answer = Main.Sum(5, 5);
        assertEquals(10, answer, 0.0);
        double answerOne = Main.Sum(-5, 12);
        assertEquals(7, answerOne, 0.0);
        double answerTwo = Main.Sum(2.5, 16.8);
        assertEquals(19.3, answerTwo, 0.0);
    }
    @Test
    public void testMinus(){
        double answer = Main.Minus(20, 10);
        assertEquals(10, answer, 0.0);
        double answerOne = Main.Minus(12, -46);
        assertEquals(58, answerOne, 0.0);
        double answerTwo = Main.Minus(6.7, 12.57);
        assertEquals(-5.87, answerTwo, 0.0001);
    }
    @Test
    public void testMultiply(){
        double answer = Main.Multiply(2, 3);
        assertEquals(6, answer, 0.0);
        double answerOne = Main.Multiply(-12, 10);
        assertEquals(-120, answerOne, 0.001);
        double answerTwo = Main.Multiply(2.37, 0);
        assertEquals(0, answerTwo, 0.001);
    }
    @Test
    public void testDivide(){
        double answer = Main.Divide(20, 5);
        assertEquals(4, answer, 0.0);
        double answerOne = Main.Divide(25, -5);
        assertEquals(-5, answerOne, 0.0001);
        double answerTwo = Main.Divide(25.7, 5.34);
        assertEquals(4.812734082397004, answerTwo, 0.000001);
    }


}