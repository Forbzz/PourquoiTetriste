package fr.esiea.tadondindeman.Tetriste;

/**
 * Created by julien on 01/04/16.
 */
import fr.esiea.tadondindeman.PiecesRelated.LPiece;

import java.util.Scanner;


public class Tetriste {

    public static void main(String[] args){
        /*
        System.out.println("Hello World !");
        System.out.println("Yoda!");

        LPiece yo = new LPiece(4,5);
        System.out.println("position is x = " + yo.getxPos() + " Y = " + yo.getyPos());
    */

        System.out.println("Bienvenue dans notre Tetris\n");
        System.out.println("Que voulez vous faire ?\n");
        System.out.println("1: Lancer le jeu");
        System.out.print("2: voir les meilleures scores");
        System.out.println("3: Quitter Tetris");


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        do{
            switch (num) {
                case 1:
                    Game jeu = new Game();
                    jeu.runGame();
                case 2:
                    System.out.println("En phase de construction");
                case 3:
                    System.exit(0);
            }
        }while(num < 0 && num > 3);




    }

}
