package com.abzaman.testJava;
import java.util.Scanner;
import java.text.DecimalFormat;

public class BasicCalculatorWithFunction {
    
    //Defining functions for eich oparations
    public static String add(double x, double y) {
        double result = x + y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }

    public static String multi(double x, double y) {
        double result = x * y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }

    public static String sub(double x, double y) {
        double result = x - y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }

    // public static String divide(double x, double y) throws ArithmeticException {
    //     if (y == 0) {
    //         throw new ArithmeticException("Cannot divide by zero");
    //     }
    //     double result = x / y;
    //     DecimalFormat df = new DecimalFormat("#.##");
    //     df.setMinimumFractionDigits(2);
    //     df.setMaximumFractionDigits(2);
    //     return df.format(result);
    // }

    public static String divide(double x, double y){
        double result = x / y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }
    

    public static String rem(double x, double y) {
        double result = x % y;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);
        return df.format(result);
    }


    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int choice ;
        char a = 'y';

        while (Character.toLowerCase(a) == 'y') {

            System.out.println("Select operation.");
            System.out.println("1.Add");
            System.out.println("2.Subtract");
            System.out.println("3.Multiply");
            System.out.println("4.Divide");
            System.out.println("5.Remainder\n");

           //Input validation for choice

            while (true) {
                System.out.print("Enter choice(1/2/3/4/5):");
                
                if (input.hasNextInt()) {
                    choice = input.nextInt();
                    
                    if (choice >= 1 && choice <= 5){
                        
                        break;
                } 

                    
                } else {
                    System.out.println("Invalid input. Please enter an integer between 1 to 5.");
                    input.nextLine(); // consume the invalid input
                }
                
            }

            System.out.println("");
            
            double num1, num2;
            
            //Input validation for first number

            while (true) {
                System.out.print("Enter first number: ");
                
                if (input.hasNextInt()) {
                    num1 = input.nextInt();
                    break;
                       
                } else {
                    System.out.println("Invalid input!! Please enter an integer or float");
                    input.nextLine(); // consume the invalid input
                }
                
            }

            System.out.println(" ");
            
            // validation for second number
            while (true) {
                System.out.print("Enter second number: ");
                
                if (input.hasNextInt()) {
                    num2 = input.nextInt();
                    break;
                          
                } else {
                    System.out.println("Invalid input!! Please enter an integer or float");
                    input.nextLine(); // consume the invalid input
                }
                
            }
            
            System.out.println(" ");

            switch(choice){
            
                case 1:
                System.out.println("\n" + num1 + " + " + num2 + " = " + add(num1, num2) + "\n");
                break;
            
                case 2:
                System.out.println("\n" + num1 + " - " + num2 + " = " + sub(num1, num2) + "\n");
                break;
            
                case 3:
                System.out.println("\n" + num1 + " x " + num2 + " = " + multi(num1, num2) + "\n");
                break;
            
                case 4:
                if(num2!= 0){

                    System.out.println("\n" + num1 + " / " + num2 + " = " + divide(num1, num2) + "\n");
                }
                else{
                    System.out.println("Syntax Error");
                }
                break;
            
                case 5:
                System.out.println("\n" + num1 + " % " + num2 + " = " + rem(num1, num2) + "\n");
                break;
            
                default:
                System.out.println("Wrong input");
            
            }
            
            System.out.print("Do you wish to continue? Y/N ");
            a = input.next().charAt(0);
            

        }




            

            
        
    }
            
}



                
                
                
