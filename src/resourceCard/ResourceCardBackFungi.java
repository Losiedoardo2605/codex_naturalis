package resourceCard;

import java.util.ArrayList;

import cards.Corner;
import cards.CornerPosition;
import cards.CornerState;
import cards.Symbol;

public class ResourceCardBackFungi extends ResourceCard {

	private static int points = 0;
	private static boolean isFront= false;
	private static int number= 42;
	private static Symbol symbol = Symbol.FUNGI_KINGDOM;
	//private ArrayList <Corner> corners = new ArrayList <Corner>;
	private Corner corner2 = new Corner (CornerPosition.TOP_RIGHT, CornerState.EMPTY, null);
	private Corner corner3 = new Corner (CornerPosition.BOTTOM_RIGHT, CornerState.EMPTY, null );
	private Corner corner4 = new Corner (CornerPosition.BOTTOM_LEFT, CornerState.EMPTY, null);
	private Corner corner1 = new Corner (CornerPosition.TOP_LEFT, CornerState.EMPTY, null);
	private boolean isPlaced = false;
	
	public ResourceCardBackFungi() {}
	
	
	
	@Override
	public ArrayList<Corner> addCorners() {
		ArrayList <Corner> frontCorners = new ArrayList<Corner>();
		frontCorners.add(corner1);
		frontCorners.add(corner2);
		frontCorners.add(corner3);
		frontCorners.add(corner4);
		return frontCorners;
	}
	@Override
	public int getPoints() {
		return points;
	}
	@Override
	public boolean isPlaced() {
		return isPlaced;
	}
	@Override
	public void setPlaced(boolean isPlaced) {
		this.isPlaced   = isPlaced;
	}
	@Override
	public Symbol getKingdom() {
		return ResourceCardBackFungi.symbol;
	}
	
	@Override
	public boolean isFront() {
		return isFront;
	}
	@Override
	public int getResourceCardNumber() {
		return ResourceCardBackFungi.number;
	}
	@Override
	public Symbol getCentralSymbol() {
		return symbol;
	}
	
	



}
