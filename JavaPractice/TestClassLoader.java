// package com.atguigu.loader;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestClassLoader {
    @Test
    public void test01() {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("systemClassLoader = " + systemClassLoader);
    }

    @Test
    public void test02() throws Exception {
        ClassLoader c1 = String.class.getClassLoader();
        System.out.println("加载String类的类加载器：" + c1);

        ClassLoader c2 = Class.forName("sun.util.resources.cldr.zh.TimeZoneNames_zh").getClassLoader();
        System.out.println("加载sun.util.resources.cldr.zh.TimeZoneNames_zh类的类加载器：" + c2);

        ClassLoader c3 = TestClassLoader.class.getClassLoader();
        System.out.println("加载当前类的类加载器：" + c3);
    }

    @Test
    public void test03() {
        ClassLoader c1 = TestClassLoader.class.getClassLoader();
        System.out.println("加载当前类的类加载器c1=" + c1);

        ClassLoader c2 = c1.getParent();
        System.out.println("c1.parent = " + c2);

        ClassLoader c3 = c2.getParent();
        System.out.println("c2.parent = " + c3);

    }

    @Test
    public void test5() throws IOException {
        Properties pros = new Properties();
        //方式1：此时默认的相对路径是当前的module
//        FileInputStream is = new FileInputStream("info.properties");
//        FileInputStream is = new FileInputStream("src//info1.properties");

        //方式2：使用类的加载器
        //此时默认的相对路径是当前module的src目录
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("info1.properties");


        pros.load(is);

        //获取配置文件中的信息
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");
        System.out.println("name = " + name + ", password = " + password);
    }

}