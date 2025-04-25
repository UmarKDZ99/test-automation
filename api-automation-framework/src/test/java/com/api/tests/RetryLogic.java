package com.api.tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
    private int retryCount = 0;
    private final int maxRetryCount = 3;  

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;  
        }
        return false;
    }
}
