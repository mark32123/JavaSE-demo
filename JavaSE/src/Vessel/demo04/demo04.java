package Vessel.demo04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class demo04 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        //         增强for循环遍历：
//        for (String s : coll) {
//            System.out.println(s);
//        }

        //Lambda:
        coll.forEach((String s) -> System.out.println(s));
    }
}
