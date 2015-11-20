package domain;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class Player
{
    private ArrayList<Card> library;
    private ArrayList<Card> field;
    private ArrayList<Card> hand;
    private ArrayList<Card> graveyard;
    private ArrayList<Card> scry;
    private ArrayList<Card> exile;
    
    public Player() {
        this.library   = new ArrayList<Card>();
        this.field     = new ArrayList<Card>();
        this.hand      = new ArrayList<Card>();
        this.graveyard = new ArrayList<Card>();
        this.scry      = new ArrayList<Card>();
        this.exile     = new ArrayList<Card>();
    }
    
    //----PLAYER METHODS----
    public void drawACard() {
        moveCardFromTopOfLibraryToHand();
    }
    
    public void submitDeck(String... cardNames) {
        for(String cardName : cardNames) {
            addCardToLibrary(new Card(cardName));
        }
    }
    //----END PLAYER METHODS----
    
    //----LIBRARY METHODS----
    public void shuffleLibrary() {
        ArrayList<Card> copyLibrary = new ArrayList<Card>();
        ArrayList<Card> newLibrary = new ArrayList<Card>();
        
        for(Card card : library) {
            copyLibrary.add(card);
        }
        
        while(!copyLibrary.isEmpty()) {
            int randomIndex = (int)(Math.random() * copyLibrary.size());
            
            newLibrary.add(copyLibrary.remove(randomIndex));
        }
        
        library = newLibrary;
    }
    
    public void addCardToLibrary(Card card) {
        card.clearAttributes();
        library.add(card);
    }
    
    public void moveCardFromHandToLibrary(Card card) {
        hand.remove(card);
        addCardToLibrary(card);
    }
    
    public void moveCardFromFieldToLibrary(Card card) {
        field.remove(card);
        addCardToLibrary(card);
    }
    
    public Card getTopCardFromLibrary() {
        return library.remove(library.size() - 1);
    }
    //----END LIBRARY METHODS----
    
    //----FIELD METHODS----
    public void addCardToField(Card card) {
        card.clearAttributes();
        card.addAttribute("isTapped", new Boolean(false));
        field.add(card);
    }
    
    public void moveCardFromHandToField(Card card) {
        hand.remove(card);
        addCardToField(card);
    }
    
    public void moveCardFromLibraryToField(Card card) {
        library.remove(card);
        addCardToField(card);
    }
    //----END FIELD METHODS----
    
    //----HAND METHODS----
    public void addCardToHand(Card card) {
        card.clearAttributes();
        hand.add(card);
    }
    
    public void moveCardFromFieldToHand(Card card) {
        field.remove(card);
        addCardToHand(card);
    }
    
    public void moveCardFromLibraryToHand(Card card) {
        library.remove(card);
        addCardToHand(card);
    }
    
    public void moveCardFromTopOfLibraryToHand() {
        addCardToHand(library.remove(library.size() - 1));
    }
    //----END HAND METHODS----
}
