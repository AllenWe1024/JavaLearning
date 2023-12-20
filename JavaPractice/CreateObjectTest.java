// package com.atguigu.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

class TestClass1 {
    private String name;
    private int age;

    public TestClass1() {
        System.out.println("无参构造");
    }

    public TestClass1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestClass1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class CreateObjectTest {
    @Test
    public void test1() throws Exception {
//        AtGuiguClass obj = new AtGuiguClass();//编译期间无法创建

        Class<?> clazz = Class.forName("TestClass1");
        //clazz代表com.atguigu.ext.demo.AtGuiguClass类型
        //clazz.newInstance()创建的就是AtGuiguClass的对象
        Object obj = clazz.newInstance();
        System.out.println(obj);
    }

    @Test
    public void test2() throws Exception {
        Class<?> clazz = Class.forName("TestClass1");
        //java.lang.InstantiationException: com.atguigu.ext.demo.AtGuiguDemo
        //Caused by: java.lang.NoSuchMethodException: com.atguigu.ext.demo.AtGuiguDemo.<init>()
        //即说明AtGuiguDemo没有无参构造，就没有无参实例初始化方法<init>
        Object stu = clazz.newInstance();
        System.out.println(stu);
    }

    @Test
    public void test3() throws Exception {
        //(1)获取Class对象
        Class<?> clazz = Class.forName("TestClass1");
        /*
         * 获取AtGuiguDemo类型中的有参构造
         * 如果构造器有多个，我们通常是根据形参【类型】列表来获取指定的一个构造器的
         * 例如：public AtGuiguDemo(String title, int num)
         */
        //(2)获取构造器对象
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);

        //(3)创建实例对象
        // T newInstance(Object... initargs)  这个Object...是在创建对象时，给有参构造的实参列表
        Object obj = constructor.newInstance("尚硅谷", 2022);
        System.out.println("1"+obj);
        // for (String o : obj.keys()) {
        //     System.out.println(o);
        // }
    }
}