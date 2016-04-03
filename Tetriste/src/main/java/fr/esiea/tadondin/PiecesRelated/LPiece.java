package fr.esiea.tadondin.PiecesRelated;

/**
 * Created by julien on 01/04/16.
 */
public class LPiece extends Piece {

    private int[][] bluePrintTop = new int[][]{{0,2,0},{0,2,0},{0,2,2}};
    private int[][] bluePrintRight = new int[][]{{0,0,0},{2,2,2},{2,0,0}};
    private int[][] bluePrintDown = new int[][]{{2,2,0},{0,2,0},{0,2,0}};
    private int[][] bluePrintLeft = new int[][]{{0,0,2},{2,2,2},{0,0,0}};

    public LPiece(int x, int y){
        super(x,y);
        setBlockSymbol('L');
        orientations.add(bluePrintTop);
        orientations.add(bluePrintRight);
        orientations.add(bluePrintDown);
        orientations.add(bluePrintLeft);
        setAngle(bluePrintTop);
    }
}