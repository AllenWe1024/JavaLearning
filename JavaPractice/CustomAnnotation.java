// package com.atguigu.annotation;

import java.lang.annotation.*;

// 自定义注解
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table {
    String value();
}

// 自定义注解
@Inherited
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Column {
    String columnName();

    String columnType();
}

@Table("t_stu")
public class CustomAnnotation {
    @Column(columnName = "sid", columnType = "int")
    private int id;
    @Column(columnName = "sname", columnType = "varchar(20)")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}