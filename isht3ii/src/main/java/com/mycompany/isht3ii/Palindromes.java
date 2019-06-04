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
public class Palindromes {
    
    public boolean evaluate(String word) {
    if (word == null) {
      throw new IllegalArgumentException("You can't pass a null String as input.");
    }
    boolean result = true;
    int length = word.length();
    for (int i = 0; i < length / 2; i++) {
      if (word.charAt(i) != word.charAt(length - 1 - i)) {
        result = false;
        break;
      }
    }
    return result;
}
    
}
