import java.util.Random;
import java.util.Scanner;

public class Tutor {

    public static void main ( String[] args ) {

        //Intro
        System.out.println( "This program will help you practice math problems. Pick what type of math problem to " +
                            "practice\n" );
        int i = 0; //Initialize while loop
        while ( i == 0 ){

            System.out.println( "\n\tMenu\n1: ADDITION\n2: SUBTRACTION\n3: MULTIPLICATION\n4: DIVISION\n0: QUIT\n" );

            System.out.println("Enter number of math problem to practice on: ");
            Scanner input = new Scanner (System.in);
            int mathType = input.nextInt();

            //Create random numbers to create the math problem
            Random rand = new Random();
            int maxRandNum = rand.nextInt (( 10 - 1 ) + 1 ) + 1;
            int minRandNum = rand.nextInt (( maxRandNum - 1 ) + 1 ) + 1;

            //Given two tries per question
            int attempts = 1;

            switch ( mathType ){

                //Quit option selected, terminate program
                case 0: System.out.println( "You just quit the pogram!" ); i++; break;

                //Addition method is selected
                case 1: addition ( maxRandNum, minRandNum, attempts ); break;

                //Subtraction method is selected
                case 2: subtraction ( maxRandNum, minRandNum, attempts ); break;

                //Multiplication method is selected
                case 3: multiplication ( maxRandNum, minRandNum, attempts ); break;

                //Division method is selected
                case 4: division ( maxRandNum, minRandNum, attempts ); break;

                //In case any #, besides 0 to 4, is input
                default:
                    System.out.println( "Error! Please check input & try again" );
            }
        }
    }

    public static void addition ( int max, int min, int attempts ){

        //Intro to Addition method
        System.out.println( "You selected to practice addition, you have two tries!\n" );

        //Correct answer
        int corrAns = max + min;

        //Equation to output in checkAns method
        String equation = max + " + " + min + " = ? ";

        checkAns ( max, min, attempts, corrAns, equation);
    }

    public static void subtraction ( int max, int min, int attempts ){

        //Intro to subtraction method
        System.out.println( "You selected to practice subtraction, you have two tries!\n" );

        //Correct answer
        int corrAns = max - min;

        //Create string to output equation in checkAns method
        String equation = max + " - " + min + " = ? ";

        //Calling checkAns method to finish checking users input
        checkAns( max, min, attempts, corrAns, equation );

    }

    public static void multiplication ( int max, int min, int attempts ){
        //Intro to subtraction method
        System.out.println( "You selected to practice multiplication, you have two tries!\n" );

        //Correct answer
        int corrAns = max * min;

        String equation = max + " * " + min + " = ? ";

        checkAns ( max, min, attempts, corrAns, equation );

    }

    public static void division ( int max, int min, int attempts ){

        //Intro to division method
        System.out.println( "You selected to practice multiplication, you have two tries!\n" );

        //Correct answer
        int corrAns = max / min;

        String equation = max + " / " + min + " = ? ";

        checkAns ( max, min, attempts, corrAns, equation );


    }

    public static void checkAns ( int max, int min, int attempts, int corrAns, String equation ){

        System.out.println( "Try solving this problem: ");

        do {

            System.out.println ( equation );
            Scanner input = new Scanner ( System.in ); //Enable user input
            int userAns = input.nextInt();

            //If user input is correct answer
            if ( userAns == corrAns ){

                System.out.println( "You answer was correct!" );
                attempts = 3;
                break;

                //If user input is incorrect
            } else {

                System.out.println ( "You answer was incorrect." );
                attempts ++;

                //Response if it's last attempt
                if (attempts == 2){

                    System.out.println ( "This is your last attempt, check you answer and try again!" );

                } else {

                    System.out.println ( "Ran out of attempts, you're going back to the menu." );

                }
            }
        } while (attempts != 3);
    }
}
