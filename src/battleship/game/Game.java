package battleship.game; 

import java.util.Scanner;

import battleship.modele.Plateau;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plateau plateau = new Plateau(10);

        // on place les bateaux 
        plateau.placerBateauHorizontal(2, 3, 3); // bateau 1
        plateau.placerBateauVertical(5, 1, 4);   // bateau 2
        plateau.placerBateauHorizontal(7, 6, 2);

        
    }
}