package co.edu.usta.tunja.bidimensional.array.BIDIMENSIONAL;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class ARRAY {
    public static void main(String []args){
    int rows=5, columns=4;
        Scanner keyboard=new Scanner(System.in);
        int [][] BidArray = new int[rows][columns];

        System.out.println("Please type the values for the bidimensional array");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <columns ; j++) {
                System.out.print("The value will lo cate on matrix[ "+i+" ] [ "+j+" ]=");
                BidArray[i][j] = keyboard.nextInt();

            }
        }
        System.out.println("The values for the BidArray are:");
        for (int i=0; i < BidArray.length; i++){
            for (int j=0; j < BidArray[i].length;j++){
                System.out.print(" " + BidArray[i][j] + " ");
                if (BidArray[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
