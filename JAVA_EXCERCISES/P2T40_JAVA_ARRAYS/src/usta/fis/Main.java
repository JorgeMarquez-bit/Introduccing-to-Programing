package usta.fis;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        p_process();
    }
    public static void p_show_info_program() {
        // DATE: 27/04/2021
        // DESCRIPTION: This methods show the info software
        System.out.println("--------------------------------------------");
        System.out.println("         ARRAYS EXAMPLE                     ");
        System.out.println("         Maker:Jorge Marquez                ");
        System.out.println("         DESCRIPTION: Examples for arrays   ");
        System.out.println("--------------------------------------------");
    }
    public static void p_process() {
        Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        int p_total = 0;
        int v_sum=0;
        int v_average=0;
        int p_cuts;
        System.out.println("Type the number of the cuts");
        p_cuts= keyboard.nextInt();
        while (p_cuts<=0){
            System.out.println("Please type a valid number");
            p_cuts= keyboard.nextInt();
        }
        int[] p_array_or_vector = new int[p_cuts];

        for (counter = 0; counter < p_array_or_vector.length; counter++) {
            System.out.println("Please type your note of the cut " + (counter + 1));
                p_array_or_vector[counter]= keyboard.nextInt();
                v_sum=v_sum+p_array_or_vector[counter];
                v_average=v_sum/p_cuts;
        }
        if (counter==0){
            System.out.println("The note is"+p_array_or_vector[counter]*0.1);
        }
        if (counter==1){
            System.out.println("The note is"+p_array_or_vector[counter]*0.3);
        }
        if (counter>=2){
            System.out.println("The note is"+p_array_or_vector[counter]*(0.6/(p_array_or_vector.length-2)));
        }


        System.out.println("The average of the notes is:"+v_average);
    }
    public static void p_percentage(){

    }

}


