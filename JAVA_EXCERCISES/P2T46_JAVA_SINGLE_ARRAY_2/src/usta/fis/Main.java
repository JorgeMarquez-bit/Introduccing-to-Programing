package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] mySingleArray;
        int size =0;// int size =0,i = 0,grades = 0
        int i = 0;
        int grades = 0;
        float averageResult=0;
        int SumResult=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the size for your SingleArray");
        size=keyboard.nextInt();
        mySingleArray= new int[size];
        System.out.println("Please type the grades you want to know the average ");
        while (i<mySingleArray.length){
            System.out.println("Please type the "+(i+1)+" grade:");
            grades= keyboard.nextInt();
            mySingleArray[i]= grades;
            i++;
        }
        averageResult=p_average(mySingleArray);
        System.out.println("The average grades are: "+averageResult);
        SumResult=p_sum(mySingleArray);
        System.out.println("The result of the sum the grades is: "+SumResult);
        for (int count = 0; count < mySingleArray.length ; count++) {
            System.out.print("The grade "+(count+1)+" is: " +mySingleArray[count]+",");
        }
    }
    public static float p_average( int[] mySingleArray ){
        float average=0;
        int sum =0;
        sum= p_sum(mySingleArray);
        average = sum/mySingleArray.length;
        return average;//sum/mySingleArray.length
    }
    public static int p_sum(int[]mySingleArray){
        int counter=0;
        int sum=0;
        while (counter<mySingleArray.length){
            sum = sum + mySingleArray[counter];
            counter++;
        }
        return sum;
    }
}
