/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlFlow;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author jared
 */
public class Main {

    //generate 5 random numbers between 1 and 65
    //generate a "magic ball" number between 1 and 75
    //viewer should enable line wrap
    public static int[] generateLottoNumbers(String redCar, String petName, int petAge, int luckyNumber, String doYouHaveAFavoriteQB, int qbJerseyNumber, int carYearModel, String favoriteActorFirstName, int randomNumberOnetoFifty){
        
        int[] lottoNumbers = {0,1,2,3,4,5};
        
        //generate magic ball first
        //multiply luckyNumber by a random Integer then subtract 75 if it is greater than 75
        int magicBall = (int) (luckyNumber * Math.random() +1); //+1 so magicBall is never 0.  
        while(magicBall > 75){
            magicBall-=75;
        }
        lottoNumbers[5]=magicBall;
        //two digit year model + lucky number
        lottoNumbers[0] = carYearModel + luckyNumber;
        //first letter of favorite actor/actress to an integer by ASCII
        lottoNumbers[1] = (int) favoriteActorFirstName.charAt(0); 
        //42
	lottoNumbers[2] = 42; //best number
        
        //age of favorite pet + car model year
	lottoNumbers[3] = petAge + carYearModel;
        
        //favoriteQBNumber + age of pet + lucky number
	lottoNumbers[4] = qbJerseyNumber + petAge + luckyNumber;
        //testing by printing
        System.out.println("lotto numbers inside method:");
        for(int number : lottoNumbers){
            System.out.println(number);
        }

        
        return lottoNumbers;
        
    }
    public static void printLottoNumbers(int[] lottoNumbers){
        //desired format
       // Lottery numbers: 4, 17, 15, 52, 26  Magic ball: 22
        System.out.print("Lottery numbers: "); 
        //stop 1 less because magic ball needs to be printed special
        for(int i=0; i < lottoNumbers.length-1; i++){
            System.out.print(Integer.toString(lottoNumbers[i]) +", ");
        }
        //print magic ball
        System.out.print("Magic ball: " +lottoNumbers[lottoNumbers.length-1] +"\n");        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //fields for calculating the lotto number
        //default values are for testing so I don't have to enter inputs over and over
        String redCar="no";
        String petName="Skoogie";
        int petAge=6;
        int luckyNumber=7;
        String doYouHaveAFavoriteQB="no";
        int qbJerseyNumber=-1;
        int carYearModel=8; //two digits
        String favoriteActorFirstName="Johnny";
        int randomNumberOnetoFifty=4; //"random"
        
        
        //prints ASCII characters
        /* AsciiChars.printNumbers(); 
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
*/
            //infinite loop for testing
           // while(true){
                
            
            int[] lottoNumbers = generateLottoNumbers(redCar, petName, petAge, luckyNumber, doYouHaveAFavoriteQB, qbJerseyNumber, carYearModel, favoriteActorFirstName, randomNumberOnetoFifty); 
            System.out.println("break here");
            printLottoNumbers(lottoNumbers);
         //   }
            //repeat if choice is y or yes
           /* System.out.println("Do you want to pick more lotto numbers?");
            choice = scanner.nextLine();*/
        }
    }

//}
