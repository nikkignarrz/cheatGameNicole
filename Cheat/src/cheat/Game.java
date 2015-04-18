/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package cheat;

import java.util.ArrayList;

/**
 *
 * @author Patrick
 */
public class Game {
    public Player[] players;
    public Discard discard;
    public Card[] selectedCards;
    public int round;
    public boolean lastPlayerLied;
    public int quantityLastPlayed;
    GameWindow gw;
    
    /**
     * Gets names for each player       
     * Creates 4 hands from a full set of cards         .
     * Creates 4 players and stores them in players     .
     * sets discard to empty
     * starts game loop
     */
    public Game(){
        players = new Player[4];
        //create deck for game
        Deck deck = new Deck();
        //shuffle deck
        deck.shuffle();
        // create temp storage for names
        String[] name = {"Human", "pc1","pc2","pc3"};
        //TODO: GET NAMES
        
        //Create temporary hand storage
        Hand tempHand;
        //Create Card array
        Card[] cards = new Card[13];
        boolean[] isHuman = {true, false, false, false};
        //create 4 hands of size 13(inner loop) and store them to 4 players(outer loop)
        for(int i = 0; i <4; i++){
            for(int j = 0; j<13; j++){
                cards[j] = deck.popCard();
            }
            tempHand = new Hand(cards);
            players[i] = new Player(name[i], tempHand,isHuman[i]);
        }
        discard = new Discard();
    }
    /**
     * decide whether or not computer player will call cheat
     * decide what cards computer player will play
     * do the decided actions
     * return
     */
    public int[] computerPlayerTurn(int player){
        int[]temp ={0,0};
        return temp;
    }
    /**
     * check the boolean status of the discard
     * if true add cards to last player to play's hand
     * if false add cards to current player's hand
     */
    public int[] callCheat(){
        ArrayList<Card> temp = discard.getDiscardCards();
        if (lastPlayerLied){
            players[(round-1)%4].hand.addCards(temp);
            int[] value = {(round-1)%4,temp.size()};
            discard.discardCards.removeAll(discard.discardCards);
            return value;
        }else{
           players[round%4].hand.addCards(temp);
           int[] value = {round%4,temp.size()};
           discard.discardCards.removeAll(discard.discardCards);
           return value;
        }

    }
    /**
     * add card to the selectedCards array 
     * or remove them if they are already there
     */
    public void selectCards(Card card){
        
    }
    /**
     * add cards in selectedCards to discard
     * remove them from current player's hand
     */
    public void playCards(){
        
    }
    /**
     * create a GameModelView using the data stored in this class
     * use the new GameModelView to call GameWindow's method Update
     */

    public boolean checkWinCondition() {
        if(players[(round-1)%4].getHand().size()==0){
            return true;
        }else{
            return false;
        }
    }
}
