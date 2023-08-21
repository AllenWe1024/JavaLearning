//package com.atguigu.keyword;

class Father {
    public static void method() {
        System.out.println("Father.method");
    }

    public static void fun() {
        System.out.println("Father.fun");
    }
}

//package com.atguigu.keyword;

class Son extends Father {
    //    @Override //尝试重写静态方法，加上@Override编译报错，去掉Override不报错，但是也不是重写
    public static void fun() {
        System.out.println("Son.fun");
    }
}

//package com.atguigu.keyword;

public class TestStaticMethod {
    public static void main(String[] args) {
        Father.method();
        Son.method();//继承静态方法

        Father f = new Son();
        f.method();//执行Father类中的method
    }
}