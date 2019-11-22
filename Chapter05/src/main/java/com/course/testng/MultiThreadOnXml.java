package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author lily
 * @date 2019/11/22
 * @time 16:03
 */
public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.println("Thread Id : %s%n"+Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.println("Thread Id : %s%n"+Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.println("Thread Id : %s%n"+Thread.currentThread().getId());
    }

}
