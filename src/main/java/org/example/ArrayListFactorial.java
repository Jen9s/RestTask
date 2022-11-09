package org.example;

import java.util.ArrayList;

public class ArrayListFactorial {
    private ArrayList factorial = new ArrayList<>();
    public ArrayListFactorial(){}
    public ArrayListFactorial(int n) {
        if (n == 0) {
            return;
        } else {
            if (n == 1) {
                factorial.add(1);
                return;
            }
            int tmp = 1;
            for (int i = 2; i <= n + 1; i++) {
                factorial.add(tmp);
                tmp *= i;
            }
        }
    }
    public static ArrayList ArrayFactorial(int n){
        ArrayList arrayList = new ArrayList<>();
        if(n == 0){
            return arrayList;
        }
        if(n == 1){
            arrayList.add(1);
            return arrayList;
        }
        int tmp = 1;
        for(int i = 2;i <= n + 1;i++){
            arrayList.add(tmp);
            tmp *= i;
        }
        return arrayList;
    }

    public ArrayList GetArrayFactorial(){
        return factorial;
    }
}
