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
//    @SuppressWarnings("empty-statement")
    public static int[] generateLottoNumbers(String redCar, String petName, int petAge, int luckyNumber, String doYouHaveAFavoriteQB, int qbJerseyNumber, int carYearModel, String favoriteActorFirstName, int randomNumberOnetoFifty){
        
        int[] lottoNumbers = {0,1,2,3,4,5}; //place holder values
        
        //generate three random integers from 1 to 75
        //because we're told to
        int firstRandom = (int) (Math.random() * 75) + 1; //for magic ball
        int secondRandom = (int) (Math.random() * 75) + 1; //not used
        int thirdRandom = (int) (Math.random() * 75) + 1;  //not used
        
        
        //generate magic ball first
        //multiply luckyNumber by a random int (firstRandom) then subtract 75 if it is greater than 75
        int magicBall = (int) (luckyNumber * firstRandom);
        while(magicBall > 75){
            magicBall-=75;
        }
        lottoNumbers[5]=magicBall;
        //two digit year model + lucky number
        lottoNumbers[0] = carYearModel + luckyNumber;
        //first letter of favorite actor/actress to an integer by ASCII
        lottoNumbers[1] = (int) favoriteActorFirstName.charAt(0); 
        //hard code as 42
	lottoNumbers[2] = 42; //best number
        //age of favorite pet + car model year
	lottoNumbers[3] = petAge + carYearModel;
        //3rd letter of favorite pet as ASCII int
	lottoNumbers[4] = (int) petName.charAt(2);
        
        //if they are outside of the boundaries (1 to 65) fix it. 
        //-1 to not adjust magicBall
        for (int i=0; i < lottoNumbers.length-1; i++) {
            lottoNumbers[i] = stayBounded(lottoNumbers[i], 1, 65);
        }
        
        return lottoNumbers;
        
    }
    //boundaries for the lotto numbers are 1 to 65 inclusive
    //add or subtract by max if they are outside of the boundary
    public static int stayBounded(int value, int min, int max){
        while(value < min){
            value+=max;
        }
        while(value > max){
            value-=max;
        }
        return value;
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
            System.out.println("Do you have a red car? (yes, no)");
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

            
            int[] lottoNumbers = generateLottoNumbers(redCar, petName, petAge, luckyNumber, doYouHaveAFavoriteQB, qbJerseyNumber, carYearModel, favoriteActorFirstName, randomNumberOnetoFifty); 
            System.out.println("break here");
            printLottoNumbers(lottoNumbers);

            //repeat if choice is y or yes
           System.out.println("Play again? (yes, no)");
           choice = scanner.nextLine();
        }
        System.out.println("Thank you for playing.");
    }

}
