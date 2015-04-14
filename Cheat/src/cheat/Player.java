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
public class Player {
    String name;
    Hand hand;
    boolean isHuman;
    
    public Player(String name, Hand hand, boolean isHuman){
    this.name = name;
    this.hand = hand;
    this.isHuman = isHuman;
    }
    public String getName(){
        return name;
    }
    public Hand getHand(){
        return hand;
    }
    public void setHand(Hand hand){
        this.hand = hand;
    }
            
}
