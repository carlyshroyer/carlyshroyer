/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsius2fahrenheit;

import java.util.Scanner;

/**
 *
 * @author carlyshroyer
 */
public class Celsius2Fahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // converts from celsius to fahrenheit
    double degreesC;
    double degreesF;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a temperature in degrees Celsius: ");
    degreesC = in.nextDouble();
    degreesF = degreesC * 9.0/5.0 + 32.0;
    System.out.printf("%.1f", degreesF);
    System.out.println();
  
    }
    
}
