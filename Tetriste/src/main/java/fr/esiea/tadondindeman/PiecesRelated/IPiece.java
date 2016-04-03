package fr.esiea.tadondindeman.PiecesRelated;

/**
 * Created by julien on 01/04/16.
 */

public class IPiece extends Piece{
    private int[][] bluePrintTop = new int[][]{{0,1,0},{0,1,0},{0,1,0}};
    private int[][] bluePrintRight = new int[][]{{0,0,0},{1,1,1},{0,0,0}};
    private int[][] bluePrintDown = new int[][]{{0,1,0},{0,1,0},{0,1,0}};
    private int[][] bluePrintLeft = new int[][]{{0,0,0},{1,1,1},{0,0,0}};


    public IPiece(int x, int y) {
        super(x, y);
        setBlockSymbol('I');
        orientations.add(bluePrintTop);
        orientations.add(bluePrintRight);
        orientations.add(bluePrintDown);
        orientations.add(bluePrintLeft);
        setAngle(bluePrintTop);
    }


}
