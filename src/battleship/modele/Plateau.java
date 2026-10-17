package battleship.modele;

public class Plateau {

    private char[][] grille;
    
    /**
     * remplit le tableau avec '.' au debut du jeu
     * @param taille la taile du plateau
     */
    public Plateau(int taille) {
        grille = new char[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                grille[i][j] = '.';
            }
        }
    }


}
