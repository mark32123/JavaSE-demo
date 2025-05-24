package Vessel.Set;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class TreeSetdemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(4);
        ts.add(3);
        ts.add(1);
        ts.add(7);
        //迭代器遍历
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            int x = it.next();
            System.out.println(x);
        }
        //增强for
        for (Integer t : ts) {
            System.out.println(t);
        }

        //匿名类表达式
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer s) {
                System.out.println(s);
            }
        });
        //Lambda遍历
        ts.forEach(s->System.out.println(s));
    }
}
