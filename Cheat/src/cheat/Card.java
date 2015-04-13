/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramAssignment1;

/**
 *
 * @author Patrick
 */
public class Card {
    private String suit;
    private int value;
    private int imageValue;

    /**
     * @param suit
     * @param value
     */
    public Card(String suit, int value, int imageValue){
        this.suit = suit;
        this.value = value;
        this.imageValue = imageValue;
    }
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the imageValue
     */
    public int getImageValue() {
        return imageValue;
    }

    /**
     * @param imageValue the imageValue to set
     */
    public void setImageValue(int imageValue) {
        this.imageValue = imageValue;
    }
    
    
}
