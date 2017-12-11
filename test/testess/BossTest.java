package testess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import estg.esii.wizards.Player;
import estg.esii.wizards.Boss;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carlos
 */
public class BossTest {
    
    public BossTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAccuracy method, of class Boss.
     */
    /*
    @Test
    public void testGetAccuracy() {
        System.out.println("getAccuracy");
        Boss instance = new Boss();
        int expResult = 0;
        int result = instance.getAccuracy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayAttributes method, of class Boss.
     */
   /* @Test
    public void testDisplayAttributes() {
        System.out.println("displayAttributes");
        Boss instance = new Boss();
        instance.displayAttributes();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**max 580
       min 300
     * Test of bossAttack method, of class Boss.
     */
    @Test
    public void testBossAttack() {
       
        for (int i = 0; i < 100; i++) { 
         Player p1= new Player();
         p1.createWarrior(10);
         Boss boss1= new Boss(p1); 
         int n= p1.getHealth();
         boss1.bossAttack(p1);
         
        //  if(boss1.getStrength()> n){
            //  assertEquals(p1.getHealth(), p1.getHealth());
        //  }else{
            //  assertEquals(boss1.getStrength(),n-p1.getHealth());
              
          //}
          
    }
    }
    
    @Test
    public void testConstructor1() {
        
        for (int i = 0; i < 100; i++) { 
        Boss boss1= new Boss();
      
        // System.out.println(  boss1.getStrength());
         boss1.displayAttributes();
         assertTrue(boss1.getAccuracy()==-1);
     
    }}
    
     @Test
    public void testConstructor2() {
        
       // verificar
        
       for (int i = 1; i < 100; i++) { 
       Player p1= new Player();
       p1.createWarrior(i);
       Boss boss1= new Boss(p1);
      assertTrue("health",boss1.getHealth() >= 300 && boss1.getHealth() <= 580);
      assertTrue("strenght",boss1.getStrength() >=30 && boss1.getStrength() <= 86);
    }
    }
        
   @Test 
   public void testeBossSetAcurracy(){
       
   
       for (int i = 0; i < 100; i++) { 
        Boss boss1= new Boss();
        boss1.setAccuracy(i);
        
           assertTrue(boss1.getAccuracy()== i);
        
    }
   }
   
        
   @Test 
   public void testeBossEvade(){
       
   
       for (int i = 0; i < 100; i++) { 
        Boss boss1= new Boss();
        boss1.setAccuracy(i);
        
           assertTrue(boss1.getAccuracy()== i);
        
    }
   }
   
    @Test
    public void testBossDisplayAtributes(){
        
        
        
        Player p = new Player();
         Boss boss1 = new Boss(p);
         boss1.displayAttributes();
   
    }
    

}
