package fr.esiea.tadondin.PiecesRelated;

/**
 * Created by julien on 01/04/16.
 */
class TPiece extends Piece {

    private int[][] bluePrintTop = new int[][]{{0,5,0},{5,5,5},{0,0,0}};
    private int[][] bluePrintRight = new int[][]{{0,5,0},{0,5,5},{0,5,0}};
    private int[][] bluePrintDown = new int[][]{{5,5,5},{0,5,0},{0,0,0}};
    private int[][] bluePrintLeft = new int[][]{{0,5,0},{5,5,0},{0,5,0}};

    public TPiece(int x, int y){
        super(x,y);
        setBlockSymbol('T');
        orientations.add(bluePrintTop);
        orientations.add(bluePrintRight);
        orientations.add(bluePrintDown);
        orientations.add(bluePrintLeft);
        setAngle(bluePrintTop);
    }
}
