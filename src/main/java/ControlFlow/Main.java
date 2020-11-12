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
        //fields for calculating the lotto number
        String redCar;
        String petName;
        int petAge;
        int luckyNumber;
        String doYouHaveAFavoriteQB;
        int qbJerseyNumber;
        int carYearModel; //two digits
        String favoriteActorFirstName;
        int randomNumberOnetoFifty; //"random"
        
        
        //prints ASCII characters
        AsciiChars.printNumbers(); 
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        //gets name and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.printf("Hi %s\n", name);
        
        //go into picking lotto numbers if yes.
        System.out.println("Do you wish to continue and pick your lotto numbers? (yes)");
        String choice = scanner.nextLine();
        while(choice.equals("y") || choice.equals("yes")){
            System.out.println("Do you have a red car? (yes, no");
            redCar = scanner.nextLine();
            System.out.println("What is the name of your favorite pet?");
            petName =  scanner.nextLine();
            System.out.println("What is the age of your favorite pet?");
            petAge = Integer.parseInt(scanner.nextLine());
            System.out.println("What is your lucky number (ints only)");
            luckyNumber = Integer.parseInt(scanner.nextLine());
            System.out.println("Do you have a favorite quarterback? (yes, no)");
            doYouHaveAFavoriteQB = scanner.nextLine(); //if not yes or y then dont' ask for jersey number;
            if(doYouHaveAFavoriteQB.equals("yes") || doYouHaveAFavoriteQB.equals("y")){
                System.out.println("What is your favorite QB's jersey number");
                qbJerseyNumber = Integer.parseInt(scanner.nextLine());
            } else{
                qbJerseyNumber = -1; //means there is no favorite QB
            }
            System.out.println("What is the two-digit model year of your car?");
            carYearModel = Integer.parseInt(scanner.nextLine());
            System.out.println("What is the first name of your favorite actor or actresss");
            favoriteActorFirstName = scanner.nextLine();
            System.out.println("Pretend you're a RNG. Enter a random number between 1 and 50");
            randomNumberOnetoFifty = Integer.parseInt(scanner.nextLine());
            
            //repeat if choice is y or yes
            System.out.println("Do you want to pick more lotto numbers?");
            choice = scanner.nextLine();
        }
    }

}
