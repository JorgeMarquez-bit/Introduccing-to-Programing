package usta.fis;
import  java.util.Scanner;
public class Main {
    public static void p_show_info_program() {
        // DATE: 03/05/2021
        // DESCRIPTION: This array show you the Fibonacci sequence
        System.out.println("--------------------------------------------");
        System.out.println("         ARRAYS EXAMPLE                     ");
        System.out.println("         Maker:Jorge Marquez                ");
        System.out.println("        DESCRIPTION:Array Fibonacci sequence");
        System.out.println("--------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int series = 0;
        int i =0;
        p_show_info_program();
        System.out.println("Type the number fibonacci");
        series = keyboard.nextInt();
        int fibo_array[] = new int[100];
        fibo_array = series_fibonacci(series, fibo_array);
        System.out.println("The series fibonacci for the number " + series + " is:");
        while ( fibo_array[i] != -1) {
            if(i>=1)
                System.out.print(",");
            if(fibo_array[i]!=-1)
                System.out.print(fibo_array[i]);
                i++;

        }
    }
    public static int[] series_fibonacci ( int v_limit, int[] fibonacci_array){
        fibonacci_array[0] = 0;
        fibonacci_array[1] = 1;
        int i =1;
        while (fibonacci_array[i - 1] + fibonacci_array[i] < v_limit) {
            fibonacci_array[i + 1] = fibonacci_array[i - 1] + fibonacci_array[i];
            fibonacci_array[i + 2] = -1;
            i++;
        }
        return fibonacci_array;
    }
}

