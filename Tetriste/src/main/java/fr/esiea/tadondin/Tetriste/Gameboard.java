package fr.esiea.tadondin.Tetriste;

public class Gameboard {

	private static int MINIMUM_BOARD_HEIGHT;
	
	private static int MINIMUM_BOARD_WIDTH;
	
	private int height;
	
	private int width;
	
	public Gameboard(Coordinate C){
		
			
		
	}
	
	
	
	public void putPIece(Coordinate C, Piece piece){
		
		
		
	}
	
	public int getWidth(){
		
		
		return width;
	}
	
	public int getHeight(){
		
		
		return height;
	}
	
	public boolean isPlaceValid(Coordinate C, Piece piece){
		
		return false;
		
		// ou
		return true;
	}
	
	
	public boolean isPLaceFree(Coordinate C, Piece piece){
		
		return true;
		
		//or
		
		return false;
	}
	
	public void removePIece(Piece piece){
		
		
		
	}
	
	public Piece getCellContent(Coordinate C){
		
		
		
	}
	
	public void setCellContent(Coordinate C, Piece piece){
		
		
	}
	
	public String toString(){
		
		
		return null;
	}
	
	public boolean isRowFull(int row){
		
		return true;
		
		//or 
		
		//return false;
	}
	
	public int firstRowFullFromBotton(){
		int nbOfFullRow=0;
		
		return nbOfFullRow;
	}
	
	public void clearRow(int row){
		
		
	}
	
	public void makeUpperRowsFall(int row){
		
		
	}
	
}
