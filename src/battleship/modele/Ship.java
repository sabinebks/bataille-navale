package battleship.modele;

public class Ship {


    private Position[] positions;
    private boolean[] hits;  
    
    /**
     * Constructeur d'un bateau.
     * @param positions tableau des positions occupées par le bateau
     */
    public Ship(Position[] positions) {
        this.positions = positions;
        this.hits = new boolean[positions.length];
    }

    /**
     * verifies if a ship occupies the position
     * @param position the position to test
     * @return true if the ship occupies the positon
     */
    public boolean occupies(Position position) {
        for (int i = 0; i < positions.length; i++) {
            if (positions[i].equals(position)) {
                return true;
            }
        }
        return false;   
    }
    
    /**
     * marks a position hitten 
     * @param position hitten position 
     */
    public void hit(Position position) {
        for (int i = 0; i < positions.length; i++) {
            if (positions[i].equals(position)) {
                hit[i] = true;
            }
        }
    }
    

    /**
     * verifies if the ship is sunk
     * @return true is the ship is sunk
     */
    public boolean isSunk() {
        for (int i = 0; i < hits.length; i++) {
            if (!hits[i]) return false;
        }
        return true;
    }




}

