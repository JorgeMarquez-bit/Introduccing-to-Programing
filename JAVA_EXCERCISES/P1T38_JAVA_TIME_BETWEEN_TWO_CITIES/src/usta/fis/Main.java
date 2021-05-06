package usta.fis;
// AUTHOR: Jorge Marquez
// DATE: 25/03/2021
// DESCRIPTION: This software calculate the time between two cities(t=d/v)
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        // Calculate time =distance/ velocity
        float v_time=0; // la variable v_time es decimal = Float / double
        int v_distance = p_user_distance();
        int v_velocity = p_user_velocity();
        v_time= v_distance/v_velocity;
        System.out.println("The time between  two cities is "+v_time+" hours ");

    }
    public static void p_show_info_program(){
        //DESCRIPTION: This method show info program(software)
        System.out.println("-----------------");
        System.out.println("SOFT-CALCULATE-TIME-V1.0");
        System.out.println("MAKER: Jorge Marquez");
        System.out.println("DATE: 25/03/2021");
        System.out.println("-----------------");
    }
    public static  int p_user_distance(){
        //DESCRIPTION: This method return the distance than user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type the distance between two cities: ");
        int v_distance =  keyboard.nextInt();
        while (v_distance<0){
            System.err.println("ERR: The distance should be grater than zero, type again teh distance (KM):  ");
            v_distance=keyboard.nextInt();

        }
        return v_distance;
    }

    public static int p_user_velocity(){
        //DESCRIPTION: This method return the VELOCITY than user input

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type the constance velocity(KM/H) between two cities: ");
        int v_velocity = keyboard.nextInt();
        while (v_velocity<=0){
            System.err.println("ERR: The velocity can´t be zero, type again the velocity (KM/H):  ");
            v_velocity = keyboard.nextInt();
        }
        return v_velocity;
    }
}
