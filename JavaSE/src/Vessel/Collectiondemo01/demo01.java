package Vessel.Collectiondemo01;

import java.util.ArrayList;
import java.util.Collection;

public class demo01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<> ();

        coll.add("aaa");
        coll.add("bbb");
        System.out.println(coll);

        coll.clear();
        System.out.println(coll);

        //contains中判断是否包含是利用equals方法，即判断地址值是否相同，所以需要重写

    }
}
