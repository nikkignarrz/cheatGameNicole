/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package cheat;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Patrick
 */
public class Game {
    public Player[] players;
    public Discard discard;
    public int round;
    public boolean lastPlayerLied;
    public int quantityLastPlayed;
    Random r;
   
    public Game(){
        r = new Random();
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
        ////////////////////////////////////////////////////////////
        //DECIDE TO CALL CHEAT
        //CALL CHEAT IF:
        // LAST PLAYER HAS NO CARDS LEFT
        // OR AMOUNT LAST PLAYER PLAYED + AMOUNT I HAVE OF SAME VALUE >4 
        ///////////////////////////////////////////////////////////
        int quantityLastPlay = 0;
        int cheatReturnValue[];
        for(int i =0; i < players[player].hand.size(); i++){
            if(players[player].hand.cards.get(i).getValue() == (round-1)%13 ){
                quantityLastPlay++;
            }
        }
        int r = this.r.nextInt(100);
        System.out.println(r);
        if(quantityLastPlay+quantityLastPlayed >4 || 
            players[(round-1)%4].getHand().cards.size() == 0 ||
            r>=95){ 
            cheatReturnValue =callCheat();
        }else{
            cheatReturnValue = new int[2];
            cheatReturnValue[0] = -1;
            cheatReturnValue[1] = -1;
        }
        ////////////////////////////////////////////////////////////
        //SELECT CARDS TO PLAY
        //////////////////////////////////////////////////////////
        ArrayList<Card> selectedCards = new ArrayList();
        for (int i = 0; i < players[player].getHand().getCards().size(); i++){
            if(players[player].getHand().cards.get(i).getValue() == round%13){
                selectedCards.add(players[player].getHand().cards.get(i));
            }
        }
        if(this.r.nextInt(100)>75){
            for(int i = 0; i < players[player].getHand().getCards().size(); i++){
                if(selectedCards.contains(players[player].getHand().getCards().get(i))){
                    
                }
            }
        }
        if(selectedCards.isEmpty()){
            selectedCards.add(players[player].getHand().cards.get(0));
            if(this.r.nextInt(100)>75&& players[player].hand.size() ==2){            
               selectedCards.add(players[player].getHand().cards.get(1));
            }
        }
        discard.addCardsToDiscard(selectedCards);
        players[player].hand.removeCards(selectedCards);
        ////////////////////////////////////////////////////////////
        //CHECK IF LYING
        ////////////////////////////////////////////////////////////
        for(int j = 0; j<selectedCards.size(); j++){
                if(selectedCards.get(j).getValue() != round%13){
                    lastPlayerLied = true;
                    break;
                }else{
                    lastPlayerLied = false;
                }
        }
        
        int[]temp ={selectedCards.size(),cheatReturnValue[0],cheatReturnValue[1]};
        return temp;
    }

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
    public boolean checkWinCondition() {
        if(round ==0){
            return false;
        }
        if(players[(round-1)%4].getHand().size()==0){
            return true;
        }else{
            return false;
        }
    }
}
