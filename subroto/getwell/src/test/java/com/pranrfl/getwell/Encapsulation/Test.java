package com.pranrfl.getwell.Encapsulation;

public class Test {

    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("subroto");
        p1.setPlace("dhaka");
        p1.setAge(27);
        p1.setPhone(1716238954);
        System.out.println(p1.getName());
        System.out.println(p1.getPlace());
        System.out.println(p1.getAge());
        System.out.println(p1.getPhone());
    }
}
