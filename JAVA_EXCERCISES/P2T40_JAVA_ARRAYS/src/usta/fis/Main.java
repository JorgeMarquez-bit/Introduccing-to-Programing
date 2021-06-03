package usta.fis;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float v_sum=0;
        int counter=0;
        int p_cuts;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Type the number of the cuts");
        p_cuts= entrada.nextInt();
        int [] numbers = new int[p_cuts];

        for( counter=0;counter< numbers.length;counter++){
            System.out.print((counter+1)+". Digite el numero: ");
            numbers[counter]= entrada.nextInt();
            v_sum=v_sum+numbers[counter];
        }
        // System.out.println("Valor de sum" + v_sum + " valor counter" + counter);
        System.out.println("The average of all the Terms is: "+(v_sum/counter)+".");

        for ( counter=0;counter<numbers.length;counter++){
            System.out.println("Su calificacion del corte "+ (counter+1) + " es " + numbers[counter]);

        }

    }

}




