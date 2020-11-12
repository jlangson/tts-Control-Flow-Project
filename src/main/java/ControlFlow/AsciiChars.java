/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlFlow;

/**
 *
 * @author jared
 */
public class AsciiChars {
    //inclusive ranges of the ASCII chart. 
    private static int numberBegin = 48;
    private static int numberEnd = 57;
    private static int lowerCaseBegin = 97;
    private static int lowerCaseEnd = 122;
    private static int upperCaseBegin = 65;
    private static int upperCaseEnd = 90;
    
    
    public static void printNumbers(){ 
        for(int i=numberBegin; i<=numberEnd; i++){
            System.out.println((char) i);
        }
        
    }
    public static void printLowerCase(){
        for(int i=lowerCaseBegin; i<=lowerCaseEnd; i++){
            System.out.println((char) i);
        }
        
    }
    public static void printUpperCase(){
        for(int i=upperCaseBegin; i<=upperCaseEnd; i++){
            System.out.println((char) i);
        }
        
    }
    
    public static void test(){
        System.out.println("TEST!");
    }
            
    
}
