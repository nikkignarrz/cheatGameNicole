/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cheat;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nas113
 */
public class HandTest {
    
    Hand testHand;
    ArrayList<Card> array = new ArrayList<Card>();
    
    public HandTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCards method, of class Hand.
     */
    @Test
    public void testGetCards() {
        System.out.println("getCards");
        Hand instance = new Hand();
        ArrayList<Card> expResult = array;
        ArrayList<Card> result = instance.getCards();
        
        //System.out.println(array.size());
        //System.out.println(instance.size());
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of removeCards method, of class Hand.
     */
    @Test
    public void testRemoveCards() {
        System.out.println("removeCards");
        ArrayList<Card> removeCards = null;
        Hand instance = new Hand();
        instance.removeCards(removeCards);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addCards method, of class Hand.
     */
    @Test
    public void testAddCards() {
        System.out.println("addCards");
        ArrayList<Card> addCards = array;
        Hand instance = new Hand();
        instance.addCards(addCards);
      
        //System.out.println(array.size());
        assertEquals(array.size(), instance.size());
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class Hand.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
