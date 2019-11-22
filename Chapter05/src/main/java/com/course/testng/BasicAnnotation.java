package com.course.testng;

import org.testng.annotations.*;

import java.sql.SQLOutput;

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在测试类运行之前");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("bafterClass这是在测试类运行之前");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 这是测试级之前运行");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 这是测试级之后运行");
    }
}

