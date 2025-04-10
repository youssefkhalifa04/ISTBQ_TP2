package org.example;

public class Calculator {
    public  int sommeDeuxEntiers(int a , int b ){
        return a+ b ;

    }
    public int multiplicationDeuxEntiers(int a , int b ){
        return a* b ;
    }
    public int soustraction(int a , int b ){
        return a - b ;
    }
    public int power(int a, int b) {
        int c = 1; // Initialize to 1 since anything raised to 0 is 1
        for (int i = 0; i < b; i++) {
            c = c * a; // Multiply c by a, b times
        }
        return c;
    }

}
