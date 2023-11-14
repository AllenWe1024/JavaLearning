// package com.atguigu.set;

import java.util.HashSet;
import java.util.Objects;

import org.junit.Test;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year &&
                month == myDate.month &&
                day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Test
    public void test01() {
        HashSet set = new HashSet();
        set.add("张三");
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("王五");
        set.add("赵六");

        System.out.println("set = " + set);// 不允许重复，无序
    }
}

class TestHashSet {
    @Test
    public void test01() {
        HashSet set = new HashSet();
        set.add("张三");
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("王五");
        set.add("赵六");

        System.out.println("set = " + set);// 不允许重复，无序
    }

    @Test
    public void test02() {
        HashSet set = new HashSet();
        set.add(new MyDate(2021, 1, 1));
        set.add(new MyDate(2021, 1, 1));
        set.add(new MyDate(2022, 2, 4));
        set.add(new MyDate(2022, 2, 4));

        System.out.println("set = " + set);// 不允许重复，无序
    }
}