package group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author lily
 * @date 2019/11/22
 * @time 14:53
 */
public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("test1..........");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("test2..........");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("test3..........");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("test4..........");
    }
    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("yunxingzhiqian");
    }
    @AfterGroups("server")
    public void aforeGroupsOnServer(){
        System.out.println("yunxingzhihou");
    }
}
