package resourceCard;

import java.util.ArrayList;

import cards.Corner;
import cards.CornerPosition;
import cards.CornerState;
import cards.Symbol;

public class ResourceCard38 extends ResourceCard {

	private static int points = 1;
	private static boolean isFront= true;
	private static int number= 38;
	private static Symbol symbol = Symbol.INSECT_KINGDOM;
	//private ArrayList <Corner> corners = new ArrayList <Corner>;
	private Corner corner1 = new Corner (CornerPosition.TOP_LEFT, CornerState.EMPTY, null);
	private Corner corner2 = new Corner (CornerPosition.TOP_RIGHT, CornerState.EMPTY, null);
	private Corner corner3 = new Corner (CornerPosition.BOTTOM_RIGHT, CornerState.SYMBOL, symbol );
	private Corner corner4 = new Corner (CornerPosition.BOTTOM_LEFT,CornerState.NULL, null );
	private boolean isPlaced = false;
	
	public ResourceCard38() {}



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
		return isPlaced ;
	}
	@Override
	public void setPlaced(boolean isPlaced) {
		this.isPlaced  = isPlaced;
	}
	@Override
	public Symbol getKingdom() {
		return ResourceCard38.symbol;
	}
	
	@Override
	public boolean isFront() {
		return isFront;
	}

	@Override
	public int getResourceCardNumber() {
		return ResourceCard38.number;
	}








}
