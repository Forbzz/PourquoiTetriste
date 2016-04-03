package fr.esiea.tadondindeman.Tetriste;

import fr.esiea.tadondindeman.customInterfaces.Printable;
import fr.esiea.tadondindeman.PiecesRelated.Piece;
import fr.esiea.tadondindeman.PiecesRelated.IPiece;
import fr.esiea.tadondindeman.PiecesRelated.TPiece;
import fr.esiea.tadondindeman.PiecesRelated.LPiece;
import fr.esiea.tadondindeman.PiecesRelated.OPiece;
import fr.esiea.tadondindeman.PiecesRelated.SPiece;
import fr.esiea.tadondindeman.PiecesRelated.ZPiece;

import java.util.ArrayList;
import java.util.Arrays;


public class GameBoard implements Printable {

    public int[][] grid;
    private boolean[] fullLines; // true if line is full, array index is the line number
    private Piece pieceActuelle
    // Arrays.fill()

    public GameBoard(int x, int y){
        this.grid = new int[25][12];
        Arrays.fill(fullLines, true);

    }

    public void getBoardSize(){

        int y = grid.length; // length of the grid
        int x = grid[0].length; // width of the grid

        System.out.println("length of grid: " + y);
        System.out.println("width of grid is: " + x);
    }

    public boolean isPlaceFree(int[][] grid, int i, int j){
        if(grid[i][j] >= 0) {
            return false;
        }
        else {
            return false;
        }
    }

    public boolean[] checkFullLines(int[][] grid){

        int i = 0, j = 0;
        int count = 0;

        for(i=24; i >=0 ; i--){
            for(j=0; j < 12; j++){
                if(grid[i][j] >= 1){
                    count++;
                }
            }
            if(count == 12){
                fullLines[i] = true;
            }
            else{
                fullLines[i] = false;
                count = 0;
            }
        }
        return fullLines;
    }

    public void clearRows(int[][] grid, boolean[] fullLines){
        int j=0, k=0;

        for(k=0; k < 25; k++){
            if(fullLines[k]){
                for(j=0; j < 12; j++){
                    grid[k][j] = 0;
                }
            }
        }
    }

    public void gravityDropRows(int[][] grid, boolean[] fullLines){

    }

    public void draw(int[][] grid){

        int i, j;

        for(i=0; i < 25; i++){
            for(j=0; j < 12; j++){
                if(grid[i][j] >= 0) {
                    System.out.println("O");
                }
                else{
                    System.out.println(" ");
                }
            }
        }

    }




}