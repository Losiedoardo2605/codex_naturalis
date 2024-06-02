package resourceCard;

import java.util.ArrayList;
import cards.Corner;
import cards.CornerPosition;
import cards.CornerState;
import cards.Symbol;

public class ResourceCard11 extends ResourceCard {

	private boolean isPlaced = false;
	private static int points = 0;
	private static boolean isFront= true;
	private static int number= 11;
	private static Symbol symbol = Symbol.FUNGI_KINGDOM;
	private Corner corner1 = new Corner (CornerPosition.TOP_LEFT, CornerState.SYMBOL, symbol);
	private Corner corner2 = new Corner (CornerPosition.TOP_RIGHT, CornerState.SYMBOL, symbol);
	private Corner corner3 = new Corner (CornerPosition.BOTTOM_RIGHT, CornerState.EMPTY, null);
	private Corner corner4 = new Corner (CornerPosition.BOTTOM_LEFT, CornerState.NULL, null);
	
	public ResourceCard11() {}
	
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
		this.isPlaced = isPlaced;
	}
	
	@Override
	public Symbol getSymbol() {
		return ResourceCard11.symbol;
	}
	
	@Override
	public boolean isFront() {
		return isFront;
	}
	
	@Override
	public int getResourceCardNumber() {
		return ResourceCard11.number;
	}
	
}