package com.course.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30},
        };
        return o;
    }
    @Test(dataProvider = "methodData")  //methodData与下面的参数名字都是对应的
    public void test1(String name,int age){
        System.out.println("test11111方法 name"+name+";age="+age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test22222方法 name"+name+";age="+age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){ //Method导入的是java.lang.reflect。Method包
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25}

            };
        }else if(method.getName().equals("test2")) {
            result = new Object[][]{
                    {"zhangsan", 30},
                    {"zhaoliu", 25}
            };
        }
        return result;
    }
}
