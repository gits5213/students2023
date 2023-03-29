package com.pranrfl.getwell.BaseClass;

public class ForEachLoop {
    public static void main(String[] args) {



        /*
        String[] names = new String[4];

        names[0]= "badhan";
        names[1]= "mridul";
        names[2]= "bisho";
        names[3]= "talha";

        for (int i=0;i<4;i++){
            System.out.println(names[i]);
        }
        */

        /*
        String[] names = {"badhan","mridul","bisho","talha"};
        System.out.println(names.length);
        for (int i=0;i<4;i++){
            System.out.println(names[i]);
        }
        */

      /* String [] num = {"volvo","bmw","porshe"};

        for (String x : num){
            System.out.println(x);
        }
        */


       /* int[] num = {10,20,30,40,50,60,70,80,90,100};

        for (int x : num){
            System.out.println(x);
        }
        */

        int[] num ={10,20,30,40,50,60,70,80,90,100};
        int sum = 0;
        for (int x : num){
            sum= sum+x;
        }
        System.out.println(sum);


    }
}
