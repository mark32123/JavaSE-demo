package Vessel.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetdemo01 {
    public static void main(String[] args) {
        Student s1 = new Student(18, "小明");
        Student s2 = new Student(19, "小王");
        Student s3 = new Student(18, "小军");

        HashSet<Student> set = new HashSet<>();
        System.out.println(set.add(s1));
        System.out.println(set.add(s2));
        System.out.println(set.add(s3));

        System.out.println(set);

    }
}
