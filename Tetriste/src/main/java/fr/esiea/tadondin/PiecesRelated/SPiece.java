package fr.esiea.tadondin.PiecesRelated;

/**
 * Created by julien on 01/04/16.
 */
public class SPiece extends Piece {


    private int[][] bluePrintTop = new int[][]{{0,4,4},{4,4,0},{0,0,0}};
    private int[][] bluePrintRight = new int[][]{{0,4,0},{0,4,4},{0,0,4}};
    private int[][] bluePrintDown = new int[][]{{0,4,4},{4,4,0},{0,0,0}};
    private int[][] bluePrintLeft = new int[][]{{0,4,0},{0,4,4},{0,0,4}};

    public SPiece(int x, int y) {
        super(x, y);
        setBlockSymbol('S');
        orientations.add(bluePrintTop);
        orientations.add(bluePrintRight);
        orientations.add(bluePrintDown);
        orientations.add(bluePrintLeft);
        setAngle(bluePrintTop);
    }
}
