package usta.fis;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int series = 0;
        p_show_info_program();
        System.out.println("Type the number fibonacci");
        series = keyboard.nextInt();
        int fibo_array[] = new int[100];
        fibo_array = series_fibonacci(series, fibo_array);
        System.out.println("The series fibonacci for the number " + series + " is:");
        for (int i = 0; fibo_array[i] > -1; i++) {
            System.out.print(fibo_array[i] + ", ");
        }
    }

        public static int[] series_fibonacci ( int v_limit, int[] fibonacci_array){
            fibonacci_array[0] = 0;
            fibonacci_array[1] = 1;
            for (int i = 1; fibonacci_array[i - 1] + fibonacci_array[i] < v_limit; i++) {
                fibonacci_array[i + 1] = fibonacci_array[i - 1] + fibonacci_array[i];
                fibonacci_array[i + 2] = -1;
            }
            return fibonacci_array;
        }


    public static void p_show_info_program() {
        // DATE: 03/05/2021
        // DESCRIPTION: This array show you the Fibonacci sequence
        System.out.println("--------------------------------------------");
        System.out.println("         ARRAYS EXAMPLE                     ");
        System.out.println("         Maker:Jorge Marquez                ");
        System.out.println("        DESCRIPTION:Array Fibonacci sequence");
        System.out.println("--------------------------------------------");
    }
}
