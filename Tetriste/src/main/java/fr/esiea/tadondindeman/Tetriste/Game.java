package fr.esiea.tadondindeman.Tetriste;

import fr.esiea.tadondindeman.PiecesRelated.PieceFactory;

/**
 * Created by julien on 02/04/16.
 */
public class Game {

    private String player
    private GameBoard grid;
    private Regle regle;
    private Score score;
    private int difficulty; // entre 1 et 3


    public Game(int lvl){

    }

    public void showFinalScore(Score score){
        score.showScore()
    }

    public void runGame(){
        GameBoard plateau = new GameBoard(25,12);
        PieceFactory facto = new PieceFactory(difficulty);

        Gameboard.nexstate();



    }


}