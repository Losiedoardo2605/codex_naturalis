package resourceCard;

import java.util.ArrayList;
import cards.Corner;
import cards.CornerPosition;
import cards.CornerState;
import cards.SpecialSymbol;
import cards.Symbol;

public class ResourceCard10 extends ResourceCard {
	
	private boolean isPlaced = false;
	private static int points = 0;
	private static boolean isFront= true;
	private static int number= 10;
	private static Symbol symbol = Symbol.PLANT_KINGDOM;
	private static Symbol differentSymbol = Symbol.FUNGI_KINGDOM;
	private static SpecialSymbol specialSymbol = SpecialSymbol.INKWELL;
	private Corner corner1 = new Corner (CornerPosition.TOP_LEFT, CornerState.SYMBOL, differentSymbol);
	private Corner corner2 = new Corner (CornerPosition.TOP_RIGHT, CornerState.SYMBOL, symbol );
	private Corner corner3 = new Corner (CornerPosition.BOTTOM_RIGHT, CornerState.SPECIALSYMBOL, specialSymbol);
	private Corner corner4 = new Corner (CornerPosition.BOTTOM_LEFT, CornerState.NULL, null);
	
	public ResourceCard10() {}

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
		return ResourceCard10.symbol;
	}
	
	@Override
	public boolean isFront() {
		return isFront;
	}
	
	@Override
	public int getResourceCardNumber() {
		return ResourceCard10.number;
	}

}
