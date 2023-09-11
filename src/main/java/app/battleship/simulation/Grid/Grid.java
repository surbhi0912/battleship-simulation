package app.battleship.simulation.Grid;

public class Grid {
    private int[][] Grid;

    public Grid(int size) {
        this.Grid = new int[size][size];
    }

    public int[][] getGrid() {
        return Grid;
    }
}
