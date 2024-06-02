package objectivecards;

import java.util.List;

import cards.Symbol;
import game.PlayArea;

public class ObjectiveCard1 extends ObjectiveCards {

	private static int points = 2;
	private static int number = 1;
	private static Symbol target = Symbol.FUNGI_KINGDOM;
	
	@Override
	public boolean checkTarget(PlayArea man) {
		 List<Symbol> symbols = man.getSymbols();
	        int count = 0;

	        for (Symbol symbol : symbols) {
	            if (symbol == target) {
	                count++;
	            }
	        }

	        if (count == 3) {
	            setPoints(points);
	            return true;
	        }
	        return false;
	    }

	    /**
	     * @return the number
	     */
	    public static int getNumber() {
	        return number;
	    }

}
