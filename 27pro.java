/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dev;

/**
 *
 * @author Student
 */
public class Dev {

    /**
     * @param args the command line arguments
     */
public static int strToInt( String str ){
    int a = 0;
    int num = 0;
    boolean isNeg = false;

    
    if (str.charAt(0) == '-') {
        isNeg = true;
        a = 1;
    }

   
    while( a < str.length()) {
        num *= 10;
        num += str.charAt(i++) - '0'; 
    }

    if (isNeg)
        num = -num;
    return num;
}
}
