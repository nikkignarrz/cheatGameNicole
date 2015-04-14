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
 //       loop();
    }
    /**
     * loop until game is won or quit
     * on each loop execute:
     *          check win condition
     *          call playerTurn()
     *          render()
     */
    private void loop(){
        while(!checkWinCondition()){
            playerTurn(players[round%4]);
            render();
        }
    }
    /**
     * check if player is human
     * if human call humanPlayerTurn
     * if computer call computerPlayerTurn
     * @param player 
     */
    public void playerTurn(Player player){
        if(player.isHuman){
            humanPlayerTurn(player);
        }else{
            computerPlayerTurn(player);
        }
    }
    /**
     * wait for input from player
     * check input and do one of the following
     * callCheat(), selectCards(), or playCards()
     * then call render()
     * Repeat these steps until playCards has been selected
     */
    public void humanPlayerTurn(Player player){
        
    }
    /**
     * decide whether or not computer player will call cheat
     * decide what cards computer player will play
     * do the decided actions
     * return
     */
    public void computerPlayerTurn(Player player){
        
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

    private boolean checkWinCondition() {
        return true;
    }
}
