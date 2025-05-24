package Vessel.Set;

import java.util.TreeSet;

public class TreeSetdemo2 {
    public static void main(String[] args) {
        Student s1 = new Student(18, "小明");
        Student s2 = new Student(19, "小王");
        Student s3 = new Student(20, "小军");

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);
    }
}
