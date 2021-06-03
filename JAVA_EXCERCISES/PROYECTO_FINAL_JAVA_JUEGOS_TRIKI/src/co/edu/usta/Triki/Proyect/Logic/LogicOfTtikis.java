package co.edu.usta.Triki.Proyect.Logic;

import javax.swing.*;

public class LogicOfTtikis {
    private char[][] ArrayForTrikis;
    private String result;
    private boolean EndGame = false;
    String ArrayView = "";

    //Este metodo es donde se crea el array para el triki
    public void ArrayTriki(int gameMOde) {
        if (gameMOde == 1) {
            ArrayForTrikis = new char[3][3];
        }
        if (gameMOde == 2) {
            ArrayForTrikis = new char[5][5];
        }

        for (int i = 0; i < ArrayForTrikis.length; i++) {
            for (int j = 0; j < ArrayForTrikis.length; j++) {
                ArrayForTrikis[i][j] = '-';
            }
        }
    }

    //En este metodo muestro el array del triki que cree arriba
    public String ShowArray() {
        ArrayView = "";
        for (int i = 0; i < ArrayForTrikis.length; i++) {
            for (int j = 0; j < ArrayForTrikis.length; j++) {
                ArrayView = ArrayView + ArrayForTrikis[i][j] + "    ";
            }
            ArrayView = ArrayView + "\n";
        }
        return ArrayView;
    }

    //Este metodo es para poder interactual con la matriz, es decir poder acceder a ella
    public void ArrayInteractive(int Player_Row, int Player_column, int TurnPlayer, int gameMOde) {
    //Seguridad por si ponen un numero no permitido
        if (gameMOde == 1) {
            while (Player_column < 0 || Player_column > 2 || Player_Row < 0 || Player_Row > 2) {
                JOptionPane.showMessageDialog(null, "You only can type the numbers froms 0 to 2, in the Triky3*3 mode");
                result = JOptionPane.showInputDialog("Select the row you want to occupy");
                Player_Row = Integer.parseInt(result);
                result = JOptionPane.showInputDialog("Select the column you want to occupy");
                Player_column = Integer.parseInt(result);
            }
        }
        if (gameMOde == 2) {
            while (Player_column < 0 || Player_column > 4 || Player_Row < 0 || Player_Row > 4) {
                JOptionPane.showMessageDialog(null, "Los numeros solo pueden ir del 0 al 4 en el modo 5x5");
                result = JOptionPane.showInputDialog("Seleccione la fila que desea ocupar");
                Player_Row = Integer.parseInt(result);
                result = JOptionPane.showInputDialog("Seleccione la columna que desea ocupar");
                Player_column = Integer.parseInt(result);
            }
        }
        //Seguridad por si seleccionan una casilla ya ocupada
        //Seguridad por si seleccionan una casilla ya ocupada
        while (ArrayForTrikis[Player_Row][Player_column] != '-') {
            JOptionPane.showMessageDialog(null, "La casilla ya esta ocupada, por favor seleccione otra");
            JOptionPane.showMessageDialog(null, ShowArray());
            JOptionPane.showMessageDialog(null, ShowArray());
            result = JOptionPane.showInputDialog("Seleccione la fila que desea ocupar");
            Player_Row = Integer.parseInt(result);
            result = JOptionPane.showInputDialog("Seleccione la columna que desea ocupar");
            Player_column = Integer.parseInt(result);
        }
        if (TurnPlayer == 1) {
            ArrayForTrikis[Player_Row][Player_column] = 'X';
        } else ArrayForTrikis[Player_Row][Player_column] = 'O';
    }

    //Este metodo es donde estan todos los if para saber si el jugador gano, estan todas las posibles opciones para ganar en los dos modos de juego
    public boolean comprobarvictoria(int mode) {
    //Este if son todas las posibilidades que hay para ganar en el modo de juego de 3*3
        if (mode == 1) {
            if (ArrayForTrikis[0][0] == 'X' && ArrayForTrikis[0][1] == 'X' && ArrayForTrikis[0][2] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[1][0] == 'X' && ArrayForTrikis[1][1] == 'X' && ArrayForTrikis[1][2] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[2][0] == 'X' && ArrayForTrikis[2][1] == 'X' && ArrayForTrikis[2][2] == 'X') {

                EndGame = true;
            }
            if (ArrayForTrikis[0][0] == 'X' && ArrayForTrikis[1][0] == 'X' && ArrayForTrikis[2][0] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][1] == 'X' && ArrayForTrikis[1][1] == 'X' && ArrayForTrikis[2][1] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][2] == 'X' && ArrayForTrikis[1][2] == 'X' && ArrayForTrikis[2][2] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][0] == 'X' && ArrayForTrikis[1][1] == 'X' && ArrayForTrikis[2][2] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[2][0] == 'X' && ArrayForTrikis[1][1] == 'X' && ArrayForTrikis[0][2] == 'X') {
                EndGame = true;
            }

            if (ArrayForTrikis[0][0] == 'O' && ArrayForTrikis[0][1] == 'O' && ArrayForTrikis[0][2] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[1][0] == 'O' && ArrayForTrikis[1][1] == 'O' && ArrayForTrikis[1][2] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[2][0] == 'O' && ArrayForTrikis[2][1] == 'O' && ArrayForTrikis[2][2] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][0] == 'O' && ArrayForTrikis[1][0] == 'O' && ArrayForTrikis[2][0] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][1] == 'O' && ArrayForTrikis[1][1] == 'O' && ArrayForTrikis[2][1] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][2] == 'O' && ArrayForTrikis[1][2] == 'O' && ArrayForTrikis[2][2] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][0] == 'O' && ArrayForTrikis[1][1] == 'O' && ArrayForTrikis[2][2] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[2][0] == 'O' && ArrayForTrikis[1][1] == 'O' && ArrayForTrikis[0][2] == 'O') {
                EndGame = true;
            }
        }  //Este if son todas las posibilidades que hay para ganar en el modo de juego de 5*5
        if (mode == 2) {
            if (ArrayForTrikis[0][0] == 'X' && ArrayForTrikis[0][1] == 'X' && ArrayForTrikis[0][2] == 'X' && ArrayForTrikis[0][3] == 'X' && ArrayForTrikis[0][4] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[1][0] == 'X' && ArrayForTrikis[1][1] == 'X' && ArrayForTrikis[1][2] == 'X' && ArrayForTrikis[1][3] == 'X' && ArrayForTrikis[1][4] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[2][0] == 'X' && ArrayForTrikis[2][1] == 'X' && ArrayForTrikis[2][2] == 'X' && ArrayForTrikis[2][3] == 'X' && ArrayForTrikis[2][4] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[3][0] == 'X' && ArrayForTrikis[3][1] == 'X' && ArrayForTrikis[3][2] == 'X' && ArrayForTrikis[3][3] == 'X' && ArrayForTrikis[3][4] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[4][0] == 'X' && ArrayForTrikis[4][1] == 'X' && ArrayForTrikis[4][2] == 'X' && ArrayForTrikis[4][3] == 'X' && ArrayForTrikis[4][4] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][0] == 'X' && ArrayForTrikis[1][0] == 'X' && ArrayForTrikis[2][0] == 'X' && ArrayForTrikis[3][0] == 'X' && ArrayForTrikis[4][0] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][1] == 'X' && ArrayForTrikis[1][1] == 'X' && ArrayForTrikis[2][1] == 'X' && ArrayForTrikis[3][1] == 'X' && ArrayForTrikis[4][1] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][2] == 'X' && ArrayForTrikis[1][2] == 'X' && ArrayForTrikis[2][2] == 'X' && ArrayForTrikis[3][2] == 'X' && ArrayForTrikis[4][2] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][3] == 'X' && ArrayForTrikis[1][3] == 'X' && ArrayForTrikis[2][3] == 'X' && ArrayForTrikis[3][3] == 'X' && ArrayForTrikis[4][3] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][4] == 'X' && ArrayForTrikis[1][4] == 'X' && ArrayForTrikis[2][4] == 'X' && ArrayForTrikis[3][4] == 'X' && ArrayForTrikis[4][4] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][0] == 'X' && ArrayForTrikis[1][1] == 'X' && ArrayForTrikis[2][2] == 'X' && ArrayForTrikis[3][3] == 'X' && ArrayForTrikis[4][4] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[4][0] == 'X' && ArrayForTrikis[3][1] == 'X' && ArrayForTrikis[2][2] == 'X' && ArrayForTrikis[1][3] == 'X' && ArrayForTrikis[0][4] == 'X') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][0] == 'O' && ArrayForTrikis[0][1] == 'O' && ArrayForTrikis[0][2] == 'O' && ArrayForTrikis[0][3] == 'O' && ArrayForTrikis[0][4] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[1][0] == 'O' && ArrayForTrikis[1][1] == 'O' && ArrayForTrikis[1][2] == 'O' && ArrayForTrikis[1][3] == 'O' && ArrayForTrikis[1][4] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[2][0] == 'O' && ArrayForTrikis[2][1] == 'O' && ArrayForTrikis[2][2] == 'O' && ArrayForTrikis[2][3] == 'O' && ArrayForTrikis[2][4] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[3][0] == 'O' && ArrayForTrikis[3][1] == 'O' && ArrayForTrikis[3][2] == 'O' && ArrayForTrikis[3][3] == 'O' && ArrayForTrikis[3][4] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[4][0] == 'O' && ArrayForTrikis[4][1] == 'O' && ArrayForTrikis[4][2] == 'O' && ArrayForTrikis[4][3] == 'O' && ArrayForTrikis[4][4] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][0] == 'O' && ArrayForTrikis[1][0] == 'O' && ArrayForTrikis[2][0] == 'O' && ArrayForTrikis[3][0] == 'O' && ArrayForTrikis[4][0] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][1] == 'O' && ArrayForTrikis[1][1] == 'O' && ArrayForTrikis[2][1] == 'O' && ArrayForTrikis[3][1] == 'O' && ArrayForTrikis[4][1] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][2] == 'O' && ArrayForTrikis[1][2] == 'O' && ArrayForTrikis[2][2] == 'O' && ArrayForTrikis[3][2] == 'O' && ArrayForTrikis[4][2] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][3] == 'O' && ArrayForTrikis[1][3] == 'O' && ArrayForTrikis[2][3] == 'O' && ArrayForTrikis[3][3] == 'O' && ArrayForTrikis[4][3] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][4] == 'O' && ArrayForTrikis[1][4] == 'O' && ArrayForTrikis[2][4] == 'O' && ArrayForTrikis[3][4] == 'O' && ArrayForTrikis[4][4] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[0][0] == 'O' && ArrayForTrikis[1][1] == 'O' && ArrayForTrikis[2][2] == 'O' && ArrayForTrikis[3][3] == 'O' && ArrayForTrikis[4][4] == 'O') {
                EndGame = true;
            }
            if (ArrayForTrikis[4][0] == 'O' && ArrayForTrikis[3][1] == 'O' && ArrayForTrikis[2][2] == 'O' && ArrayForTrikis[1][3] == 'O' && ArrayForTrikis[0][4] == 'O') {
                EndGame = true;
            }
        }
        return EndGame;
    }
}
