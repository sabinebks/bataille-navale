package battleship.modele;

import javax.naming.InvalidNameException;

import battleship.InvalidPositionException;

public class Position {
    private final int ligne;
    private final int col;

    /**
     * constructeur : cree une position valide
     * @param ligne
     * @param col
     * @throws InvalidPositionException si ligne ou col sont negatifs
     */
    public Position(int ligne, int col) {
        if (ligne < 0 || col < 0) {
            throw new InvalidNameException("les coordonnées doivent etre positives");
        }
        
        this.ligne = ligne;
        this.col = col;
    }
    
    /**
     * getter pour la ligne
     * @return la ligne
     */
    public int getLigne() {
        return this.ligne;
    }

    /**
     * getter pour la colonne
     * @return la colonne
     */
    public int getCol() {
        return this.col;
    }
    
    /**
     * representation textuelle "A1", ...
     * utilisation : affichage et saisie de position par le joueur
     * @return  
     */
    public String toString() {
        char lettre = (char) ('A' + ligne);
        return lettre + (col + 1);
    }
    
    /**
     * 
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position other = (Position) o;
        return this.row == other.row && this.col == other.col;
    }



}
