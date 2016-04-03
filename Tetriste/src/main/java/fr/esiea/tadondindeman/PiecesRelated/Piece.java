package fr.esiea.tadondindeman.PiecesRelated; /**
 * Created by julien on 01/04/16.
 */

import java.util.List;
import java.util.ArrayList;

public abstract class Piece {

    private char blockSymbol;
    private Boolean fixed;
    private String color;
    private int xPos, yPos;
    protected List<int[][]> orientations = new ArrayList<int[][]>();
    private int angle[][];


    Piece(int x, int y){
        this.fixed = false;
        this.xPos = x;
        this.yPos = y;

    }

    public String getColor(){
        return this.color;
    }

    public char getBlockSymbol(){
        return this.blockSymbol;
    }

    public void setBlockSymbol(char c){
        this.blockSymbol = c;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Boolean isMoving(){
        return this.fixed;
    }

    public void setFixed(boolean bol){
        this.fixed = bol;
    }

    public int getxPos(){
        return this.xPos;
    }

    public int getyPos(){
        return this.yPos;
    }

    public void setxPos(int x){
        this.xPos = x;
    }

    public void setyPos(int y){
        this.yPos = y;
    }

    public List<int[][]> getOrientations(){
        return this.orientations;
    }

    public void setAngle(int[][] angle2){ // argument will be a blueprint
        this.angle = angle2;
    }

}
