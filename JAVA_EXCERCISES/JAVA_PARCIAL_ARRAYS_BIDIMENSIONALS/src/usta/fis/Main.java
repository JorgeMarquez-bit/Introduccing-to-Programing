package usta.fis;
import javax.swing.*;
public class Main {
    //
    public static void main(String[] args) {
        int [][] BidArray;
        int value;
        String rows,input,columns;
        JOptionPane.showMessageDialog(null,"This program create a dynamic bidimensional array for a bus, The size of columns is : 4 ");
        columns= JOptionPane.showInputDialog("Please type the size of columns of the bus: ");
        rows= JOptionPane.showInputDialog("Please type the size of rows of the bus: ");
        BidArray = new int[Integer.parseInt(rows)][];
        JOptionPane.showMessageDialog(null,"Please type the values for the rows of the bus " +rows+ "  rows and the columns are 4 columns");
        for (int i = 0; i <  Integer.parseInt(columns) ; i++) {
            for (int j = 0; j < Integer.parseInt(rows); j++) {
                input =JOptionPane.showInputDialog("Please type the value Array [" +i+"][" +j+"] = ");
                value=Integer.parseInt(input);
                BidArray[i][j]=value;
            }
            JOptionPane.showMessageDialog(null,Bus_stringBidArray(BidArray,rows,columns));
        }
    }
    public static String Bus_stringBidArray(int[][]BidArray, String rows, String columns){
        String answer ="";
        for (int i = 0; i <Integer.parseInt(rows) ; i++) {

            for (int j = 0; j <Integer.parseInt(columns) ; j++) {
                answer+= BidArray[i][j]+" ";
            }
            answer+="\n";
        }
        return answer;
    }
}

//Numero par  Num1%2==0
//Numero Impar Num1%2!=0