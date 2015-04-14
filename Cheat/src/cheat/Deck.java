/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Patrick
 */
public class Deck {
    LinkedList<Card> deck;
    
    public Deck(){
        deck = new LinkedList<Card>();
        String suit;
        for(int i =0; i < 4; i++){
            if (i == 0){
                suit = "Club";
            }else if (i ==1){
                suit = "Diamond";
            }else if (i ==2){
                suit = "Heart";
            }else{
                suit = "Spade";
            }
            for(int j = 0; j <13; j ++){
                deck.add(new Card(suit,j,"images/" +  (j+(i*13)) + ".png"));
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }
    public Card popCard(){
        return deck.pop();
    }
    public boolean isEmpty(){
        return deck.isEmpty();
    }
}
