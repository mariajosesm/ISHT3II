/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii;

import com.mycompany.isht3ii.Palindromes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mariajose
 */
public class PalindromesTest {
    
    public PalindromesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of evaluate method, of class Palindromes.
     */
  
    
    @Test
    public void PruebaPalabra() {
        System.out.println("Prueba palabra: somos ");
        String word = "somos";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result); 
    }
    
    @Test
    public void PruebaEspacioEnBlanco() {
        System.out.println("Prueba espacio en blanco");
        String word = "";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void PruebaPalabra2() {
        System.out.println("Prueba palabra: reconocer ");
        String word = "reconocer";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result); 
    }
    
    @Test
    public void PruebaNumeros() {
        System.out.println("Prueba numeros: 12321 ");
        String word = "12321";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result); 
    }
    
    @Test
    public void PruebaFraseCorta() {
        System.out.println("Prueba frase corta: luz azul");
       String word = "luz azul";
        String word2 = "luzazul";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        boolean result2 = instance.evaluate(word2);
        assertNotEquals(expResult, result);        
        assertEquals(expResult, result2);
    }
    
    @Test
    public void PruebaFraseLarga() {
        System.out.println("Prueba frase larga: somos o no somos ");
        String word = "somos o no somos";
        String word2 = "somosonosomos";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        boolean result2 = instance.evaluate(word2);
        assertNotEquals(expResult, result);        
        assertEquals(expResult, result2);
    }
    
    @Test
    public void PruebaTabulaciones() {
        System.out.println("Prueba tabulaciones");
        String word = "         ";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void PruebaSimbolos() {
        System.out.println("Prueba simbolos");
        String word = "@f@*";
        Palindromes instance = new Palindromes();
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void PruebaNumeros2() {
        System.out.println("Prueba numeros: 8102018 ");
        String word = "8102018";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result); 
    }
    
    @Test
    public void PruebaCambioDeLinea() {
        System.out.println("Prueba cambio de linea ");
        String word = "\n \n";
        Palindromes instance = new Palindromes();
        instance.evaluate(word);
        boolean expResult = true;
        boolean result = instance.evaluate(word);
        assertEquals(expResult, result); 
    }
}
