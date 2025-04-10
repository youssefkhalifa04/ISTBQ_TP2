package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test ;
class CalculatorTest {
    Calculator c ;
    @Test
    void sommeDeuxEntiers() {
        int a = 2 ,  b= 3 ;
        c = new Calculator() ;
        int f = c.sommeDeuxEntiers(a,b);
        assertEquals(f , 5);

    }

    @Test
    void multiplicationDeuxEntiers() {
        int a = 2 ,  b= 3 ;
        c = new Calculator() ;
        int f = c.multiplicationDeuxEntiers(a,b);
        assertEquals(f , 6);
    }

    @Test
    void soustraction (){
        int a = 2 , b = 3 ;
        c = new Calculator();
        int f = c.soustraction(a , b );
        assertEquals(f , -1);
    }
    @Test
    void power(){
        int a = 0 , b = 3 ;
       c = new Calculator();
        int f = c.power(a , b);
        assertEquals(f , 0);
    }
    @BeforeEach
    void instance(){
        c = new Calculator();
        System.out.println("calculator created successfully!");
    }
    @AfterEach
    void setNull(){

         c = null ;
        System.out.println("calculator is set as  null\n");
    }


}