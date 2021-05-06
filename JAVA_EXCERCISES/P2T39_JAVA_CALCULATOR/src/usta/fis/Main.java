package usta.fis;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float v_total = 0; int v_system; float v_number1; float v_number2=0;
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("Select an option. 0[Exit]; 1[Addition]; 2[Subtraction]; 3[Multiplication]; 4[Division]; 5[Prime Numbers]");
            v_system = keyboard.nextInt();
            if(v_system!=0){
                while (v_system<0 || v_system>5) {
                    System.err.println("Remember, the number should be between 1 - 5 and be an integer");
                    v_system = keyboard.nextInt();
                }
                System.out.println("Welcome. Please, type/input the number you want to insert for this software.");
                v_number1 = keyboard.nextFloat();
                if (v_system!=5) {
                    System.out.println("Now, input the second number you want to insert for this software.");
                    v_number2 = keyboard.nextFloat();
                }
                p_user_number(v_number1, v_number2, v_system, v_total);
            }
            else{System.out.println("Goodbye!");}
        } while(v_system!=0);
    }

    public static void p_show_info_program() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("      SoftBasicCalculatorV1.1      ");
        System.out.println("   Maker: Jorge Marquez.   ");
        System.out.println("      Date: April / 15 / 2021      ");
        System.out.println("╚═════════════════════════════════╝");
    }

    public static String p_user_number(float v_number1, float v_number2, int v_system, float v_total) {
        String v_convert="";
        Scanner keyboard = new Scanner(System.in);
        switch (v_system) {
            case 1 -> v_total = v_number1 + v_number2;
            case 2 -> v_total = v_number1 - v_number2;
            case 3 -> v_total = v_number1 * v_number2;
            case 4 -> {
                while (v_number2 == 0) {
                    System.err.println("We've a problem. The second number should beError the numbers entered are incorrect please type it again ");
                    v_number2 = keyboard.nextFloat();
                }
                v_total = v_number1 / v_number2;
            }
            case 5 -> {
                System.out.println("Do you want to check if if your number is prime (input 1) or see the prime numbers behind this (input 2)?");
                int v_case_five = keyboard.nextInt();
                while(v_case_five<1||v_case_five>2){
                    System.err.println("Oh no, we've a problem. Please, insert again the number. Remember, your selection should be an integer");
                    v_case_five = keyboard.nextInt();
                }
                if(v_case_five==1){
                    System.out.println(v_number1+" isn't a prime");
                    if(p_validate_prime(v_number1)){
                        System.out.println(v_number1+" is a prime");
                    }
                }
                if (v_case_five==2){
                    p_prime_numbers(v_number1);
                    System.out.println(p_prime_numbers(v_number1));
                }
            }
            default -> System.out.println("Oh no, we've a problem. Please, insert again the number. Remember, your selection should be an integer");
        }
        if(v_system!=5){
            System.out.println("The answer is: "+v_total+".");
        }
        if(v_convert.isEmpty()){
            v_convert=String.valueOf(v_total);
        }
        return v_convert; //Float.toString(v_total);v_result+""; String.valueOf(v_total);
    }

    public static boolean p_validate_prime(float v_number1){
        int v_n_divide=0;
        for(int i=1;i<=v_number1;i++){
            if(v_number1%i==0){
                v_n_divide++;
            }
        }
        if(v_n_divide!=2){
            return false;
        }
        return true;
    }

    public static String p_prime_numbers(float v_number1){
        String prime_numbers="";
        int p_pos_counter=0; int[]int_prime_numbers=new int[100];
        for(int i=1;i<=v_number1;i++) {
            if(p_validate_prime(i)) {
                prime_numbers = prime_numbers+String.valueOf(i) + ", ";
            }
        }
        return prime_numbers;
    }
}
