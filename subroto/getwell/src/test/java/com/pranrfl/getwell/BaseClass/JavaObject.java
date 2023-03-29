package com.pranrfl.getwell.BaseClass;

public class JavaObject {
    public static void main(String[] args) {

        JavaObject jo = new JavaObject();

        String [] name={"class","object","java","method"};
        System.out.println(name.length);

        for (int i=0;i<=4;i++){
            System.out.println(name[i]);
        }

        jo.getClass();

    }
}
