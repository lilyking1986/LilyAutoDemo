package com.course.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author lily
 * @date 2019/11/22
 * @time 15:51
 */
public class DataProviderTest {
    @Test(dataProvider="data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age"+age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] Q = new Object[][]{
                {"zhangsan",10},
                {"lisi",25}
        };
        return Q;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test1   name="+name+",age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test2   name="+name+",age="+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if (method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",10},
                    {"lisi",20}
            };

        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"zhangsan111",10},
                    {"lisi111",20}
            };
        }
        return result;
    }
}
