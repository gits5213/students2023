package com.pranrfl.getwell.Encapsulation;

public class Person {

    private String name,place;
    private int age,phone;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setPlace(String place){
        this.place=place;
    }

    public String getPlace(){
        return place;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setPhone(int phone){
        this.phone=phone;
    }

    public int getPhone() {
        return phone;
    }
}
