/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Patrick
 */
public class Hand {
    ArrayList<Card> cards;
    /**
     * creates a hand with the provided cards
     * @param cards 
     */
    public Hand(Card[] card){
        this.cards = new ArrayList<>();
        this.cards.addAll(Arrays.asList(card));
    }
    /**
     * creates an empty hand
    */
    public Hand(){
        this.cards = new ArrayList<>();
    }
    /**
     * returns the cards in the hand
     * @return 
     */
    public ArrayList<Card> getCards(){
        return cards;
    }
    /**
     * remove the cards in removeCards from cards in Hand
     * @param removeCards 
     */
    public void removeCards(ArrayList<Card> removeCards){
        cards.removeAll(removeCards);
    }
    /**
     * add cards in addCards to cards in Hand
     */
    public void addCards(ArrayList<Card> addCards){
        cards.addAll(addCards);
    }
    /**
     * 
     * @return 
     */
    public int size(){
        return cards.size();
    }
}