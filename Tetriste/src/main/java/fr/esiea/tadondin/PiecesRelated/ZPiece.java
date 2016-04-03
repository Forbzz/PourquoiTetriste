package fr.esiea.tadondin.PiecesRelated;

/**
 * Created by julien on 01/04/16.
 */
public class ZPiece extends Piece {

    private int[][] bluePrintTop = new int[][]{{1,1,0},{0,1,1},{0,0,0}};
    private int[][] bluePrintRight = new int[][]{{0,0,1},{0,1,1},{0,1,0}};
    private int[][] bluePrintDown = new int[][]{{1,1,0},{0,1,1},{0,0,0}};
    private int[][] bluePrintLeft = new int[][]{{0,0,1},{0,1,1},{0,1,0}};

    public ZPiece(int x, int y){
        super(x,y);
        setBlockSymbol('Z');
        orientations.add(bluePrintTop);
        orientations.add(bluePrintRight);
        orientations.add(bluePrintDown);
        orientations.add(bluePrintLeft);
        setAngle(bluePrintTop);
    }
}
