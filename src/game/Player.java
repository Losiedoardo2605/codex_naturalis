package game;

import java.util.ArrayList;
import java.util.Scanner;
import goldCard.*;
import initialCard.*;
//import ObjectiveCard;
import resourceCard.*;
import cards.Card;
import cards.Symbol;


public class Player {

	private String name;
	private final int id;
	private int points;
	private boolean isFirst;
	//private CommonGoalCard commonGoalCard;
	//private PlayArea personalManuscript;
	private PlayArea personalManuscript;
	//private ArrayList <ResourceCard> handResourceCard;
	private ArrayList <Card> hand;

	//private CommonObjective commonObj;

	/**
	 * The constructor define player
	 * @param id player
	 * @param name player

	 */

	public Player(int id, String name, int x, int y) {
		this.id = id;
		this.personalManuscript = new PlayArea(x,y);
		this.name = name;
		this.points = 0;
		this.hand = new ArrayList <Card>();
		//this.handResourceCard = new ArrayList<ResourceCard>();
		//this.handGoldCard = new ArrayList <GoldCard> ();
		//this.commonObj = CommonObjectiveCard.assignCommonObjectiveCard();

	}

	/**
	 * @return player's Id
	 */
	public int getId() {
		return this.id;
	}

	public PlayArea getPlayArea() {
		return personalManuscript;
	}

	public void setPlayArea(PlayArea playArea) {
		personalManuscript = playArea;
	}
	
	
	
	/**
	 * @return player's name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param isFirst
	 */
	public void setIsFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}
	/**
	 * @return if player is first
	 */
	public boolean isFirst() {
		return isFirst;
	}
	/**
	 * @return player's points
	 */
	public int getPoints() {
		return points;
	}
	/**
	 * @param commonGoalPoints
	 */
	public void setPoints(int commonGoalPoints) {
		this.points = commonGoalPoints;
	}
	/**
	 * somma i punti inseriti ai punti che il giocatore ha
	 * @param points punti da sommare 
	 */
	public void addPoints(int points) {
		this.points += points;
	}

	public int totalPoints() {
		int total = 0;
		//total += personalGoalPoints();
		total += points;
		//total += personalManuscript.nearbySymbolsScore();
		return total;
	}

	/*
	 * public ArrayList <ResourceCard> addResourceCardToHand(ResourceCard card) {
		handResourceCard.add(card);
		return handResourceCard;
	}
	public ArrayList <GoldCard> addGoldCardToHand(GoldCard card) {
		handGoldCard.add(card);
		return handGoldCard;
	}
	 */
	public void addCardToHand(Card card) {
		hand.add(card);

	}


	
	
	/*
	 * public CommonObjectiveCard getPersonalCommonObjectiveCard() {
		return personalGoalCard;
	}


	public void setPersonalGoalCard(PersonalGoalCard personalGoalCard) {
		this.personalGoalCard = personalGoalCard;
	}
	 */


	/**
	 * Permette al giocatore di scegliere una carta da giocare dalla propria mano.
	 *
	 * @param mano La mano di carte corrente del giocatore (ArrayList).
	 * @return L'oggetto Carta scelto, o null se non � stata selezionata alcuna carta.
	 */
	public Card chooseCardToPlay() {
	    Scanner scanner = new Scanner(System.in);
	    int choice;
	    boolean isVerified = false;
	    
	    do {
	        do {
	            System.out.println("La tua mano:");
	            for (int i = 0; i < this.hand.size(); i++) {
	                Card card = this.hand.get(i);  
	                System.out.println((i + 1) + ": ");
	                card.printCard();
	                System.out.println();
	            }
	            System.out.print("Scegli una carta (0 per annullare): ");

	            while (!scanner.hasNextInt()) {
	                System.out.println("Inserisci un numero valido.");
	                scanner.next();
	            }
	            choice = scanner.nextInt();
	        } while (choice < 0 || choice > this.hand.size()); 

	        if (choice == 0) {
	            isVerified = false; 
	        }

	        Card choosenCard = this.hand.get(choice - 1);
	        System.out.println("Hai scelto: " + choosenCard);
	        System.out.print("Confermi la scelta? (1 per s�, 0 per no): ");

	        while (!scanner.hasNextInt()) {
	            System.out.println("Inserisci 1 per s� o 0 per no.");
	            scanner.next();
	        }
	        int validation = scanner.nextInt();
	        isVerified = (validation == 1);
	    } while (!isVerified);

	    scanner.close();

	    return this.hand.remove(choice - 1); 
	}


	

	
	
	
	
	
	/**
	 * Allows the player to choose a card to take from the visible cards.
	 *
	 * @param visibleCards The list of visible cards available.
	 * 
	 * @return The chosen Card object. If the player doesn't choose any of the visible 
	 *         cards, a new resource or gold card (depending on their choice) is drawn
	 *         and returned. Returns null only if the player enters invalid input for
	 *         the card type.
	 */
	public Card chooseCardToTake(ArrayList <Card> visibleCards) {
		Card cardTaken = null;
		String answer;
		boolean choosen;
		boolean secondchoice;
		Scanner scanner = new Scanner (System.in);
		Scanner in = new Scanner (System.in);
		int choice;
		System.out.println("Le carte visibili sono: ");
		for(Card c: visibleCards) {
			if (c instanceof ResourceCard) {
				c.printCard();
			}
			else if (c instanceof GoldCard) {
				c.printCard();
			}
		}
		System.out.println("Vuoi pescare una tra queste carte?");
		choosen = yesorNoInput(scanner);
		if (choosen) {
			System.out.println("Che tipo di carta vorresti? Oro oppure Risorsa?");
			String typeCard = scanner.next();
			for( Card card : visibleCards ) {
				if (typeCard.equals("risorsa") || typeCard.equals("Risorsa") || typeCard.equals("RISORSA")) {
					if (card instanceof ResourceCard) {
						card.printCard();
						System.out.println("Vuoi questa carta? ");
						secondchoice = yesorNoInput(scanner);
						if (secondchoice) {
							cardTaken = card;
							break;
						}
						else
							continue;
					}

				}
				else if(typeCard.equals("gold") || typeCard.equals("Gold") || typeCard.equals("GOLD")) {
					if (card instanceof GoldCard) {
						card.printCard();
						System.out.println("Vuoi questa carta? ");
						secondchoice = yesorNoInput(scanner);
						if (secondchoice) {
							cardTaken = card;
							break;
						}
						else
							continue;
					}
				}

			}
		}
		else{
			System.out.println("Che tipo di carta vorresti? Oro oppure Risorsa?");
			String typeCard = scanner.next();
			if (typeCard.equals("risorsa") || typeCard.equals("Risorsa") || typeCard.equals("RISORSA")) {
				cardTaken = ResourceCard.drawResourceCard();
			}
			else if(typeCard.equals("gold") || typeCard.equals("Gold") || typeCard.equals("GOLD")) {}
			cardTaken = GoldCard.drawGoldCard();
		}
		in.close();
		scanner.close();
		return cardTaken;	
	}

	private boolean yesorNoInput(Scanner scanner) {
		String answer;
		boolean choosen;
		answer = scanner.next();
		while (!answer.startsWith("s") && !answer.startsWith("S") && !answer.startsWith("N") && !answer.startsWith("n")) {
			System.out.println("La risposta non � corretta. Rispondi si o no!'");
			answer = scanner.next();
		}
		choosen = answer.startsWith("s") || answer.startsWith("S");
		return choosen;
	}
	




/**
 * @return personal goal score 
 */
private int commonGoalPoints() {
	//DA FARE
	return points;
}



/**
 * @return print player's Manuscript
 */
public String printPlayArea() {
	return personalManuscript.toString();
}


  public void chooseOrientationAndPlaceInitialCard(InitialCard initialCard) {
	  initialCard.ChooseSide(initialCard);
	personalManuscript.placeInitialCard(initialCard); 
}

 

/*
 * public ObjectiveCard chooseObjectiveCard(ObjectiveCard firstCard,
			ObjectiveCard secondCard) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose one of the following cards:");
		System.out.println("1. " + firstCard);
		System.out.println("2. " + secondCard);
		int choice = 0;
		while (choice != 1 && choice != 2) {
			System.out.print("Enter your choice (1 or 2): ");
			choice = scanner.nextInt();
			if (choice != 1 && choice != 2) {
				System.out.println("Invalid choice. Please enter 1 or 2.");
			}
		}
		scanner.close();
		return choice == 1 ? firstCard : secondCard;
	}
 */



}




