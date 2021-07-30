/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mansiti.lab_2;

import java.util.function.Predicate;
import java.util.function.BiPredicate;

/**
 *
 * @author Yasser
 */
public class BetterString {    
    public static void main(String[] args) {
        String str1 = "Yasser1";
        String str2 ="Ibrahim1";
        
        boolean isLonger = betterString(str1, str2, (s1 , s2)-> s1.length()>s2.length());
        
        System.out.println("Is Longer? "+isLonger);
        System.out.println(isLetter(str1, Character::isLetter));

        
    }
    
    public static boolean betterString(String str1, String str2, BiPredicate<String, String> pred) {
        return pred.test(str1, str2);
    }

    public static boolean isLetter(String str, Predicate<Character> pred) {
        return !str.matches(".*\\d.*");
    }

}







