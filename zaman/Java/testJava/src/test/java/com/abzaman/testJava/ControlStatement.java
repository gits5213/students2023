package com.abzaman.testJava;

public class ControlStatement {


    /*

    use if to specify a block of code to be executed, if the condition is true
    use else to specify a block of code to be executed if the condition is false
    use else if to specify a new condition to test if the first condition is false

     */


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        // js consol.log("condition is undefined")
        // py a= 10, b = 20
        // c sharp consol.writeline ("Condition is undefined")
        if (a==b){

            System.out.println("Condition is undefined");

        }
        else if (a<b){

            System.out.println("Condition is true");
        }

        else{

            System.out.println("condition is false");
        }

    }
}
