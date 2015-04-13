/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramAssignment1;

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
                suit = "Spade";
            }else if (i ==1){
                suit = "Club";
            }else if (i ==2){
                suit = "Heart";
            }else{
                suit = "Diamond";
            }
            for(int j = 1; j <14; j ++){
                deck.add(new Card(suit,j,((i*13)+j)));
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
