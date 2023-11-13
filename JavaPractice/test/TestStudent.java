package test;

import org.junit.Test;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student(3, "张三", 90, 23);
        arr[1] = new Student(1, "熊大", 100, 22);
        arr[2] = new Student(5, "王五", 75, 25);
        arr[3] = new Student(4, "李四", 85, 24);
        arr[4] = new Student(2, "熊二", 85, 18);


        System.out.println("所有学生：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("按照成绩排序");
        StudentScoreComparator sc = new StudentScoreComparator();
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (sc.compare(arr[j], arr[j + 1]) > 0) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test01() {
        Student[] students = new Student[5];
        students[0] = new Student(3, "张三", 90, 23);
        students[1] = new Student(1, "熊大", 100, 22);
        students[2] = new Student(5, "王五", 75, 25);
        students[3] = new Student(4, "李四", 85, 24);
        students[4] = new Student(2, "熊二", 85, 18);

        System.out.println(Arrays.toString(students));
        //定制排序
        StudentScoreComparator sc = new StudentScoreComparator();
        Arrays.sort(students, sc);
        System.out.println("排序之后：");
        System.out.println(Arrays.toString(students));
    }
}