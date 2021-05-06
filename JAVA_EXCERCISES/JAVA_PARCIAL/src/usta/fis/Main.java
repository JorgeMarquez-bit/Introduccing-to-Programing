package usta.fis;
//AUTHOR: Jorge Marquez, Juan Felipe Villanueva, Paula Martinez
//DATE: 26/03/2021
//DESCRIPTION: First Parcial
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
      p_show_info_program();
      int v_average_height=0;
      int v_height_sum=0;
        for (int i =1; i<=5;i=i+1) {
        System.out.println("----Person-----"+i+"");
        v_height_sum=v_height_sum+p_height(i);
        }
        v_average_height=v_height_sum/5;
        System.out.println("The average of the heights is "+v_average_height+" ");
    }
    public static void p_show_info_program(){
        //DESCRIPTION: First Parcial
        System.out.println("--------------");
        System.out.println("Parcial V1.0");
        System.out.println("AUTHORS: Jorge Marquez, Juan Felipe Villanueva, Paula Martinez ");
        System.out.println("DATE: 26/03/2021");
        System.out.println("--------------");
    }

    public static int p_height(int i){
        //DESCRIPTION: This method return the size of 5 persons
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the height of person "+i+" : ");
        int v_height = keyboard.nextInt();
        while (v_height<50 || v_height>200){
            System.err.println("ERR: The height of the person is incorrect it need to be between 50 and 200. Type again the height ");
            v_height=keyboard.nextInt();
        }
    return v_height;
    }

}

