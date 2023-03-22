package com.gits.sheba.java.controlStatement;

public class SwitchStatement {
    public static void main(String[] args) {
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
        int day = 2;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Nothing");
        }

        for (int i = 0; i<=10; i++){
            if (i==4){
                break;
            }
            System.out.println("break=========" + i);
        }

        for (int i = 0; i<=10; i++){
            if (i==4){
                continue;
            }
            System.out.println("continue=========" +i);
        }

        // Python
        /*
        bike = 'Yamaha'
        if bike == 'Hero':
            print('Bike is hero')
        elif bike == 'Suzuki':
            print('Bike is suzuki')
        elif bike == 'Yamaha':
            print('bike is yamaha')
        else:
            print('Please chose correct answer')
         */

        //Javascript
        /*
        switch (new Date().getDay()){
            case 0:
                day = "Monday";
                console.log(day)
                break;
            case 1:
                day = "Tuesday";
                console.log(day)
                break;
            case 2:
                day = "Wednesday";
                console.log(day)
                break;
            case 3:
                day = "Thursday";
                console.log(day)
                break;
            case 4:
                day = "Friday";
                break;
            case 5:
                day = "Sunday";
                console.log(day)
                break;
            case 6:
                day = "Saturday";
                console.log(day)
                break;
            case 7:
                day = "Sunday";
                console.log(day)
                break;
            default:
                day = "Nothing"

        }
         */
    }
}
