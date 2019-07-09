package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("\nbefore suite 运行啦");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite 运行啦");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTEST");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTEST");
    }


}
