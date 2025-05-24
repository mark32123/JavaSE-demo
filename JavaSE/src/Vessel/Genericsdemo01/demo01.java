package Vessel.Genericsdemo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class demo01 {
    public static void main(String[] args) {
        //没有泛型限定，默认为Object类型，写包装类
        ArrayList list = new ArrayList();
        list.add(123);
        list.add("abc");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
