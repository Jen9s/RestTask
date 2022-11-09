package org.example;

public class Factorial {
    private int factorial;
    public Factorial(){}
    public Factorial(int n){
        if(n == 1 || n == 0){
            factorial = 1;
        } else {
            int answer = 1;
            for (int i = 1; i <= n; i++) {
                answer *= i;
            }
            factorial = answer;
        }
    }

    public static int FactorialNumber(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int answer = 1;
        for(int i = 1;i <= n;i++){
            answer *= i;
        }
        return  answer;
    }

    public int GetFactorial(){
        return factorial;
    }
}
