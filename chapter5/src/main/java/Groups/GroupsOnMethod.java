package Groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test (groups = "server")
    public void test1(){
        System.out.println("这个服务端组的测试方法111111");

    }
    @Test (groups ="server")
    public void test2(){
        System.out.println("这是服务端组测试方法22222222222");
    }

    @Test (groups ="client")
    public void test3() {
        System.out.println("这是客户端测试方法3333333");

    }
    @Test (groups ="client")
    public void test4() {
        System.out.println("这是客户端测试方法4444");

    }
    @BeforeGroups ("server")
    public void beforeGroupsOnMethod(){
        System.out.println("这个服务端组运行之前的运行方法。。。。。。");
    }
    @AfterGroups ("server")
    public void afterGroupsOnMethod(){
        System.out.println("这是服务端组运行之后的运行方法");
    }

    @BeforeGroups ("client")
    public void beforeGroupsOnClient(){
        System.out.println("这个客户端组运行之前的运行方法!!!");
    }
    @AfterGroups ("client")
    public void afterGroupsOnClient(){
        System.out.println("这个客户端组运行之后的运行方法？??");
    }
    }
