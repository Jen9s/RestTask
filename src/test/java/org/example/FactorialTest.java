package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void GetFactorialNull(){
        Factorial tmp = new Factorial(0);
        int expected = tmp.GetFactorial();
        Assert.assertEquals(expected, 1);
    }
    @Test
    public void GetFactorialOne(){
        Factorial tmp = new Factorial(1);
        int expected = tmp.GetFactorial();
        Assert.assertEquals(expected, 1);
    }
    @Test
    public void GetFactorialFour(){
        Factorial tmp = new Factorial(4);
        int expected = tmp.GetFactorial();
        Assert.assertEquals(expected, 24);
    }
    @Test
    public void GetFactorialSix(){
        Factorial tmp = new Factorial(6);
        int expected = tmp.GetFactorial();
        Assert.assertEquals(expected, 720);
    }

    @Test
    void FactorialFour(){
        int expected = Factorial.FactorialNumber(4);
        Assert.assertEquals(expected, 24);
    }
    @Test
    void FactorialSeven(){
        int expected = Factorial.FactorialNumber(7);
        Assert.assertEquals(expected, 5040);
    }
}