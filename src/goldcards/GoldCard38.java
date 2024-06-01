package goldcards;

import java.util.ArrayList;

import cards.*;

public class GoldCard38 extends GoldCard {

	private boolean isPlaced = false;
	private static int points = 3;
	private static boolean isFront = true;
	private static int number = 38;
	private static SpecialSymbol cornerSymbol = SpecialSymbol.INKWELL;
	private static Symbol kingdom = Symbol.INSECT_KINGDOM;
	
	// Card with 2 corners available
	private  Corner corner1 = new Corner (CornerPosition.TOP_LEFT, CornerState.SPECIALSYMBOL, cornerSymbol);
	private  Corner corner2 = new Corner (CornerPosition.TOP_RIGHT, CornerState.NULL ,null);
	private  Corner corner3 = new Corner (CornerPosition.BOTTOM_LEFT, CornerState.EMPTY ,null);
	private  Corner corner4 = new Corner (CornerPosition.BOTTOM_RIGHT, CornerState.NULL ,null);
	
	
	public GoldCard38() {}

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
	public ArrayList<Symbol> createRequirementsForPoints() {
		ArrayList<Symbol> requirements = new ArrayList<>();
		requirements.add(kingdom);
		requirements.add(kingdom);
		requirements.add(kingdom);
		return requirements;
	}

	/**
	 * @return the isPlaced
	 */
	public boolean isPlaced() {
		return isPlaced;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @return the isFront
	 */
	public boolean isFront() {
		return isFront;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the kingdom
	 */
	public Symbol getKingdom() {
		return kingdom;
	}

	/**
	 * @param isPlaced the isPlaced to set
	 */
	public void setPlaced(boolean isPlaced) {
		this.isPlaced = isPlaced;
	}
	
}
