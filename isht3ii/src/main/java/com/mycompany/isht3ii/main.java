/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii;

/**
 *
 * @author mariajose
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Palindromes p= new Palindromes();
        System.out.println("Palindromo {somos} " + p.evaluate ("somos"));
        System.out.println("Palindromo (ESPACIO EN BLANCO) {}"  + p.evaluate (""));
        System.out.println("Palindromo {reconocer}" + p.evaluate ("reconocer"));
        System.out.println("Palindromo {12321}" + p.evaluate ("12321"));
        System.out.println("Palindromo {luz azul}" + p.evaluate ("luz azul"));
        System.out.println("Palindromo {somos o no somos}" + p.evaluate ("somos o no somos"));
        System.out.println("Palindromo (MUCHOS ESPACIOS EN BLANCO) {            }" + p.evaluate ("          "));
        System.out.println("Palindromo {*@f@*}" + p.evaluate ("*@f@*"));
        System.out.println("Palindromo {8102018}" + p.evaluate ("8102018"));
        System.out.println("Palindromo (CAMBIO DE LINEA) {\n \n}" + p.evaluate ("somos"));
    }
    
}
