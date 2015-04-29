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
public class CardTest {
    
    int num = 2;
    String suit = "Diamond";
    String imageValue = "13.png";
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = new Card(suit,num,imageValue);
        String expResult = "Diamond";
        String result = instance.getSuit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSuit method, of class Card.
     */
    @Test
    public void testSetSuit() {
        System.out.println("setSuit");
        String suit = "Diamond";
        Card instance = new Card(suit,num,imageValue);
        instance.setSuit(suit);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Card instance = new Card(suit,num,imageValue);
        int expResult = 2;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   //     fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Card.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 2;
        Card instance = new Card(suit,value,imageValue);
        //instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getImageValue method, of class Card.
     */
    @Test
    public void testGetImageValue() {
        System.out.println("getImageValue");
        Card instance = new Card(suit,num,imageValue);
        String expResult = "13.png";
        String result = instance.getImageValue();
        assertEquals(expResult, imageValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setImageValue method, of class Card.
     */
    @Test
    public void testSetImageValue() {
        System.out.println("setImageValue");
        String imageValue = "";
        Card instance = new Card(suit,num,imageValue);
        instance.setImageValue(imageValue);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSelected method, of class Card.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        Card instance = new Card(suit,num,imageValue);
        boolean expResult = false;
        boolean result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class Card.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        boolean selected = false;
        Card instance = new Card(suit,num,imageValue);
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Card.
     */
  /*@Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object t = null;
        Card instance = new Card(suit,num,imageValue);
        int expResult = 0;
        int result = instance.compareTo(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
