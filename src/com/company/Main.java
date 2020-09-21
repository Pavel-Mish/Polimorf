package com.company;

public class Main {

    public static void main (String[] args){
        Age[] arr = new Age[] {new Olya(), new Valera()};
        for (int i = 0; i < arr.length; i++){
            int j = (i + 2) * 22;
            arr[i].age(j);
        }
    }

}
