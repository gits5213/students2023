package com.app.theInternetHerokuapp.utilities;

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
    public static final String WRONG_USERNAME = "tomsmit";
    public static final String WRONG_PASSWORD = "ERFGAERGAR";
    public static final String EXPECTED_LOGIN_ERROR_MESSAGE = "Your password is invalid!\n" +
            "×";

    //==========Digest authentication==============
    public static final String DIGEST_USERNAME = "admin";
    public static final String DIGEST_PASSWORD = "admin";
    public static final String DIGEST_ACTUAL_MESSAGE = "Congratulations! You must have the proper credentials.";



}
