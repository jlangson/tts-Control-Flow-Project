/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlFlow;
import java.util.function.*;

/**
 *
 * @author jared
 */
public class InputValidation {
    
    //true for all variations of y yes n and no
    public static boolean isYesNo (String response){
        String[] answers = {"y", "yes", "n", "no"};
        for(String answer : answers){
            if(response.equalsIgnoreCase(answer)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isInt(String str){
        try {
            int n = Integer.parseInt(str);
        } catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }
    
    //tests to see if input is two digits. used for checking car model number
    public static boolean isTwoChars(String str){
        return str.length()==2;
    }
    
    public static boolean isQBJersey(String str){
        if(isInt(str)){
            int n = Integer.parseInt(str);
            //1 to 19 are current QB jersey positions. 0 has ben used historically https://en.wikipedia.org/wiki/National_Football_League_uniform_numbers#Current_system
            return isInt(str) && n >=0 && n<=19; 
        }
        return false;
    }
    
    public static boolean isCarModel(String str){
        //short circuit evaluation means parseInt won't trigger an error if it's not parseable.
        return isInt(str) && isTwoChars(str) && Integer.parseInt(str) > -1;
    }
    
    public static String[] testInputs = {"yes", "no", "y", "n", "YES", "NO", "123", "85.0", "-1", "0", "d8($()*", "1988", "32", "09", "12", "200", "100", "35.33", "", "\n", "\t"}; 
    
   public static void runTests(){
    for(String input : testInputs){
        System.out.println(input+ "\tisYesNo?\t" + isYesNo(input) +"\tisInt?\t" + isInt(input) +"\tisTwoChars\t" + isTwoChars(input) + "\tisQBJersey\t" + isQBJersey(input) + "\tisCarModel\t" + isCarModel(input));
   
        }
   } 
}
