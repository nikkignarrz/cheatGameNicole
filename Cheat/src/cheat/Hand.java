/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

/**
 *
 * @author Patrick
 */
public class Hand {
    Card[] cards;
    /**
     * creates a hand with the provided cards
     * @param cards 
     */
    public Hand(Card[] cards){
        this.cards = cards;
    }
    /**
     * creates an empty hand
    */
    public Hand(){
        
    }
    /**
     * returns the cards in the hand
     * @return 
     */
    public Card[] getCards(){
        return cards;
    }
    /**
     * remove the cards in removeCards from cards in Hand
     * @param removeCards 
     */
    public void removeCards(Card[] removeCards){
        
    }
    /**
     * add cards in addCards to cards in Hand
     */
    public void addCards(Card[] addCards){
        
    }
    /**
     * 
     * @return 
     */
    public int size(){
        return cards.length;
    }
}