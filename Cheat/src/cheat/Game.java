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
public class Game {
    Player[] players;
    Discard discard;
    Card[] selectedCards;
    int round;
    GameWindow gw;
    
    /**
     * Gets names for each player
     * Creates 4 hands from a full set of cards
     * Creates 4 players and stores them in players
     * sets discard to empty
     * starts game loop
     */
    public Game(){
        
    }
    /**
     * loop until game is won or quit
     * on each loop execute:
     *          check win condition
     *          call playerTurn()
     *          render()
     */
    public void loop(){
        
    }
    /**
     * check if player is human
     * if human call humanPlayerTurn
     * if computer call computerPlayerTurn
     * @param player 
     */
    public void playerTurn(Player player){
        
    }
    /**
     * wait for input from player
     * check input and do one of the following
     * callCheat(), selectCards(), or playCards()
     * then call render()
     * Repeat these steps until playCards has been selected
     */
    public void humanPlayerTurn(){
        
    }
    /**
     * decide whether or not computer player will call cheat
     * decide what cards computer player will play
     * do the decided actions
     * return
     */
    public void computerPlayerTurn(){
        
    }
    /**
     * check the boolean status of the discard
     * if true add cards to last player to play's hand
     * if false add cards to current player's hand
     */
    public void callCheat(){
       
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
    public void render(){
        
    }
}
