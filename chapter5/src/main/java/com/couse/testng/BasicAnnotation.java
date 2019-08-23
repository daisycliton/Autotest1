package com.couse.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test//最基本的注解，用来把方法标记为测试的一部分

    public void testcase1(){
        System.out.println("这是测试用例1 ");
    };
    @Test
    public void testcase2(){
        System.out.println("这个测试用例2");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("beforemethod这是在测试方法之前运行的");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("aftermethod这是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("beforeclass这是在类之前运行的");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("afterclass这个在类之后运行的");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite测试套件");
    }
    @AfterSuite
    public void  aftersuite(){
        System.out.println("aftersuite测试套件");
    }

};
