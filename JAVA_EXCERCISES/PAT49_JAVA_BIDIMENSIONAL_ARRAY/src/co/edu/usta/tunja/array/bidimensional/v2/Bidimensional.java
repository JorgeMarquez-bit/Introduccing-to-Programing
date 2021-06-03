package co.edu.usta.tunja.array.bidimensional.v2;

import javax.swing.*;

public class Bidimensional {
    public static void main(String[] args) {
        int [][] BidArray;
        String columns,rows,input;

        columns= JOptionPane.showInputDialog("This program create dynamic bidimensional array, "+" \n Please the size of columns: ");
        rows= JOptionPane.showInputDialog("Please the size of rows: ");
        BidArray = new int[Integer.parseInt(rows)][Integer.parseInt(columns)];
        //JOptionPane.showMessageDialog(null,"Please type the values "+" for the bidimensional array of: " +rows+ "rows and " +columns+" columns");
        for (int i = 0; i < Integer.parseInt(columns) ; i++) {
            for (int j = 0; j < Integer.parseInt(rows); j++) {
                if (i%2==0){
                JOptionPane.showMessageDialog(null,"the value is  [" +i+"][" +j+"] = D ");
                }else if (1%2!=0){
                    JOptionPane.showMessageDialog(null,"The value is [" +i+"][" +j+"] = X");
                }
            }
        }
        JOptionPane.showMessageDialog(null,stringBidArray(BidArray,rows,columns));
    }
    public static String stringBidArray(int[][]BidArray, String rows, String columns){
    String answer ="";
        for (int i = 0; i <Integer.parseInt(rows) ; i++) {
            for (int j = 0; j <Integer.parseInt(columns) ; j++) {
                if (i%2==0){
                    answer+= BidArray[i][j]+" D ";
                }else if (1%2!=0){
                    answer+= BidArray[i][j]+" X ";
                }
            }
            answer+="\n";
        }
        return answer;
    }

}

