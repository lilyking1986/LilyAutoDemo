package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author lily
 * @date 2019/11/22
 * @time 15:03
 */
public class ExceptionDemo {
    /**
     * 什么时候会用到异常测试
     * 在我们期望结果为某一个异常的时候
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaled(){
        System.out.println("this is except exception");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptiononSuccess(){
        System.out.println("successs");
        throw new RuntimeException();
    }
}
