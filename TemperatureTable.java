/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlyshroyer
 */
public class TemperatureTable {

    public static void outputTwoTemps(double degreesC) {
        double degreesF;
        degreesF = 9./5.*degreesC + 32.0;
        System.out.printf("%.2f C  %.2f F\n", degreesC, degreesF);   
     
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // print a temperature table
        System.out.print("Degrees (C) Degrees (F)");
        System.out.println();
        outputTwoTemps(0.00);
        outputTwoTemps(5.00);
        outputTwoTemps(10.00);
        outputTwoTemps(15.00);
        outputTwoTemps(20.00);
    }
    
}