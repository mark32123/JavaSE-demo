package Vessel.demo02;
import java.util.ArrayList;
import java.util.Collection;

public class demo02 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<> ();

        coll.add(new Student("小明", 18));
        coll.add(new Student("小红", 19));
        //contains中判断是否包含是利用equals方法，即判断地址值是否相同，所以需要重写，在Student类中重写equals方法
        Student s1 = new Student("小明", 18);
        System.out.println(coll.contains(s1));


    }
}


