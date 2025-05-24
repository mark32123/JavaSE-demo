package Vessel.Set;

import java.util.LinkedHashSet;

public class LinkedHashdemo01 {//可以保存存入的顺序
    public static void main(String[] args) {
        Student s1 = new Student(18, "小明");
        Student s2 = new Student(19, "小王");
        Student s3 = new Student(18, "小军");

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs);

    }
}
