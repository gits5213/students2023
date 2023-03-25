package com.sqajava.javapracties.controlStatement;

public class SwitchStatement {
    /*
            String browser = "browser";
            if(browser.chrome){
                //browser.config
            }else if(browser.edge){
                //browser.config
            }else if(browser.firefox){
                //browser.config
            }else if(browser.safari){
                //browser.config
            }

            switch (expression){
                case x:
                    //code
                    break;
                case y:
                    //code
                    break;
                case z:
                    //code
                    break;
                default:
                    //code block
         */
    public static void main(String[] args) {
        int month = 2;
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            default:
                System.out.println("Not match");
        }


        int i,j;
        for (i = 0; i<=10; i++){
            if (i==4){
                break;
            }
            System.out.println("break" + i);
        }

        for ( i = 0; i<=10; i++){
            if (i==4){
                continue;
            }
            System.out.println("continue" +i);
        }
    }
}

