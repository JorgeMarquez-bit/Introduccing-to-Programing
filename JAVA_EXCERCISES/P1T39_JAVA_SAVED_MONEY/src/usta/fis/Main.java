package usta.fis;
// AUTHOR: Jorge Marquez
// DATE: 25/03/2021
// DESCRIPTION: This software calculate the total money
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        p_show_info_program();
        int v_total_saved = 0;
        for ( int i =1; i<=12; i=i + 1) {
            System.out.println("----Month---"+i+"");
            v_total_saved = v_total_saved+p_user_save_money();

        }
        System.out.println("The total saved money in year is $"+v_total_saved+"");
    }
    public static void p_show_info_program(){
        //DESCRIPTION: This method show info program(software)
        System.out.println("-----------------");
        System.out.println("SOFT-SAVED-MONEY-V1.0");
        System.out.println("MAKER: Jorge Marquez");
        System.out.println("DATE: 25/03/2021");
        System.out.println("-----------------");
    }
    public static int p_user_save_money(){
        // DESCRIPTION:This method return the saved money in a month
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the saved money in the month (CO)$:");
        int v_saved_money = keyboard.nextInt();
        while (v_saved_money<0){
            System.err.println("ERR: You saved monet cannot be less than zero, Input again the saved money (CO)$: ");
            v_saved_money= keyboard.nextInt();
        }
        return  v_saved_money;
    }
}
