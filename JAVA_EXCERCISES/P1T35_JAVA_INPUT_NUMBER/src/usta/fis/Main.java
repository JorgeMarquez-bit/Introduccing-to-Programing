package usta.fis;

//AUTHOR:JORGE MARQUEZ
//DATE: 2021 MARCH 16
//DESCRIPTION: This software show variable than input by keyboard


import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println ("------------------");
        System.out.println ("Soft Input Num version 1.0");
        System.out.println ("Maker: Jorge Marquez");
        System.out.println ("------------------");
        Scanner keyboard = new Scanner(System.in);

        int v_number1, v_number2, v_sum;
        System.out.println("Input the first number");
        v_number1= keyboard.nextInt();
        System.out.println("Input the second number");
        v_number2= keyboard.nextInt();
        v_sum= v_number1+v_number2;
        System.out.println("The total sum is " +v_sum);
    }
}
