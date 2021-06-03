package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int count =0;
    int arrayV1[]=new int[5];
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please type 5 values odd to array ");
        for (int i = 0; i < arrayV1.length ; i++) {
            System.out.println("Please type the value "+(i+1));
            arrayV1[i]=keyboard.nextInt();
            while (arrayV1[i]%2==0){
                System.err.println("The value is incorrect please type a number odd "+(i+1));
                arrayV1[i]=keyboard.nextInt();
            }
        }
        for (int i = 0; i < arrayV1.length ; i++) {
            System.out.println("The value is: "+arrayV1[i]);
        }
    }
}
    //Numero par  Num1%2==0
    //Numero Impar Num1%2!=0

