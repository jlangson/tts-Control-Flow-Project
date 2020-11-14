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
    
    public static String[] testInputs = {"yes", "no", "y", "n", "YES", "NO", "123", "85.0", "-1", "0", "asd82374(*@#$()*", "1988", "09", "", "200", "100", "35.33", "\n", "\t"}; 
    
    //I want this to take a function so I can test that function. 
    public static void runTests(Consumer<String> func){
        for(String input : testInputs){
            System.out.print(input +" isValid? ");
            boolean bool = func(input);
           System.out.println(func(input));
        //    System.out.println(String.valueOf(func(input)));
            
            
        
        }
       
        
    }

    private static void func(String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
