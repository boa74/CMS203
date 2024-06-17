/*
 * Class: CMSC203 
 * Instructor: Professor Eivazi
 * Description: Color guess game
 * Due: June 17 2024
 * Platform/compiler:java
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: _Boa Kim_______
*/


import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {

    public static void main(String[] args) {
        //use class random to get computer's guess 
        Random random = new Random();
        final int totalColorNumber = 16;


        //get the file name 
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String fileName = keyboard.nextLine();
        

        // Use try-with-resources for file reading
        //read the file
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextLine()) {
                String str = fileScanner.nextLine();
                System.out.println(str);
            }
            // Confirm file reading is complete
            System.out.println("File reading completed.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // Confirm the start of the for loop
        System.out.println("Starting the for loop...");
        int correctGuesses = 0;

        for (int i = 1; i < 4; i++) {
        
        //declare colorNumber for picking a random number and connect it to the color name

        int colorNumber = random.nextInt(totalColorNumber)+1;
        String chosenColor="";
         switch (colorNumber) {
            case 1: chosenColor = "black"; break;
            case 2: chosenColor = "white"; break;
            case 3: chosenColor = "gray"; break;
            case 4: chosenColor = "silver"; break;
            case 5: chosenColor = "maroon"; break;
            case 6: chosenColor = "red"; break;
            case 7: chosenColor = "purple"; break;
            case 8: chosenColor = "fuchsia"; break;
            case 9: chosenColor = "green"; break;
            case 10: chosenColor = "lime"; break;
            case 11: chosenColor = "olive"; break;
            case 12: chosenColor = "yellow"; break;
            case 13: chosenColor = "navy"; break;
            case 14: chosenColor = "blue"; break;
            case 15: chosenColor = "teal"; break;
            case 16: chosenColor = "aqua"; break;
          }
          //printout the number of round and get user's guess

            System.out.println("Round " + i);
            System.out.println("I am thinking of a color.");
            System.out.println("Enter your guess: ");
            String guess = keyboard.nextLine();
            System.out.println("You Guessed : "+ guess);
          //compare it with user's guess and computer's pick
         if(guess==chosenColor){

            System.out.println("I was thinking of " + chosenColor + ".");
            correctGuesses++;
         }else{

            System.out.println("I was thinking of " + chosenColor + ".");
         }
            
           
        }

        // Confirm the end of the for loop

        System.out.println("For loop ended.");
        
        System.out.println("\nGame Over");
        //confirm the number of correct guesses
        System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");

        //get user's information
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.print("Describe yourself: ");
        String description = keyboard.nextLine();
        System.out.print("Due Date (MM/DD/YY): ");
        String dueDate = keyboard.nextLine();

        System.out.println("\nUser Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);


        keyboard.close();
    }
}
