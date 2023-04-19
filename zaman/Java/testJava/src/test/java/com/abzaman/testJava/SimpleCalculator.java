package com.abzaman.testJava;

import java.util.Scanner;

public class SimpleCalculator {

    static double a;
    static double b;
    static double add;
    static String c;

    public static void main(String[] args) {


            System.out.println("This is a basic calculator :) ");
            System.out.println();
            System.out.println("For addition type 'Add'");
            System.out.println("For subtraction type 'Sub'");
            System.out.println("For division type 'Div'");
            System.out.println("For multiplication type 'Multi'");

            System.out.print("Enter your choice: ");

            Scanner scanInputType = new Scanner(System.in);
            String c = scanInputType.next();

            // addition
            if (c.equalsIgnoreCase("add")){

                System.out.print("Enter your first number ");
                Scanner scanInputNumber = new Scanner(System.in);
                a = scanInputNumber.nextDouble();

                System.out.print("Enter your second number ");
                b = scanInputNumber.nextDouble();


                add = a + b;

                System.out.println("Your value for the addition is = " + add);


            }

             // division
             else if (c.equalsIgnoreCase("div")){

                 System.out.print("Enter your first number ");
                 Scanner scanInputNumber = new Scanner(System.in);
                 a = scanInputNumber.nextDouble();

                 System.out.print("Enter your second number ");
                 b = scanInputNumber.nextDouble();


                 add = a / b;

                 System.out.println("Your value for the subtraction is = " + add);

             }

            // multiplication

            else if (c.equalsIgnoreCase("multi")){

                System.out.print("Enter your first number ");
                Scanner scanInputNumber = new Scanner(System.in);
                a = scanInputNumber.nextDouble();

                System.out.print("Enter your second number ");
                b = scanInputNumber.nextDouble();


                add= a * b;

                System.out.println("Your value for the subtraction is = " + add);

            }

            // Subtraction
            else if (c.equalsIgnoreCase("sub")){

                System.out.print("Enter your first number ");
                Scanner scanInputNumber = new Scanner(System.in);
                a = scanInputNumber.nextDouble();

                System.out.print("Enter your second number ");
                b = scanInputNumber.nextDouble();

                add = a - b;

                System.out.println("Your value for the subtraction is = " + add);

              

            }

        }


    }

