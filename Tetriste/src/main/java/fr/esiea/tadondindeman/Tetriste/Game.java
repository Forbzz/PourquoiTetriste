package fr.esiea.tadondindeman.Tetriste;

import fr.esiea.tadondindeman.PiecesRelated.PieceFactory;

/**
 * Created by julien on 02/04/16.
 */
public class Game {

    private String player;
    private GameBoard grid;
    private int score;
    private int difficulty; // entre 1 et 3


    public Game(int lvl){

    }

    private void showFinalScore(int score){
        score.showScore()
    }

    public void runGame(){
        GameBoard plateau = new GameBoard(25,12);
        PieceFactory facto = new PieceFactory(difficulty);

        Gameboard.nexstate();



    }


}