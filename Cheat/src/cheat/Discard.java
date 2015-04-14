/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

/**
 *
 * @author pbm104
 */
public class Discard {
    //cards in discard
    Card[] discardCards;
    // int representing last player
    int lastPlayer;
    // boolean representing whther last player lied
    boolean lastPlayerLied;
    
    /**
     * creates an empty discard
    */
    public Discard(){
        
    }
    /**
     * return int indicating last player to add cards
     * @return 
     */
    public int getLastPlayer(){
        return lastPlayer;
    }
    /**
     * returns the cards in DiscardCards
     */
    public Card[] getDiscardCards(){
        return discardCards;
    }
    /**
     * return the number of cards in discardCards
     */
    public int discardSize(){
        return discardCards.length;
    }
    /**
     * add cards to discardCards
    */
    public void addCardsToDiscard(Card[] cards){
        
    }
    /**
     * set cards in Discards to be empty
     */
    public void emptyDiscard(){
        
    }
}