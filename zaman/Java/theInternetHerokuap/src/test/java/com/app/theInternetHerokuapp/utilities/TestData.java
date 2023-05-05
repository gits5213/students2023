package com.app.theInternetHerokuapp.utilities;

import java.lang.reflect.Array;

public class TestData {

    //==========Global Test Data==============
    public static final String USERNAME = "tomsmith";
    public static final String PASSWORD = "SuperSecretPassword!";
    public static final String URL ="https://the-internet.herokuapp.com";

    //==========A/B Testing Page==============
    public static final String AB_TESTING_URL = "https://the-internet.herokuapp.com/abtest";
    public static final String AB_TESTING_HEADER_TEXT = "A/B Test Variation 1";
    public static final String AB_TESTING_HEADER_TEXT_2 = "A/B Test Control";

    //==========Login page==============
    public static final String WRONG_USERNAME = "tomsmitt";
    public static final String WRONG_PASSWORD = "ERFGAERGAR";
    public static final String EXPECTED_LOGIN_ERROR_MESSAGE_USERNAME = "Your username is invalid!\n" +
            "×";
    public static final String EXPECTED_LOGIN_ERROR_MESSAGE_PASSWORD = "Your password is invalid!\n" +
            "×";
    public static final String EXPECTED_LOGIN_SUCCESSFUL_MESSAGE = "You logged into a secure area!\n" +
            "×";

    //==========Digest authentication==============
    public static final String DIGEST_USERNAME = "admin";
    public static final String DIGEST_PASSWORD = "admin";
    public static final String DIGEST_SUCCESSFUL_MESSAGE = "Congratulations! You must have the proper credentials.";
    public static final String DIGEST_EDITABLE_URL = "the-internet.herokuapp.com/digest_auth";

    //==========Disappearing Elements==============
    public static final String[] DISAPPEARING_ELEMENTS = {"Home", "About", "Contact Us", "Portfolio", "Gallery"};


    //==========LoginValidationWithExcelData==============
    public static final String LOGIN_EXCEL_FILEPATH = "src/test/java/com/app/theInternetHerokuapp/testData/loginData.xlsx";



    //==========Drag And Drop ==============
    public static final String DRAG_AND_DROP_URL = "https://www.globalsqa.com/demo-site/draganddrop/";


    //==========Next==============
    //==========Next==============
    //==========Next==============
    //==========Next==============
    //==========Next==============



}
