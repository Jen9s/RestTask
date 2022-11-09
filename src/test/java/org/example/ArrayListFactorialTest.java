package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class ArrayListFactorialTest {

    @Test
    void arrayListFactorialNull() {
        ArrayList expected = new ArrayList<>();
        ArrayListFactorial arrayListFactorial= new ArrayListFactorial(0);
        expected = arrayListFactorial.GetArrayFactorial();
        ArrayList<Object> arrayList = new ArrayList<>();
        Assert.assertEquals(expected, arrayList);
    }
    @Test
    void arrayListFactorialOne() {
        ArrayList expected = new ArrayList<>();
        ArrayListFactorial arrayListFactorial= new ArrayListFactorial(1);
        expected = arrayListFactorial.GetArrayFactorial();
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(1);
        Assert.assertEquals(expected, arrayList);
    }
    @Test
    void arrayListFactorialThere() {
        ArrayList expected = new ArrayList<>();
        ArrayListFactorial arrayListFactorial= new ArrayListFactorial(3);
        expected = arrayListFactorial.GetArrayFactorial();
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(6);
        Assertions.assertEquals(expected, arrayList);
    }
    @Test
    void arrayListFactorialSeven() {
        ArrayList<Object> expected = new ArrayList<>();
        ArrayListFactorial arrayListFactorial= new ArrayListFactorial(7);
        expected = arrayListFactorial.GetArrayFactorial();
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(6);
        arrayList.add(24);
        arrayList.add(120);
        arrayList.add(720);
        arrayList.add(5040);
        Assertions.assertEquals(expected, arrayList);
    }
}