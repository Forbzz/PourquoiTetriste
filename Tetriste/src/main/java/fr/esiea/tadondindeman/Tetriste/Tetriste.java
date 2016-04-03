package fr.esiea.tadondindeman.Tetriste;

/**
 * Created by julien on 01/04/16.
 */
import fr.esiea.tadondindeman.PiecesRelated.LPiece;


public class Tetriste {

    public static void main(String[] args){

        System.out.println("Hello World !");
        System.out.println("Yoda!");

        LPiece yo = new LPiece(4,5);
        System.out.println("position is x = " + yo.getxPos() + " Y = " + yo.getyPos());


        /**************************************************/
        /**************************************************/

            /*Menu choices = new Menu();

              choices.showChoices();

              Scanner reader = new Scanner(System.in);  // Reading from System.in

              do{
                System.out.println("Enter a number: ");
                int n = reader.nextInt(); // Scans the next token of the input as an int.

                if(n == 1){
                    Score scores = new Score();
                    scores.showTopScores();
                }

                else if(n == 2){

                    do{
                        System.out.println("Enter a difficulty (1 to 3): ");
                        int level = reader.nextInt();
                    }while(level < 0 && level > 3);

                    System.out.println("Enter your name: ");
                    String player=(scanner.next());

                    if(!player || player.length() > 10)
                        throw new IllegalArgumentException("name lenght must be >=1 and <=10");

                    Game jeu = new Game(level,player)
                    jeu.runGame();
                }

                else if(n==3){

               }while(n >0 && n < 6)

               System.exit(0);

            */


    }

}
