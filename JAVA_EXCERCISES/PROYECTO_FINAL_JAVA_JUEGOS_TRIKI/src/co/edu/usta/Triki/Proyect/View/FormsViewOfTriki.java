package co.edu.usta.Triki.Proyect.View;

import co.edu.usta.Triki.Proyect.Logic.LogicOfTtikis;
import javax.swing.*;

public class FormsViewOfTriki {
    public static LogicOfTtikis Mytriki;
    public static void main(String[] args) {

            Mytriki = new LogicOfTtikis();
            String result;
            int gameMOde;
            int placePlayer_Row;
            int placePlayer_column;
            int turn;
            char Winner = 0;
            int limit = 0;
            boolean endGame = false;
        String[] carreras = {
                "Ingeniería en sistemas computacionales",
                "Ingeniería industrial",
                "Ingeniería en mecatrónica",
                "Ingeniería en informatica",
                "Ingeniería petroquímica"
        };
        MyIcon icon = new MyIcon();
        String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una carrera a cursar", "Carrera", JOptionPane.DEFAULT_OPTION, icon, carreras, carreras[0]);
//Mensaje de inicio
            JOptionPane.showMessageDialog(null,"Proyecto Final 1 semestre \n Bienvenido a mi juego de Triki"+"\n Creador: Jorge Alberto Márquez Camargo"+"\n Ingeniero de Sistemas"+"\n Fecha: 02/06/2021");
//Selecion de modo de juego 3x3 o 5x5
            do {
                result = JOptionPane.showInputDialog("Seleccione el modo de juego\n" +
                        "1) 3x3\n" +
                        "2) 5x5");
                gameMOde = Integer.parseInt(result);
                //Seguridad para que solo se introduzcan valores de 1 o 2
                if (gameMOde != 1 && gameMOde != 2) {
                    JOptionPane.showMessageDialog(null, "Los unicos valores permitidos son 1 o 2");
                }
            } while (gameMOde != 1 && gameMOde != 2);
//Crea la matriz usando el metodo crearmatriz que se encuentra en la otra clase
            Mytriki.ArrayTriki(gameMOde);

//Muestra la matriz vacia usando el metodo mostrarmatriz que se encuentra en la otra clase
            JOptionPane.showMessageDialog(null, Mytriki.ShowArray());

//Mientras la variable findeljuego sea falsa seguira pidiendo valores
            while (endGame == false) {
                turn = 1;
                JOptionPane.showMessageDialog(null, "Turno del jugador 1 (X)");
                result = JOptionPane.showInputDialog("Seleccione la fila que desea ocupar");
                placePlayer_Row = Integer.parseInt(result);
                result = JOptionPane.showInputDialog("Seleccione la columna que desea ocupar");
                placePlayer_column = Integer.parseInt(result);

//Ocupa la casilla indicada previamente usando el metodo interactuarmatriz que se encuentra en la otra clase (revisa antes que la casilla no este ocupada)
                Mytriki.ArrayInteractive(placePlayer_Row, placePlayer_column, turn, gameMOde);

//Muestra la matriz con el valor previamente agregado
                JOptionPane.showMessageDialog(null, Mytriki.ShowArray());

//comprueba si se cumple alguna de las condiciones para que el juego termine usando el metodo comprobarvictoria que se encuentra en la otra clase
                endGame = Mytriki.comprobarvictoria(gameMOde);
                Winner = 'X';

//En caso de que todas las casillas sean llenadas la variable findeljuego tambien pasara a ser true
                limit++;
                if (gameMOde == 1 && limit == 9) {
                    endGame = true;
                }
                if (gameMOde == 2 && limit == 25) {
                    endGame = true;
                }
//Repite el procedimiento anterior pero para el jugador 2 (O)
                if (endGame == false) {
                    turn = 2;
                    JOptionPane.showMessageDialog(null, "Turno del jugador 2 (O)");
                    result = JOptionPane.showInputDialog("Seleccione la fila que desea ocupar");
                    placePlayer_Row = Integer.parseInt(result);
                    result = JOptionPane.showInputDialog("Seleccione la columna que desea ocupar");
                    placePlayer_column = Integer.parseInt(result);
                    Mytriki.ArrayInteractive(placePlayer_Row, placePlayer_column, turn, gameMOde);
                    JOptionPane.showMessageDialog(null, Mytriki.ShowArray());
                    endGame = Mytriki.comprobarvictoria(gameMOde);
                    Winner = 'O';
                    limit++;
                    if (gameMOde == 1 && limit == 9) {
                        endGame = true;
                    }
                    if (gameMOde == 2 && limit == 25) {
                        endGame = true;
                    }
                }
            }

            if (gameMOde == 1) {
                if (limit != 9) {
                    JOptionPane.showMessageDialog(null, "End game\\n" +
                            "The winner is: " + Winner);
                } else JOptionPane.showMessageDialog(null, "There are no boxes left to fill\n end game");
            }
            if (gameMOde == 2) {
                if (limit != 25) {
                    JOptionPane.showMessageDialog(null, "End game\n" +
                            "The winner is: " + Winner);
                } else JOptionPane.showMessageDialog(null, "There are no boxes left to fill\n end game");
            }

        }
}

