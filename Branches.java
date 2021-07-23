/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random; 
/**
 *
 * @author carlyshroyer
 */
public class Branches {
    
    //1st void method
    public static void calculateSalary(double salary) {
        double hoursWorked;
        double hourlyRate;
        double weeklySalary;
        double overtimeSalary;
        
        System.out.print("How many hours were worked? ");
        Scanner in = new Scanner(System.in);
        hoursWorked = in.nextDouble();
        
        System.out.print("What is the hourly rate? ");
        hourlyRate = in.nextDouble();
        
        System.out.print("The weekly salary is ");
        weeklySalary = hourlyRate * hoursWorked;
        overtimeSalary = ((hoursWorked - 40) * (hourlyRate * 1.5)) + (40 * hourlyRate);
            if 
                (hoursWorked < 40){
                    System.out.println(weeklySalary);
            } else {
                    System.out.println(overtimeSalary);
}
    }
    //2nd void method
    public static void guessNumber(int randomGuess) {
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        
        System.out.print("Please guess a number between 1 and 10, inclusive. ");
        Scanner in = new Scanner(System.in);
        randomGuess = in.nextInt();
        
        if (randomGuess == number) {
            System.out.println("You got it! :)");    
            
        } else if (randomGuess > number) {
            System.out.println("Too high :(");
            System.out.print("The number I was thinking of was ");
            System.out.print(number);
            System.out.println(".");
        } else {
            System.out.println("Too low :(");
            System.out.print("The number I was thinking of was ");
            System.out.print(number);
            System.out.println(".");
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
 
        public static void main(String[] args) { 
        // TODO code application logic here
        
        calculateSalary(1);
        guessNumber(2);
        
        
    }
    
}
