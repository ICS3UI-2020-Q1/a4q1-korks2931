import java.util.Scanner;
/**
 * This program will count down from 100 by 5 until its gets to the entered number.
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // prompt the user for an integer 
    System.out.println("Please enter an integer to count down to ");
   // declare a variable to store integer
   int integer = input.nextInt();
   // countdown
   System.out.println("Count Down:");
   // create a counter variable to keep track of what number we are on startint at 100
   int count = 100;
   // use a loop to count down by 5
   while(count >= integer){
     // tell the user the count 
   System.out.println( count);
   count = count - 5;

   }



  }
}
