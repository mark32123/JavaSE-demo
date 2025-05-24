package Vessel.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class demo01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
//        boolean s1 = set.add("aaa");     //去重性
//        boolean s2 = set.add("aaa");
//
//        System.out.println(s1);
//        System.out.println(s2);


        set.add("aaa");
        set.add("bbb");
        set.add("ccc");
        set.add("ddd");
        set.add("eee");

//        //迭代器遍历
//        Iterator<String> it = set.iterator();
//        while(it.hasNext()){
//            String str = it.next();
//            System.out.println(str);
//        }


//        //匿名类表达式
//        set.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        //Lambda遍历
//        set.forEach(s->System.out.println(s));
    }
}
