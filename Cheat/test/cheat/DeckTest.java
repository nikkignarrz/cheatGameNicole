/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nas113
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = new Deck();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of popCard method, of class Deck.
     */
    @Test
    public void testPopCard() {
        System.out.println("popCard");
        Deck instance = new Deck();
        
        String suit = "Club";
        int v = 0;
        String imValue = "images/0.png";
        /*System.out.println(instance.popCard().getSuit());
        System.out.println(instance.popCard().getValue());
        System.out.println(instance.popCard().getImageValue());*/
       
        Card expResult = new Card(suit, v, imValue);
        Card result = instance.popCard();
        
       /* System.out.println(result.getSuit());
        System.out.println(result.getValue());
        System.out.println(result.getImageValue());*/
        
        assertEquals(expResult.getSuit(), result.getSuit());
        assertEquals(expResult.getValue(), result.getValue());
        assertEquals(expResult.getImageValue(),result.getImageValue());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Deck.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Deck instance = new Deck();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
