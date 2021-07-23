/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlyshroyer
 */
public class OperatorLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // the code below is for number 1
        int leftInt, rightInt, intResult;
        leftInt = 3;
        rightInt = 5;
        intResult = leftInt + rightInt;

        System.out.print("The result of \"");
        System.out.print(leftInt);
        System.out.print(" plus ");
        System.out.print(rightInt);
        System.out.print("\" is ");
        System.out.println(intResult);
        
       // the code below is for number 2
       int thirdOperand = 6;
       intResult = (rightInt + leftInt) * thirdOperand;
       
       System.out.print("The result of \"");
       System.out.print(thirdOperand);
       System.out.print(" times the sum of ");
       System.out.print(leftInt);
       System.out.print(" plus ");
       System.out.print(rightInt);
       System.out.print("\" is ");
       System.out.println(intResult);
       
       // the code below is for number 3
       String part1 = "goodtimes";
       String part2 = "badtimes";
       
       System.out.print("The result of \"");
       System.out.print(part1);
       System.out.print(" concatenated with ");
       System.out.print(part2);
       System.out.print("\" is ");
       System.out.println(part1 + part2);
       
       // the code below is for number 4
     
        double x = 4.5;
        double y = 1.5;
        double z = x / y;
        

        System.out.print("The result of \"");
        System.out.print("Four and one half ");
        System.out.print(x);
        System.out.print(" divided by one and one half ");
        System.out.print(y);
        System.out.print("\" is ");
        System.out.println(z);
        
        // the code below is for number 5
        
        System.out.print("The result of \"One and one half times the result of adding five and three\" is ");
        System.out.println(1.5* (5 +3));
        
        // the code below is for number 6
        
        int a = 1; 
        int b = 2;
        int c = a << b; 
        
        System.out.print("The result of \"");
        System.out.print(a);
        System.out.print(" left shifted by ");
        System.out.print(b);
        System.out.print("\" is ");
        System.out.println(c);
   
        
        // the code below is for number 7
        
        int d = 8; 
        int e = 1;
        int f = d >> e; 
        
        System.out.print("The result of \"");
        System.out.print(d);
        System.out.print(" right shifted by ");
        System.out.print(e);
        System.out.print("\" is ");
        System.out.println(f);
       
        // the code below is for number 7
        
        int g = 255;
        int h = 17;
        int i = g & h;
        
        System.out.print("The result of \"");
        System.out.print(g);
        System.out.print(" bitwise AND ");
        System.out.print(h);
        System.out.print("\" is ");
        System.out.println(i);
        
        // the code below is for number 8
        
        double k = 1;
                
        System.out.print("The result of \"One third as a floating point value\" is ");
        System.out.println(k / 3);
        
        // testing i/o
        
        System.out.printf("Hello");
        System.out.printf("%S%n", " world");
        
        System.out.printf("'%50s' %n", "Carly Shroyer");
        
    
    }
    
}
