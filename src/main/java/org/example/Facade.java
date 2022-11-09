package org.example;

import java.util.ArrayList;

public class Facade {
    private Factorial factorial = new Factorial();
    private ArrayListFactorial arrayListFactorial= new ArrayListFactorial();
    Facade(){}
    Facade(int n){
        factorial = new Factorial(n);
        arrayListFactorial= new ArrayListFactorial(n);
    }
    public int GetNumberFactorial(){
        return factorial.GetFactorial();
    }
    public ArrayList GetArrayListFactorial(){
        return arrayListFactorial.GetArrayFactorial();
    }
}
