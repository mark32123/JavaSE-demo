package Vessel.Set;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private int age;
    private String name;


    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "Student{age = " + age + ", name = " + name + "}";
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
