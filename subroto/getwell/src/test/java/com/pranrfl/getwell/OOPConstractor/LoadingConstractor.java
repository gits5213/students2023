package com.pranrfl.getwell.OOPConstractor;

public class LoadingConstractor {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("subroto paul","male");
        teacher2.DisplayInformation();
        Teacher teacher3 = new Teacher(27,1409546174);
        teacher3.DisplayInformation();




    }
}
