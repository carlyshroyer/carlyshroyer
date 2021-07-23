/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author carlyshroyer
 */
public class TwoLoops {
    
     // below is a void method that converts 10 values of in^2 to cm^2
    public static void areaTable(double cm) {
       
        System.out.printf("in^2", "%-10s%n");
        System.out.printf("%10s%n", "cm^2");
        System.out.println("---------------");
        
        for (double in = 1; in <= 10; in++) {
            System.out.print(in);
            System.out.printf("%10.2f%n", in * 6.452);
        }
    }
    //below is a void method that prompts users to enter integers and returns count # of even integers
    
    public static void numberOfEvens(int n) {
        int number, x, evenSum = 0;
        
        System.out.println("Please enter a list of nonzero integers separated by spaces.");
        System.out.println("Enter a 0 to stop, and I will tell you how many even numbers you entered.");
        
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        
        x = 1;
        
        while(x <= number)
        {
            if(x % 2 == 0)
            { 
                   evenSum = evenSum + x;
                }
               x++;             
        }
        System.out.print("You entered ");
        System.out.print(x);
        System.out.print(" even integers.");
    }


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // call first void method
        System.out.println("Main will now call areaTable.");
        areaTable(10);
        
        // call second void method
        System.out.println("Main will now call numberOfEvens.");
        numberOfEvens(1);
        
    }
    
}
