/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlFlow;
import java.util.Scanner;
/**
 *
 * @author jared
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AsciiChars.printNumbers(); 
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.printf("Hi %s", name);
    }

}
