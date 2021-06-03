package co.edu.usta.JOptionPane_Examples.JOptionPane;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;

public class Examples {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Operación realizada correctamente");//Bien
        //JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.NO_OPTION);//Bien
        //JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);//Bien
        //JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.INFORMATION_MESSAGE);//Bien


        //MyIcon icon = new MyIcon();
        //JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Titulo", JOptionPane.DEFAULT_OPTION, icon);

        //JOptionPane.showInputDialog(Mensaje);
        //String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
        //2 Ejercicio
        //JOptionPane.showInputDialog(null,"Cómo te llamas?");
        //3
        //JOptionPane.showInputDialog(null,"Cómo te llamas?","Jorge Marquez");
        //4
        //String respuesta = JOptionPane.showInputDialog(null, "Escriba nuevamente su nombre", "Error!", JOptionPane.ERROR_MESSAGE);
        String Answer;
        int amount = 0;
        int[] Array;
        int operation = 0;
        int result = 0;
        Answer = JOptionPane.showInputDialog("Hi this program is a calculator, " +
                "\nand do an arithmetic operations, " +
                "\nplease type the amount of numbers you will use");
        amount = Integer.valueOf(Answer);
        Array = new int[amount];

        Answer = JOptionPane.showInputDialog("Please Type: \n 1 To Sum \n 2 to subtract \n 3 to multiply \n 4 to divide \n 5 to exit");
        operation = Integer.valueOf(Answer);

        for (int i = 0; i < amount; i++) {
            Answer = JOptionPane.showInputDialog("Please type the " + (i + 1) + " number");
            Array[i] = amount = Integer.valueOf(Answer);
        }
        result = Calculator(Array, operation);
        JOptionPane.showMessageDialog(null, "Your result is: " + result);
    }

    public static int Calculator(int[] Array, int operations) {
        int result = 0;
        //Operaciones
        if (operations == 1) {
            return  + Num2;
        } else if (operations == 2) {
            return Num1 - Num2;
        } else if (operations == 3) {
            return Num1 * Num2;
        } else if (operations == 4 && Num2 != 0) {
            return Num1 / Num2;
        }
            return result;
    }
}

