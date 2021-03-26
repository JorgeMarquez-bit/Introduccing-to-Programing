package usta.fis;
// AUTHOR: Jorge Marquez
// DATE: 23/03/2021
// DESCRIPTION: This software calculate time between two cities
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    p_show_info_program();
    int v_distance = p_user_distance();
    }
    public static void p_show_info_program(){
        // DATE: 23/03/2021
        // DESCRIPTION: This methods show the info software
        System.out.println("--------------------------------------------");
        System.out.println("         SOFT_TIME_CYCLE VERSION 1.0        ");
        System.out.println("         Maker:Jorge Marquez                ");
        System.out.println("         DESCRIPTION: Use methods           ");
        System.out.println("--------------------------------------------");
    }
    public static  int p_user_distance(){
        Scanner keyboard = new Scanner(System.in);
        int v_distance;
        System.out.println("Type distance between two cities");
        v_distance= keyboard.nextInt();
        while (v_distance<0){
        System.err.println("ERR: The distance should be greater than zero,Type again distance between two cities");
        v_distance= keyboard.nextInt();
        }
        return v_distance;
    }
}
