package usta.fis;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Num1 = 0;
        int Num2 = 0;
        int result = 0;
        int operationtoDo = 0;
        Scanner keyboard = new Scanner(System.in);
        infoprogam();
        System.out.println("Please type the aritmetic operation: 1 to add, 2 to subtract, 3 to multiply, 4 to divide, 5 to know if the number is prime, and 0 to exit");
        operationtoDo = keyboard.nextInt();
        System.out.println("Please type the first number: ");
        Num1 = keyboard.nextInt();
        System.out.println("Please type the second number:");
        Num2 = keyboard.nextInt();
        result= operationCalc(Num1, Num2, operationtoDo);
        System.out.println("The result is: " + result);
    }

    public static int operationCalc(int Num1, int Num2, int operation) {
        if (operation == 1) {
            return Num1 + Num2;
        }else if (operation == 2) {
            return Num1 - Num2;
        } else if (operation == 3) {
            return Num1 * Num2;
        } else if (operation == 4&& Num2!=0) {
                return Num1 / Num2;
        }else if (operation==5){
            int v_validate =0;
            for (int i = 1; i <= Num1; i++) {
                if(Num1%i==0){
                    v_validate++;
                }
            }
            if(v_validate!=2){
                System.out.println("The number is not prime");
            }else {
                System.out.println("The number is prime");
            }
        }
            return 0;
    }

    public static void infoprogam(){
        System.out.println("This program add, subtract, multiply and divide 2 integer numbers");
        System.out.println("Developed by: Jorge Marquez");
        System.out.println("Date: 07/05/2021");
    }
}
