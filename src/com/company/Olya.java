package com.company;

public class Olya extends Age {
    @Override
    public void age(int number) {
        System.out.println("Olya");

        boolean old;
        System.out.println(number);
        if (number > 50){
            System.out.println("old");
        }
        else{
            System.out.println("young");
        }
        System.out.print("\n");
    }
}
