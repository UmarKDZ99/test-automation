package com.api.tests;

public class TestHelper {
    
    public static String generateValidPayload() {
        return "{\n" +
                "  \"name\": \"QA Test\",\n" +
                "  \"email\": \"testmanager@test.com\",\n" +
                "  \"phoneNumber\": 591097511,\n" +
                "  \"companyName\": \"QA Corner\",\n" +
                "  \"strategicGoals\": \"The goals is to prepare team for the QA testing and execution.\"\n" +
                "}";
    }
}
