package objectivecards;

import java.util.List;

import cards.Symbol;
import game.Manuscript;

public class ObjectiveCard3 extends ObjectiveCard {

	private static int points = 2;
	private static int number = 3;
	private static Symbol target = Symbol.PLANT_KINGDOM;
	
	@Override
	public boolean checkTarget(Manuscript man) {
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
