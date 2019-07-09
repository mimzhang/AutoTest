package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例的一部分");
    }

    @Test
    public void TestCase2(){
        System.out.println("这是TestCase2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前的运行的");
    }

    @AfterMethod
    public void aferMethod(){
        System.out.println("afterMethod这是测试方法之后运行的");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("beforeclass是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("afterclass是在类运行之后运行的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}
