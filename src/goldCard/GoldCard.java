package goldCard;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import cards.*;


public abstract class GoldCard extends Card {

	private CardType type = CardType.GOLD;
	private static boolean isFront;
	private boolean isPlaced = false;
	private boolean hasCentralSymbol;
	private int points;
	private int number;
	private Symbol kingdom;
	private SpecialSymbol specialSymbol;
	private Corner corner1;
	private Corner corner2;
	private Corner corner3;
	private Corner corner4;
	private static ArrayList<Integer> assignedGoldCards= new ArrayList<>();
	
	public GoldCard () {}
	
	public ArrayList<Corner> addCorners(){
		ArrayList<Corner> corners = new ArrayList<>();
		corners.add(corner1);
		corners.add(corner2);
		corners.add(corner3);
		corners.add(corner4);
		for(int i = 0; i <corners.size(); i++) {
			corners.get(i).setPosition(CornerPosition.values()[i]);
		}
		return corners;
	}
	
	public ArrayList<Symbol> createRequirementsForPoints() {
		ArrayList<Symbol> requirements = new ArrayList<>();
		return requirements;
	}
	public static void resetGoldCards() {
		assignedGoldCards =new ArrayList<>();
	}

	/* Da definire dopo aver fatto manuscript!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * 
	public int countSpecialSymbolsOnBoard(SpecialSymbol x) {
		int specialSymbolCount = 0;

		for (GoldCard existingCard :  GoldCard4) {  
			for (Corner corner : existingCard.getCorner()) {
				if (corner.getSymbol() == x) {
					
					specialSymbolCount++;
				}
			}
		}

		return specialSymbolCount;
	}
	/**
    * Counts the number of different cards whose corners are covered by a gold card.
    *
    * @param playArea The PlayArea where the gold card is being placed.
    * @param goldCard The gold card that is covering other cards.
    * @return The number of different cards covered by the coveringCard, up to a maximum of 4.
 
	public int countCoveredCards(PlayArea playArea, GoldCard goldCard) {
       int coveredCardCount = 0;
       int size = playArea.getPlacedCards().size();
       boolean[] cardCovered = new boolean[size]; // Array per tenere traccia delle carte coperte

       for (int i = 0; i < size; i++) {
           GoldCard existingCardOnPlayArea = playArea.getPlacedCards().get(i);
           if (existingCardOnPlayArea != goldCard) { // Salta la carta stessa
               for (Corner corner : existingCardOnPlayArea.getCorners()) {
                   if (corner.isCovered()) {
                       for (Corner myCorner : goldCard.getCorners()) {
                           if (myCorner.covers(corner)) {
                               if (!cardCovered[i]) { // Controlla se la carta è già stata contata
                                   cardCovered[i] = true;
                                   coveredCardCount++;
                                   if (coveredCardCount == 4) { // Verifica se sono stati coperti 4 angoli
                                       return coveredCardCount; // Restituisci immediatamente se il limite è raggiunto
                                   }
                               }
                               break; // Passa alla carta successiva se un corner è coperto
                           }
                       }
                   }
               }
           }
       }

       return coveredCardCount;
   }
	fine metodi workinprogess */
	
	/**
	 * @return the type
	 */
	public CardType getType() {
		return type;
	}

	/**
	 * @return the isFront
	 */
	public boolean isFront() {
		return isFront;
	}

	/**
	 * @return the isPlaced
	 */
	@Override
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
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return the kingdom
	 */
	@Override
	public Symbol getKingdom() {
		return kingdom;
	}

	/**
	 * @return the specialSymbol
	 */
	public SpecialSymbol getSpecialSymbol() {
		return specialSymbol;
	}

	/**
	 * @param isPlaced the isPlaced to set
	 */
	@Override
	public void setPlaced(boolean isPlaced) {
		this.isPlaced = isPlaced;
	}

	/**
	 * @param kingdom the kingdom to set
	 */
	public void setKingdom(Symbol kingdom) {
		this.kingdom = kingdom;
	}
	@Override
	public boolean hasCentralSymbol() {
		return hasCentralSymbol;
	}


	public static GoldCard drawGoldCard() {
		GoldCard card = null;
		Random r = new Random();
		int n = 0;
		
		do{
		 n=r.nextInt(40) + 1 ;		 
		}while(assignedGoldCards.contains(n));
		
		assignedGoldCards.add(n);
		switch(n) {
		case 1:
			card=new GoldCard1();
			break;
		case 2:
			card=new GoldCard2();
			break;
		case 3:
			card=new GoldCard3();
			break;
		case 4:
			card=new GoldCard4();
			break;
		case 5:
			card=new GoldCard5();
			break;
		case 6:
			card=new GoldCard6();
			break;
		case 7:
			card=new GoldCard7();
			break;
		case 8:
			card=new GoldCard8();
			break;
		case 9:
			card=new GoldCard9();
			break;
		case 10:
			card=new GoldCard10();
			break;
		case 11:
			card=new GoldCard11();
			break;
		case 12:
			card=new GoldCard12();
			break;
		case 13:
			card=new GoldCard13();
			break;
		case 14:
			card=new GoldCard14();
			break;
		case 15:
			card=new GoldCard15();
			break;
		case 16:
			card=new GoldCard16();
			break;
		case 17:
			card=new GoldCard17();
			break;
		case 18:
			card=new GoldCard18();
			break;
		case 19:
			card=new GoldCard19();
			break;
		case 20:
			card=new GoldCard20();
			break;
		case 21:
			card=new GoldCard21();
			break;
		case 22:
			card=new GoldCard22();
			break;
		case 23:
			card=new GoldCard23();
			break;
		case 24:
			card=new GoldCard24();
			break;
		case 25:
			card=new GoldCard25();
			break;
		case 26:
			card=new GoldCard26();
			break;
		case 27:
			card=new GoldCard27();
			break;
		case 28:
			card=new GoldCard28();
			break;
		case 29:
			card=new GoldCard29();
			break;
		case 30:
			card=new GoldCard30();
			break;
		case 31:
			card=new GoldCard31();
			break;
		case 32:
			card=new GoldCard32();
			break;
		case 33:
			card=new GoldCard33();
			break;
		case 34:
			card=new GoldCard34();
			break;
		case 35:
			card=new GoldCard35();
			break;
		case 36:
			card=new GoldCard36();
			break;
		case 37:
			card=new GoldCard37();
			break;
		case 38:
			card=new GoldCard38();
			break;
		case 39:
			card=new GoldCard39();
			break;
		case 40:
			card=new GoldCard40();
			break;
		case 41:
			card=new GoldCardBackFungi();
			break;
		case 42:
			card=new GoldCardBackAnimal();
			break;
		case 43:
			card=new GoldCardBackPlant();
			break;
		case 44:
			card=new GoldCardBackInsect();
			break;
		}
		return card;
	}
	
	public String getAbbreviatedCorner(CornerPosition position) {
	    for (Corner corner : addCorners()) {
	        if (corner.getPosition().equals(position)) {
	            switch (corner.getState()) {
	                case NULL:
	                    return "NUL";
	                case EMPTY:
	                    return "EMP";
	                case HIDDEN:
	                    return "HID";
	                case SYMBOL:
	                	if (corner.getSymbol() instanceof Symbol) {
	                        Symbol symbol = (Symbol) corner.getSymbol();
	                        return symbol.getAbbreviation();
	                	} else {
	                        
	                        return corner.getSymbol().toString();
	                    }
	                case SPECIALSYMBOL:
	                	if (corner.getSymbol() instanceof SpecialSymbol) {
	                        SpecialSymbol symbol = (SpecialSymbol) corner.getSymbol();
	                        return symbol.getAbbreviation();
	                	} else {
	                        
	                        return corner.getSymbol().toString();
	                    }
	                default:
	                    return "?";
	            }
	        }
	    }
	    return "  "; // Angolo non trovato (non dovrebbe accadere)
	}
	@Override
	public void printCardInCell() {
		if(this.isFront())
			{
				System.out.print(getAbbreviatedCorner(CornerPosition.TOP_LEFT) + "        "+
						getAbbreviatedCorner(CornerPosition.TOP_RIGHT));
				System.out.println("\n");
				System.out.println(getAbbreviatedCorner(CornerPosition.BOTTOM_LEFT) + "        "+
						getAbbreviatedCorner(CornerPosition.BOTTOM_RIGHT)+"\n");
			}else {
				
				System.out.print(getAbbreviatedCorner(CornerPosition.TOP_LEFT) + "        "+
						getAbbreviatedCorner(CornerPosition.TOP_RIGHT));
				System.out.println("\n\n    " + getKingdom().getAbbreviation() + "    \n");
				System.out.println(getAbbreviatedCorner(CornerPosition.BOTTOM_RIGHT) + "        "+
						getAbbreviatedCorner(CornerPosition.BOTTOM_LEFT)+"\n");
		}
	}
	

	
	public String getCornerRepresentation(CornerPosition position) {
		for (Corner corner : addCorners()) {
			if (corner.getPosition().equals(position)) {
				switch (corner.getState()) {
				case NULL:
					return "NULL";
				case EMPTY:
					return "EMPTY";
				case HIDDEN:
					return "HIDDEN";
				case SYMBOL:
					return corner.getSymbol().toString();
				case SPECIALSYMBOL:
					return corner.getSymbol().toString();
				default:
					return "?";
				}
			}
		}
		return "  "; // Angolo non trovato (non dovrebbe accadere)
	}
	/**
	 * Prints the details of the card.
	 * 
	 * This method displays the card's type, the side (front or back),
	 * the corner symbols and center symbols (if present) of that side, and the card's score.
	 * If the card has no center symbols, a blank line is printed to maintain consistent card height.
	 */
	@Override
	public void printCard() {
		if(this.isFront())
			{
				System.out.println("Type: " + getType());
				System.out.println("Score: " + getPoints());
				System.out.println("Kingdom " + getKingdom());
				System.out.println("Requirement " + createRequirementsForPoints());
				System.out.println("Front side :\n");

				System.out.print(getCornerRepresentation(CornerPosition.TOP_LEFT) + "        "+
					getCornerRepresentation(CornerPosition.TOP_RIGHT));
				System.out.println("\n");
				System.out.println(getCornerRepresentation(CornerPosition.BOTTOM_LEFT) + "        "+
					getCornerRepresentation(CornerPosition.BOTTOM_RIGHT)+"\n");
			}else {
				System.out.println("Type: " + getType());
				System.out.println("Score: " + getPoints());
				System.out.println("Kingdom " + getKingdom());
				System.out.println("Requirement " + createRequirementsForPoints());
				System.out.println("Back side :\n");

				System.out.print(getCornerRepresentation(CornerPosition.TOP_LEFT) + "        "+
					getCornerRepresentation(CornerPosition.TOP_RIGHT));
				System.out.println("\n\n    " + getKingdom() + "    \n");
				System.out.println(getCornerRepresentation(CornerPosition.BOTTOM_RIGHT) + "        "+
					getCornerRepresentation(CornerPosition.BOTTOM_LEFT)+"\n");
		}
	}
	/**
	 * This method displays a menu asking the user to select the front (1) or back (2) side.
	 * It reads the user's input and sets the isFront property of the card accordingly.
	 * If the user enters an invalid choice, it defaults to the front side.
	 */
	@Override
	public Card ChooseSide(Card d) {
	    GoldCard card = null;
	    System.out.println("Scegli il fronte o il retro della carta?");
	    System.out.println("1. Fronte");
	    System.out.println("2. Retro");

	    Scanner scanner = new Scanner(System.in);
	    boolean validChoice = false; 

	    while (!validChoice) {
	        if (scanner.hasNextInt()) { 
	            int choice = scanner.nextInt();
	            scanner.nextLine(); 

	            if (choice == 1 || choice == 2) {
	                validChoice = true; 
	                int val = d.getNumber();
	                switch (choice) {
	                    case 1:
	                        card = (GoldCard) d;
	                        break;
	                    case 2:
	                        if (val > 0 && val < 11) {
	                            card = new GoldCardBackFungi();
	                        } else if (val > 10 && val < 21) {
	                            card = new GoldCardBackAnimal();
	                        } else if (val > 20 && val < 31) {
	                            card = new GoldCardBackPlant();
	                        } else if (val > 30 && val < 41) {
	                            card = new GoldCardBackInsect();
	                        }
	                        break;
	                    default:
	                        
	                        System.out.println("Scelta non valida. Impostato il fronte");
	                        card = (GoldCard) d;
	                        break;
	                }
	            } else {
	                System.out.println("Scelta non valida. Inserisci 1 o 2.");
	            }
	        } else {
	            System.out.println("Input non valido. Inserisci un numero.");
	            scanner.next(); 
	        }
	    }

	    scanner.close(); 

	    System.out.println("Hai scelto " + (card.isFront() ? "fronte" : "retro")+ " della carta.");
	    return card;
	}

}
