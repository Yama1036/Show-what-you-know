/*
 *Yama
 *21/10/2019
 *Remake the Cubes and Squares and Power code.
 */

package showwhatyouknow;

import java.util.Scanner;

/**
 *
 * @author ayyam8774
 */
public class ShowWhatYouKnow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner (System.in);
        int choice = 0;
        double base = 0;
        double power;
        
        while ( choice != 5 )
        {
            System.out.println(" + - * / ");
            System.out.println("");
        
            System.out.println("Prease enter your choice.");
            System.out.println("");
            System.out.println("1 → Addition of up to 10 numbers");
            System.out.println("2 → Subtraction of up to 10 numbers");
            System.out.println("3 → Multiplication of up to 10 numbers");
            System.out.println("4 → Division of up to 10 numbers");
            System.out.println("5 → Exit");
            System.out.println("Prease enter your choice.");
        
            choice = keyedInput.nextInt();
            
            if ( choice == 1 ) 
                {
                    int [ ] numbers = new int [10];
                    int total = 0;
        
                    System.out.println("");
                    System.out.println("Enter ten integers and they will be added together:");
                    System.out.println("If you don't want to add 10 number, then you just type 0 to line.");
                    for (int i = 0; i <= 9; i = i + 1)
                        {
                            numbers[i] = keyedInput.nextInt();
                        }
        

                    for (int i = 0; i <= 9; i = i + 1)
                        {
                            total = total + numbers[i];
                        }
                        
                        System.out.println("");
                        System.out.println("The sum of those numbers is:");
                        System.out.println(total);
                        System.out.println("----------------------------------------------");
                }
            
            
            if ( choice == 2 )
                {
                    int [] numbers = new int [11];
                    int total = 0;
                    
                    System.out.println("");
                    System.out.println("Enter ten integers and they will be subtract:");
                    System.out.println("First number that you are going to put in is the Number to be drawn.");
                    System.out.println("If you don't want to Subtract the 10 number, you just put 0 to the line.");
                    for (int i = 0; i <= 10; i = i + 1)
                        {
                            numbers[i] = keyedInput.nextInt();
                        }
        

                    for (int i = 0; i <= 10; i = i + 1)
                        {
                            total = numbers[0] - numbers[1] - numbers[2] - numbers[3] - numbers[4] - numbers[5] - numbers[6] - numbers[7] - numbers[8] - numbers[9] - numbers[10];
                        }
                        
                        System.out.println("");
                        System.out.println("The sub of those numbers is:");
                        System.out.println(total);
                        System.out.println("----------------------------------------------");
                    
                }
            
            
            if ( choice == 3 )
                {
                    int [] numbers = new int [10];
                    int total = 1;
                    
                    System.out.println("");
                    System.out.println("Enter ten integers and they will be multiple:");
                    System.out.println("If you don't want to multiple 10 numbers, then you just put 1 to the line. ");
                    for (int i = 0; i <= 9; i = i + 1)
                        {
                            numbers[i] = keyedInput.nextInt();
                        }
        

                    for (int i = 0; i <= 9; i = i + 1)
                        {
                            total = total * numbers[i];
                        }
                        
                        System.out.println("");
                        System.out.println("The multiplecation of those numbers is:");
                        System.out.println(total);
                    System.out.println("----------------------------------------------");
                }
            
            if ( choice == 4)
                {
                    int [] numbers = new int [11];
                    int total = 0;
                    
                    System.out.println("");
                    System.out.println("Enter ten integers and they will be devide:");
                    System.out.println("First number that you are going to put in is the Number that dividend.");
                    System.out.println("If you don't want to Subtract the 10 number, you just put 0 to the line.");
                    for (int i = 0; i <= 10; i = i + 1)
                        {
                            numbers[i] = keyedInput.nextInt();
                        }
        

                    for (int i = 0; i <= 10; i = i + 1)
                        {
                            total = numbers[0] / numbers[1] / numbers[2] / numbers[3] / numbers[4] / numbers[5] / numbers[6] / numbers[7] / numbers[8] / numbers[9] / numbers[10];
                        }
                        
                        System.out.println("");
                        System.out.println("The devision of those numbers is:");
                        System.out.println(total);
                        System.out.println("----------------------------------------------");
                }
        }    
        
                if ( choice == 5 )
                    {
                        System.out.println("　　　∧∧\n" +
                        "　　（*･ω･） 　Thank you\n" +
                        "　 ＿|　⊃／(＿＿_\n" +
                        "／　└-(＿＿＿_／\n" +
                        "￣￣￣￣￣￣￣\n" +
                        "");
                    }
        
        
        
    }
    
}
